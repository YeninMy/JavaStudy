--sql.p1
CREATE TABLE courses (
  course_id SERIAL PRIMARY KEY,
  course_name TEXT NOT NULL
);

CREATE TABLE students (
  student_id SERIAL PRIMARY KEY,
  first_name TEXT NOT NULL,
  last_name TEXT NOT NULL
);

CREATE TABLE teachers (
  teacher_id SERIAL PRIMARY KEY,
  first_name TEXT NOT NULL,
  last_name TEXT NOT NULL
);

CREATE TABLE lectures (
  lecture_id SERIAL PRIMARY KEY,
  lecture_name TEXT NOT NULL,
  course_id INTEGER REFERENCES courses(course_id),
  teacher_id INTEGER REFERENCES teachers(teacher_id),
  lecture_date DATE NOT NULL
);

CREATE TABLE materials (
  material_id SERIAL PRIMARY KEY,
  material_name TEXT NOT NULL,
  material_type TEXT NOT NULL,
  lecture_id INTEGER REFERENCES lectures(lecture_id)
);

CREATE TABLE homework (
  homework_id SERIAL PRIMARY KEY,
  homework_name TEXT NOT NULL,
  lecture_id INTEGER REFERENCES lectures(lecture_id),
  student_id INTEGER REFERENCES students(student_id)
);

CREATE TABLE course_students (
  course_id INTEGER REFERENCES courses(course_id),
  student_id INTEGER REFERENCES students(student_id),
  PRIMARY KEY (course_id, student_id)
);
