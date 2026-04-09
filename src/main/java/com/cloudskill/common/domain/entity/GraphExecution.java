package com.cloudskill.common.domain.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

/**
 * Graph执行实例 实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GraphExecution {
    
    /**
     * 执行实例ID（requestId）
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    
    /**
     * Graph Key
     */
    private String graphKey;
    
    /**
     * 执行的版本号
     */
    private Integer graphVersionNo;
    
    /**
     * 关联t_graph_version.id
     */
    private Integer graphVersionId;
    
    /**
     * 关联的Graph Skill ID（如果是作为Skill调用）
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long skillId;
    
    /**
     * 调用方服务名
     */
    private String callerService;
    
    /**
     * 调用方IP
     */
    private String callerIp;
    
    /**
     * 输入参数JSON
     */
    private String input;
    
    /**
     * 输出结果JSON
     */
    private String output;
    
    /**
     * 状态：RUNNING/SUCCESS/FAILED/PAUSED/PENDING_HUMAN_APPROVAL/CANCELLED
     */
    private String status;
    
    /**
     * 当前执行节点ID
     */
    private String currentNodeId;
    
    /**
     * 暂停原因
     */
    private String pauseReason;
    
    /**
     * 恢复执行的Token（用于人工审批等场景）
     */
    private String resumeToken;
    
    /**
     * 总耗时(毫秒)
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
     * 链路追踪ID
     */
    private String traceId;
    
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
