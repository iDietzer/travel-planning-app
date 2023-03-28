package com.travelPlanning.service;

import com.travelPlanning.model.travel.Airport;
import com.travelPlanning.model.travel.Flight;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface AirportService {

    Optional<Airport> getArrivalAirportByFlight(Flight flight);

    List<Airport> getAllAirports();

    void deleteAirportById(Long id);

    void updateAirport(Airport airport);
}
