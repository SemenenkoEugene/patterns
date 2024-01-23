package ru.semenenko.absctractFactory.banking;

import ru.semenenko.absctractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
