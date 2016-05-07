package com.shu.entity;

import java.util.Date;

/**
 * Created by wxl on 2016/5/7.
 */
public class SucceedSecKill {
    private Long secKillId;
    private String usePhone;
    private Byte state;
    private Date createTime;

    private SecKill secKill;

    public SecKill getSecKill() {
        return secKill;
    }

    public void setSecKill(SecKill secKill) {
        this.secKill = secKill;
    }

    public Long getSecKillId() {
        return secKillId;
    }

    public void setSecKillId(Long secKillId) {
        this.secKillId = secKillId;
    }

    public String getUsePhone() {
        return usePhone;
    }

    public void setUsePhone(String usePhone) {
        this.usePhone = usePhone;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SucceedSecKill{" +
                "secKillId=" + secKillId +
                ", usePhone='" + usePhone + '\'' +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
