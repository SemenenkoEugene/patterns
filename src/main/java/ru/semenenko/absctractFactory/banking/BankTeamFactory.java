package ru.semenenko.absctractFactory.banking;

import ru.semenenko.absctractFactory.Developer;
import ru.semenenko.absctractFactory.ProjectManager;
import ru.semenenko.absctractFactory.ProjectTeamFactory;
import ru.semenenko.absctractFactory.Tester;

public class BankTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
