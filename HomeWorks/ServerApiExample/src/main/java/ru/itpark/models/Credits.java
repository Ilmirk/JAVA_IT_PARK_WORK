package ru.itpark.models;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Credits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String number;

    @Column(name = "owner_id")
    private Integer ownerId;

    public Credits(String number, Integer ownerId) {
        this.number = number;
        this.ownerId = ownerId;
    }

    public Credits() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}
