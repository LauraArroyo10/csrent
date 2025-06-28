package com.csrent.service;

import com.csrent.dto.ReservationDTO;
import com.csrent.model.Reservation;
import com.csrent.model.Space;
import com.csrent.model.User;
import com.csrent.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    private ReservationRepository reservationRepository;
    private UserService userService;
    private SpaceService spaceService;

    public ReservationService(ReservationRepository reservationRepository, UserService userService, SpaceService spaceService) {
        this.reservationRepository = reservationRepository;
        this.userService = userService;
        this.spaceService = spaceService;
    }

    public List<Reservation> getAll(){
        return reservationRepository.findAll();


// hacer toda la parte que falta del crud para borrar modificar, agregar
    }

    public Reservation add (ReservationDTO reservationDTO){
     User user= userService.getUserByEmail(reservationDTO.getUserEmail());
     Space space = spaceService.getSpace(reservationDTO.getSpaceId());
      Reservation reservation= new Reservation();
      reservation.setUser(user);
      reservation.setSpace(space);
      reservation.setDataReservation(reservationDTO.getDate());
      reservation.setStatus(reservationDTO.getStatus());
      return reservationRepository.save(reservation);
    }




}
