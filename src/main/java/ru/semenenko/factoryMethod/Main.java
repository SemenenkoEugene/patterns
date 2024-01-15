package ru.semenenko.factoryMethod;

public class Main {
    public static void main(String[] args) {
        WatchFactory watchFactory = new RomeWatchFactory();//new DigitalWatchFactory();
        Watch watch = watchFactory.createWatch();
        watch.showTime();
    }
}
