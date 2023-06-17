package com.nxy.postgresqldemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author Nilfie
 * @version 1.0
 * @date 2023/6/17 10:29
 * @description
 **/

@Data
//@TableName(schema = "public")
@TableName("employment_info")
@ToString
public class EmploymentInfo {
    @TableField("information_id")
    private String informationId;
    @TableField("company_name")
    private String companyName;
    @TableField("company_address")
    private String companyAddress;
    @TableField("employment_station")
    private String employmentStation;
    @TableField("treatment")
    private String treatment;
    @TableField("ability_requirement")
    private String abilityRequirement;
    @TableField("student_name")
    private String studentName;
    @TableField("student_major")
    private String studentMajor;
    @TableField("student_gender")
    private String studentGender;
    @TableField("student_class")
    private String studentClass;
    @TableField("student_mobile")
    private String studentMobile;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField("employment_time")
    private LocalDate employmentTime;
    @TableField("company_contact_name")
    private String companyContactName;
    @TableField("company_contact_mobile")
    private String companyContactMobile;

}
