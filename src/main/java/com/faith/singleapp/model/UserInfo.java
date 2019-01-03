package com.faith.singleapp.model;

import java.io.Serializable;

/**
 * @author:haibo.xiong
 * @date:2019/1/2
 * @description:
 */
public class UserInfo implements Serializable{
    private Integer id;
    private String name;
    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
