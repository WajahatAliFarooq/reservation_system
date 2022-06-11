package com.reservation.Reservation.mapper;

import com.reservation.Reservation.entity.Reservation;
import com.reservation.Reservation.DTO.ReservationDTO;
import org.mapstruct.Mapper;
<<<<<<< HEAD
import org.mapstruct.factory.Mappers;
=======
>>>>>>> 57747da876385613724d509e5a39907fd1b6ce57

import  java.util.List;

@Mapper

public interface IReservation_mapper {

<<<<<<< HEAD
IReservation_mapper INSTANCE = Mappers.getMapper(IReservation_mapper.class);

ReservationDTO mapDTO(Reservation reservation);

Reservation map(ReservationDTO reservationDTO);

List<ReservationDTO> mapList(List<Reservation> reservationsList);
=======
>>>>>>> 57747da876385613724d509e5a39907fd1b6ce57


}
