package hw31;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    Teacher teacher1 = new Teacher(1, "Sveta", "zhuravel@gmail.com");
    Teacher teacher2 = new Teacher(2, "Russel", "ruslanmeta.ua");

    @Test
    void testWriteTeacher() throws Exception {
            Path path = Paths.get("src/test/java/hw31/teacherTestLog.txt");
            Files.createFile(path);
            Teacher.writeTeacher(teacher1, path);
            String logContent = Files.readString(path);
            assertTrue(logContent.contains("Teacher added:"));
            assertTrue(logContent.contains(teacher1.toString()));
            Files.deleteIfExists(path);
        }

    @Test
    void testGetByIdIfTeacherExist() {
        Teacher expected = Teacher.getById(1);
        Teacher actual = teacher1;
        assertEquals(Teacher.getById(1),teacher1);
    }

    @Test
    void testGetByIdIfTeacherNotExist() {
        Teacher expected = Teacher.getById(3);
        assertNull(expected);
    }

    @Test
    void testIsValidEmailValid() {
        assertTrue(teacher1.isEmailValid());
    }
    @Test
    void testIsInvalidEmailInvalid() {
        assertFalse(teacher2.isEmailValid());
    }

}