package ru.semenenko.absctractFactory.website;

import ru.semenenko.absctractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
