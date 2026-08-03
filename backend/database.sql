CREATE DATABASE OnlineExam;

USE OnlineExam;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(50),
    role VARCHAR(20)
);

CREATE TABLE questions (
    id INT PRIMARY KEY AUTO_INCREMENT,
    question TEXT,
    optionA VARCHAR(100),
    optionB VARCHAR(100),
    optionC VARCHAR(100),
    optionD VARCHAR(100),
    answer CHAR(1)
);

CREATE TABLE results (
    id INT PRIMARY KEY AUTO_INCREMENT,
    studentName VARCHAR(50),
    marks INT
);

INSERT INTO users(username,password,role)
VALUES
('admin','admin123','ADMIN'),
('student','student123','STUDENT');