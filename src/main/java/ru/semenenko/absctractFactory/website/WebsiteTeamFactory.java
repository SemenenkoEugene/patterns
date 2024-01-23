package ru.semenenko.absctractFactory.website;

import ru.semenenko.absctractFactory.Developer;
import ru.semenenko.absctractFactory.ProjectManager;
import ru.semenenko.absctractFactory.ProjectTeamFactory;
import ru.semenenko.absctractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
