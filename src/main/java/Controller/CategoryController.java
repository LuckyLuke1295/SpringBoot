package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Entity.Category;
import service.CategoryService;

@Controller
@RequestMapping("/admin/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/showlist")
	public String showCategoryList(Model model) {
		
		List<Category> categoryList = categoryService.findAll();
		
		model.addAttribute("categoryList", categoryList);
		
		
		return "Category_list";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
