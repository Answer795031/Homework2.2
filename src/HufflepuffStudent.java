public class HufflepuffStudent extends HogwartsStudent{

    private int diligence, loyal, honest;

    @Override
    public String toString() {
        return "\nИмя: " + getName()
                + "\nУровень колдовства: " + getMagic()
                + "\nУровень трансгрессии: " + getTransgression()
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

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
