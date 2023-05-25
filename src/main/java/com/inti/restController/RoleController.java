package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Role;
import com.inti.services.interfaces.IRoleService;

@RestController // RestFul ws
@CrossOrigin
public class RoleController {
	@Autowired
	IRoleService roleService;

	// @RequestMapping(value = "roles", method = RequestMethod.GET)
	@GetMapping("/roles")
	public List<Role> findAll() {
		return roleService.findAll();
	}

	// @RequestMapping(value = "roles/{idRole}", method = RequestMethod.GET)
	@GetMapping("/roles/{idRole}")
	public Role findOne(@PathVariable("idRole") Long id) {
		return roleService.findOne(id);
	}

	// @RequestMapping(value = "roles", method = RequestMethod.POST)
	@PostMapping("/roles")
	public Role saveRole(@RequestBody Role role) {
		return roleService.save(role);
	}

	// @RequestMapping(value = "roles/{idRole}", method = RequestMethod.DELETE)
	@DeleteMapping("/roles/{idRole}")
	public void deleteRole(@PathVariable("idRole") Long id) {
		roleService.delete(id);
	}

	// @RequestMapping(value = "roles/{idRole}", method = RequestMethod.PUT)
	@PutMapping("/roles/{idRole}")
	public Role updateRole(@PathVariable("idRole") Long id, @RequestBody Role role) {
		Role currentRole = roleService.findOne(id);
		currentRole.setLibelle(role.getLibelle());
		return roleService.save(currentRole);
	}
}
