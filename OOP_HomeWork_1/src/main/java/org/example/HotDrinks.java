package org.example;

public class HotDrinks extends Product{

    private int volume;
    private int temperature;


    public HotDrinks(String name, int price, int volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrinks{" +
                "temperature=" + temperature + ", name=" + getName() + ", volume=" + getVolume() +
                '}';
    }
}
