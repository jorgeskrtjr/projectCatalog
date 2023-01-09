package com.backend.catalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.catalog.entities.Category;
import com.backend.catalog.repositories.CategoryRepository;

@Service
public class CategoryService {
    
	@Autowired
	private CategoryRepository repository; 
	
	public List<Category> findAll(){
		
		return repository.findAll(); 
	}
}
