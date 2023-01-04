package exercise3.entities;

public class Student {
    private String nome;
    private double note1;
    private double note2;
    private double note3;

    public void finalNote() {
        double average = note1 + note2 + note3;
        if (average > 60) {
            System.out.printf("FINAL GRADE: %.2f", average);
            System.out.println();
            System.out.println("PASS");
        } else {
            System.out.printf("FINAL GRADE: %.2f", average);
            System.out.println();
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", (60 - average));
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public double getNote3() {
        return note3;
    }

    public void setNote3(double note3) {
        this.note3 = note3;
    }


}
