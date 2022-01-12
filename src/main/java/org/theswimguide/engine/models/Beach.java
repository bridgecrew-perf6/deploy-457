package org.theswimguide.engine.models;

import java.io.Serializable;
import java.util.List;

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
@Table(name = "beaches")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Beach implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "region", nullable = false)
	private Region region;

	@Column(name = "hidden", nullable = false)
	private int hidden;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "photo", nullable = false)
	private int photo;

	@Column(name = "streetNumber", nullable = false, length = 20)
	private String streetNumber;

	@Column(name = "streetName", nullable = false, length = 100)
	private String streetName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "streetDirection", nullable = false)
	private Direction streetDirection;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "streetType", nullable = false)
	private Street streetType;

	@Column(name = "city", nullable = false, length = 100)
	private String city;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "location", nullable = false)
	private Province location;

	@Column(name = "postal", nullable = false, length = 100)
	private String postal;

	@Column(name = "description", nullable = false)
	private String description;

	@Column(name = "manualRating", nullable = false)
	private int manualRating = -1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "frequency", nullable = false)
	private Frequency frequency;

	@Column(name = "monitorStartMonth", nullable = false)
	private int monitorStartMonth;

	@Column(name = "monitorStartDay", nullable = false)
	private int monitorStartDay;

	@Column(name = "monitorStopMonth", nullable = false)
	private int monitorStopMonth;

	@Column(name = "monitorStopDay", nullable = false)
	private int monitorStopDay;

	@Column(name = "locLat", nullable = false)
	private double locLat;

	@Column(name = "locLong", nullable = false)
	private double locLong;

	@Column(name = "feedStatus", nullable = false)
	private int feedStatus;

	@Column(name = "feedLocation")
	private String feedLocation;

	@Column(name = "feedStation")
	private String feedStation;

	@Column(name = "tempFeedInterval")
	private Integer tempFeedInterval;

	@Column(name = "hideTemperature")
	private int hideTemperature;

    @OneToMany(mappedBy = "beach", fetch = FetchType.LAZY)
	private List<HistoricTemp> historicTempList;

    public Beach() {
    }

    public Beach(int id, Region region, int hidden, String name, int photo, String streetNumber, String streetName,
            Direction streetDirection, Street streetType, String city, Province location, String postal,
            String description, int manualRating, Frequency frequency, int monitorStartMonth, int monitorStartDay,
            int monitorStopMonth, int monitorStopDay, double locLat, double locLong, int feedStatus,
            String feedLocation, String feedStation, Integer tempFeedInterval, int hideTemperature) {
        this.id = id;
        this.region = region;
        this.hidden = hidden;
        this.name = name;
        this.photo = photo;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.streetDirection = streetDirection;
        this.streetType = streetType;
        this.city = city;
        this.location = location;
        this.postal = postal;
        this.description = description;
        this.manualRating = manualRating;
        this.frequency = frequency;
        this.monitorStartMonth = monitorStartMonth;
        this.monitorStartDay = monitorStartDay;
        this.monitorStopMonth = monitorStopMonth;
        this.monitorStopDay = monitorStopDay;
        this.locLat = locLat;
        this.locLong = locLong;
        this.feedStatus = feedStatus;
        this.feedLocation = feedLocation;
        this.feedStation = feedStation;
        this.tempFeedInterval = tempFeedInterval;
        this.hideTemperature = hideTemperature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
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

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
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

    public Direction getStreetDirection() {
        return streetDirection;
    }

    public void setStreetDirection(Direction streetDirection) {
        this.streetDirection = streetDirection;
    }

    public Street getStreetType() {
        return streetType;
    }

    public void setStreetType(Street streetType) {
        this.streetType = streetType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Province getLocation() {
        return location;
    }

    public void setLocation(Province location) {
        this.location = location;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getManualRating() {
        return manualRating;
    }

    public void setManualRating(int manualRating) {
        this.manualRating = manualRating;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public int getMonitorStartMonth() {
        return monitorStartMonth;
    }

    public void setMonitorStartMonth(int monitorStartMonth) {
        this.monitorStartMonth = monitorStartMonth;
    }

    public int getMonitorStartDay() {
        return monitorStartDay;
    }

    public void setMonitorStartDay(int monitorStartDay) {
        this.monitorStartDay = monitorStartDay;
    }

    public int getMonitorStopMonth() {
        return monitorStopMonth;
    }

    public void setMonitorStopMonth(int monitorStopMonth) {
        this.monitorStopMonth = monitorStopMonth;
    }

    public int getMonitorStopDay() {
        return monitorStopDay;
    }

    public void setMonitorStopDay(int monitorStopDay) {
        this.monitorStopDay = monitorStopDay;
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

    public int getFeedStatus() {
        return feedStatus;
    }

    public void setFeedStatus(int feedStatus) {
        this.feedStatus = feedStatus;
    }

    public String getFeedLocation() {
        return feedLocation;
    }

    public void setFeedLocation(String feedLocation) {
        this.feedLocation = feedLocation;
    }

    public String getFeedStation() {
        return feedStation;
    }

    public void setFeedStation(String feedStation) {
        this.feedStation = feedStation;
    }

    public Integer getTempFeedInterval() {
        return tempFeedInterval;
    }

    public void setTempFeedInterval(Integer tempFeedInterval) {
        this.tempFeedInterval = tempFeedInterval;
    }

    public int getHideTemperature() {
        return hideTemperature;
    }

    public void setHideTemperature(int hideTemperature) {
        this.hideTemperature = hideTemperature;
    }

    public List<HistoricTemp> getHistoricTempList() {
        return historicTempList;
    }

    public void setHistoricTempList(List<HistoricTemp> historicTempList) {
        this.historicTempList = historicTempList;
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
        Beach other = (Beach) obj;
        if (id != other.id)
            return false;
        return true;
    }
    
}
