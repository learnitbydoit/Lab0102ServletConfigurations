package vn.edu.eiu.servletconfig;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/servlet-anotation-config","/servlet-anotation"})
public class ServletConfigAnotation extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Set content type
		resp.setContentType("text/html");
		
		//Tạo đối tượng ghi
		PrintWriter writer = resp.getWriter();
		
		//Ghi dữ liệu
		writer.println("<h1>Xin chào! Tôi là Servlet được cấu hình bằng Servlet Anotation</h1>");
		
		//Đóng writer
		writer.close();
		
	}
	
}
