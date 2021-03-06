package model;
// Generated 19/05/2019 14:54:07 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Request generated by hbm2java
 */
@Entity
@Table(name="request"
    ,schema="gcsystem"
)
public class Request  implements java.io.Serializable {


     private int code;
     private Company company;
     private Guestcheck guestcheck;
     private Tablelist tablelist;
     private Userlogin userlogin;
     private String status;
     private Date datetimeins;
     private Date datetimeend;
     private Set<Requestproduct> requestproducts = new HashSet<Requestproduct>(0);
     private Set<Requestpay> requestpays = new HashSet<Requestpay>(0);

    public Request() {
    }

	
    public Request(int code) {
        this.code = code;
    }
    public Request(int code, Company company, Guestcheck guestcheck, Tablelist tablelist, Userlogin userlogin, String status, Date datetimeins, Date datetimeend, Set<Requestproduct> requestproducts, Set<Requestpay> requestpays) {
       this.code = code;
       this.company = company;
       this.guestcheck = guestcheck;
       this.tablelist = tablelist;
       this.userlogin = userlogin;
       this.status = status;
       this.datetimeins = datetimeins;
       this.datetimeend = datetimeend;
       this.requestproducts = requestproducts;
       this.requestpays = requestpays;
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
    @JoinColumn(name="code_company")
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="code_guestcheck")
    public Guestcheck getGuestcheck() {
        return this.guestcheck;
    }
    
    public void setGuestcheck(Guestcheck guestcheck) {
        this.guestcheck = guestcheck;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="code_tablelist")
    public Tablelist getTablelist() {
        return this.tablelist;
    }
    
    public void setTablelist(Tablelist tablelist) {
        this.tablelist = tablelist;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="code_userlogin")
    public Userlogin getUserlogin() {
        return this.userlogin;
    }
    
    public void setUserlogin(Userlogin userlogin) {
        this.userlogin = userlogin;
    }

    
    @Column(name="status", length=20)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="datetimeins", length=29)
    public Date getDatetimeins() {
        return this.datetimeins;
    }
    
    public void setDatetimeins(Date datetimeins) {
        this.datetimeins = datetimeins;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="datetimeend", length=29)
    public Date getDatetimeend() {
        return this.datetimeend;
    }
    
    public void setDatetimeend(Date datetimeend) {
        this.datetimeend = datetimeend;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="request")
    public Set<Requestproduct> getRequestproducts() {
        return this.requestproducts;
    }
    
    public void setRequestproducts(Set<Requestproduct> requestproducts) {
        this.requestproducts = requestproducts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="request")
    public Set<Requestpay> getRequestpays() {
        return this.requestpays;
    }
    
    public void setRequestpays(Set<Requestpay> requestpays) {
        this.requestpays = requestpays;
    }




}


