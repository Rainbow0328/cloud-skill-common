package com.cloudskill.common.domain.dto.graph;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

/**
 * Graph发布结果DTO
 */
@Data
public class GraphPublishResultDTO {

    /**
     * 是否发布成功
     */
    private Boolean success;

    /**
     * 生成的Skill ID
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long skillId;

    /**
     * Skill调用端点
     */
    private String endpoint;

    /**
     * 版本号
     */
    private Integer versionNo;

    /**
     * 全局时间戳
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long globalTimestamp;
}
