package com.hossain.dojosninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hossain.dojosninjas.models.DojoCon;


@Repository
public interface DojoRepo extends CrudRepository<DojoCon, Long>{

}
