package com.wyk.generator.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wang
 * @since 2021-05-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TCaptureDeviceInfo extends Model<TCaptureDeviceInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 设备ID
     */
    private String captureId;

    /**
     * 设备名称
     */
    private String captureName;

    /**
     * 设备mac
     */
    private String captureMac;

    /**
     * 设备UUID
     */
    private String captureUuid;

    /**
     * 1.人脸摄像机 2.人脸闸机
     */
    private Integer type;

    /**
     * 安装地址
     */
    private String address;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 设备IP
     */
    private String ip;

    /**
     * 设备所属楼层
     */
    private Integer floor;


    @Override
    protected Serializable pkVal() {
        return this.captureId;
    }

}
