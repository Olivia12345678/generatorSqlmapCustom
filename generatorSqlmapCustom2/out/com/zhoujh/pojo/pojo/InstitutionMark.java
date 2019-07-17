package com.zhoujh.pojo.pojo;

public class InstitutionMark {
    private Integer id;

    private String mark;

    private Integer refInstitutionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public Integer getRefInstitutionId() {
        return refInstitutionId;
    }

    public void setRefInstitutionId(Integer refInstitutionId) {
        this.refInstitutionId = refInstitutionId;
    }
}