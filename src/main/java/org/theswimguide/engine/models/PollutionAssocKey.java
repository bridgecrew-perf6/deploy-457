package org.theswimguide.engine.models;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Embeddable
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PollutionAssocKey implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pollution", nullable = false)
	private Pollution pollution;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "photo", nullable = false)
	private PollutionPhoto photo;

    public Pollution getPollution() {
        return pollution;
    }

    public void setPollution(Pollution pollution) {
        this.pollution = pollution;
    }

    public PollutionPhoto getPhoto() {
        return photo;
    }

    public void setPhoto(PollutionPhoto photo) {
        this.photo = photo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((photo == null) ? 0 : photo.hashCode());
        result = prime * result + ((pollution == null) ? 0 : pollution.hashCode());
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
        PollutionAssocKey other = (PollutionAssocKey) obj;
        if (photo == null) {
            if (other.photo != null)
                return false;
        } else if (!photo.equals(other.photo))
            return false;
        if (pollution == null) {
            if (other.pollution != null)
                return false;
        } else if (!pollution.equals(other.pollution))
            return false;
        return true;
    }
    
}
