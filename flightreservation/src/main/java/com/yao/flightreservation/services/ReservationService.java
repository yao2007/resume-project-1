package com.yao.flightreservation.services;

import com.yao.flightreservation.dto.ReservationRequest;
import com.yao.flightreservation.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);

}
