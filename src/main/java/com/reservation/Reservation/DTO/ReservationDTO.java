package com.reservation.Reservation.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDTO {

    @Id
    @Column(name = "ids", nullable = false)
    private Integer ids;
    private String first_name;
    private String last_name;
    private String contact_number;
    private String email_address;
    private String residential_address;
    private String id_card_type;
    private String id_number;
    private String room_type;
    private Integer room_number;


}
