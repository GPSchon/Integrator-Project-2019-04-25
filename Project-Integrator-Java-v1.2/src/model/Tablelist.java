package model;
// Generated 25/04/2019 00:40:20 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tablelist generated by hbm2java
 */
@Entity
@Table(name = "tablelist", schema = "gcsystem")
public class Tablelist implements java.io.Serializable {

    private int code;
    private String description;
    private String active;
    private Set<Request> requests = new HashSet<Request>(0);

    public Tablelist() {
    }

    public Tablelist(int code) {
        this.code = code;
    }

    public Tablelist(int code, String description, String active, Set<Request> requests) {
        this.code = code;
        this.description = description;
        this.active = active;
        this.requests = requests;
    }

    @Id

    @Column(name = "code", nullable = false)
    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Column(name = "description", length = 10)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "active", length = 3)
    public String getActive() {
        return this.active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tablelist")
    public Set<Request> getRequests() {
        return this.requests;
    }

    public void setRequests(Set<Request> requests) {
        this.requests = requests;
    }

}
