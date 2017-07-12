package ru.itpark.models;


public class Credits {

    private int id;
    private int number;
    private int ownerId;

    public Credits(int number, Integer ownerId) {
        this.number = number;
        this.ownerId = ownerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }


    @Override
    public String toString() {
        return "Credits{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Credits credits = (Credits) o;

        if (id != credits.id) return false;
        if (number != credits.number) return false;
        return ownerId == credits.ownerId;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + number;
        result = 31 * result + ownerId;
        return result;
    }
}

