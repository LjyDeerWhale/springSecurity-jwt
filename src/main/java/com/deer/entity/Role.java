package com.deer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (Role)表实体类
 *
 * @author lujy
 * @since 2020-10-16 13:30:13
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_role")
@SuppressWarnings("serial")
public class Role extends Model<Role> {
    @TableId(type = IdType.AUTO)
    /**角色id*/
    private String uid;
    /**
     * 角色名
     */
    private String roleName;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    /**
     * 状态
     */
    private Object status;
    /**
     * 角色介绍
     */
    private String summary;
    /**
     * 角色管辖的菜单的UID
     */
    private String categoryMenuUids;


    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.uid;
    }
}
