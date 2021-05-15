package com.wyk.generator.domain;

public class CaptureAppVersion {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * APP 名称
     */
    private String appName;

    /**
     * APP 下载链接
     */
    private String appUrl;

    /**
     * APP 版本
     */
    private String appVersionName;

    /**
     * 1.强制更新0.非强制更新
     */
    private Integer flag;

    /**
     * APP 版本
     */
    private Integer appVersion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl == null ? null : appUrl.trim();
    }

    public String getAppVersionName() {
        return appVersionName;
    }

    public void setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName == null ? null : appVersionName.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(Integer appVersion) {
        this.appVersion = appVersion;
    }
}