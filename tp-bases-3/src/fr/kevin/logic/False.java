package fr.kevin.logic;

public class False extends Boolean {

    @Override
    public boolean value() {
        return false;
    }

    @Override
    public boolean not() {
        return !value();
    }

    @Override
    public boolean and(Boolean bool) {
        return value() && bool.value();
    }

    @Override
    public boolean or(Boolean bool) {
        return value() || bool.value();
    }

    @Override
    public boolean xor(Boolean bool) {
        return value() ^ bool.value();
    }

    @Override
    public String toString() {
        return "False";
    }

}
