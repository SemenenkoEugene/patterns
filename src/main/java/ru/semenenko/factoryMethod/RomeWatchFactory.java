package ru.semenenko.factoryMethod;

public class RomeWatchFactory implements WatchFactory {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
