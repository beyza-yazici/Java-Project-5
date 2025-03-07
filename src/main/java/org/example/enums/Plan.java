package org.example.enums;

public enum Plan {
    BASIC("Basic Plan", 100);

    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
