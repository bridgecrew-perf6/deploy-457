package org.theswimguide.engine.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "direction")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Direction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "direction", length = 9)
    private String direction;

    @JsonIgnore
    @OneToMany(mappedBy = "streetDirection", fetch = FetchType.LAZY)
	private Set<Organization> organizations;

    @JsonIgnore
    @OneToMany(mappedBy = "streetDirection", fetch = FetchType.LAZY)
	private Set<Beach> beaches;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Set<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Set<Organization> organizations) {
        this.organizations = organizations;
    }

    public Set<Beach> getBeaches() {
        return beaches;
    }

    public void setBeaches(Set<Beach> beaches) {
        this.beaches = beaches;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Direction other = (Direction) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Direction [direction=" + direction + ", id=" + id + "]";
    }
    
}
