package servlet;

import db.DbConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "person")
public class person extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String fname = request.getParameter("fname");
String lname = request.getParameter("lname");
String gender = request.getParameter("age");
String book = request.getParameter("book");
String cricket = request.getParameter("cricket");
        DbConnection db = new DbConnection();
        db.insertRecord(fname,lname,gender,book,cricket);






    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
