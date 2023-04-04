package hw33.Servletes;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import hw33.DataBaseUtils;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lec")
public class LecPage extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;");
        PrintWriter printWriter = response.getWriter();

        printWriter.print(DataBaseUtils.getLecById(1)+"<br>");
        printWriter.print(DataBaseUtils.getLecById(2)+"<br>");
        printWriter.print(DataBaseUtils.getLecById(3)+"<br>");

        printWriter.close();
    }
}