public class Main {
    public static void main(String[] args) {

        GriffindorStudent hermione = new GriffindorStudent("Гермиона Грейнджер", 100, 100, 100, 100, 100);
        HufflepuffStudent sedric = new HufflepuffStudent("Седрик Диггори", 80, 20, 70, 100, 100);
        RavenclawStudent chang = new RavenclawStudent("Чжоу Чанг", 60, 40, 50, 40, 20, 30);
        SlytherinStudent draco = new SlytherinStudent("Драко Малфой", 70, 70, 100, 20, 80, 80, 90);

        System.out.println(hermione);
        System.out.println(sedric);
        System.out.println(chang);
        System.out.println(draco);

    }
}