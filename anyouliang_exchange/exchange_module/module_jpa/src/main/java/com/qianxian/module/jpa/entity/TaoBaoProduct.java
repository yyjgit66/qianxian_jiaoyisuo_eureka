package com.qianxian.module.jpa.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import com.qianxian.module.jpa.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 管理员信息实体
 * @author yanyujie
 * @since 2020年5月11日09:27:16
 */
@Entity(name ="taobao_product" )
@Data
@Table(name = "taobao_product")
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
public class TaoBaoProduct extends BaseEntity {


    /** ID **/
    @Id
    @Column(name="id",type= MySqlTypeConstant.BIGINT,comment = "ID")
    private Long id;
    /**
     * 折淘客的编号
     */
    @Column(name = "code",type = MySqlTypeConstant.VARCHAR,length = 100,comment="折淘客的编号")
    private String code;

    @Column(name = "name",type = MySqlTypeConstant.VARCHAR,length = 100,comment="折淘客的编号")
    private String name;

}
