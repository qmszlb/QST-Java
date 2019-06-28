package com.qst.itoffer.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qst.itoffer.bean.Job;
import com.qst.itoffer.dao.JobDAO;
/**
 * 职位信息处理Servlet
 *
 * @author QST青软实训
 *
 */
@WebServlet("/JobServlet")
public class JobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public JobServlet() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取操作类型
		String type = request.getParameter("type");
		if("select".equals(type)){
			// 获取职位编号
			String jobid = request.getParameter("jobid");
			// 根据职位编号查询职位详细信息
			JobDAO dao = new JobDAO();
			Job job = dao.getJobByID(jobid);
			// 将职位信息对象存入request对象
			request.setAttribute("job", job);
			// 将企业信息对象存入request对象
			request.setAttribute("company", job.getCompany());
			request.getRequestDispatcher("recruit/job.jsp").forward(request, response);
		}
	}

}
