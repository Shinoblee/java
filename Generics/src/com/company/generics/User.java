package com.company.generics;

public class User implements Comparable<User> {
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        //this < 0 -> return negative value
        //this == o -> return 0
        //this > o -> return a positive value
        return points - other.points;

        //SAME AS ABOVE
//        if (points < other.points)
//            return -1;
//        if (points == other.points)
//            return 0;
//        return 1;
    }


    @Override
    public String toString() {
        return "Points=" + points;
    }
}
