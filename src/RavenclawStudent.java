public class RavenclawStudent extends  HogwartsStudent{

    private int mind, wisdom, wit, creativity;

    @Override
    public String toString() {
        return "\nИмя: " + getName()
                + "\nУровень колдовства: " + getMagic()
                + "\nУровень трансгрессии: " + getTransgression()
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

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
