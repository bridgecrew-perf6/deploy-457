package org.theswimguide.engine.models;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "pollutionassoc")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PollutionAssoc implements Serializable {

    @EmbeddedId
    private PollutionAssocKey id;

    public PollutionAssocKey getId() {
        return id;
    }

    public void setId(PollutionAssocKey id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        PollutionAssoc other = (PollutionAssoc) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
}
