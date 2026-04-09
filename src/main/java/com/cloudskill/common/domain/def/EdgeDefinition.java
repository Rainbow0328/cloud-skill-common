package com.cloudskill.common.domain.def;

import lombok.Data;

/**
 * Graph边定义（连接）
 */
@Data
public class EdgeDefinition {
    /**
     * 边唯一ID
     */
    private String id;

    /**
     * 源节点ID
     */
    private String source;

    /**
     * 目标节点ID
     */
    private String target;

    /**
     * 边显示标签（分支节点这里填分支名）
     */
    private String label;
}
