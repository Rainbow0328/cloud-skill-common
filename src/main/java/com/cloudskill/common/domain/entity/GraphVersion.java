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
 * Graph版本 实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_graph_version")
public class GraphVersion {

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 关联t_graph.id
     */
    private Integer graphId;

    /**
     * 版本号（自增）
     */
    private Integer versionNo;

    /**
     * 版本名称
     */
    private String versionName;

    /**
     * 版本描述
     */
    private String versionDesc;

    /**
     * 前端画布导出的原始Graph定义JSON
     */
    private String definitionJson;

    /**
     * 编译后的可执行IR快照JSON
     */
    private String compiledIrJson;

    /**
     * Graph整体输入Schema（JSON Schema）
     */
    private String requestSchema;

    /**
     * Graph整体输出Schema（JSON Schema）
     */
    private String responseSchema;

    /**
     * 状态：DRAFT/PUBLISHED/DISABLED/DEPRECATED
     */
    private String status;

    /**
     * 是否是当前激活版本
     */
    private Boolean isActive;

    /**
     * 发布时间
     */
    private LocalDateTime publishTime;

    /**
     * 发布人
     */
    private String publishedBy;

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
     * 兼容方法：设置版本号
     * @param version 版本号
     */
    public void setVersion(Integer version) {
        this.versionNo = version;
    }

    /**
     * 兼容方法：设置Graph定义
     * @param definition JSON定义
     */
    public void setDefinition(String definition) {
        this.definitionJson = definition;
    }

    /**
     * 兼容方法：设置备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.versionDesc = remark;
    }
}
