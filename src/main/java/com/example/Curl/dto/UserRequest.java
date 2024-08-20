package com.example.Curl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    private String name;
    private String email;
    private Long mobile;
    private String gender;
    private int age;
    private String nationality;

}
