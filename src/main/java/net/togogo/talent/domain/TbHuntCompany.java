package net.togogo.talent.domain;

import java.util.Date;

public class TbHuntCompany {
    private Integer wantId;

    private Integer compId;

    private Integer huntId;

    private Date wantDate;

    public Integer getWantId() {
        return wantId;
    }

    public void setWantId(Integer wantId) {
        this.wantId = wantId;
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public Integer getHuntId() {
        return huntId;
    }

    public void setHuntId(Integer huntId) {
        this.huntId = huntId;
    }

    public Date getWantDate() {
        return wantDate;
    }

    public void setWantDate(Date wantDate) {
        this.wantDate = wantDate;
    }
}