public class GriffindorStudent extends HogwartsStudent {

    private int nobility, honor, bravery;

    @Override
    public String toString() {
        return "\nИмя: " + getName()
                + "\nФакультет: Гриффиндор"
                + "\nКолдовство: " + getMagic()
                + "\nТрансгрессия: " + getTransgression()
                + "\nБлагородство: " + this.nobility
                + "\nЧесть: " + this.honor
                + "\nХрабрость " + this.bravery;
    }

    public GriffindorStudent(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void griffindorStudentsCompare(GriffindorStudent griffindorStudent) {
        // метод сравнения студентов внутри факультета

        System.out.println();

        int sum1 = this.getMagic()
                + this.getTransgression()
                + this.getNobility()
                + this.getHonor()
                + this.getBravery();

        int sum2 = griffindorStudent.getMagic()
                + griffindorStudent.getTransgression()
                + griffindorStudent.getNobility()
                + griffindorStudent.getHonor()
                + griffindorStudent.getBravery();

        System.out.println("Сумма баллов студента " + this.getName() + " - " + sum1);
        System.out.println("Сумма баллов студента " + griffindorStudent.getName() + " - " + sum2);

        String res = sum1 > sum2 ? this.getName() + " - лучший гриффиндорец" : griffindorStudent.getName() + " - лучший гриффиндорец";

        System.out.println(res);
    }

}
