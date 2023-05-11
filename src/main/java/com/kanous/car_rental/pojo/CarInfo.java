package com.kanous.car_rental.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarInfo {
    private String carID;
    private String license;
    private byte[] photo;
    private String category;
    private String color;
    private BigDecimal dailyExpend;
    private BigDecimal overdueDailyExpend;
    private String leaseState;
}
