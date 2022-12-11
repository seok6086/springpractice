package com.hanghae.jewel.domain.member.model;


import javax.persistence.*;

@Entity
public class Member {

@Id
@Column(name="ID")
@GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "HEIGHT")
    private int height;


    public Member() {
    }

    public Member(Long id, String name, int height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void changeName(String name){
        this.name = name;
    }

    public void changeHeight(int height){
        this.height = height;
    }
}
