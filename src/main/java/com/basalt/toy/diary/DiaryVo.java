package com.basalt.toy.diary;

import java.time.LocalDateTime;

public class DiaryVo {
    private Long dId;
    private String dTitle;
    private String dContents;
    private LocalDateTime dCreate;
    private LocalDateTime dUpdate;

    public Long getdId() {
        return dId;
    }

    public void setdId(Long dId) {
        this.dId = dId;
    }

    public String getdContents() {
        return dContents;
    }

    public void setdContents(String dContents) {
        this.dContents = dContents;
    }

    public String getdTitle() {
        return dTitle;
    }

    public void setdTitle(String dTitle) {
        this.dTitle = dTitle;
    }

    public LocalDateTime getdCreate() {
        return dCreate;
    }

    public void setdCreate(LocalDateTime dCreate) {
        this.dCreate = dCreate;
    }

    public LocalDateTime getdUpdate() {
        return dUpdate;
    }

    public void setdUpdate(LocalDateTime dUpdate) {
        this.dUpdate = dUpdate;
    }

    @Override
    public String toString() {
        return "DiaryVo{" +
                "dId=" + dId +
                ", dTitle='" + dTitle + '\'' +
                ", dContents='" + dContents + '\'' +
                ", dCreate=" + dCreate +
                ", dUpdate=" + dUpdate +
                '}';
    }
}