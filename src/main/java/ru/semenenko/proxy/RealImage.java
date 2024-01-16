package ru.semenenko.proxy;

public class RealImage implements Image {

    private final String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    public void load(){
        System.out.println("Загрузка " + file);
    }

    @Override
    public void display() {
        System.out.println("Просмотр " + file);
    }
}
