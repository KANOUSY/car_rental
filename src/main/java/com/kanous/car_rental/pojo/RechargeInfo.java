package com.kanous.car_rental.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RechargeInfo {
    private String rechargeID;
    private String clientID;
    private String remanner;
    private BigDecimal remoney;
    private Date retime;
}
