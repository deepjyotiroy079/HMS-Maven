package com.hexaware.model;

import java.util.List;

import com.hexaware.persistence.DbConnection;
import com.hexaware.persistence.HotelDAO;

/**
 * Hotel
 * @author Deepjyoti Roy
 */
public class Hotel {
    /**
     * hotelId to store the id of hotel
     * hotelName to store the name of the hotel
     * hotelCity to store the city of the hotel
     * hotelState to store the state of the hotel
     * hotelZip to store the zip code of the hotel
     * hotelContact to store the contact of the hotel
     */
    private int hotelId;
    private String hotelName;
    private String hotelCity;
    private String hotelState;
    private int hotelZip;
    private Long hotelContact;

    public Hotel() {
    }
    /**
     * constructor to initialize the variables
     * @param argsHotelId the hotel id
     * @param argsHotelName the hotel Name
     * @param argsHotelCity the hotel city
     * @param argsHotelState the hotel State
     * @param argsHotelZip the hotel zip code
     * @param argsHotelContact the hotelContact
     */
    public Hotel(final int argsHotelId, final String argsHotelName, final String argsHotelCity, final String argsHotelState,
            final int argsHotelZip, final Long argsHotelContact) {
        this.hotelId = argsHotelId;
        this.hotelName = argsHotelName;
        this.hotelCity = argsHotelCity;
        this.hotelState = argsHotelState;
        this.hotelZip = argsHotelZip;
        this.hotelContact = argsHotelContact;
    }
    /**
     * returns the hotel id
     * @return the hotel id
     */
    public int getHotelId() {
        return hotelId;
    }
    /**
     * initializes the hotel id
     * @param argsHotelId the hotel id
     */
    public void setHotelId(final int argsHotelId) {
        this.hotelId = argsHotelId;
    }
    /**
     * returns the hotel name
     * @return the hotel name
     */
    public String getHotelName() {
        return hotelName;
    }
    /**
     * initializes the hotel name
     * @param argsHotelName the hotel name
     */
    public void setHotelName(final String argsHotelName) {
        this.hotelName = argsHotelName;
    }
    /**
     * returns the hotel city
     * @return the hotel city
     */
    public String getHotelCity() {
        return hotelCity;
    }
    /**
     * initializes the hotel city
     * @param argsHotelCity the hotel city
     */
    public void setHotelCity(final String argsHotelCity) {
        this.hotelCity = argsHotelCity;
    }
    /**
     * returns the hotel state
     * @return the state of the hotel
     */
    public String getHotelState() {
        return hotelState;
    }
    /**
     * initializes the state of the hotel
     * @param argsHotelState the state of the hotel
     */
    public void setHotelState(final String argsHotelState) {
        this.hotelState = argsHotelState;
    }
    /**
     * returns the hotel zip code
     * @return the hotel zip code
     */
    public int getHotelZip() {
        return hotelZip;
    }
    /**
     * initilizes the hotel zip code
     * @param argsHotelZip the hotel zip code
     */
    public void setHotelZip(final int argsHotelZip) {
        this.hotelZip = argsHotelZip;
    }
    /**
     * returns the contact of the hotel
     * @return the contact of the hotel
     */
    public Long getHotelContact() {
        return hotelContact;
    }
    /**
     * initializes the hotel contact
     * @param argsHotelContact the hotel contact
     */
    public void setHotelContact(final Long argsHotelContact) {
        this.hotelContact = argsHotelContact;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hotelCity == null) ? 0 : hotelCity.hashCode());
        result = prime * result + ((hotelContact == null) ? 0 : hotelContact.hashCode());
        result = prime * result + hotelId;
        result = prime * result + ((hotelName == null) ? 0 : hotelName.hashCode());
        result = prime * result + ((hotelState == null) ? 0 : hotelState.hashCode());
        result = prime * result + hotelZip;
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Hotel other = (Hotel) obj;
        if (hotelCity == null) {
            if (other.hotelCity != null)
                return false;
        } else if (!hotelCity.equals(other.hotelCity))
            return false;
        if (hotelContact == null) {
            if (other.hotelContact != null)
                return false;
        } else if (!hotelContact.equals(other.hotelContact))
            return false;
        if (hotelId != other.hotelId)
            return false;
        if (hotelName == null) {
            if (other.hotelName != null)
                return false;
        } else if (!hotelName.equals(other.hotelName))
            return false;
        if (hotelState == null) {
            if (other.hotelState != null)
                return false;
        } else if (!hotelState.equals(other.hotelState))
            return false;
        if (hotelZip != other.hotelZip)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Hotel [hotelCity=" + hotelCity + ", hotelContact=" + hotelContact + ", hotelId=" + hotelId
                + ", hotelName=" + hotelName + ", hotelState=" + hotelState + ", hotelZip=" + hotelZip + "]";
    }
    public static HotelDAO dao() {
        final DbConnection db = new DbConnection();
        return db.getConnect().onDemand(HotelDAO.class);
    }
    public static Hotel listHotelById(final int hotelId){
        return dao().listHotelDetails(hotelId);
    }

    public static Hotel[] listAllHotelDetails() {
        final List<Hotel> hotels = dao().listAllHotels();
        return hotels.toArray(new Hotel[hotels.size()]);
    }
}