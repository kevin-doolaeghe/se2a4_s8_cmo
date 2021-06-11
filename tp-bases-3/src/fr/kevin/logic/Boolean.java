package fr.kevin.logic;

public abstract class Boolean {

    public abstract boolean value();

    public abstract boolean not();

    public abstract boolean and(Boolean bool);

    public abstract boolean or(Boolean bool);

    public abstract boolean xor(Boolean bool);

    public abstract String toString();

}
