package com.wyk.generator.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_capture_device_info")
public class CaptureDeviceInfo implements Serializable {
    /**
     * 设备ID
     */
    @Id
    @Column(name = "capture_id")
    private String captureId;

    /**
     * 设备名称
     */
    @Column(name = "capture_name")
    private String captureName;

    /**
     * 设备mac
     */
    @Column(name = "capture_mac")
    private String captureMac;

    /**
     * 设备UUID
     */
    @Column(name = "capture_uuid")
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
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 设备IP
     */
    private String ip;

    /**
     * 设备所属楼层
     */
    private Integer floor;

    private static final long serialVersionUID = 1L;

    /**
     * 获取设备ID
     *
     * @return capture_id - 设备ID
     */
    public String getCaptureId() {
        return captureId;
    }

    /**
     * 设置设备ID
     *
     * @param captureId 设备ID
     */
    public void setCaptureId(String captureId) {
        this.captureId = captureId;
    }

    /**
     * 获取设备名称
     *
     * @return capture_name - 设备名称
     */
    public String getCaptureName() {
        return captureName;
    }

    /**
     * 设置设备名称
     *
     * @param captureName 设备名称
     */
    public void setCaptureName(String captureName) {
        this.captureName = captureName;
    }

    /**
     * 获取设备mac
     *
     * @return capture_mac - 设备mac
     */
    public String getCaptureMac() {
        return captureMac;
    }

    /**
     * 设置设备mac
     *
     * @param captureMac 设备mac
     */
    public void setCaptureMac(String captureMac) {
        this.captureMac = captureMac;
    }

    /**
     * 获取设备UUID
     *
     * @return capture_uuid - 设备UUID
     */
    public String getCaptureUuid() {
        return captureUuid;
    }

    /**
     * 设置设备UUID
     *
     * @param captureUuid 设备UUID
     */
    public void setCaptureUuid(String captureUuid) {
        this.captureUuid = captureUuid;
    }

    /**
     * 获取1.人脸摄像机 2.人脸闸机
     *
     * @return type - 1.人脸摄像机 2.人脸闸机
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1.人脸摄像机 2.人脸闸机
     *
     * @param type 1.人脸摄像机 2.人脸闸机
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取安装地址
     *
     * @return address - 安装地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置安装地址
     *
     * @param address 安装地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取设备IP
     *
     * @return ip - 设备IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置设备IP
     *
     * @param ip 设备IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取设备所属楼层
     *
     * @return floor - 设备所属楼层
     */
    public Integer getFloor() {
        return floor;
    }

    /**
     * 设置设备所属楼层
     *
     * @param floor 设备所属楼层
     */
    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", captureId=").append(captureId);
        sb.append(", captureName=").append(captureName);
        sb.append(", captureMac=").append(captureMac);
        sb.append(", captureUuid=").append(captureUuid);
        sb.append(", type=").append(type);
        sb.append(", address=").append(address);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", ip=").append(ip);
        sb.append(", floor=").append(floor);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}