package com.hossain.language.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hossain.language.models.Lang;

@Repository
public interface LangRepo extends CrudRepository<Lang, Long>{

}
