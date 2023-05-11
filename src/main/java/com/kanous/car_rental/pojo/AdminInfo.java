package com.kanous.car_rental.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminInfo {
    private String adminID;
    private String adminName;
    private String gender;
    private String phone;
    private String address;
}
