package com.testproject.project;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testproject.model.ProjectBeanLocal;

public class ProjectRemoveServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@EJB
	private ProjectBeanLocal projectBean;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO
		req.getRequestDispatcher("project.jsp").forward(req, resp);
	}

}