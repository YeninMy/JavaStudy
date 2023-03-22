--sql.p2
--Виведіть дані про студентів, відсортованих за прізвищем

SELECT first_name, last_name
FROM students
ORDER BY last_name;

--Виведіть назву лекції та кількість додаткових матеріалів, які вона містить, відсортовані за датою та які проходили до 2023 року.

SELECT lectures.lecture_name, COUNT(materials.material_id) AS num_materials
FROM lectures
LEFT JOIN materials ON lectures.lecture_id = materials.lecture_id
WHERE lecture_date < '2023-01-01'
GROUP BY lectures.lecture_id
ORDER BY lecture_date;

--Виведіть інформацію про лекцію, створену раніше всіх і які мають найбільшу кількість домашніх завдань.

SELECT *
FROM lectures
WHERE lecture_id = (
  SELECT lecture_id
  FROM (
    SELECT lecture_id, COUNT(homework_id) AS num_homeworks
    FROM homework
    GROUP BY lecture_id
    ORDER BY num_homeworks DESC
    LIMIT 1
  ) AS most_homeworks
);

--Виведіть кількість додаткових матеріалів за кожною категорією (URL, VIDEO, BOOK).

SELECT material_type, COUNT(material_id) AS num_materials
FROM materials
GROUP BY material_type;

--Виведіть на екран список вчителів, прізвища яких починаються з літер, що стоять до літери N англійського алфавіту або "Н" української.

SELECT first_name, last_name
FROM teachers
WHERE last_name ILIKE 'n%' OR last_name ILIKE 'н%'
ORDER BY last_name;

--Виведіть прізвище та ім'я студентів, які записані лише на один курс, на два курси одночасно та на три та більше, відсортовані на прізвище.

SELECT s.last_name, s.first_name, COUNT(cs.course_id) as course_count
FROM students s
JOIN course_students cs ON s.student_id = cs.student_id
GROUP BY s.student_id
HAVING COUNT(cs.course_id) = 1
ORDER BY s.last_name;

SELECT s.last_name, s.first_name, COUNT(cs.course_id) as course_count
FROM students s
JOIN course_students cs ON s.student_id = cs.student_id
GROUP BY s.student_id
HAVING COUNT(cs.course_id) = 2
ORDER BY s.last_name;

SELECT s.last_name, s.first_name, COUNT(cs.course_id) as course_count
FROM students s
JOIN course_students cs ON s.student_id = cs.student_id
GROUP BY s.student_id
HAVING COUNT(cs.course_id) >= 3
ORDER BY s.last_name;

--sql.p3
--Виведіть назву лекції, прізвище та ім'я вчителя, відсортовані за датою лекції:

SELECT lectures.lecture_name, teachers.last_name, teachers.first_name, lectures.lecture_date
FROM lectures
JOIN teachers ON lectures.teacher_id = teachers.teacher_id
ORDER BY lectures.lecture_date;

--Виведіть прізвище та ім'я вчителя та кількість лекцій, які він викладає:

SELECT teachers.last_name, teachers.first_name, COUNT(*) AS num_lectures
FROM lectures
JOIN teachers ON lectures.teacher_id = teachers.teacher_id
GROUP BY teachers.teacher_id;

--Виведіть дати всіх лекцій та їх назви для вчителя з ідентифікатором 3, відсортованих за датою:

SELECT lectures.lecture_date, lectures.lecture_name
FROM lectures
WHERE lectures.teacher_id = 3
ORDER BY lectures.lecture_date;

--Виведіть назву курсу, кількість лекцій, кількість вчителів, студентів, кількість домашніх завдань та додаткових матеріалів:

SELECT courses.course_name, COUNT(DISTINCT lectures.lecture_id) AS num_lectures,
COUNT(DISTINCT lectures.teacher_id) AS num_teachers, COUNT(DISTINCT course_students.student_id) AS num_students,
COUNT(DISTINCT homework.homework_id) AS num_homeworks, COUNT(DISTINCT materials.material_id) AS num_materials
FROM courses
LEFT JOIN lectures ON lectures.course_id = courses.course_id
LEFT JOIN course_students ON course_students.course_id = courses.course_id
LEFT JOIN homework ON homework.lecture_id = lectures.lecture_id
LEFT JOIN materials ON materials.lecture_id = lectures.lecture_id
GROUP BY courses.course_name;

--Виведіть назву місяця та кількість лекцій за цей період:

SELECT TO_CHAR(lecture_date, 'Month') AS month,
       COUNT(*) AS lecture_count
FROM lectures
GROUP BY TO_CHAR(lecture_date, 'Month'), EXTRACT(MONTH FROM lecture_date)
ORDER BY EXTRACT(MONTH FROM lecture_date);

--Виведіть на екран ім'я даних, яких більше, та їх кількість, порівнюючи кількість домашніх завдань та додаткові матеріали:

WITH num_homeworks AS (
    SELECT COUNT(*) AS count, 'homeworks' AS name FROM homework
),
num_materials AS (
    SELECT COUNT(*) AS count, 'materials' AS name FROM materials
)
SELECT name, count
FROM num_homeworks
UNION
SELECT name, count
FROM num_materials
ORDER BY count DESC
LIMIT 1;