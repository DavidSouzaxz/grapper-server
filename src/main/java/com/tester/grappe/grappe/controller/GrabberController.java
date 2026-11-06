package com.tester.grappe.grappe.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/grabber")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class GrabberController {

    @PostMapping("/receive")
    public Map<String, String> receiveData(
            @RequestBody Map<String, Object> data) {

        System.out.println("\n========== DADOS RECEBIDOS ==========");
        System.out.println(data);
        System.out.println("=====================================\n");

        return Map.of("status", "success");
    }
}