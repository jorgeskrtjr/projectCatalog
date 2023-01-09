package com.backend.catalog.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.catalog.entities.Category;
import com.backend.catalog.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class categoryResource {
	 
	@Autowired
	 private CategoryService service; 
	
	 @GetMapping
	 public ResponseEntity<List<Category>> findAll(){
		 
          List<Category> list = service.findAll(); 

            return ResponseEntity.ok().body(list); 
	 }

}
