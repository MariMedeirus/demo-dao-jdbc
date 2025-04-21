package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("--- Test department find by id ---");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		
		System.out.println("--- Test find all ---");
		List<Department> listAll = departmentDao.findAll();
		for(Department x : listAll) {
			System.out.println(x);
		}
		
		
		System.out.println("--- Test insert ---");
		Department newDepartment = new Department(null, "T.I.");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		
		System.out.println("--- Test department update ---");
		dep = departmentDao.findById(5);
		dep.setName("Marketing");
		departmentDao.update(dep);
		System.out.println("Update completed");
	}

}
