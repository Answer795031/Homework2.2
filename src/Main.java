import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        GriffindorStudent[] griffindorStudents = {
                new GriffindorStudent("Гарри Поттер", 70, 85, 90, 100, 100),
                new GriffindorStudent("Гермиона Грейнджер", 100, 100, 100, 100, 100),
                new GriffindorStudent("Рон Уизли", 60, 60, 85, 100, 60)
        };

        HufflepuffStudent[] hufflepuffStudents = {
                new HufflepuffStudent("Захария Смит", 50, 45, 50, 20, 40),
                new HufflepuffStudent("Седрик Диггори", 80, 30, 70, 100, 100),
                new HufflepuffStudent("Джастин Финч-Флетчли", 50, 30, 70, 80, 70)
        };

        RavenclawStudent[] ravenclawStudents = {
                new RavenclawStudent("Чжоу Чанг", 60, 40, 50, 40, 20, 30),
                new RavenclawStudent("Падма Патил", 50, 50, 45, 50, 35, 40),
                new RavenclawStudent("Маркус Белби", 65, 45, 55, 55, 40, 45)
        };

        SlytherinStudent[] slytherinStudents = {
                new SlytherinStudent("Драко Малфой", 70, 70, 100, 40, 80, 80, 90),
                new SlytherinStudent("Грэхэм Монтегю", 50, 50, 80, 20, 50, 40, 50),
                new SlytherinStudent("Грегори Гойл", 45, 50, 50, 20, 30, 35, 60)
        };

        printHogwartsStudent(griffindorStudents, "Гарри");
//        printHogwartsStudent(hufflepuffStudents, "Седрик");
//        printHogwartsStudent(ravenclawStudents, "Чжоу");
//        printHogwartsStudent(slytherinStudents, "Драко");

        griffindorStudentsComparison(griffindorStudents, "Гарри", "Рон");
        hufflepuffStudentsComparison(hufflepuffStudents, "Седрик", "Захария");
        ravenclawStudentsComparison(ravenclawStudents, "Чжоу", "Падма");
        slytherinStudentsComparison(slytherinStudents, "Драко", "Гойл");

    }


    public static void printHogwartsStudent(HogwartsStudent[] hogwartsStudents, String name) {

        for (HogwartsStudent i : hogwartsStudents) {

            String checkName = i.getName();

            if (checkName.contains(name)) {
                System.out.println(i);
            }
        }
    }

    public static void griffindorStudentsComparison(GriffindorStudent[] griffindorStudents, String name1, String name2) {

        int sum1 = 0;
        int sum2 = 0;

        System.out.println();

        if (name1.contains("Гермиона") || name2.contains("Гермиона")){
            System.out.println("\nГермиона априори лучший гриффиндорец, смысл сравнивать!");
            return;
        }

        for (GriffindorStudent i : griffindorStudents) {

            String checkName = i.getName();

            if(checkName.contains(name1)){
                sum1 = i.getMagic() + i.getTransgression() + i.getNobility() + i.getBravery() + i.getHonor();
                System.out.println(name1 + ": сумма баллов - " + sum1);
            }

            if(checkName.contains(name2)){
                sum2 = i.getMagic() + i.getTransgression() + i.getNobility() + i.getBravery() + i.getHonor();
                System.out.println(name2 + ": сумма баллов - " + sum2);
            }
        }

        System.out.println(sum1 > sum2 ? name1 + " - лучший гриффиндорец" : name2 + " - лучший гриффиндорец");
    }

    public static void hufflepuffStudentsComparison(HufflepuffStudent[] hufflepuffStudents, String name1, String name2) {

        int sum1 = 0;
        int sum2 = 0;

        System.out.println();

        for (HufflepuffStudent i : hufflepuffStudents) {

            String checkName = i.getName();

            if(checkName.contains(name1)){
                sum1 = i.getMagic() + i.getTransgression() + i.getDiligence() + i.getLoyal() + i.getHonest();
                System.out.println(name1 + ": сумма баллов - " + sum1);
            }

            if(checkName.contains(name2)){
                sum2 = i.getMagic() + i.getTransgression() + i.getDiligence() + i.getLoyal() + i.getHonest();
                System.out.println(name2 + ": сумма баллов - " + sum2);
            }
        }

        System.out.println(sum1 > sum2 ? name1 + " - лучший пуффендуец" : name2 + " - лучший пуффендуец");
    }

    public static void ravenclawStudentsComparison(RavenclawStudent[] ravenclawStudents, String name1, String name2) {

        int sum1 = 0;
        int sum2 = 0;

        System.out.println();

        for (RavenclawStudent i : ravenclawStudents) {

            String checkName = i.getName();

            if(checkName.contains(name1)){
                sum1 = i.getMagic() + i.getTransgression() + i.getMind() + i.getWisdom() + i.getWit() + i.getCreativity();
                System.out.println(name1 + ": сумма баллов - " + sum1);
            }

            if(checkName.contains(name2)){
                sum2 = i.getMagic() + i.getTransgression() + i.getMind() + i.getWisdom() + i.getWit() + i.getCreativity();
                System.out.println(name2 + ": сумма баллов - " + sum2);
            }
        }

        System.out.println(sum1 > sum2 ? name1 + " - лучший когтевранец" : name2 + " - лучший когтевранец");
    }

    public static void slytherinStudentsComparison(SlytherinStudent[] slytherinStudents, String name1, String name2) {

        int sum1 = 0;
        int sum2 = 0;

        System.out.println();

        for (SlytherinStudent i : slytherinStudents) {

            String checkName = i.getName();

            if(checkName.contains(name1)){
                sum1 = i.getMagic() + i.getTransgression() + i.getCunning() + i.getDetermination() + i.getAmbition() + i.getResourcefulness() + i.getPerfidy();
                System.out.println(name1 + ": сумма баллов - " + sum1);
            }

            if(checkName.contains(name2)){
                sum2 = i.getMagic() + i.getTransgression() + i.getCunning() + i.getDetermination() + i.getAmbition() + i.getResourcefulness() + i.getPerfidy();
                System.out.println(name2 + ": сумма баллов - " + sum2);
            }
        }

        System.out.println(sum1 > sum2 ? name1 + " - лучший слизеринец" : name2 + " - лучший слизеринец");
    }

//    public static void hogwartsStudentsComparison(String name1, String name2) {
//
//        int sum1 = 0;
//        int sum2 = 0;
//
//        System.out.println();
//
//        for (HogwartsStudent i;;) {
//
//            String checkName = HogwartsStudent.getName();
//
//            if(checkName.contains(name1)){
//                sum1 = i.getMagic() + i.getTransgression();
//                System.out.println(name1 + ": сумма баллов - " + sum1);
//            }
//
//            if(checkName.contains(name2)){
//                sum2 = i.getMagic() + i.getTransgression();
//                System.out.println(name2 + ": сумма баллов - " + sum2);
//            }
//        }
//
//        System.out.println(sum1 > sum2 ? name1 + " - лучший студент" : name2 + " - лучший сьудент");
//    }

}