public class RavenclawStudent extends  HogwartsStudent{

    private int mind, wisdom, wit, creativity;

    @Override
    public String toString() {
        return "\nИмя: " + getName()
                + "\nФакультет: Когтевран"
                + "\nКолдовство: " + getMagic()
                + "\nТрансгрессия: " + getTransgression()
                + "\nУм: " + this.mind
                + "\nМудрость: " + this.wisdom
                + "\nОстроумие: " + this.wit
                + "\nТворчество: " + this.creativity;
    }

    public RavenclawStudent(String name, int magic, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void ravenclawStudentsCompare(RavenclawStudent ravenclawStudent) {
        // метод сравнения студентов внутри факультета

        System.out.println();

        int sum1 = this.getMagic()
                + this.getTransgression()
                + this.getMind()
                + this.getWisdom()
                + this.getWit()
                + this.getCreativity();

        int sum2 = ravenclawStudent.getMagic()
                + ravenclawStudent.getTransgression()
                + ravenclawStudent.getMind()
                + ravenclawStudent.getWisdom()
                + ravenclawStudent.getWit()
                + ravenclawStudent.getCreativity();

        System.out.println("Сумма баллов студента " + this.getName() + " - " + sum1);
        System.out.println("Сумма баллов студента " + ravenclawStudent.getName() + " - " + sum2);

        String res = sum1 > sum2 ? this.getName() + " - лучший когтевранец" : ravenclawStudent.getName() + " - лучший когтевранец";

        System.out.println(res);
    }
}
