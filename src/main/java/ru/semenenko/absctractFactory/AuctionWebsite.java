package ru.semenenko.absctractFactory;

import ru.semenenko.absctractFactory.website.WebsiteTeamFactory;

public class AuctionWebsite {
    public static void main(String[] args) {
        WebsiteTeamFactory teamFactory = new WebsiteTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        ProjectManager projectManager = teamFactory.getProjectManager();
        Tester tester = teamFactory.getTester();

        System.out.println("Creating website project...");

        developer.writeCode();
        projectManager.manageProject();
        tester.testCode();
    }
}
