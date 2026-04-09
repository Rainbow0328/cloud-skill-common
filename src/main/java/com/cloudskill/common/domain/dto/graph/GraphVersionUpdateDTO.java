package com.cloudskill.common.domain.dto.graph;

import lombok.Data;

/**
 * Graph版本更新DTO
 */
@Data
public class GraphVersionUpdateDTO {

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
     * Graph整体输入Schema
     */
    private String requestSchema;

    /**
     * Graph整体输出Schema
     */
    private String responseSchema;
}
