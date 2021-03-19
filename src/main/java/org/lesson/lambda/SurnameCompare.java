package org.lesson.lambda;

import java.util.Comparator;

public class SurnameCompare implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
