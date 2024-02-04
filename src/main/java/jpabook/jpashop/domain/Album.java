package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Album extends Item {
    private String aritst;
    private String etc;

    public String getAritst() {
        return aritst;
    }

    public void setAritst(String aritst) {
        this.aritst = aritst;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }
}
