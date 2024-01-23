package ru.semenenko.absctractFactory.banking;

import ru.semenenko.absctractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
