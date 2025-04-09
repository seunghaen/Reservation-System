package com.seunghaen.reservation.api.controller;

import com.seunghaen.reservation.api.dto.RoomResDto;
import com.seunghaen.reservation.api.dto.SeatResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
@RequiredArgsConstructor
public class RoomController {

    // 전체 룸 목록 조회
    @GetMapping
    public List<RoomResDto> getAllRooms() {
        return List.of(
                new RoomResDto(1L, "A룸"),
                new RoomResDto(2L, "B룸")
        );
    }

    // 특정 룸의 좌석 목록 조회
    @GetMapping("/{roomId}/seats")
    public List<SeatResDto> getSeatsByRoom(@PathVariable Long roomId) {
        return List.of(
                new SeatResDto(1L, "A1"),
                new SeatResDto(2L, "A2")
        );
    }

    // 특정 날짜의 좌석 예약 현황 조회
    @GetMapping("/{roomId}/seats/status")
    public List<SeatResDto> getSeatStatusByRoomAndDate(
            @PathVariable Long roomId,
            @RequestParam String date
    ) {
        return List.of(
                new SeatResDto(1L, "A1", true),
                new SeatResDto(2L, "A2", false)
        );
    }
}
