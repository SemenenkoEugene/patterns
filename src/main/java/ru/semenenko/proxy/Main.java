package ru.semenenko.proxy;

public class Main {
    public static void main(String[] args) {
//        Image image = new RealImage("D:/images/myImage.jpg");
//        image.display();

        Image image = new ProxyImage("D:/images/myImage.jpg");
        image.display();
    }
}
