package com.partyutility.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/seats")
public class SeatController {

    @GetMapping("/random")
    public List<Integer> random(@RequestParam int people) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= people; i++) {
            list.add(i);
        }

        Collections.shuffle(list);
        return list;
    }
}
