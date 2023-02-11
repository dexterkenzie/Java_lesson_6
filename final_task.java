// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

public class Laptop {
    private String name;
    private String HDD;
    private String OS;
    private String color;
    private String ram;
    
    public Laptop(String name, String ram, String HDD, String OS, String color) {
        this.name = name;
        this.ram = ram;
        this.HDD = HDD;
        this.OS = OS;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getHDD() {
        return HDD;
    }
    
    public String getOS() {
        return OS;
    }
    
    public String getColor() {
        return color;
    }

    public String getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Laptop [name=" + name + ", ram=" + ram + ", HDD=" + HDD + ", OS="
                + OS + ", color=" + color + "]";
    }

}