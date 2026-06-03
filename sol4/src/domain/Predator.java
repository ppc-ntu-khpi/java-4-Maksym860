package domain;

/**
 * Клас хижака — розширює {@link Animal} поведінкою мисливця.
 */
public class Predator extends Animal {

    /** Улюблена здобич хижака. */
    protected String prey;

    /**
     * Конструктор за замовчуванням.
     */
    public Predator() {
        super();
        prey = "small animal";
    }

    /**
     * Конструктор з параметрами.
     *
     * @param name   ім'я
     * @param weight вага у кг
     * @param age    вік у роках
     * @param prey   улюблена здобич
     */
    public Predator(String name, int weight, int age, String prey) {
        super(name, weight, age);
        this.prey = prey;
    }

    /** Хижак полює. */
    public void hunt() {
        System.out.println(name + " is hunting for " + prey + "...");
    }

    /** Хижак ховається в засідці. */
    public void ambush() {
        System.out.println(name + " is hiding in ambush, waiting for " + prey + "...");
    }

    @Override
    public String toString() {
        return super.toString() +
               "\n  Prey   : " + prey;
    }
}
