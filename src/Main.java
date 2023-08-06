public class Main {

    public static void main(String[] args) {

        // задаем параметры студентов всех факультетов
        GriffindorStudent harry_potter = new GriffindorStudent("Гарри Поттер", 70, 85, 90, 100, 100);
        GriffindorStudent hermione_granger = new GriffindorStudent("Гермиона Грейнджер", 100, 100, 100, 100, 100);
        GriffindorStudent ron_weasley = new GriffindorStudent("Рон Уизли", 60, 60, 85, 100, 60);

        HufflepuffStudent zaharia_smith = new HufflepuffStudent("Захария Смит", 50, 45, 50, 20, 40);
        HufflepuffStudent cedric_diggory = new HufflepuffStudent("Седрик Диггори", 80, 30, 70, 100, 100);
        HufflepuffStudent justin_finch_fletchley = new HufflepuffStudent("Джастин Финч-Флетчли", 50, 30, 70, 80, 70);

        RavenclawStudent cho_chang = new RavenclawStudent("Чжоу Чанг", 60, 40, 50, 40, 20, 30);
        RavenclawStudent padma_patil = new RavenclawStudent("Падма Патил", 50, 50, 45, 50, 35, 40);
        RavenclawStudent marcus_belby = new RavenclawStudent("Маркус Белби", 65, 45, 55, 55, 40, 45);

        SlytherinStudent draco_malfoy = new SlytherinStudent("Драко Малфой", 70, 70, 100, 40, 80, 80, 90);
        SlytherinStudent graham_montague = new SlytherinStudent("Грэхэм Монтегю", 50, 50, 80, 20, 50, 40, 50);
        SlytherinStudent gregory_goyle = new SlytherinStudent("Грегори Гойл", 45, 50, 50, 20, 30, 35, 60);

        // вывод на экран параметров студентов
        System.out.println(harry_potter);
        System.out.println(draco_malfoy);

        // сравнение студентов одного факультета
        harry_potter.griffindorStudentsCompare(hermione_granger);
        zaharia_smith.hufflepuffStudentsCompare(cedric_diggory);
        cho_chang.ravenclawStudentsCompare(marcus_belby);
        draco_malfoy.slytherinStudentsCompare(graham_montague);

        // сравнение студентов вне зависимости от факультета
        harry_potter.hogwartsStudentsCompareByMagic(draco_malfoy);

    }
}