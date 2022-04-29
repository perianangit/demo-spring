package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceController {
	
	@GetMapping("dept/adddept")
	public String addDept() {
		System.out.println("add dept");
		return "success";
	}
	@GetMapping("dept/listdept")
	public String listDept() {
		System.out.println("list dept");
		return "list success";
	}
	@GetMapping("dept/updatedept")
    public String updateDept() {
    	System.out.println("update dept");
    	return "update success";
	}
	@GetMapping("dept/deletedept")
     public String deleteDept() {
    	 System.out.println("delete dept");
    	 return "delete success";
    }

}
