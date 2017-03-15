package net.togogo.talent.domain;

import java.util.Date;

public class TbMessage {
    private Integer messId;

    private String messTopic;

    private String resource;

    private String content;

    private Integer userId;

    private Integer compId;

    private Date messDate;

    private String messType;

    private String sendRole;

    public Integer getMessId() {
        return messId;
    }

    public void setMessId(Integer messId) {
        this.messId = messId;
    }

    public String getMessTopic() {
        return messTopic;
    }

    public void setMessTopic(String messTopic) {
        this.messTopic = messTopic == null ? null : messTopic.trim();
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource == null ? null : resource.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public Date getMessDate() {
        return messDate;
    }

    public void setMessDate(Date messDate) {
        this.messDate = messDate;
    }

    public String getMessType() {
        return messType;
    }

    public void setMessType(String messType) {
        this.messType = messType == null ? null : messType.trim();
    }

    public String getSendRole() {
        return sendRole;
    }

    public void setSendRole(String sendRole) {
        this.sendRole = sendRole == null ? null : sendRole.trim();
    }
}