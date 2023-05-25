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

import com.inti.entities.Reservation;
import com.inti.services.interfaces.IReservationService;

@RestController // RestFul ws
@CrossOrigin
public class ReservationController {

	@Autowired
	IReservationService reservationService;

	//@RequestMapping(value = "reservations", method = RequestMethod.GET)
	@GetMapping("/reservations")
	public List<Reservation> findAll() {
		return reservationService.findAll();
	}

	//@RequestMapping(value = "reservations/{idReservation}", method = RequestMethod.GET)
	@GetMapping("/reservations/{idReservation}")
	public Reservation findOne(@PathVariable("idReservation") Long id) {
		return reservationService.findOne(id);
	}

	//@RequestMapping(value = "reservations", method = RequestMethod.POST)
	@PostMapping("/reservations")
	public Reservation saveReservation(@RequestBody Reservation reservation) {
		return reservationService.save(reservation);
	}

	//@RequestMapping(value = "reservations/{idReservation}", method = RequestMethod.DELETE)
	@DeleteMapping("/reservations/{idReservation}")
	public void deleteReservation(@PathVariable("idReservation") Long id) {
		reservationService.delete(id);
	}

	//@RequestMapping(value = "reservations/{idReservation}", method = RequestMethod.PUT)
	@PutMapping("/reservations/{idReservation}")
	public Reservation updateReservation(@PathVariable("idReservation") Long id, @RequestBody Reservation reservation) {
		Reservation currentReservation = reservationService.findOne(id);
		currentReservation.setDate(reservation.getDate());
		
		return reservationService.save(currentReservation);
	}
}
