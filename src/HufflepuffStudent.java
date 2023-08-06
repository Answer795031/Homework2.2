public class HufflepuffStudent extends HogwartsStudent{

    private int diligence, loyal, honest;

    @Override
    public String toString() {
        return "\nИмя: " + getName()
                + "\nФакультет: Пуффендуй"
                + "\nКолдовство: " + getMagic()
                + "\nТрансгрессия: " + getTransgression()
                + "\nУсердие: " + this.diligence
                + "\nПреданность: " + this.loyal
                + "\nЧестность " + this.honest;
    }

    public HufflepuffStudent(String name, int magic, int transgression, int diligence, int loyal, int honest) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void hufflepuffStudentsCompare(HufflepuffStudent hufflepuffStudent) {
        // метод сравнения студентов внутри факультета

        System.out.println();

        int sum1 = this.getMagic()
                + this.getTransgression()
                + this.getDiligence()
                + this.getLoyal()
                + this.getHonest();

        int sum2 = hufflepuffStudent.getMagic()
                + hufflepuffStudent.getTransgression()
                + hufflepuffStudent.getDiligence()
                + hufflepuffStudent.getLoyal()
                + hufflepuffStudent.getHonest();

        System.out.println("Сумма баллов студента " + this.getName() + " - " + sum1);
        System.out.println("Сумма баллов студента " + hufflepuffStudent.getName() + " - " + sum2);

        String res = sum1 > sum2 ? this.getName() + " - лучший пуффендуец" : hufflepuffStudent.getName() + " - лучший пуффендуец";

        System.out.println(res);
    }
}
