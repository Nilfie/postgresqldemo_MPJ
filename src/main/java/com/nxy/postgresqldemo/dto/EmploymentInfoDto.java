package com.nxy.postgresqldemo.dto;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

/**
 * @author Nilfie
 * @version 1.0
 * @date 2023/6/17 15:33
 * @description
 * dto类负责将查询到的数据存入
 **/
@Data
@ToString
public class EmploymentInfoDto {
    private String userAccount;
    private String userType;
    private String accountname;
    private String studentclass;
    private String classid;
    private String companyName;
    private String companyAddress;
    private String employmentStation;
    private String treatment;
    private String abilityRequirement;
    private String studentName;
    private String studentMajor;
    private String studentGender;
    private String studentMobile;
    private LocalDate employmentTime;
    private String companyContactName;
    private String companyContactMobile;
}
