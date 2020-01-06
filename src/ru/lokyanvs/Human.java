package ru.lokyanvs;

public abstract class Human {
    protected final boolean man;
    protected final String name;
    protected Human spouse;

    public Human(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public abstract boolean marry(Human human);

    public abstract boolean divorce();
}
