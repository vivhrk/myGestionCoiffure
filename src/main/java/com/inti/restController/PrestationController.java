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

import com.inti.entities.Prestation;
import com.inti.services.interfaces.IPrestationService;

@RestController // RestFul ws
@CrossOrigin
public class PrestationController {
	@Autowired
	IPrestationService prestationService;

	// @RequestMapping(value = "prestations", method = RequestMethod.GET)
	@GetMapping("/prestations")
	public List<Prestation> findAll() {
		return prestationService.findAll();
	}

	// @RequestMapping(value = "prestations/{idPrestation}", method = RequestMethod.GET)
	@GetMapping("/prestations/{idPrestation}")
	public Prestation findOne(@PathVariable("idPrestation") Long id) {
		return prestationService.findOne(id);
	}

	// @RequestMapping(value = "prestations", method = RequestMethod.POST)
	@PostMapping("/prestations")
	public Prestation savePrestation(@RequestBody Prestation prestation) {
		return prestationService.save(prestation);
	}

	// @RequestMapping(value = "prestations/{idPrestation}", method = RequestMethod.DELETE)
	@DeleteMapping("/prestations/{idPrestation}")
	public void deletePrestation(@PathVariable("idPrestation") Long id) {
		prestationService.delete(id);
	}

	// @RequestMapping(value = "prestations/{idPrestation}", method = RequestMethod.PUT)
	@PutMapping("/prestations/{idPrestation}")
	public Prestation updatePrestation(@PathVariable("idPrestation") Long id, @RequestBody Prestation prestation) {
		Prestation currentPrestation = prestationService.findOne(id);
		currentPrestation.setNom(prestation.getNom());
		currentPrestation.setReservation(prestation.getReservation());
		return prestationService.save(currentPrestation);
	}
}
