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
		
		System.out.println("===== Teste 1 FindById=======");
		Seller seller = sellerDao.findById(4);
		System.out.println(seller);
		
		System.out.println("");
		System.out.println("===== Teste 2 FindByDepartment=======");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
		System.out.println("");
		System.out.println("===== Teste 3 FindAll=======");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("");
		System.out.println("===== Teste 4 Insert =======");
		Seller newSeller = new Seller(null, "Daniel", "daniel@gmail.com",
				new Date(), 100000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido, Novo Id: " + newSeller.getId());
		
		
		System.out.println("");
		System.out.println("===== Teste 5 Update =======");
		seller = sellerDao.findById(9);
		seller.setName("Daniel Adriano de Araujo");
		sellerDao.update(seller);
		System.out.println("Update Realizado ");
		
		System.out.println("");
		System.out.println("===== Teste 8 Update =======");
		sellerDao.deleteById(8);
		System.out.println("Delete Realizado ");
		
		
		
		
	}

}
