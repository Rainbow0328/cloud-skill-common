package com.cloudskill.common.domain.dto.llm;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 公开资源列表响应
 * 返回给LLM的公开资源信息，不包含敏感信息（API Key等）
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PublicResourceListResponse {

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PublicModel {
        private String modelKey;
        private String name;
        private String provider;
        private String modelName;
        private String description;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PublicAgent {
        private String agentKey;
        private String name;
        private String agentType;
        private String description;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PublicMcp {
        private String mcpKey;
        private String name;
        private String transportType;
        private String description;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PublicSkill {
        @JsonSerialize(using = ToStringSerializer.class)
        private Long skillId;
        private String name;
        private String description;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PublicGraph {
        private String graphKey;
        private String name;
        private String description;
    }

    private List<PublicModel> models;
    private List<PublicAgent> agents;
    private List<PublicMcp> mcps;
    private List<PublicSkill> skills;
    private List<PublicGraph> graphs;
}
