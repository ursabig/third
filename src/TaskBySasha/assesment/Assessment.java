package TaskBySasha.assesment;

public class Assessment {

    public Aitishnik[] doAssessment(Aitishnik[] aitishniks) {
        for (int i = 0; i < aitishniks.length; i++) {
            if (aitishniks[i].getLevel().equals(Level.JUNIOR) && aitishniks[i].getSalary() < 100) {
                aitishniks[i].setSalary(aitishniks[i].getSalary() + 50);
            }
            if (aitishniks[i].getLevel().equals(Level.MIDDLE) && aitishniks[i].getSalary() < 200) {
                aitishniks[i].setSalary(aitishniks[i].getSalary() + 50);
            }
            if (aitishniks[i].getLevel().equals(Level.SENIOR) && aitishniks[i].getSalary() < 300) {
                aitishniks[i].setSalary(aitishniks[i].getSalary() + 50);
            }
            if (aitishniks[i].getLevel().equals(Level.ANDREI_IVANOVICH)) {
                aitishniks[i].setSalary(aitishniks[i].getSalary() + 1000);
            }
        }
        return aitishniks;
    }
}
