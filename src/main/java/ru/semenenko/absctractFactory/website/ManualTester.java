package ru.semenenko.absctractFactory.website;

import ru.semenenko.absctractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
