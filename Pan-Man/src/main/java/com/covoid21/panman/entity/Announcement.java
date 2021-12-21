package com.covoid21.panman.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "announcements")
public class Announcement {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    //@Column(name = "id", nullable = false, updatable = false, unique = true)
    private Long id;

    //Column(name = "message")
    private String message;

    //@Column(name = "date")
    private Date date;

    //@Column(name = "sender")
    private long senderID;

    protected Announcement() {}

    public Announcement(String message, Date date, int senderID) {
        this.message = message;
        this.date = date;
        this.senderID = senderID;
    }

    @Override
    public String toString() {
        return String.format("Announcement[id=%d, date=%s]", id, date);
    }
}
