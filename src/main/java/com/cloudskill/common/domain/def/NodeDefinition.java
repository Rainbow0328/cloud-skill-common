package com.cloudskill.common.domain.def;

import lombok.Data;

/**
 * Graph节点定义
 */
@Data
public class NodeDefinition {
    /**
     * 节点唯一ID
     */
    private String id;

    /**
     * 节点类型: start/model/agent/mcp/skill/condition/graph/end
     */
    private String type;

    /**
     * 节点显示标签
     */
    private String label;

    /**
     * 画布X坐标
     */
    private Integer x;

    /**
     * 画布Y坐标
     */
    private Integer y;

    /**
     * 节点具体配置
     */
    private NodeConfig config;
}
