package com.cloudskill.common.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * Agent配置 - 平台级资源
 * 统一管理Agent类型、系统提示词、关联模型等
 * Graph节点通过agentKey引用，支持动态替换
 */
@Data
@TableName("t_agent_config")
public class AgentConfig {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 唯一标识Key
     */
    private String agentKey;

    /**
     * Agent展示名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * Agent类型: REACT/SEQUENTIAL/PARALLEL/PLAN_EXECUTE
     */
    private String agentType;

    /**
     * 兼容方法：获取Agent类型
     * @return 类型
     */
    public String getType() {
        return this.agentType;
    }

    /**
     * 系统提示词
     */
    private String systemPrompt;

    /**
     * 关联模型Key
     */
    private String modelKey;

    /**
     * 最大执行步骤
     */
    private Integer maxSteps;

    /**
     * 是否启用工具调用
     */
    private Boolean enableToolCall;

    /**
     * 输出JSON Schema（限定输出格式，可选）
     */
    private String outputSchema;

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 是否开放给LLM自动编排（0=私密，1=公开）
     */
    private Boolean isPublic;

    /**
     * 是否删除
     */
    @TableLogic
    private Boolean isDeleted;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedAt;
}
