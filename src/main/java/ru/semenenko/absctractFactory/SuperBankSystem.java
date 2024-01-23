package ru.semenenko.absctractFactory;

import ru.semenenko.absctractFactory.banking.BankTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating banking project...");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
