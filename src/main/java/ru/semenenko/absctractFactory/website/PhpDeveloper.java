package ru.semenenko.absctractFactory.website;

import ru.semenenko.absctractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
