package com.kanous.car_rental.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleInfo {
    private String saleID;
    private String saleName;
    private String gender;
    private String phone;
    private String address;
}
