package domain;

/**
 * Клас зграйної тварини — розширює {@link Predator}.
 * Зграйна тварина полює та живе разом з іншими особинами.
 */
public class PackAnimal extends Predator {

    /** Назва зграї / прайду. */
    protected String packName;

    /** Розмір зграї (кількість особин). */
    protected int packSize;

    /**
     * Конструктор за замовчуванням.
     */
    public PackAnimal() {
        super();
        packName = "unnamed pack";
        packSize = 5;
    }

    /**
     * Конструктор з параметрами.
     *
     * @param name     ім'я тварини
     * @param weight   вага у кг
     * @param age      вік у роках
     * @param prey     улюблена здобич
     * @param packName назва зграї
     * @param packSize розмір зграї
     */
    public PackAnimal(String name, int weight, int age,
                      String prey, String packName, int packSize) {
        super(name, weight, age, prey);
        this.packName = packName;
        this.packSize = packSize;
    }

    /** Тварина полює разом зі зграєю. */
    public void huntWithPack() {
        System.out.println(name + " and the pack \"" + packName +
                           "\" (" + packSize + " members) are hunting together!");
    }

    /** Тварина захищає свою територію. */
    public void markTerritory() {
        System.out.println(name + " is marking the territory of pack \"" + packName + "\"...");
    }

    @Override
    public String toString() {
        return super.toString() +
               "\n  Pack   : " + packName +
               " (" + packSize + " members)";
    }
}
