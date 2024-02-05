package com.earlybird.api.ticket.dto;

import com.earlybird.api.user.domain.User;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@ToString
public class TicketIssueRequest {
    private User user;
    private String description;
    private LocalDate expireAt;

    public TicketIssueRequest(User user, String description, LocalDate expireAt) {
        this.user = user;
        this.description = description;
        this.expireAt = expireAt;
    }
}