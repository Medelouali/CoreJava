-- Create database if not exists
CREATE DATABASE IF NOT EXISTS toto;

USE toto;

-- Drop table if it exists
DROP TABLE IF EXISTS students;

-- Table for storing student information
CREATE TABLE students (
                          student_id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(100) NOT NULL,
                          age INT,
                          gender ENUM('Male', 'Female', 'Other'),
                          gpa DECIMAL(3, 2)
);
