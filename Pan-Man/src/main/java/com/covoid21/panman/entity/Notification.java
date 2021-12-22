package com.covoid21.panman.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "notifications" )
@Getter
@Setter
public class Notification {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    //@Column(name = "id", nullable = false, updatable = false, unique = true)
    private Long id;


    private Date date;
    private NotificationType notificationType;
    private Long receiverID;
    private String message;
    private boolean isRead;

    protected Notification() {}
    
    public Notification(Date date, NotificationType notificationType, Long receiverID, String message, boolean isRead)
    {
        this.date = date;
        this.notificationType = notificationType;
        this.receiverID = receiverID;
        this.message = message;
        this.isRead = isRead;
    }
}
