package com.supermarket.model;

import java.time.LocalDate;

public class Staffmember extends Person {
    protected int salery;
    protected int mounthlyTarget;

    public Staffmember() {
        super();
    }

    public Staffmember(int id, String name, int age, int telephone, String address, Double salary) {
        super(id, name, age, telephone, address);
        this.salery = salary.intValue();
    }

    public void bouns() {
        LocalDate currentDate = LocalDate.now();
        LocalDate afterthirtyDay = currentDate.plusDays(30);

        if (currentDate.isAfter(afterthirtyDay) && mounthlyTarget >= 100000) {
            salery += 500;
        }
    }
}
