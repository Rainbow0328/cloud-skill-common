package com.cloudskill.common.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

/**
 * Graph 实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_graph")
public class Graph {

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * Graph唯一标识Key
     */
    private String graphKey;

    /**
     * Graph名称
     */
    private String name;

    /**
     * Graph描述
     */
    private String description;

    /**
     * 分类
     */
    private String category;

    /**
     * 负责人
     */
    private String owner;

    /**
     * 状态：DRAFT/ACTIVE/DISABLED/DELETED
     */
    private String status;

    /**
     * 最新版本号
     */
    private Integer latestVersionNo;

    /**
     * 是否公开
     */
    private Boolean isPublic;

    /**
     * 标签列表
     */
    private String tags;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新人
     */
    private String updatedBy;

    /**
     * 是否删除
     */
    @TableLogic
    private Boolean isDeleted;

    /**
     * 是否启用
     * @return 状态是否为ACTIVE
     */
    public Boolean getEnabled() {
        return "ACTIVE".equals(status);
    }
}
