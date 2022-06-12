package com.reservation.Reservation.mapper;

import com.reservation.Reservation.entity.Reservation;
import com.reservation.Reservation.DTO.ReservationDTO;
import org.mapstruct.Mapper;

import org.mapstruct.factory.Mappers;


import  java.util.List;

@Mapper

public interface IReservation_mapper {


IReservation_mapper INSTANCE = Mappers.getMapper(IReservation_mapper.class);

ReservationDTO mapDTO(Reservation reservation);

Reservation map(ReservationDTO reservationDTO);

List<ReservationDTO> mapList(List<Reservation> reservationsList);


}
