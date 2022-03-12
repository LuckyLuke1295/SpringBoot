package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Category;
import Repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public <S extends Category> S save(S entity) {
		return categoryRepository.save(entity);
	}

	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	public Optional<Category> findById(Long id) {
		return categoryRepository.findById(id);
	}

	public boolean existsById(Long id) {
		return categoryRepository.existsById(id);
	}

	public void deleteById(Long id) {
		categoryRepository.deleteById(id);
	}
	
	
	
	
	
	
	

}
