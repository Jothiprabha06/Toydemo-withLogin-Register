package com.example.Toydemo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Toydemo.Model.ToyDemo;
import com.example.Toydemo.Service.ToyService;

@RestController
public class ToyController {

	@Autowired
	ToyService ts;
	
	@GetMapping("/fetch")
	public List<ToyDemo> getallDetails(){
		return ts.getAllDetails();
	}
	@PostMapping("/save")
	public String saveAll(@RequestBody ToyDemo a) {
		ts.saveDetails(a);
		return "Saved";
	}
	@PutMapping("/put")
	public String saveall(@RequestBody ToyDemo x) {
		ts.saveupdate(x);
		return "Updated";
	}

		@DeleteMapping("/delete/{j}")
	public String deleteDetails(@PathVariable int j) {
		ts.deleteDetails(j);
		return "Deleted";
	}
		
		@GetMapping("/auto/{field}")
		public List<ToyDemo>sortCrudD(@PathVariable String field){
			return ts.sortToy(field);
		}
		@GetMapping("/autio")
		public List<ToyDemo>sortCrudDes(@RequestParam String field){
			return ts.sortDesToy(field);
		}
		
		
		@GetMapping("/pagination")
		
		public List<ToyDemo> pagination(@RequestParam int offset,@RequestParam int pagesize){
			
			return ts.getpaginationss(offset,pagesize);
		}
		
		@GetMapping("/sortpagination")
		
		public List<ToyDemo> sortpagination(@RequestParam int offset,@RequestParam int pagesize,String field){
			
			return ts.getsortpaginations(offset,pagesize,field);
		}
		
		@GetMapping("/login")
		public String logins(@RequestParam String username, @RequestParam String password){
			
			return ts.login(username,password);
		}
		@PostMapping("/reg")
		public ToyDemo regid(@RequestBody ToyDemo id) {
			
			
			return ts.register(id);
			
		}
}
