package application;

import java.util.Date;

import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(18,"Mariana","mariana@hotmail.com",new Date(),1500.0, obj);
		
		System.out.println(obj);
		System.out.println(seller);
	}

}
