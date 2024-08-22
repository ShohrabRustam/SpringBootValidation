package com.example.Curl.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    @NotNull(message = "username shouldn't be null")
    private String name;
    @NotBlank(message = "email is required")
    @Email(message = "Invalid Email")
    private String email;
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number")
    private String mobile;

    private String gender;
    @Min(18)
    @Max(70)
    private int age;
    @NotBlank
    private String nationality;

}
