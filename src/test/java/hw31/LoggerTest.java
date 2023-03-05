package hw31;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTest {


    static final String tempFilePathString = "src/test/java/hw31/tempFile.txt";
    static final Path tempFilePath = Paths.get(tempFilePathString);
    ByteArrayOutputStream baos = null;

    @BeforeEach
    void beforeEach() {
        baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
    }


    @Test
    public void testCreateFileNewFile() {
        Logger.createFile(tempFilePathString);
        String expectedMessage = "File created: " + tempFilePathString;
        String actualMessage = baos.toString().replace("\\", "/").trim();
        assertEquals(expectedMessage, actualMessage);
        assertTrue(Files.exists(tempFilePath));

    }


    @Test
    public void testCreateFileIfExistingFile() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        Logger.createFile(tempFilePathString);
        String expectedMessage = "This file exists: " + tempFilePathString;
        String actualMessage = baos.toString().replace("\\", "/").trim();
        assertEquals(expectedMessage, actualMessage);
        System.setOut(System.out);

    }


    @Test
    public void testReadTextExistingFile() throws IOException {
        List<String> expected = Arrays.asList("line 1", "line 2", "line 3");
        Files.write(tempFilePath, expected);
        Logger.readText(tempFilePath.toString());
        String expectedText = String.join("\n", expected).trim();
        String actualText = baos.toString().trim();
        assertEquals(expectedText.replaceAll("\\r\\n", "\n"), actualText.replaceAll("\\r\\n", "\n"));
    }

    @Test
    public void testReadTextNonExistingFile() {
        assertThrows(NoSuchFileException.class, () ->
                Logger.readText("src/test/java/hw31/noexist.txt"));
    }
    @Test
    public void testLogsToListExistingFile() throws IOException {
        List<String> expectedText = Arrays.asList("line 1", "line 2", "line 3");
        Files.write(tempFilePath, expectedText);
        List<String> actualText = Logger.logsToList(tempFilePath.toString());
        assertEquals(expectedText, actualText);
    }

    @Test
    public void testLogsToListNonExistingFile() {
        assertThrows(NoSuchFileException.class, () -> Logger.logsToList("non-existing-file.txt"));
    }


    @AfterEach
    void afterEach() {
        System.setOut(System.out);
    }

    @AfterAll
    static void afterAll() throws IOException {
        Files.deleteIfExists(tempFilePath);
    }
}