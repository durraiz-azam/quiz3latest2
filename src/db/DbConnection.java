package db;

import java.sql.*;

public class DbConnection {
    private String dbURL = "jdbc:mysql://localhost:3306/employee_db";
    private String username = "root";
    private String password = "";
    private Connection connection;
    public DbConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL,username,password);
            if(connection!=null){
                System.out.println("Success");
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertRecord(String firstname,String lastname,String gender, String Interests1, String Int2){
        try {
            String sqlQuery = "INSERT INTO `employee_info` (`id`, `firstname`, `lastname`, `gender`, `interest1`, `interest2`) VALUES(NULL,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, gender);
            preparedStatement.setString(4, Interests1);
            preparedStatement.setString(5, Int2                                               );


            int noOfRowsInserted = preparedStatement.executeUpdate();
            if(noOfRowsInserted>0){
                System.out.println(noOfRowsInserted + " rows inserted!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateRecord(int id,String firstName,String lastName,String email){
        try {
            String sqlQuery = "UPDATE student SET first_name=?,last_name=?,email=? WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1,firstName);
            preparedStatement.setString(2,lastName);
            preparedStatement.setString(3,email);
            preparedStatement.setInt(4,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteRecord(int id){
        try {
            String sqlQuery = "DELETE from student WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getRecord(int id){
        try {
            String sqlQuery = "SELECT * FROM registration where id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1,id);
            ResultSet result = preparedStatement.executeQuery();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet getRecords(){
        try {
            String sqlQuery = "SELECT * FROM user";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlQuery);
            System.out.println(" rows get!");
            return result;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
