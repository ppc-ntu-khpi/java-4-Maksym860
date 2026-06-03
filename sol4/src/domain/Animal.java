package domain;

/**
 * Базовий клас, що моделює загальні властивості та поведінку будь-якої тварини.
 */
public class Animal {

    /** Ім'я тварини. */
    protected String name;

    /** Вага тварини у кілограмах. */
    protected int weight;

    /** Вік тварини у роках. */
    protected int age;

    /**
     * Конструктор за замовчуванням — задає базові значення.
     */
    public Animal() {
        name = "Unknown Animal";
        weight = 10;
        age = 1;
    }

    /**
     * Конструктор з параметрами.
     *
     * @param name   ім'я тварини
     * @param weight вага у кг
     * @param age    вік у роках
     */
    public Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    /** Тварина їсть. */
    public void eat() {
        System.out.println(name + " is eating...");
    }

    /** Тварина видає звук. */
    public void speak() {
        System.out.println(name + " makes a sound...");
    }

    /** Тварина спить. */
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    /** Тварина рухається. */
    public void move() {
        System.out.println(name + " is moving...");
    }

    @Override
    public String toString() {
        return "Animal:" +
               "\n  Name   : " + name +
               "\n  Weight : " + weight + " kg" +
               "\n  Age    : " + age + " years";
    }
}
