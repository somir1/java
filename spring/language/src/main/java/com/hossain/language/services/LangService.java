package com.hossain.language.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hossain.language.repositories.LangRepo;
import com.hossain.language.models.Lang;

@Service
public class LangService {

	// adding the book repository as a dependency
	private final LangRepo langRepo;
	
	//create constructer
	public LangService(LangRepo langRepo) {
		this.langRepo = langRepo;
	}
	
	// returns all the languages
	public List<Lang> allLang(){
		return (List<Lang>) this.langRepo.findAll();
	}
	
	// creates a language
	public Lang addLang(Lang l) {
		return this.langRepo.save(l);
	}
	
	// returns a language
	public Lang findLang(Long id) {
		return this.langRepo.findById(id).orElse(null);
	}
	
	//deletebyid
	public void killLang(Long id) {
		this.langRepo.deleteById(id);
	}
	
	//update
	public Lang langUpdate(Lang l) {
		return this.langRepo.save(l);
	}
}
