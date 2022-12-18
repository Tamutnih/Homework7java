package com.example;

// 1. Создайте унаследованный класс ГорячийНапиток с дополнительным полем int
// температура.

public class Drink {
    public String name;
    public int volume;
    public int temperature;

    public Drink(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    public class hotDrink extends Drink {

        public hotDrink(String name, int volume, int temperature) {
            super(name, volume, temperature);
        }
    }

}