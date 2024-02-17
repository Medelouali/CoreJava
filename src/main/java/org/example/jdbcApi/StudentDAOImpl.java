package org.example.jdbcApi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{
    @Override
    public void saveStudent(Student student) {
        Connection connection1= SingletonConnection.getConnection();
        try {
            PreparedStatement preparedStatement1=connection1.prepareStatement("INSERT INTO students (name, age, gender, gpa) VALUES (?, ?, ?, ?);");
            // 'John Doe', 20, 'Male', 3.75
            preparedStatement1.setString(1, student.getName());
            preparedStatement1.setInt(2, student.getAge());
            preparedStatement1.setString(3, student.getGender());
            preparedStatement1.setDouble(4, student.getGpa());

            preparedStatement1.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getStudents() {
        List<Student> studentsList=new ArrayList<>();
        Connection connection1= SingletonConnection.getConnection();
        try{
            PreparedStatement preparedStatement=connection1.prepareStatement("select * from students;");
            ResultSet rs= preparedStatement.executeQuery();

            while (rs.next()){
                studentsList.add(new Student(
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getDouble("gpa")
                ));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return studentsList;
    }

    @Override
    public void dropAll() {
        Connection connection1= SingletonConnection.getConnection();
        try {
            PreparedStatement preparedStatement=connection1.prepareStatement("delete from students where 1=1;");
            int deletedRowsCount= preparedStatement.executeUpdate();
            System.out.println(deletedRowsCount+" rows has been deleted");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getMales() {
        return getStudentByGender("Male");
    }

    @Override
    public List<Student> getFemales() {
        return getStudentByGender("Female");
    }

    @Override
    public List<Student> getOthers() {
        return getStudentByGender("Other");
    }

    private List<Student> getStudentByGender(String gender){
        List<Student> studentsList=new ArrayList<>();
        Connection connection1= SingletonConnection.getConnection();
        try{
            PreparedStatement preparedStatement=connection1.prepareStatement("select * from students where gender=?;");
            preparedStatement.setString(1, gender);
            ResultSet rs= preparedStatement.executeQuery();

            while (rs.next()){
                studentsList.add(new Student(
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getDouble("gpa")
                ));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return studentsList;
    }
}
