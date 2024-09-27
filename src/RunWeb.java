import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import webTree.WebPage;

/**
 * Servlet implementation class BmiA
 */
@WebServlet("/RunWeb")
public class RunWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RunWeb() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestUri = request.getRequestURI();
		PrintWriter out = response.getWriter();
		
        // our search engine name is "Cafoogle" (whatever lol)
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cafoogle</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<form action='" + requestUri + "' method='post'>");
		out.println("<input type='text' name='keyword' placeholder = 'height'/>");
		out.println("<input type='submit' value='search' />");
		out.println("</form>");

        //body/web color
        out.println("<body id='WebPage' bgcolor='#E09200;>");
		
        //body/web color changes when user clicks(��������恬蕭嚙賣�潘蕭嚙�)
       out.println("<html>");
       out.println("<body id='WebPage' bgcolor='#E09200;>");
       out.println("<input type='button' onclick='ChangeBgColor()' value='���嚙踝蕭嚙賣葡嚙踝蕭嚙踝蕭��恬蕭嚙踝蕭嚙踝蕭'>");
    
       out.println("<script type='text/javascript'>");
       out.println("function ChangeBgColor(){   document.bgColor='gray'}");
       out.println("</script>");
       out.println("</body>");
       out.println("</html>");


		out.println("</body>");
		out.println("</html>");
		
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Cafoogle</title>");
		out.println("</head>");
		out.println("<body>");
		ArrayList<WebPage> webPageList=App.webPageList;
        //we need to place the search result (which is counted in other classes)
		out.println(("The searching result is: )+SearchResult"));
		for(WebPage webpage:webPageList){
            System.out.println(webpage.name+"          "+webpage.score);
        }
		//System.out.println(webpage.name+"          "+webpage.score);
		
		out.println("</body>");
		out.println("</html>");
		
		out.flush();
		out.close();
	}

}
