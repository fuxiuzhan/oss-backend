package com.berry.oss.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author HiCooper
 * @since 2019-06-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BucketInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id主键
     */
    private String id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * Bucket名称
     */
    private String name;

    /**
     * 读写权限
     */
    private String acl;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
