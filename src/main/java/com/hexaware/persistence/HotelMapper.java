package com.hexaware.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexaware.model.Hotel;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

/**
 * HotelMapper
 */
public class HotelMapper implements ResultSetMapper<Hotel> {

    @Override
    public Hotel map(int index, ResultSet rs, StatementContext ctx) throws SQLException {
        return new Hotel(rs.getInt("HOTEL_ID"), rs.getString("HOTEL_NAME"), rs.getString("HOTEL_CITY"), rs.getString("HOTEL_STATE"), rs.getInt("HOTEL_ZIP"), rs.getLong("HOTEL_CONTACT"));
    }

    
}