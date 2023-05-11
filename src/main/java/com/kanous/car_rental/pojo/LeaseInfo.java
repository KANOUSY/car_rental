package com.kanous.car_rental.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeaseInfo {
    private String checkID;
    private String clientID;
    private String carID;
    private BigDecimal dailyExpend;
    private BigDecimal overdueDailyExpend;
    private Integer day;
    private Date leasetime;
    private Date timeToReturn;
}
