package com.heeexy.example.core.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author ：scq
 * @date ：Created in 2020/1/5 23:49
 * @description：
 * @modified By：
 * @version:
 */
@Data
public class BaseEntity {

    private String creator;
    private Date createTime;
    private String operator;
    private Date updateTime;
    private String comments;
}
