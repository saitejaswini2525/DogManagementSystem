/*  
 * @author Yarapathineni Saitejaswini
 */
 
package com.yarapathineniClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yarapathineniClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
	

}
