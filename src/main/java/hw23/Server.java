package hw23;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {

//        addToBlackList("192.168.0.106");
        Server soc = new Server();
        soc.createServer();
    }

    void createServer() {
        try (ServerSocket serverSocket = new ServerSocket(9000);
             Socket socket = serverSocket.accept();
             Scanner scanner = new Scanner(socket.getInputStream());
             PrintWriter writer = new PrintWriter(socket.getOutputStream())) {
            final Path p = Paths.get("yenin/src/hw23/blackList.txt");
            final List<String> strings = Files.readAllLines(p);
            String ip = socket.getInetAddress().getHostAddress();
            for (String string : strings) {
                if (Objects.equals(string, ip)) {
                    writer.println("Access denied!");
                    writer.println("");
                }
            }
            writer.println("Hello! You just connected from ip: " + ip);
            writer.println("");
            writer.flush();

            while (scanner.hasNext()) {
                final String s = scanner.nextLine();
                writer.println("Client request: " + s);
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

    public static void addToBlackList(String ip) {
        try {
            final Path p = Paths.get("yenin/src/hw23/blackList.txt");
            Files.write(p, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
            Files.write(p, ip.getBytes(), StandardOpenOption.APPEND);
            System.out.println("New IP added to blacklist: " + ip);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

