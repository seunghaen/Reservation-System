package com.seunghaen.reservation.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationHistoryResDto {
    private Long reservationId;
    private String seatNumber;
    private String roomName;
    private String reservedDate;
}
