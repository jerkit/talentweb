package net.togogo.talent.domain;

public class TbResume {
    private Integer resuId;

    private String resuName;

    private String resuJob;

    private String education;

    private String jobExperience;

    private String projectExperience;

    private String selfEvaluate;

    private Integer userId;

    public Integer getResuId() {
        return resuId;
    }

    public void setResuId(Integer resuId) {
        this.resuId = resuId;
    }

    public String getResuName() {
        return resuName;
    }

    public void setResuName(String resuName) {
        this.resuName = resuName == null ? null : resuName.trim();
    }

    public String getResuJob() {
        return resuJob;
    }

    public void setResuJob(String resuJob) {
        this.resuJob = resuJob == null ? null : resuJob.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getJobExperience() {
        return jobExperience;
    }

    public void setJobExperience(String jobExperience) {
        this.jobExperience = jobExperience == null ? null : jobExperience.trim();
    }

    public String getProjectExperience() {
        return projectExperience;
    }

    public void setProjectExperience(String projectExperience) {
        this.projectExperience = projectExperience == null ? null : projectExperience.trim();
    }

    public String getSelfEvaluate() {
        return selfEvaluate;
    }

    public void setSelfEvaluate(String selfEvaluate) {
        this.selfEvaluate = selfEvaluate == null ? null : selfEvaluate.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}