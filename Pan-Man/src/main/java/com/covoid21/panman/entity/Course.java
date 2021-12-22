package com.covoid21.panman.entity;

import com.covoid21.panman.entity.user.Instructor;
import com.covoid21.panman.entity.user.Student;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Course
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private int id;
    
    private String code;
    private int section;
    
    @ManyToMany
    private List<Student> students;
    
    @OneToOne
    private Instructor instructor;
    
    @ManyToMany
    private List<Student> assistants;
    
    private int quota;
    private int seatingPlanID;
    
    private double coordinateX;
    private double coordinateY;
    
    private boolean isFaceToFace;
    
    protected Course() {}
    
    public Course(int id, String code, int section, Instructor instructor, int quota, int seatingPlanID, double coordinateX, double coordinateY, boolean isFaceToFace)
    {
        this.id = id;
        this.code = code;
        this.section = section;
        this.instructor = instructor;
        this.quota = quota;
        this.seatingPlanID = seatingPlanID;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.isFaceToFace = isFaceToFace;
    }
}
