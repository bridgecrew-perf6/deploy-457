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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "pollution")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pollution implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "deleted", nullable = false)
	private int deleted;

	@Column(name = "formTimestamp", nullable = false)
	private int formTimestamp;

	@Column(name = "receiveTimestamp", nullable = false)
	private int receiveTimestamp;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "associatedOrganization", nullable = true)
	private Organization associatedOrganization;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "associatedBeach", nullable = true)
	private Beach associatedBeach;

	@Column(name = "latitude", nullable = false)
	private double latitude;

	@Column(name = "longitude", nullable = false)
	private double longitude;

	@Column(name = "name", nullable = false, length = 255)
	private String name;

	@Column(name = "email", nullable = false, length = 255)
	private String email;

	@Column(name = "city", nullable = false, length = 255)
	private String city;

	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "language", nullable = false, length = 2)
	private String language;

	@Column(name = "photoSubmission", nullable = false)
	private int photoSubmission;

    @OneToMany(mappedBy = "id.pollution", fetch = FetchType.LAZY)
	private Set<PollutionAssoc> photoAssociations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public int getFormTimestamp() {
        return formTimestamp;
    }

    public void setFormTimestamp(int formTimestamp) {
        this.formTimestamp = formTimestamp;
    }

    public int getReceiveTimestamp() {
        return receiveTimestamp;
    }

    public void setReceiveTimestamp(int receiveTimestamp) {
        this.receiveTimestamp = receiveTimestamp;
    }

    public Organization getAssociatedOrganization() {
        return associatedOrganization;
    }

    public void setAssociatedOrganization(Organization associatedOrganization) {
        this.associatedOrganization = associatedOrganization;
    }

    public Beach getAssociatedBeach() {
        return associatedBeach;
    }

    public void setAssociatedBeach(Beach associatedBeach) {
        this.associatedBeach = associatedBeach;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPhotoSubmission() {
        return photoSubmission;
    }

    public void setPhotoSubmission(int photoSubmission) {
        this.photoSubmission = photoSubmission;
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
        Pollution other = (Pollution) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
