package com.seunghaen.reservation.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SeatResDto {
    private Long seatId;
    private String seatNumber;
    private Boolean isReserved;

    public SeatResDto(Long seatId, String seatNumber) {
        this.seatId = seatId;
        this.seatNumber = seatNumber;
        this.isReserved = null;
    }
}
