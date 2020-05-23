package com.qianxian.module.jpa.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 持久化基类
 * 实体类如果不需要某字段，请加上@Transient注解，Mapper扫描时将忽略该字段
 */

/**
 * @author kevinsu
 * @date 2020/05/22
 **/

public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 594829320797158219L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "t_index", type = MySqlTypeConstant.BIGINT, length = 20, isKey = true, isAutoIncrement = true)
    @JsonIgnore
    @javax.persistence.Column(name = "t_index")
    private Long index;

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * 覆盖原equals方法，只要对象类型相同并且主键相同，那么返回true，表示两个对象相等
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof BaseEntity)) {
            return false;
        }
        BaseEntity other = (BaseEntity) o;
        return index.equals(other.getIndex());
    }

    /**
     * 覆盖原hashCode方法，用主键的hashcode代替原来对象的hashcode，可以简化持久化对象的比较
     * @return int
     */
    @Override
    public int hashCode() {
        if (index == null) {
            return Integer.valueOf(0);
        }
        return index.hashCode();
    }

    /**
     * 覆盖原toString方法，打印更详细信息
     *
     * @return String
     */
    @Override
    public String toString() {
        return this.getClass().getName() + "[index=" + index + "]";
    }
}