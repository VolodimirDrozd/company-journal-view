package com.testproject.controller;

import java.io.IOException; 

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testproject.model.UserLocal;;

public class HomeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	@EJB
	private UserLocal user;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		user.getInfo();
		String userInfo = user.getInfo();
		req.setAttribute("user", userInfo);
		req.getRequestDispatcher("homeV.jsp").forward(req, resp);
	}

}