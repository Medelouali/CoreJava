package org.example.jdbcApi;

import java.util.List;

public interface StudentDAO {
    void saveStudent(Student student);
    List<Student> getStudents();
    void dropAll();

    List<Student> getMales();
    List<Student> getFemales();
    List<Student> getOthers();
}
