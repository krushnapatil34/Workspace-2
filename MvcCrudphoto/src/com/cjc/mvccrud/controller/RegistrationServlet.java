package com.cjc.mvccrud.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.cjc.mvccrud.model.Student;
import com.cjc.mvccrud.service.Servicei;
import com.cjc.mvccrud.serviceImplementation.ServiceImplementation;

@WebServlet(urlPatterns = "/regi")
@MultipartConfig
public class RegistrationServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Student sd = new Student();

		String uname = request.getParameter("uname");
		String password = request.getParameter("pw");
		String mailId = request.getParameter("mailId");
		String name = request.getParameter("name");

		sd.setUname(uname);
		sd.setPw(password);
		sd.setMailId(mailId);
		sd.setName(name);
		
		Part part = request.getPart("file");
		String fileName = extractFileName(part);
		String savePath = "F:\\cjc\\workspace2\\MvcCrudphoto\\WebContent\\image\\" + File.separator + fileName;
		File fileSaveDir = new File(savePath);
		System.out.println(savePath);
		part.write(savePath + File.separator);

		sd.setImage(savePath);
		sd.setImagename(fileName);
		Servicei si = new ServiceImplementation();
		si.addStudent(sd);

		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);

	}

	private String extractFileName(Part part) {
		{
			String contentDisp = part.getHeader("content-disposition");
			String[] items = contentDisp.split(";");
			for (String s : items) {
				if (s.trim().startsWith("filename")) {
					String fname = s.substring(s.indexOf("=") + 2, s.length() - 1);
					return fname;
				}
			}
			return "";
		}
	}

}
