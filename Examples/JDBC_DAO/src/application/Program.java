package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
//		
//		Seller seller = sellerDao.findById(3);
//		
//		System.out.println(seller);
		Department department = new Department(1, null);
		
//		List<Seller> sellers = sellerDao.findByDepartment(department);
//		List<Seller> sellers = sellerDao.findAll();
//		
//		for(Seller obj : sellers) {
//			System.out.println(obj);
//		}
		
//		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);		
		
		Seller s = sellerDao.findById(2);
		System.out.println(s);
		s.setName("Maria Purple");
		sellerDao.update(s);
		
		sellerDao.deleteById(9);
			
	}
}

