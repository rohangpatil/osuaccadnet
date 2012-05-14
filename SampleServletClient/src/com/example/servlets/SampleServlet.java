package com.example.servlets;

import java.io.IOException;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.osu.accadnet.service.NewsFeedService;
import com.osu.accadnet.service.impl.NewsFeedServiceImpl;
import com.osu.accadnet.entities.NewsFeed;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @EJB
    private NewsFeedService newsBean;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        NewsFeed nf1 = new NewsFeed();
        Date date = new Date();
//        nf1.setId(1L);
        nf1.setDateTime(date);
        nf1.setNewsCategory("newsCategory1");
        nf1.setNewsContent("newsContent1");
        newsBean.saveNewsFeed(nf1);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
