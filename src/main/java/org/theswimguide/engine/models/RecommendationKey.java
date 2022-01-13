package org.theswimguide.engine.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Embeddable
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class RecommendationKey implements Serializable {

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "beach", nullable = false)
	private Beach beach;

    @JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "similar", nullable = false)
	private Beach similar;

	@Column(name = "rank", nullable = false)
	private int rank;

    public Beach getBeach() {
        return beach;
    }

    public void setBeach(Beach beach) {
        this.beach = beach;
    }

    public Beach getSimilar() {
        return similar;
    }

    public void setSimilar(Beach similar) {
        this.similar = similar;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((beach == null) ? 0 : beach.hashCode());
        result = prime * result + rank;
        result = prime * result + ((similar == null) ? 0 : similar.hashCode());
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
        RecommendationKey other = (RecommendationKey) obj;
        if (beach == null) {
            if (other.beach != null)
                return false;
        } else if (!beach.equals(other.beach))
            return false;
        if (rank != other.rank)
            return false;
        if (similar == null) {
            if (other.similar != null)
                return false;
        } else if (!similar.equals(other.similar))
            return false;
        return true;
    }
    
}
