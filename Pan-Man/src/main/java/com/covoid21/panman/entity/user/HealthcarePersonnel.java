package com.covoid21.panman.entity.user;

import javax.persistence.Entity;

@Entity
public class HealthcarePersonnel extends User
{
    private String department;
    private String office;
    private String title;
}
