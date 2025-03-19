package CourseStudies.Exercicies.Methods;

public class Ex004 {
    public static void main(String[] args) {
        String resultado = receberResultado(8);

        System.out.printf(resultado);

    }
    public static String receberResultado(double media) {
        if (media < 7) {
            return "reprovado";
        } else {
            return "aprovado";
        }
    }
}
