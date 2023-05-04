package com.youtube.jwt.dto;

import com.youtube.jwt.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse {
    
    private User user;

    private String jetToken;
}
