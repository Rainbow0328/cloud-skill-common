package com.cloudskill.common.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * MCP服务器配置 - 平台级资源
 * 统一管理MCP服务连接信息
 * Graph节点通过mcpKey引用，支持动态替换
 */
@Data
@TableName("t_mcp_server")
public class McpServerConfig {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 唯一标识Key
     */
    private String mcpKey;

    /**
     * MCP服务名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 传输类型: SSE / STDIO
     */
    private String transportType;

    /**
     * SSE模式：服务端点URL
     */
    private String sseUrl;

    /**
     * STDIO模式：启动命令
     */
    private String command;

    /**
     * STDIO模式：命令参数(JSON数组)
     */
    private String args;

    /**
     * 环境变量(JSON对象)
     */
    private String env;

    /**
     * API Key(可选，Authorization Bearer)
     */
    private String apiKey;

    /**
     * 连接超时(ms)
     */
    private Integer connectTimeout;

    /**
     * 读取超时(ms)
     */
    private Integer readTimeout;

    /**
     * 输出JSON Schema（限定工具调用结果格式，可选）
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
