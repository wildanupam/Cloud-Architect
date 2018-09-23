package org.anupam.freelancers.com.controller;

import org.anupam.freelancers.com.model.FreeLancers;
import org.anupam.freelancers.com.service.FreelancersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class FreeLancersController {
	
	@Autowired
	private FreelancersService freelancersService;
	
	@RequestMapping("/freelancers")
	public List<FreeLancers> listAllFreeLancers(){
		return freelancersService.listAllFreelancers();
	}
	
	@RequestMapping("/freelancers/{id}")
	public FreeLancers getFreeLancer(@PathVariable long id){
		return freelancersService.getFreelancer(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/freelancers")
	public ResponseEntity<FreeLancers> createFreeLancer(@RequestBody FreeLancers f){
		 freelancersService.createFreelancer(f);
		 return new ResponseEntity<FreeLancers>(f,HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/freelancers/{id}")
	public ResponseEntity<FreeLancers> updateFreeLancer(@RequestBody FreeLancers f, @PathVariable long id){
		 freelancersService.updateFreelancer(f,id);
		 return new ResponseEntity<FreeLancers>(f,HttpStatus.ACCEPTED);
	}
	
}
