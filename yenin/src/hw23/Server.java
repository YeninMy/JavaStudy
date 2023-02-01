package hw23;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {

        Server soc = new Server();
        soc.createServer();
    }

    void createServer() {
        try (ServerSocket serverSocket = new ServerSocket(9000);
             Socket socket = serverSocket.accept();
             Scanner scanner = new Scanner(socket.getInputStream());
             PrintWriter writer = new PrintWriter(socket.getOutputStream())) {

            final Path p = Paths.get("yenin/src/hw23/blaskList.txt");
            final List<String> strings = Files.readAllLines(p);
            for (String string : strings) {
                String s = string;
                if(Objects.equals(s, socket.getInetAddress())){
                    System.out.println("Доступ заборонено!");
                }
            }
            writer.write("Hello");
            writer.flush();

            while (scanner.hasNext()) {
                final String s = scanner.nextLine();
                writer.println("You say " + s);
                writer.flush();
                System.out.println(s);
                if (s.equals("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List getBlackList() {
        List<String> strings = null;
        try {
            final Path p = Paths.get("yenin/src/hw23/blaskList.txt");
            strings = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }
}

