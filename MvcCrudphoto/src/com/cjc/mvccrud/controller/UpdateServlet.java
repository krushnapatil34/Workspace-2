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

@WebServlet("/edit")
@MultipartConfig
public class UpdateServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Student sd = new Student();
		Servicei si= new ServiceImplementation();
		int idd = Integer.parseInt(request.getParameter("rad"));
		sd.setId(idd);
		sd.setUname(request.getParameter("uname"));
		sd.setPw(request.getParameter("pw"));
		sd.setMailId(request.getParameter("mailId"));
		sd.setName(request.getParameter("name"));
		si.update(sd);

		// rg.setUname(uname);
		// rg.setPw(password);
		// rg.setMailId(mailId);
		// rg.setName(name);
		//List<Regipojo> list=session.createQuery(query).getResultList();
	
		Part part = request.getPart("file");
		String fileName = extractFileName(part);
		if(!fileName.equals(""))
		{
			String savePath = "F:\\cjc\\workspace2\\MvcCrudphoto\\WebContent\\image" + File.separator + fileName;
			File fileSaveDir = new File(savePath);
			
			part.write(savePath + File.separator);
			
			sd.setImage(savePath);
			sd.setImagename(fileName);
		}
		else
		{
			sd.setImage(request.getParameter("oldfile"));
		}
	
			request.setAttribute("data", si.getAlldata());
	RequestDispatcher rd= request.getRequestDispatcher("Success.jsp");
	rd.forward(request, response);
		

	}
	private String extractFileName(Part part) 
	{
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for(String s: items) 
		{
			if(s.trim().startsWith("filename")) 
			{
				String fname=s.substring(s.indexOf("=") + 2, s.length()-1);
				return fname;
			}
		}
		return "";
	}	
	}

