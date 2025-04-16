package com.github.davidfantasy.mybatisplus.generatorui.example.entity.test;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 应用下载信息
 * </p>
 *
 * @author kaiser
 * @since 2024-10-16
 */
@TableName("b_app_download")
public class AppDownload implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * appid
     */
    private String appId;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 是否是最新版本 1.是 0.否
     */
    private Integer latestFlag;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 版本名称
     */
    private String versionName;

    /**
     * 平台 1.安卓 2.苹果
     */
    private Integer installPlatform;

    /**
     * 更新信息
     */
    private String updateInfo;

    /**
     * 更新方式 1.整包更新 2.wgt热更新
     */
    private Integer updateWay;

    /**
     * 下载链接
     */
    private String downloadUrl;

    /**
     * 是否强制更新 1.是 0.否
     */
    private Integer forceUpdateFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date modifyTime;

    /**
     * 创建者id
     */
    private Long creatorId;

    /**
     * 创建者名称
     */
    private String creatorName;

    /**
     * 最近操作人 id
     */
    private Long handlerId;

    /**
     * 操作者名字
     */
    private String handlerName;

    /**
     * 记录状态: 1.有效 0.无效
     */
    private Integer recordStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Integer getLatestFlag() {
        return latestFlag;
    }

    public void setLatestFlag(Integer latestFlag) {
        this.latestFlag = latestFlag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public Integer getInstallPlatform() {
        return installPlatform;
    }

    public void setInstallPlatform(Integer installPlatform) {
        this.installPlatform = installPlatform;
    }

    public String getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
    }

    public Integer getUpdateWay() {
        return updateWay;
    }

    public void setUpdateWay(Integer updateWay) {
        this.updateWay = updateWay;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Integer getForceUpdateFlag() {
        return forceUpdateFlag;
    }

    public void setForceUpdateFlag(Integer forceUpdateFlag) {
        this.forceUpdateFlag = forceUpdateFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public Long getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
    }

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    @Override
    public String toString() {
        return "AppDownload{" +
        ", id = " + id +
        ", appId = " + appId +
        ", appName = " + appName +
        ", latestFlag = " + latestFlag +
        ", version = " + version +
        ", versionName = " + versionName +
        ", installPlatform = " + installPlatform +
        ", updateInfo = " + updateInfo +
        ", updateWay = " + updateWay +
        ", downloadUrl = " + downloadUrl +
        ", forceUpdateFlag = " + forceUpdateFlag +
        ", createTime = " + createTime +
        ", modifyTime = " + modifyTime +
        ", creatorId = " + creatorId +
        ", creatorName = " + creatorName +
        ", handlerId = " + handlerId +
        ", handlerName = " + handlerName +
        ", recordStatus = " + recordStatus +
        "}";
    }
}
