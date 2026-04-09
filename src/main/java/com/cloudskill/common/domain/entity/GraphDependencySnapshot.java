package com.cloudskill.common.domain.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

/**
 * Graph依赖快照 实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GraphDependencySnapshot {
    
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 关联t_graph_version.id
     */
    private Integer graphVersionId;
    
    /**
     * 依赖类型：SKILL/GRAPH/INTERNAL_SKILL/MODEL/AGENT
     */
    private String dependencyType;
    
    /**
     * 依赖Key：skillId/graphKey等
     */
    private String dependencyKey;
    
    /**
     * 依赖版本号（发布时锁定）
     */
    private String dependencyVersion;
    
    /**
     * 依赖版本ID（关联对应表主键）
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long dependencyVersionId;
    
    /**
     * 引用该依赖的Graph节点ID
     */
    private String referenceNodeId;
    
    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
}
