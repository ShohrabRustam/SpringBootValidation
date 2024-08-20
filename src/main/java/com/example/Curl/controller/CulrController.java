package com.example.Curl.controller;

import com.example.Curl.service.CurlService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CulrController {

    private final CurlService curlService;

    public CulrController(CurlService curlService) {
        this.curlService = curlService;
    }
    @GetMapping("payee-validation")
    public ResponseEntity<?> payeeValidation(){
        return ResponseEntity.ok(curlService.payeeValidation());
    }
}
