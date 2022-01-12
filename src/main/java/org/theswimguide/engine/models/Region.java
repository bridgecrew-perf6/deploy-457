package org.theswimguide.engine.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "regions")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Region implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name="hidden", nullable = false)
	private int hidden;

	@Column(name="name", nullable = false, length = 100)
	private String name;

	@Column(name="source", nullable = false)
	private int source;

	@Column(name = "sourceInformation", nullable = false)
	private String sourceInformation;

	@Column(name = "contact", nullable = false, length = 255)
	private String contact;

	@Column(name="reporting", nullable = false)
	private int reporting;

	@Column(name = "reportInfo", nullable = false, length = 100)
	private String reportInfo;

    // @JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="assignedTo", nullable = true)
	private Organization assignedTo;

	@Column(name = "feedUrl", length = 255)
	private String feedUrl;

	@Column(name="feedUpdateInterval", nullable = false)
	private int feedUpdateInterval;

	@Column(name="singleEnabled", nullable = false)
	private int singleEnabled;

	@Column(name="singleThreshold", nullable = false)
	private float singleThreshold;

	@Column(name="spatialEnabled", nullable = false)
	private int spatialEnabled;

	@Column(name="spatialThreshold", nullable = false)
	private float spatialThreshold;

	@Column(name="temporalEnabled", nullable = false)
	private int temporalEnabled;

	@Column(name="temporalThreshold", nullable = false)
	private float temporalThreshold;

    @JsonIgnore
    @OneToMany(mappedBy = "region", fetch = FetchType.LAZY)
	private Set<Beach> beaches;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHidden() {
        return hidden;
    }

    public void setHidden(int hidden) {
        this.hidden = hidden;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public String getSourceInformation() {
        return sourceInformation;
    }

    public void setSourceInformation(String sourceInformation) {
        this.sourceInformation = sourceInformation;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getReporting() {
        return reporting;
    }

    public void setReporting(int reporting) {
        this.reporting = reporting;
    }

    public String getReportInfo() {
        return reportInfo;
    }

    public void setReportInfo(String reportInfo) {
        this.reportInfo = reportInfo;
    }

    public Organization getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Organization assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getFeedUrl() {
        return feedUrl;
    }

    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }

    public int getFeedUpdateInterval() {
        return feedUpdateInterval;
    }

    public void setFeedUpdateInterval(int feedUpdateInterval) {
        this.feedUpdateInterval = feedUpdateInterval;
    }

    public int getSingleEnabled() {
        return singleEnabled;
    }

    public void setSingleEnabled(int singleEnabled) {
        this.singleEnabled = singleEnabled;
    }

    public float getSingleThreshold() {
        return singleThreshold;
    }

    public void setSingleThreshold(float singleThreshold) {
        this.singleThreshold = singleThreshold;
    }

    public int getSpatialEnabled() {
        return spatialEnabled;
    }

    public void setSpatialEnabled(int spatialEnabled) {
        this.spatialEnabled = spatialEnabled;
    }

    public float getSpatialThreshold() {
        return spatialThreshold;
    }

    public void setSpatialThreshold(float spatialThreshold) {
        this.spatialThreshold = spatialThreshold;
    }

    public int getTemporalEnabled() {
        return temporalEnabled;
    }

    public void setTemporalEnabled(int temporalEnabled) {
        this.temporalEnabled = temporalEnabled;
    }

    public float getTemporalThreshold() {
        return temporalThreshold;
    }

    public void setTemporalThreshold(float temporalThreshold) {
        this.temporalThreshold = temporalThreshold;
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
        Region other = (Region) obj;
        if (id != other.id)
            return false;
        return true;
    }
    
}
