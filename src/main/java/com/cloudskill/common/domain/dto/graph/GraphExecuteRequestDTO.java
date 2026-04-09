package com.cloudskill.common.domain.dto.graph;

import lombok.Data;
import java.util.Map;

/**
 * Graph执行请求DTO
 */
@Data
public class GraphExecuteRequestDTO {

    /**
     * 输入参数
     */
    private Map<String, Object> parameters;

    /**
     * 是否异步执行
     */
    private Boolean async = false;

    /**
     * 上下文参数
     */
    private Map<String, Object> context;

    /**
     * 链路追踪ID
     */
    private String traceId;

    /**
     * 调用方服务名
     */
    private String callerService;
}
