package com.drew.mkp.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Liang
 * @Date 2020/4/18 20:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
  // 主键自增
  @TableId(value = "taskId", type = IdType.AUTO)
  private long taskId;

  private long accountId;
  private String taskName;
  private String taskRemarks;
  private Date createDate;
  private Date updateDate;

}
