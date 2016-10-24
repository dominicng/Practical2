package demo;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 154400m on 10/24/2016.
 */
@WebServlet(name = "BookCatalogServlet", urlPatterns = "/BookCatalog")
public class BookCatalogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    BookDBAO db= new BookDBAO();
      List<BookDetails> list= db.getAllBooks();
        PrintWriter out= response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<table>");
        for (int i=0; i<list.size();i++){
            out.println("<tr>"+list.get(i).getTitle()+("</tr>"));
            out.println("<td>"+list.get(i).getDescription()+("</tr>"));
            out.println("<td>"+list.get(i).getYear()+("</tr>"));
            out.println("<td>");
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

    }
}
