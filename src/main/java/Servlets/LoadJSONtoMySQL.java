package Servlets;

import Serialize.SaveBeanToJSON;

import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
public class LoadJSONtoMySQL extends javax.servlet.http.HttpServlet
{
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException
    {

    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1>create JSON on computer, bratiwka</h1>");
        SaveBeanToJSON createEmptyClass = new SaveBeanToJSON();
//        createEmptyClass.createJsonOnComputer();
        pw.println("</html>");
    }
}
