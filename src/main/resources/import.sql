INSERT INTO students (email, first_name, last_name, sex, student_id) VALUES ('218290@student.pwr.edu.pl', 'Tomasz', 'Krzyżowski', 'M', '218290');
INSERT INTO courses (name, type) VALUES ('Analiza matematyczna 2.4', 'W');
INSERT INTO courses (name, type) VALUES ('Analiza matematyczna 2.4', 'L');
INSERT INTO courses (name, type) VALUES ('Analiza matematyczna 2.4', 'C');
INSERT INTO courses (name, type) VALUES ('Logika', 'W');
INSERT INTO lecturers (first_name, last_name) VALUES ('Janusz', 'Gorniak');
INSERT INTO lecturers (first_name, last_name) VALUES ('Nyguen', 'Huarez');
INSERT INTO lecturers (first_name, last_name) VALUES ('Anna', 'Skrzeszewska');
INSERT INTO lecturers (first_name, last_name) VALUES ('Martyna', 'Koszka');
INSERT INTO lecturers (first_name, last_name) VALUES ('Aleksander', 'Podgorniak');
INSERT INTO may_conduct (lecturer_id, course_id) VALUES (1, 1);
INSERT INTO may_conduct (lecturer_id, course_id) VALUES (1, 2);
INSERT INTO may_conduct (lecturer_id, course_id) VALUES (2, 1);
INSERT INTO may_conduct (lecturer_id, course_id) VALUES (2, 4);
INSERT INTO may_conduct (lecturer_id, course_id) VALUES (3, 1);
INSERT INTO may_conduct (lecturer_id, course_id) VALUES (3, 3);
INSERT INTO may_conduct (lecturer_id, course_id) VALUES (1, 3);




