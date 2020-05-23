package com.qianxian.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name ="taobao_product" )
public class TaoBaoProduct {

    private Long id;
    /**
     * 折淘客的编号
     */
    private String code;
    @Id
    private Long t_index;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getT_index() {
        return t_index;
    }

    public void setT_index(Long t_index) {
        this.t_index = t_index;
    }
}
