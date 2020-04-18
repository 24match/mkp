package com.drew.mkp.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Liang
 * @Date 2020/2/23 16:26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("ACCOUNT")
public class Account {
    @TableId(value = "id", type = IdType.AUTO) // 指定自增类型
    private Long id;

    private String username;
    private String password;
    private int isadmin;
    private String key;
    private Date createDate;
    private Date updateDate;

}
