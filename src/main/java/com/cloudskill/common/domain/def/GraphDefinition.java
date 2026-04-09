package com.cloudskill.common.domain.def;

import lombok.Data;

import java.util.List;

/**
 * 完整Graph定义
 * 对应前端画布导出的结构
 */
@Data
public class GraphDefinition {
    /**
     * 节点列表
     */
    private List<NodeDefinition> nodes;

    /**
     * 边连接列表
     */
    private List<EdgeDefinition> edges;
}
