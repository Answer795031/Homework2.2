public class GriffindorStudent extends HogwartsStudent{

    private int nobility, honor, bravery;

    @Override
    public String toString() {
        return "\nИмя: " + getName()
                + "\nУровень колдовства: " + getMagic()
                + "\nУровень трансгрессии: " + getTransgression()
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

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
