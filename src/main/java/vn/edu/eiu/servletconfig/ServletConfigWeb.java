package vn.edu.eiu.servletconfig;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletConfigWeb
 */
public class ServletConfigWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//thiết lập contentype cho response
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//dùng writer để ghi dữ liệu
		PrintWriter writer = response.getWriter();
		
		//Ghi thông tin response
		writer.println("<H1>Xin chào! Tôi là Servlet được cấu hình bằng tag tại web.xml!</h1>");
		
		//Đóng writer
		writer.close();
	}

}
