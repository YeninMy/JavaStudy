package hw23;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
        System.out.println(InetAddress.getLocalHost());}
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 9000), 2000);
            Scanner scanner = new Scanner(socket.getInputStream());
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


//    void createClient() {
//      try (Socket socket = new Socket()) {
//            Scanner scanner = new Scanner(socket.getInputStream());
//            socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 57688), 2000);
//            while (scanner.hasNext()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

