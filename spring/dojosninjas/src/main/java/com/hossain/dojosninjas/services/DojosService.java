package com.hossain.dojosninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hossain.dojosninjas.models.DojoCon;
import com.hossain.dojosninjas.models.NinjaCon;
import com.hossain.dojosninjas.repositories.DojoRepo;
import com.hossain.dojosninjas.repositories.NinjaRepo;

@Service
public class DojosService {

	// service needs to be linked to the repos 
	private final DojoRepo dojoRepo;
	private final NinjaRepo ninjaRepo;
	
	//service constructors
	public DojosService(DojoRepo dojoRepo, NinjaRepo ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}
	
	//dojo methods
	public List<DojoCon> findAllDojo(){
		return (List<DojoCon>)this.dojoRepo.findAll();
	}
	
	public DojoCon makeDojo(DojoCon d) {
		return this.dojoRepo.save(d);
	}
	
	//ninja methods
	public List<NinjaCon> findAllNinja(){
		return (List<NinjaCon>)this.ninjaRepo.findAll();
	}
	
	public NinjaCon makeNinja(NinjaCon n) {
		return this.ninjaRepo.save(n);
	}
	
	public DojoCon getDojobyID(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
}

