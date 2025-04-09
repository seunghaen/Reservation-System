package com.seunghaen.reservation.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationReqDto {
    private Long seatId;
    private String reservedDate; // ISO_LOCAL_DATE 형식 ("2024-04-10")
    private String userId;
    private String lockType; // "PESSIMISTIC", "OPTIMISTIC", "REDIS"
}

