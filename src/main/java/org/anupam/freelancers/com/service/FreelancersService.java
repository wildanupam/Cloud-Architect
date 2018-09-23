package org.anupam.freelancers.com.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.anupam.freelancers.com.model.FreeLancers;
import org.anupam.freelancers.com.model.FreeLancers.ProjectStatus;
import org.springframework.stereotype.Service;

@Service
public class FreelancersService {
	
	static Map<Long, ProjectStatus> map1= new HashMap<Long,ProjectStatus>();
	static {map1.put((long) 1, ProjectStatus.Active);}
	public List<FreeLancers> freeLancers= new ArrayList<FreeLancers>(Arrays.asList(new FreeLancers((long) 1, "anupam", "verma","wild.anupam@gmail.com",map1)));;
	
	public List<FreeLancers> listAllFreelancers(){
		return freeLancers;
	}
	
	public FreeLancers getFreelancer(long id){
		return freeLancers.stream().filter(p -> p.getId()==id).findFirst().get();
	}
	
	public void createFreelancer(FreeLancers freeLancer){
		 freeLancers.add(freeLancer);
	}
	
	public void updateFreelancer(FreeLancers freeLancer){
		 freeLancers.add(freeLancer);
	}
	
}
