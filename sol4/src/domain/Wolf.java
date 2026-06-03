package domain;

/**
 * Клас «Вовк» — конкретна тварина в ієрархії успадкування.
 *
 * <p>Ієрархія: {@link Animal} → {@link Predator} → {@link PackAnimal} → {@link Wolf}</p>
 *
 * <p>Вовк — соціальний хижак, що живе у зграях. Має унікальний вовчий вий,
 * полює разом із зграєю та охороняє свою альфа-позицію.</p>
 */
public class Wolf extends PackAnimal {

    /**
     * Статус вовка у зграї.
     * Можливі значення: "Alpha", "Beta", "Delta", "Omega".
     */
    private String rank;

    /** Колір хутра вовка. */
    private String furColor;

    /**
     * Конструктор за замовчуванням — створює типового вовка.
     */
    public Wolf() {
        this("Grey", 40, 3, "deer", "Midnight Pack", 8, "Beta", "grey");
    }

    /**
     * Конструктор з повним набором параметрів.
     *
     * @param name     ім'я вовка
     * @param weight   вага у кг
     * @param age      вік у роках
     * @param prey     улюблена здобич
     * @param packName назва зграї
     * @param packSize розмір зграї
     * @param rank     статус у зграї (Alpha / Beta / Delta / Omega)
     * @param furColor колір хутра
     */
    public Wolf(String name, int weight, int age,
                String prey, String packName, int packSize,
                String rank, String furColor) {
        super(name, weight, age, prey, packName, packSize);
        this.rank = rank;
        this.furColor = furColor;
    }

    /**
     * Вовк виє на місяць.
     */
    public void howl() {
        System.out.println(name + " raises its head and howls at the moon: AWOOOO!");
    }

    /**
     * Вовк грається з молодняком зграї.
     */
    public void playWithPups() {
        System.out.println(name + " (" + rank + ") is playing with the pups of pack \""
                           + packName + "\"...");
    }

    /**
     * Вовк демонструє домінування над нижчими за рангом.
     */
    public void dominance() {
        if ("Alpha".equals(rank)) {
            System.out.println(name + " is the Alpha — stares down the pack with authority!");
        } else {
            System.out.println(name + " (" + rank + ") shows submission to the Alpha...");
        }
    }

    @Override
    public void speak() {
        System.out.println(name + " growls: Grrr... AWOOOO!");
    }

    @Override
    public void eat() {
        System.out.println(name + " tears into fresh " + prey + " meat with the pack...");
    }

    @Override
    public void move() {
        System.out.println(name + " trots silently through the forest...");
    }

    @Override
    public void hunt() {
        System.out.println(name + " (" + rank + ") leads the chase after " + prey + "!");
    }

    @Override
    public String toString() {
        return "=== W O L F ===" +
               "\n" + super.toString() +
               "\n  Rank   : " + rank +
               "\n  Fur    : " + furColor + "\n";
    }
}
