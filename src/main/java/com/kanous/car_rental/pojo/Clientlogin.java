package com.kanous.car_rental.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clientlogin {
    private String clientAcct;
    private String clientPwd;
    private String clientID;
}
