package com.cloudskill.common.domain.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

/**
 * Graph节点模板 实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GraphNodeTemplate {
    
    /**
     * 主键ID
     */
    private Integer id;
    
    /**
     * 模板Key
     */
    private String templateKey;
    
    /**
     * 模板名称
     */
    private String name;
    
    /**
     * 模板描述
     */
    private String description;
    
    /**
     * 节点类型
     */
    private String nodeType;
    
    /**
     * 节点配置模板JSON
     */
    private String configTemplate;
    
    /**
     * 输入输出模板JSON
     */
    private String ioTemplate;
    
    /**
     * 节点图标URL
     */
    private String icon;
    
    /**
     * 是否启用
     */
    private Boolean isEnabled;
    
    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
    
    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;
    
    /**
     * 是否删除
     */
    @TableLogic
    private Boolean isDeleted;
}
