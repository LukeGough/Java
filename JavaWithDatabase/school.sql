### delete database if exists ###
DROP DATABASE IF EXISTS school;

### create a fresh database ###
CREATE DATABASE school;

### select the database just created ###
USE school;

### create a table ###
CREATE TABLE scores (
	SubjectName VARCHAR(32),
	Score INTEGER
);

### insert records ###
INSERT INTO scores
	(SubjectName, Score)
VALUES
	("English", 82),
	("Math", 98),
	("Science", 89),
	("Geometry", 85),
	("Physics", 94);