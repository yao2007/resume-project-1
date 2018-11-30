package com.yao.flightreservation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yao.flightreservation.entities.Reservation;
import com.yao.flightreservation.repos.FlightRepository;
import com.yao.flightreservation.repos.PassengerRepository;
import com.yao.flightreservation.repos.ReservationRepository;
import com.yao.flightreservation.util.EmailUtil;
import com.yao.flightreservation.util.PDFGenerator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightreservationApplicationTests {

	@Autowired
	PassengerRepository repo;

	@Autowired
	FlightRepository flightRepo;

	@Autowired
	ReservationRepository reservationRepo;

	@Autowired
	PDFGenerator pdfGenerator;

	@Autowired
	EmailUtil emailUtil;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testGenerateItenarary() {
		Reservation reservation = reservationRepo.findOne(1L);
		String filePath = "/Users/yao/Documents/reservations/reservation" + reservation.getId() + ".pdf";
		pdfGenerator.generateItinerary(reservation, filePath);
	}

	@Test
	public void testEmail() {
		Reservation reservation = reservationRepo.findOne(1L);
		String filePath = "/Users/yao/Documents/reservations/reservation" + reservation.getId() + ".pdf";
		emailUtil.sendItinerary("alice.alex2007@gmail.com", filePath);
	}

}
