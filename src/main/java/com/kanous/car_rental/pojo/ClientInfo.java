package com.kanous.car_rental.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientInfo {
    private String clientID;
    private String clientName;
    private String gender;
    private String clientCard;
    private String phone;
    private String address;
}
