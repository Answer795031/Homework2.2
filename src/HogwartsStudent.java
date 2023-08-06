public class HogwartsStudent {

    private String name;
    private int magic, transgression;

    public HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void hogwartsStudentsCompareByMagic(HogwartsStudent hogwartsStudent) {
        // метод сравнения студентов Хогвартса по основным полям

        System.out.println();

        int magic1 = this.getMagic();
        int magic2 = hogwartsStudent.getMagic();

        int transgression1 = this.getTransgression();
        int transgression2 = hogwartsStudent.getTransgression();

        System.out.println("Мощность колдовства студента " + this.getName() + " - " + magic1);
        System.out.println("Мощность колдовства студента " + hogwartsStudent.getName() + " - " + magic2);

        if (magic1 > magic2){
            System.out.println(this.getName() + " обладает большей мощностью колдовства");
        } else if (magic1 < magic2){
            System.out.println(hogwartsStudent.getName() + " обладает большей мощностью колдовства");
        } else {
            System.out.println("По мощности колдовства студенты равны");
        }


        System.out.println("\nДальность трансгрессии студента " + this.getName() + " - " + transgression1);
        System.out.println("Дальность трансгрессии студента " + hogwartsStudent.getName() + " - " + transgression2);

        if (transgression1 > transgression2){
            System.out.println(this.getName() + " обладает большей дальностью трансгрессии");
        } else if (transgression1 < transgression2){
            System.out.println(hogwartsStudent.getName() + " обладает большей дальностью трансгрессии");
        } else {
            System.out.println("По дальности трансгрессии студенты равны");
        }
    }
}
