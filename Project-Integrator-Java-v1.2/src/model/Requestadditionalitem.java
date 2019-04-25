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
 * Requestadditionalitem generated by hbm2java
 */
@Entity
@Table(name="requestadditionalitem"
    ,schema="gcsystem"
)
public class Requestadditionalitem  implements java.io.Serializable {


     private int code;
     private Additional additional;
     private Requestitem requestitem;

    public Requestadditionalitem() {
    }

    public Requestadditionalitem(int code, Additional additional, Requestitem requestitem) {
       this.code = code;
       this.additional = additional;
       this.requestitem = requestitem;
    }
   
     @Id 

    
    @Column(name="code", nullable=false)
    public int getCode() {
        return this.code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="code_additional", nullable=false)
    public Additional getAdditional() {
        return this.additional;
    }
    
    public void setAdditional(Additional additional) {
        this.additional = additional;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="code_requestitem", nullable=false)
    public Requestitem getRequestitem() {
        return this.requestitem;
    }
    
    public void setRequestitem(Requestitem requestitem) {
        this.requestitem = requestitem;
    }




}

