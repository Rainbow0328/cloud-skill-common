package com.cloudskill.common.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

/**
 * 资源嵌入向量实体（用于pgvector向量检索）
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_resource_embedding")
public class ResourceEmbedding {

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 资源类型：model/agent/mcp/skill/graph
     */
    @TableField("resource_type")
    private String resourceType;

    /**
     * 资源ID：对应各表的主键/Key
     */
    @TableField("resource_id")
    private String resourceId;

    /**
     * 嵌入向量（pgvector类型）
     * 注意：这个字段在Java中存储为float[]，MyBatis-Plus会通过类型处理器转换
     */
    @TableField("embedding")
    private float[] embedding;

    /**
     * 创建时间
     */
    @TableField("created_at")
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    @TableField("updated_at")
    private LocalDateTime updatedAt;
}
