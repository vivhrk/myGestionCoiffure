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
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Salon;
import com.inti.services.interfaces.ISalonService;

@RestController // RestFul ws
@CrossOrigin
public class SalonController {

	@Autowired
	ISalonService salonService;
	
	//@RequestMapping(value = "salons", method = RequestMethod.GET)
	@GetMapping("/salons")
	public List<Salon> findAll() {
		return salonService.findAll();
	}

	//@RequestMapping(value = "salons/{idSalon}", method = RequestMethod.GET)
	@GetMapping("/salons/{idSalon}")
	public Salon findOne(@PathVariable("idSalon") Long id) {
		return salonService.findOne(id);
	}

	//@RequestMapping(value = "salons", method = RequestMethod.POST)
	@PostMapping("/salons")
	public Salon saveSalon(@RequestBody Salon salons) {
		return salonService.save(salons);
	}

	//@RequestMapping(value = "salons/{idSalon}", method = RequestMethod.DELETE)
	@DeleteMapping("/salons/{idSalon}")
	public void deleteSalon(@PathVariable("idSalon") Long id) {
		salonService.delete(id);
	}

	//@RequestMapping(value = "salons/{idSalon}", method = RequestMethod.PUT)
	@PutMapping("/salons/{idSalon}")
	public Salon updateSalon(@PathVariable("idSalon") Long id, @RequestBody Salon salons) {
		Salon currentSalon = salonService.findOne(id);
		currentSalon.setNom(salons.getNom());
		currentSalon.setAdresse(salons.getAdresse());
		currentSalon.setReservation(salons.getReservation());
		
		return salonService.save(currentSalon);
}
}
