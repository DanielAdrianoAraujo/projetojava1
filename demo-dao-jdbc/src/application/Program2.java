package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== Teste 1 FindById=======");
		Department department = depDao.findById(2);
		System.out.println(department);
		
		System.out.println();
		System.out.println("===== Teste 2 FindAll=======");
		List<Department> listDep = depDao.findAll();
		for (Department dep2 : listDep) {
			System.out.println(dep2);
		}
		
		
		System.out.println("");
		System.out.println("===== Teste 3 Insert =======");
		Department newDepartment = new Department(null, "Veterinarios");
		depDao.insert(newDepartment);
		System.out.println("Inserido no Dep, Novo Id: " + newDepartment.getId());
		
		
		System.out.println("");
		System.out.println("===== Teste 4 Update =======");
		Department updepartment = depDao.findById(7);
		Department upnewDepartment = new Department();
		upnewDepartment.setId(updepartment.getId());
		upnewDepartment.setName("Ração para Pets");
		depDao.update(upnewDepartment);
		System.out.println("Update Realizado ");
		
		
		System.out.println("");
		System.out.println("===== Teste 5 Delete =======");
		depDao.deleteById(6);
		System.out.println("Delete Realizado ");
		
}
	
	
}
