CREATE TABLE HOTELS(
	HOTEL_ID INT AUTO_INCREMENT,
    HOTEL_NAME VARCHAR(25) NOT NULL,
    HOTEL_CITY VARCHAR(55) NOT NULL,
    HOTEL_STATE VARCHAR(55) NOT NULL,
    HOTEL_ZIP INT NOT NULL,
    HOTEL_CONTACT BIGINT NOT NULL,
    CONSTRAINT HOTEL_ID_PK PRIMARY KEY(HOTEL_ID)
);

CREATE TABLE HOTEL_ROOMS(
	ROOM_ID INT AUTO_INCREMENT, -- PK --
    ROOM_NUMBER VARCHAR(25) NOT NULL,
    ROOM_PRICE INT NOT NULL,
    ROOM_BED_SIZE VARCHAR(25) NOT NULL,
    ROOM_FLOOR_NUMBER INT NOT NULL,
    HOTEL_ID INT NOT NULL, -- FK --
	CONSTRAINT ROOM_ID_PK PRIMARY KEY(ROOM_ID),
    CONSTRAINT HOTEL_ID_FK FOREIGN KEY(HOTEL_ID) REFERENCES HOTELS(HOTEL_ID)
);
