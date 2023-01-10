package com.backend.catalog.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.catalog.dto.CategoryDTO;
import com.backend.catalog.entities.Category;
import com.backend.catalog.repositories.CategoryRepository;


@Service
public class CategoryService {
    
	@Autowired
	private CategoryRepository repository; 
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll(){
		
		List <Category> list = repository.findAll(); 
		
		List <CategoryDTO> dtoList = new ArrayList<>(); 
		
		for(Category category : list) {
		  dtoList.add(new CategoryDTO(category));
		}
		
		return dtoList; 
	}
}
