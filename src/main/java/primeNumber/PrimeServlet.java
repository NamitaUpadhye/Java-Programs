package primeNumber;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
	import javax.servlet.annotation.WebServlet;

	@WebServlet("/PrimeServlet")   // ⭐ MUST ADD
	public class PrimeServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("num"));
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output with steps
        out.println("<html><body>");
        out.println("<h2>Checking number: " + num + "</h2>");

        if (isPrime) {
            out.println("<h3>" + num + " is a Prime Number</h3>");
        } else {
            out.println("<h3>" + num + " is NOT a Prime Number</h3>");
        }

        out.println("<p>Step 1: A prime number has only 2 factors (1 and itself)</p>");
        out.println("<p>Step 2: Checked divisibility from 2 to n/2</p>");
        out.println("<p>Step 3: No divisors found → Prime</p>");

        out.println("</body></html>");
    }
}