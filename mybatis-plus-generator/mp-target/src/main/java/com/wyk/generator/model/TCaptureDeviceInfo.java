package com.wyk.generator.model;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value="TCaptureDeviceInfo对象", description="")
public class TCaptureDeviceInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "设备ID")
    private String captureId;

    @ApiModelProperty(value = "设备名称")
    private String captureName;

    @ApiModelProperty(value = "设备mac")
    private String captureMac;

    @ApiModelProperty(value = "设备UUID")
    private String captureUuid;

    @ApiModelProperty(value = "1.人脸摄像机 2.人脸闸机")
    private Integer type;

    @ApiModelProperty(value = "安装地址")
    private String address;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "设备IP")
    private String ip;

    @ApiModelProperty(value = "设备所属楼层")
    private Integer floor;


}
