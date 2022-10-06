package com.valtech.training.assignment;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.valtech.dao.Employee;
import com.valtech.dao.EmployeeDAO;

@WebServlet(urlPatterns = { "/empCtlr" })
public class EmployeeControllerServlet extends HttpServlet {

	private EmployeeDAO dao;

	public void init() throws ServletException {
		dao = new EmployeeDAO();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String submit = req.getParameter("submit");
		try {
			if ("New Employee".equals(submit)) {
				req.getRequestDispatcher("createEmp.jsp").forward(req, resp);
				return;
			}
			if ("update Employee".equals(submit)) {
				req.getRequestDispatcher("UpdateEmp.jsp").forward(req, resp);
				return;
			}

			if ("update".equals(submit)) {
				Employee e = new Employee();
				e.setId(Integer.parseInt(req.getParameter("id")));
				e.setName(req.getParameter("name"));
				e.setAge(Integer.parseInt(req.getParameter("age")));
				e.setGender(Integer.parseInt(req.getParameter("gender")));
				e.setSalary(Float.parseFloat(req.getParameter("salary")));
				dao.updateEmployee(e);
			}

			if ("Save".equals(submit)) {
				Employee e = new Employee();
				e.setId(dao.getNextValidId());
				e.setName(req.getParameter("name"));
				e.setAge(Integer.parseInt(req.getParameter("age")));
				e.setGender(Integer.parseInt(req.getParameter("gender")));
				e.setSalary(Float.parseFloat(req.getParameter("salary")));
				dao.saveEmployee(e);

			} else {

			}
			req.setAttribute("emps", dao.getEmployees());
			req.getRequestDispatcher("emps.jsp").forward(req, resp);
		} catch (Exception ex ){
			throw new RuntimeException(ex);
		}
	}
	// http://localhost:8080/valtechWeb3/empCtlr?empId=3
	// http://localhost:8080/valtechWeb3/empCtlr
	// http://localhost:8080/valtechWeb3/createEmp.jsp
	// http://localhost:8080/valtechWeb3/empCtlr

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Login here and forward to JSP Page
		try {
			String empId = req.getParameter("empId");
			String submit = req.getParameter("submit");

			if (empId == null) {

				loadEmpsAndGotoEmpsPage(req, resp);
				return;
			}
			int id = Integer.parseInt(req.getParameter("empId"));
			if ("delete".equals(submit)) {
				dao.deleteEmployee(id);
				loadEmpsAndGotoEmpsPage(req, resp);
				return;
			}
			Employee e = dao.getEmployee(id);
			req.setAttribute("e", e);
			req.getRequestDispatcher("emp.jsp").forward(req, resp);
			
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	private void loadEmpsAndGotoEmpsPage(HttpServletRequest req, HttpServletResponse resp)
			throws Exception, ServletException, IOException {
		List<Employee> emps = dao.getEmployees();
		req.setAttribute("emps", emps);
		req.getRequestDispatcher("emps.jsp").forward(req, resp);
	}
}