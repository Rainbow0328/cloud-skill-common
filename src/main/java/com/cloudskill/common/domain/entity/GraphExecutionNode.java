package com.cloudskill.common.domain.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

/**
 * Graph执行节点日志 实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GraphExecutionNode {
    
    /**
     * 主键ID
     */
    private Integer id;
    
    /**
     * 关联t_graph_execution.id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long executionId;
    
    /**
     * 节点ID
     */
    private String nodeId;
    
    /**
     * 节点名称
     */
    private String nodeName;
    
    /**
     * 节点类型
     */
    private String nodeType;
    
    /**
     * 节点输入JSON
     */
    private String input;
    
    /**
     * 节点输出JSON
     */
    private String output;
    
    /**
     * 状态：PENDING/RUNNING/SUCCESS/FAILED/SKIPPED
     */
    private String status;
    
    /**
     * 错误信息
     */
    private String errorMessage;
    
    /**
     * 节点执行耗时(毫秒)
     */
    private Long duration;
    
    /**
     * 开始时间
     */
    private LocalDateTime startTime;
    
    /**
     * 结束时间
     */
    private LocalDateTime endTime;
    
    /**
     * 扩展元数据
     */
    private String metadata;
    
    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
    
    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;
}
