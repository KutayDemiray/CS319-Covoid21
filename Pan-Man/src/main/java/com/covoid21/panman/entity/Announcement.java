package com.covoid21.panman.entity;

import com.covoid21.panman.entity.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "announcements")
@Getter
@Setter
public class Announcement {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    //@Column(name = "id", nullable = false, updatable = false, unique = true)
    private Long id = 0L;

    @Column(columnDefinition="text")
    private String message;

    @Column(unique = true)
    private Date date;

    @ManyToOne
    private User sender;
    
    protected Announcement() {}
    
    public Announcement(String message, Date date, User sender) {
        this.message = message;
        this.date = date;
        this.sender = sender;
    }
    
    @Override
    public String toString()
    {
        return String.format("Announcement[id=%d, date=%s]", id, date);
    }
}
