public class SlytherinStudent extends HogwartsStudent{

    private int cunning, determination, ambition, resourcefulness, perfidy;

    @Override
    public String toString() {
        return "\nИмя: " + getName()
                + "\nФакультет: Слизерин"
                + "\nКолдовство: " + getMagic()
                + "\nТрансгрессия: " + getTransgression()
                + "\nХитрость: " + this.cunning
                + "\nРешительность: " + this.determination
                + "\nАмбициозность: " + this.ambition
                + "\nНаходчивость: " + this.resourcefulness
                + "\nЖажда власти: " + this.perfidy;
    }

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int perfidy) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.perfidy = perfidy;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPerfidy() {
        return perfidy;
    }

    public void slytherinStudentsCompare(SlytherinStudent slytherinStudent) {
        // метод сравнения студентов внутри факультета

        System.out.println();

        int sum1 = this.getMagic()
                + this.getTransgression()
                + this.getCunning()
                + this.getDetermination()
                + this.getAmbition()
                + this.getResourcefulness()
                + this.getPerfidy();

        int sum2 = slytherinStudent.getMagic()
                + slytherinStudent.getTransgression()
                + slytherinStudent.getCunning()
                + slytherinStudent.getDetermination()
                + slytherinStudent.getAmbition()
                + slytherinStudent.getResourcefulness()
                + slytherinStudent.getPerfidy();

        System.out.println("Сумма баллов студента " + this.getName() + " - " + sum1);
        System.out.println("Сумма баллов студента " + slytherinStudent.getName() + " - " + sum2);

        String res = sum1 > sum2 ? this.getName() + " - лучший слизеринец" : slytherinStudent.getName() + " - лучший слизеринец";

        System.out.println(res);
    }
}
