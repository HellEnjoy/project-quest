import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter pw = resp.getWriter();
        pw.println("<html>");
        pw.println("<h1> Пролог </h1>");
        pw.println("<h4> Ты стоишь в космическом порту и готов поднятся на борт своего корабля. " +
                "Разве ты не об этом мечтал? Стать капитаном галактического судна, " +
                "который будет совершать подвиги под твоим командованием!</h4>");

        pw.println("<body>");
        pw.println("<form action=\"MainJSP.jsp\">\n" +
                "    <button type=\"submit\">Начать</button>\n" +
                "</form>");
        pw.println("</head>");
        pw.println("<br><br><br><br><br><br>");
        pw.println("<h5>Информация о запросе</h5>");
        pw.println("<h6> Метод: " + req.getMethod() + " </h6>");
        pw.println("<h6> URI запроса: " + req.getRequestURI() + " </h6>");
        pw.println("<h6> Протокол: " + req.getProtocol() + " </h6>");
        pw.println("<h6> Путь: " + req.getPathInfo() + " </h6>");
        pw.println("<h6> Адрес: " + req.getRemoteAddr() + " </h6>");
        pw.println("<h6> Количество игр: " + count + " </h6>");
        pw.println("</html>");

        pw.flush();
    }
}




