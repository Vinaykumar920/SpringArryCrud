package com.xworkz.ArrayCRUD.Dao;

import org.springframework.stereotype.Component;

import com.xworkz.ArrayCRUD.DTO.RegisterDTO;


@Component
public class ArrayCrudDao {

	RegisterDTO dto[] = new RegisterDTO[3];
	int index = 0;
	
	
	// saving data
	public boolean save(RegisterDTO data) {
		dto[index] = data;
		index++;
		System.out.println("saving data");
		return true;
	}

	
	//display method
	
	public boolean display() {
		
		for (int i = 0; i < dto.length; i++) {
			
			if(dto[i] !=null) {
				System.out.println("----");
				System.out.println("data are displaying");
				System.out.println(dto[i].getName());
				System.out.println(dto[i].getEmail());
				System.out.println(dto[i].getContact());
				System.out.println(dto[i].getPass());
				System.out.println(dto[i].getId());
				System.out.println("-----");
				System.out.println();
				
			}
		}
		
		return true;
	}
	
	//display by id
	
	public void displayByID(int id) {
		
		System.out.println("display by id method invoked");
		for (int i = 0; i < dto.length; i++) {
		if (dto[i].getId() == id){
			System.err.println("-----");
			System.out.println("the Id belong to :"); 
			System.out.println(dto[i].getName());
			System.out.println(dto[i].getEmail());
			System.out.println(dto[i].getContact());
			System.out.println(dto[i].getPass()); 
			System.out.println(dto[i].getId());
			System.out.println("-----");
			System.out.println();
			
		}
			
		}
	}
	
	


	
	
	// display by name
		public void displayByName(String name) {

			System.out.println("display by name method invoked");
			for (int i = 0; i < dto.length; i++) {
				if (dto[i].getName().equals(name)) {
					System.out.println("-------------------");
					System.out.println("This name belongs to : ");
					System.out.println(dto[i].getId());
					System.out.println(dto[i].getName());
					System.out.println(dto[i].getEmail());
					System.out.println(dto[i].getContact());
					System.out.println(dto[i].getPass());
					System.out.println("-------------------");

				}

			}
		}

		// display by Contact number
		public void displayByContact(long contact) {

			System.out.println("display by Contact method invoked");
			for (int i = 0; i < dto.length; i++) {
				if (dto[i].getContact() == contact) {
					System.out.println("-------------------");
					System.out.println("This contact numbers belongs to : ");
					System.out.println(dto[i].getId());
					System.out.println(dto[i].getName());
					System.out.println(dto[i].getEmail());
					System.out.println(dto[i].getContact());
					System.out.println(dto[i].getPass());
					System.out.println("-------------------");

				}

			}
		}

		// display by email id
		public void displayByEmail(String email) {

			System.out.println("display by email method invoked");
			for (int i = 0; i < dto.length; i++) {
				if (dto[i].getEmail().equals(email)) {
					System.out.println("-------------------");
					System.out.println("This email belongs to : ");
					System.out.println(dto[i].getId());
					System.out.println(dto[i].getName());
					System.out.println(dto[i].getEmail());
					System.out.println(dto[i].getContact());
					System.out.println(dto[i].getPass());
					System.out.println("-------------------");

				}

			}
		}

		// update by id
		public void updateById(int id, long contact) {
			System.out.println();
			System.out.println("update method invoked");
			for (int i = 0; i < dto.length; i++) {
				if (dto[i].getId() == id) {
					dto[i].setContact(contact);
					System.out.println("updated succesfuly");

				}
			}

		}
		
		//delete by name
		public void deleteByName(String name) {
			System.out.println();
			System.out.println("delete method invoked");
			for (int i = 0; i < dto.length; i++) {
				if (dto[i].getName().equals(name)) {
					dto[i] = null;
					System.out.println("item is deleted");
					

				}

			}

		}

	
	
	
}
