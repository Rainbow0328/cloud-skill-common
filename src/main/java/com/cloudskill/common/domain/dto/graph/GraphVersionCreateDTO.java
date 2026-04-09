package com.cloudskill.common.domain.dto.graph;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;

/**
 * Graph版本创建DTO
 */
@Data
public class GraphVersionCreateDTO {

    /**
     * 版本名称
     */
    @NotBlank(message = "版本名称不能为空")
    private String versionName;

    /**
     * 版本描述
     */
    private String versionDesc;

    /**
     * 前端画布导出的原始Graph定义JSON
     */
    @NotBlank(message = "Graph定义不能为空")
    private String definitionJson;
}
