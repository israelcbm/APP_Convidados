package com.example.convidados.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "guest")
public class GuestModel {

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "confirmation")
    private int confirmation;

    @Ignore
    public GuestModel(int id, String name, int confirmation) {
        this.id = id;
        this.name = name;
        this.confirmation = confirmation;
    }

    public GuestModel( String name, int confirmation) {
        this.id = 0;
        this.name = name;
        this.confirmation = confirmation;
    }

    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(int confirmation) {
        this.confirmation = confirmation;
    }
}
