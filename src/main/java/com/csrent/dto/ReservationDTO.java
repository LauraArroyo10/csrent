package com.csrent.dto;

import java.time.LocalDate;

public class ReservationDTO {

    private String userEmail;
    private Integer spaceId;
    private LocalDate date;
    private String status;

    public ReservationDTO() {
    }

    public ReservationDTO(String userEmail, Integer spaceId, LocalDate date, String status) {
        this.userEmail = userEmail;
        this.spaceId = spaceId;
        this.date = date;
        this.status = status;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
