package com.hossain.dojosninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.hossain.dojosninjas.models.NinjaCon;


@Repository
public interface NinjaRepo extends CrudRepository<NinjaCon, Long>{

}
