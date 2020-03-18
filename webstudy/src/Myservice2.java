import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/mylogin")
public class Myservice2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getMethod());

        System.out.println(req.getContextPath());

        System.out.println(req.getRequestURI());

        System.out.println(req.getRequestURL());

        String header = req.getHeader("User-Agent");
        if(header.contains("Firefox")){
            System.out.println("Firefox 来了！！！");
        }
    }
}
