package model;
// Generated 25/04/2019 00:40:20 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Additionalitem generated by hbm2java
 */
@Entity
@Table(name = "additionalitem", schema = "gcsystem")
public class Additionalitem implements java.io.Serializable {

    private int code;
    private Additional additional;
    private Item item;

    public Additionalitem() {
    }

    public Additionalitem(int code, Additional additional, Item item) {
        this.code = code;
        this.additional = additional;
        this.item = item;
    }

    @Id

    @Column(name = "code", nullable = false)
    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "code_additional", nullable = false)
    public Additional getAdditional() {
        return this.additional;
    }

    public void setAdditional(Additional additional) {
        this.additional = additional;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "code_item", nullable = false)
    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
