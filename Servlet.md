### Necessary things to write a servlet
1. servlet should be public : else it won't be accessible to any client
2. extends HttpServlet or GenericServlet class : else class is considered as single and simple .java file and not as a servlet
3. override the doGet/doPost method : logic that is supposed to be executed when client request is received, is written in doGet or doPost method
4. create and initialise PrintWriter class object to send response to client : takes response from server to send it to client

HttpServlet is used for http request
GenericServlet for all types of requests

```java
import java.io.*;  // for PrintWriter
import javax.servlet.*;  // javax is not in JDK
import javax.servlet.http.*;

public class FirstServ extends HttpServlet {
  string str = "Welcome";
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    res.setContentType("text/html");
    PrintWriter pw = res.getWriter();
    pw.println("<h3>This is first servlet program</h3>");
    pw.println(str);
  }
}
```
