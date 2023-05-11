package com.kanous.car_rental.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnInfo {
    private String checkID;
    private String clientID;
    private String carID;
    private Date leasetime;
    private Date timeToReturn;
    private Date returntime;
    private BigDecimal expend;
    private BigDecimal overdueExpend;
    private BigDecimal damageExpend;
    private BigDecimal totalExpend;
}
