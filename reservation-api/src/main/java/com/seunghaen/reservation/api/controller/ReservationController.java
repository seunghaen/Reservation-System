package com.seunghaen.reservation.api.controller;

import com.seunghaen.reservation.api.dto.ReservationReqDto;
import com.seunghaen.reservation.api.dto.ReservationResDto;
import com.seunghaen.reservation.api.dto.ReservationHistoryResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationController {

    // 예약 요청
    @PostMapping
    public ReservationResDto reserve(@RequestBody ReservationReqDto request) {
        return new ReservationResDto(true, "예약 성공");
    }

    // 예약 취소
    @DeleteMapping("/{reservationId}")
    public ReservationResDto cancel(@PathVariable Long reservationId) {
        return new ReservationResDto(true, "예약 취소 완료");
    }

    // 유저 예약 내역 조회
    @GetMapping("/user/{userId}")
    public List<ReservationHistoryResDto> getReservationsByUser(@PathVariable String userId) {
        return List.of(
                new ReservationHistoryResDto(1L, "A2", "A룸", "2024-04-10")
        );
    }
}
