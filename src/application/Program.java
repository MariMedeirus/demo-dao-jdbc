package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("--- Test find by id ---");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
		
		System.out.println("--- Test find by Department");
		Department department = new Department(4,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller sel : list) {
			System.out.println(sel);
		}
;	}

}
