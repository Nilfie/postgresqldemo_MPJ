package com.nxy.postgresqldemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * @author Nilfie
 * @version 1.0
 * @date 2023/5/29 10:27
 */
@Data
//@TableName(schema = "public")
@ToString
//@EqualsAndHashCode(callSuper = true)
@TableName("users")
public class User {
    @TableField(value = "userid")
    private String userId;
    @TableField("useraccount")
    private String userAccount;
    @TableField("accountname")
    private String userName;
    @TableField("userpwd")
    private String userPwd;
    @TableField("usertype")
    private String userType;
    @TableField("classid")
    private String classid;

}