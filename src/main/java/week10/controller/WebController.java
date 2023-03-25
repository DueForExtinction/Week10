/**
 * 
 */
package week10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import week10.beans.InventoryItem;
import week10.repository.InventoryRepository;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Mar 24, 2023
 */
@Controller
public class WebController {
	@Autowired
	InventoryRepository repo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllInvItems(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewInvItem(model);
		}
		model.addAttribute("inventoryitem",repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputItem")
	public String addNewInvItem(Model model) {
		InventoryItem i = new InventoryItem();
		model.addAttribute("newItem",i);
		return "input";
	}
	
	@PostMapping("/inputItem")
	public String addNewInvItem(@ModelAttribute InventoryItem i, Model model) {
		repo.save(i);
		return viewAllInvItems(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateInvItem(@PathVariable("id") long id, Model model) {
		InventoryItem i = repo.findById(id).orElse(null);
		model.addAttribute("newItem", i);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseItem(InventoryItem i, Model model) {
		repo.save(i);
		return viewAllInvItems(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteItem(@PathVariable("id") long id, Model model) {
		InventoryItem i = repo.findById(id).orElse(null);
		repo.delete(i);
		return viewAllInvItems(model);
	}
}
