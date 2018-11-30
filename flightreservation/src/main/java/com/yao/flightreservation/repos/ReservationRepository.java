package com.yao.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yao.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
