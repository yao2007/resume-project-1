package com.yao.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yao.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
