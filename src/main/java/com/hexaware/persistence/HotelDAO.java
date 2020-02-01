package com.hexaware.persistence;

import java.util.List;

import com.hexaware.model.Hotel;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

/**
 * HotelDAO
 */
public interface HotelDAO {
    @SqlQuery("SELECT * FROM HOTELS WHERE HOTEL_ID = :hotelID")
    @Mapper(HotelMapper.class)
    Hotel listHotelDetails(@Bind("hotelID") int hotelId);

    @SqlQuery("SELECT * FROM HOTELS")
    @Mapper(HotelMapper.class)
    List<Hotel> listAllHotels();
}