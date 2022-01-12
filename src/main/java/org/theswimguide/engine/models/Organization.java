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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "organizations")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Organization implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "hidden", nullable = false)
    private String hidden;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "streetUnit", nullable = false)
    private String streetUnit;

    @Column(name = "streetNumber", nullable = false)
    private String streetNumber;

    @Column(name = "streetName", nullable = false)
    private String streetName;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "streetType", nullable = false)
	private Street streetType;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "streetDirection", nullable = false)
	private Direction streetDirection;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "location", nullable = false)
	private Province location;

	@Column(name = "city", nullable = true, length = 100)
	private String city;

	@Column(name = "zip", nullable = true, length = 10)
	private String zip;

	@Column(name = "locLat", nullable = true)
	private double locLat;

	@Column(name = "locLong", nullable = true)
	private double locLong;

	@Column(name = "notes", nullable = true)
	private String notes;

	@Column(name = "donateNowLink", nullable = true, length = 255)
	private String donateNowLink;

	@Column(name = "textMessageDetails", nullable = true, length = 255)
	private String textMessageDetails;

	@Column(name = "volunteering", nullable = true, length = 255)
	private String volunteering;

	@Column(name = "newsletterSignup", nullable = true, length = 255)
	private String newsletterSignup;

	@Column(name = "url", nullable = true, length = 255)
	private String url;

    @JsonIgnore
    @OneToOne(mappedBy = "organization", fetch = FetchType.LAZY)
	private User user;

    @JsonIgnore
    @OneToMany(mappedBy = "assignedTo", fetch = FetchType.LAZY)
	private Set<Region> regions;

    @JsonIgnore
    @OneToMany(mappedBy = "organization", fetch = FetchType.LAZY)
	private Set<Sponsor> sponsors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHidden() {
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetUnit() {
        return streetUnit;
    }

    public void setStreetUnit(String streetUnit) {
        this.streetUnit = streetUnit;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Street getStreetType() {
        return streetType;
    }

    public void setStreetType(Street streetType) {
        this.streetType = streetType;
    }

    public Direction getStreetDirection() {
        return streetDirection;
    }

    public void setStreetDirection(Direction streetDirection) {
        this.streetDirection = streetDirection;
    }

    public Province getLocation() {
        return location;
    }

    public void setLocation(Province location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public double getLocLat() {
        return locLat;
    }

    public void setLocLat(double locLat) {
        this.locLat = locLat;
    }

    public double getLocLong() {
        return locLong;
    }

    public void setLocLong(double locLong) {
        this.locLong = locLong;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDonateNowLink() {
        return donateNowLink;
    }

    public void setDonateNowLink(String donateNowLink) {
        this.donateNowLink = donateNowLink;
    }

    public String getTextMessageDetails() {
        return textMessageDetails;
    }

    public void setTextMessageDetails(String textMessageDetails) {
        this.textMessageDetails = textMessageDetails;
    }

    public String getVolunteering() {
        return volunteering;
    }

    public void setVolunteering(String volunteering) {
        this.volunteering = volunteering;
    }

    public String getNewsletterSignup() {
        return newsletterSignup;
    }

    public void setNewsletterSignup(String newsletterSignup) {
        this.newsletterSignup = newsletterSignup;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public void setSponsors(Set<Sponsor> sponsors) {
        this.sponsors = sponsors;
    }

    public Set<Region> getRegions() {
        return regions;
    }

    public void setRegions(Set<Region> regions) {
        this.regions = regions;
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
        Organization other = (Organization) obj;
        if (id != other.id)
            return false;
        return true;
    }
    
}
