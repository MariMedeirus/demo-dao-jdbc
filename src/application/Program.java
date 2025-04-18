package application;

import java.util.Date;
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
		
		System.out.println("--- Test find by Department ---");
		Department department = new Department(4,null);
		List<Seller> listDepartment = sellerDao.findByDepartment(department);
		for(Seller sel : listDepartment) {
			System.out.println(sel);
		}
		
		System.out.println("--- Test find all ---");
		List<Seller> listAll = sellerDao.findAll();
		for(Seller sel : listAll) {
			System.out.println(sel);
		}
		
		System.out.println("--- Test find all ---");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("--- Test seler update ---");
		seller = sellerDao.findById(12);
		seller.setName("Joey");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("--- Test deleteById ---");
		sellerDao.deleteById(14);
		System.out.println("Delete completed");
	}

}
