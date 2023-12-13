package com.basalt.toy.workOutMethod;

public class WorkOutMethodVo {
    private Long Wid;
    private String Wsubject;
    private int Wset;
    private int Wrm;

    public Long getWid() {
        return Wid;
    }

    public void setWid(Long wid) {
        Wid = wid;
    }

    public String getWsubject() {
        return Wsubject;
    }

    public void setWsubject(String wsubject) {
        Wsubject = wsubject;
    }

    public int getWset() {
        return Wset;
    }

    public void setWset(int wset) {
        Wset = wset;
    }

    public int getWrm() {
        return Wrm;
    }

    public void setWrm(int wrm) {
        Wrm = wrm;
    }

    @Override
    public String toString() {
        return "WorkOutVo{" +
                "Wid=" + Wid +
                ", Wsubject='" + Wsubject + '\'' +
                ", Wset=" + Wset +
                ", Wrm=" + Wrm +
                '}';
    }
}
