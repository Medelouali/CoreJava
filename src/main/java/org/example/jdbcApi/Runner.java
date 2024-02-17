package org.example.jdbcApi;

import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) throws SQLException {
        StudentDAO studentDAO=new StudentDAOImpl();
//        int randomCount= (int) (Math.random()*9999);
//        studentDAO.saveStudent(new Student(
//                "John"+randomCount,
//                randomCount,
//                randomCount < 4000 ? "Male": ( randomCount<7000 ? "Female": "Other"),
//                Math.random()*99));
        System.out.println(studentDAO.getOthers());


        SingletonConnection.getConnection().close();
    }
}
