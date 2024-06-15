package com.unipark.demo.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Record {
    @Id
    private String id;
    private String date;
    private String time;
    private int occupied;
    private int free;

    public Record(String id, String date, String time, int occupied, int free) {
        super();
        this.id = id;
        this.date = date;
        this.time = time;
        this.occupied = occupied;
        this.free = free;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
    public int getOccupied() {
        return occupied;
    }

    public int getFree() {
        return free;
    }
}
