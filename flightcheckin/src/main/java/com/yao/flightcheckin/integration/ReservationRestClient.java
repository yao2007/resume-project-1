package com.yao.flightcheckin.integration;

import com.yao.flightcheckin.integration.dto.Reservation;
import com.yao.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);

}
