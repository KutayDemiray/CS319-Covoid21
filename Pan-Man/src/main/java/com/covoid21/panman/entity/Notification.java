package com.covoid21.panman.entity;

import com.covoid21.panman.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notifications")
@Getter
@Setter
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id", nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(updatable = false)
    private Date date;

    @Enumerated
    private NotificationType notificationType;

    @ManyToOne
    private User receiver;

    @Column(columnDefinition = "text")
    private String message;

    private boolean isRead;

    protected Notification() {}
    
    public Notification(Date date, NotificationType notificationType, User receiver, String message)
    {
        this.date = date;
        this.notificationType = notificationType;
        this.receiver = receiver;
        this.message = message;
        this.isRead = false;
    }
}
