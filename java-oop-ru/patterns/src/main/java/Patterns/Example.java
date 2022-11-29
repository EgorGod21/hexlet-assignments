package Patterns;

import Patterns.Factory.Transp;
import Patterns.Factory.Transport;
import Patterns.Factory.TransportFactory;
import Patterns.Observer.WeatherData;
import Patterns.Observer.WeatherDataCenter;
import Patterns.Observer.WeatherDataReceiver;
import Patterns.Prototype.Bmw;
import Patterns.Prototype.Car;
import Patterns.Prototype.Kia;
import Patterns.Strategy.ChristmasDiscounter;
import Patterns.Strategy.Discounter;
import Patterns.Strategy.EightMarchDiscounter;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
//        TransportFactory transportFactory = new TransportFactory();
//        Transport wagon = transportFactory.getTransport(Transp.WAGON);
//        Transport ship = transportFactory.getTransport(Transp.SHIP);
//        List<Transport> transports = new ArrayList<>();
//        transports.add(wagon);
//        transports.add(ship);
//
//        for (Transport transport : transports) {
//            transport.deliver();
//        }
//        System.out.println();
//        double price = 100.83;
//        Discounter christmasDiscounter = new ChristmasDiscounter();
//        Discounter eightMarchDiscounter = new EightMarchDiscounter();
//        List<Discounter> discounters = new ArrayList<>();
//
//        discounters.add(christmasDiscounter);
//        discounters.add(eightMarchDiscounter);
//
//        for (Discounter discounter : discounters) {
//            if (discounter.checkCondition()) {
//                System.out.println(discounter.applyDiscount(price));
//            }
//
//        }
//        Bmw bmw = new Bmw();
//        bmw.setTurboModeOn(true);
//        bmw.setName("bmw 12");
//        bmw.setMaxSpeed(260);
//
//        Car bmw2 = bmw.clone();
//        System.out.println(bmw2);
//
//        Kia kia = new Kia();
//        kia.setMaxSpeed(230);
//        kia.setBlindZoneControl(true);
//
//
//        Car kia2=kia.clone();
//        System.out.println(kia2);

        WeatherDataCenter weatherDataCenter = new WeatherDataCenter();
        WeatherDataReceiver weatherDataReceiver = new WeatherDataReceiver();
        weatherDataCenter.registerObserver(weatherDataReceiver);

        WeatherData weatherData = new WeatherData();
        weatherData.setTemperature(29.3);
        weatherData.setPressure(760.3);

        weatherDataCenter.notifyObservers(weatherData);
    }
}
