package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("--- Test find by id ---");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
	}

}
