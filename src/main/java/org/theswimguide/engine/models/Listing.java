package org.theswimguide.engine.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "listings")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Listing implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "slug", nullable = false, unique = true)
    private String slug;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "description", nullable = false)
    private String description;

    @Column (name = "metadata", length = 160)
	private String metadata;

	@Column(name = "photo")
	private int photo;

	@Column(name = "isPublished", nullable = false)
	private Integer isPublished;

	@OneToOne
	@JoinColumn(name = "location_id", nullable = false)
	private Province location;

    public Listing() {
    }

    public Listing(String slug, String city, Province location) {
        this.slug = slug;
        this.city = city;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public Integer isPublished() {
        return isPublished;
    }

    public void setPublished(Integer isPublished) {
        this.isPublished = isPublished;
    }

    public Province getLocation() {
        return location;
    }

    public void setLocation(Province location) {
        this.location = location;
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
        Listing other = (Listing) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Listing [city=" + city + ", id=" + id + ", isPublished=" + isPublished + ", slug=" + slug + "]";
    }
    
}
