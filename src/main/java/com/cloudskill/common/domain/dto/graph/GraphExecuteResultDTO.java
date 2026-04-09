package com.cloudskill.common.domain.dto.graph;

import lombok.Data;

/**
 * Graph执行结果DTO
 */
@Data
public class GraphExecuteResultDTO {

    /**
     * 执行实例ID
     */
    private String executionId;

    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 状态
     */
    private String status;

    /**
     * 响应码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object data;

    /**
     * 耗时(毫秒)
     */
    private Long duration;

    /**
     * 恢复Token（暂停时返回）
     */
    private String resumeToken;

    /**
     * 暂停原因（暂停时返回）
     */
    private String pauseReason;
}
