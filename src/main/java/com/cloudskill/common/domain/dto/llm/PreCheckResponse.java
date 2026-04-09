package com.cloudskill.common.domain.dto.llm;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 前置可行性检查响应
 */
@Data
@Builder
public class PreCheckResponse {
    /**
     * 是否可行
     */
    private Boolean feasible;

    /**
     * 原因说明
     */
    private String reason;

    /**
     * 缺失的资源列表
     */
    private List<String> missing;
}
