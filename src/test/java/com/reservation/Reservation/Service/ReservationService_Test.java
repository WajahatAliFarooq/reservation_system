package com.reservation.Reservation.Service;

import com.reservation.Reservation.DTO.ReservationDTO;
import com.reservation.Reservation.entity.Reservation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ReservationService_Test
{
    @Mock
    private IReservationDao iReservationDao;
    private IReservationService iReservationService;
    @BeforeEach
    void setUp(){
        iReservationService = new ReservationServiceImpl(iReservationDao);
    }
    @Test
    void test_getAllUsers(){
        ReservationDTO reservation1 = new ReservationDTO();
        ReservationDTO reservation2 = new ReservationDTO();
        reservation1.setIds(1);
        reservation1.setFirst_name("Wajahat Ali");
        reservation1.setLast_name("Farooq");
        reservation1.setContact_number("03332435604");
        reservation1.setEmail_address("Wajahatchamp@gmail.com");
        reservation1.setResidential_address("A.99 Block B Kazimabad ,Model Colony,Karachi");
        reservation1.setId_card_type("CNIC");
        reservation1.setId_number("4220187765656");
        reservation1.setRoom_type("DELUX");
        reservation1.setRoom_number(312);

        reservation2.setIds(00023);
        reservation2.setFirst_name("Shujat ");
        reservation2.setLast_name("Rahem");
        reservation2.setContact_number("03408305090");
        reservation2.setEmail_address("shujibaba@gmail.com");
        reservation2.setResidential_address("A.100 Block B Kazimabad ,Model Colony,Karachi");
        reservation2.setId_card_type("passport");
        reservation2.setId_number("BQ8965951");
        reservation2.setRoom_type("Normal");
        reservation2.setRoom_number(102);


    }
}
