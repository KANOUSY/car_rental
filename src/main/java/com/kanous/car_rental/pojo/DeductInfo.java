package com.kanous.car_rental.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeductInfo {
    private String checkID;
    private String clientID;
    private BigDecimal demoney;
    private Date detime;
}
