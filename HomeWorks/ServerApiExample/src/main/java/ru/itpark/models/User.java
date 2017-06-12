package ru.itpark.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "credits")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;
    @Column
    private int phone;

    @OneToMany
    @JoinTable(name = "clients",
            joinColumns =
            @JoinColumn(name = "owner_id"),
            inverseJoinColumns =
            @JoinColumn(name = "id"))
    private List<Credits> credits;

    public User() {
    }

    public User(int id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public User(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public List<Credits> getCredits() {
        return credits;
    }

    public void setCredits(List<Credits> credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof User)) {
            return false;
        }

        User that = (User) object;

        return this.id == that.id &&
                this.phone == that.phone &&
                this.name.equals(that.name);
    }
}
