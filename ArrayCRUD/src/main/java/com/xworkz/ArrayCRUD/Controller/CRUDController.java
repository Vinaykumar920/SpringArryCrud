package com.xworkz.ArrayCRUD.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.ArrayCRUD.DTO.RegisterDTO;
import com.xworkz.ArrayCRUD.Dao.ArrayCrudDao;

@RestController
public class CRUDController {
	
	@Autowired
	ArrayCrudDao arrayCRUDDAO;
	
	
	@GetMapping("get")
	public String getName() {
		return "vinay";
	}

	@PostMapping("save")
	public RegisterDTO registerDetails(@RequestBody  RegisterDTO data) {
		System.out.println(data.getName());
		arrayCRUDDAO.save(data);
	   return data;
	}
	
	@PostMapping("display")
    public String displayRecord() {
     System.out.println("display method is calling");
     arrayCRUDDAO.display();
    	return "data displayed";
    }
	
	@GetMapping("update")
	public String updatePassByMail( String email,  String pass) {
		return "email is : " +email+ "\t"+ "password is: "+pass;
	}
	
	//display by id method
	
	
	@PostMapping("displayId")
	public String getById(int id) {
		arrayCRUDDAO.displayByID(id);
		return "check in console output";
		
	}
	
	
	
	
	
	
	     //display by name
		@PostMapping("getByName")
		public String getByName(@RequestParam String name) {
			arrayCRUDDAO.displayByName(name);
			return "check in console output";
			
		}
			
		
		//display by contact
		@PostMapping("getByContact")
		public String getByContact(@RequestParam long contact) {
			arrayCRUDDAO.displayByContact(contact);
			return "check in console output";
			
		}


		
		//display by email
		@PostMapping("getByEmail")
		public String getByEmail(@RequestParam String email) {
			arrayCRUDDAO.displayByEmail(email);
			return "check in console output";
			
		}
				
		    //update by id
			@PostMapping("updateById")
			public String updateByid(	@RequestParam int id, @RequestParam long contact) {
				arrayCRUDDAO.updateById(id,contact);
				return "check in console output";
				
			}
			
			
			
	      //delete by name
	     	@PostMapping("deleteByName")
		public String deleteByName(@RequestParam String name) {
			arrayCRUDDAO.deleteByName(name);
			return "check in console output";
			
		}
			
	
	
		
}
