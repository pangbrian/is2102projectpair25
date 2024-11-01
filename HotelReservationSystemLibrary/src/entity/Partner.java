/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author brianpang
 */
@Entity
public class Partner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parterId;
    @Column(length = 32, nullable = false, unique = true)
    @NotNull
    @Size(min = 1, max = 32)
    private String name;
    @Column(nullable = false)
    @NotNull
    @Size(min = 1, max = 32)
    private String password;

    public Partner() {
    }

    public Partner(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Long getParterId() {
        return parterId;
    }

    public void setParterId(Long parterId) {
        this.parterId = parterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parterId != null ? parterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partner)) {
            return false;
        }
        Partner other = (Partner) object;
        if ((this.parterId == null && other.parterId != null) || (this.parterId != null && !this.parterId.equals(other.parterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Partner[ id=" + parterId + " ]";
    }
    
}
