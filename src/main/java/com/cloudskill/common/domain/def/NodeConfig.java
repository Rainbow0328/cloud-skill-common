package com.cloudskill.common.domain.def;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.util.List;

/**
 * Graph节点配置
 * 不同节点类型配置不同字段
 */
@Data
public class NodeConfig {
    // --- 通用 ---
    private String outputName;
    private String outputSchema;
    private String onErrorTarget;

    // --- model节点 ---
    private String modelKey;
    private String prompt;
    private Double temperature;
    private Integer maxTokens;
    private Double topP;

    // --- agent节点 ---
    private String agentKey;

    // --- mcp节点 ---
    private String mcpKey;
    private List<String> selectedTools;
    private Integer connectTimeout;
    private Integer readTimeout;

    // --- skill节点 ---
    @JsonSerialize(using = ToStringSerializer.class)
    private Long skillId;

    // --- graph节点 ---
    private String graphKey;

    // --- condition节点 ---
    public static class Branch {
        private String name;
        private String condition;
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getCondition() { return condition; }
        public void setCondition(String condition) { this.condition = condition; }
    }
    private List<Branch> branches;
}
