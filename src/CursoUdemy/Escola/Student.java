package CursoUdemy.Escola;

public class Student {
    private String name;
    public double grade1 = 0;
    public double grade2 = 0;
    public double grade3 = 0;
    private String FinalState;

    public void setName(String newName) {
        this.name = newName.toLowerCase();
    }

    public String GetFinalState() {
        if (this.grade1 == 0 || this.grade2 == 0 || this.grade3 == 0) {
            return "Some grade is undefined";
        } else if ((this.grade1 + this.grade2 + this.grade3) / 3 >= 7){
            FinalState = "Aprovado";
        } else {
            FinalState = "Reprovado";
        } return FinalState;
    }

    public String toString() {
        return "Name: " + this.name +
                " Final State: " + this.GetFinalState();
    }
}
