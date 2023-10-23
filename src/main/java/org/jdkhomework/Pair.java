package org.jdkhomework;

public class Pair<T,E> {
    T first;
    E second;
    public Pair() {

    }

    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair < "+first.getClass().toString()+
                " = " + first +", "+second.getClass().toString()+
                " = " + second+" >";
    }
}
