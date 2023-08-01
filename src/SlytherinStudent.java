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

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setPerfidy(int perfidy) {
        this.perfidy = perfidy;
    }
}
