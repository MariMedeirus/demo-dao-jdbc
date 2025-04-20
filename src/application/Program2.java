package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("--- Test find all ---");
		List<Department> listAll = departmentDao.findAll();
		for(Department dep : listAll) {
			System.out.println(dep);
		}

	}

}
