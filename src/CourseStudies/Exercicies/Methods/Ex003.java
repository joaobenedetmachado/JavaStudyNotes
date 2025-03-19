package CourseStudies.Exercicies.Methods;

public class Ex003 {
    public static void main(String[] args) {
        double peso = 68.4;
        double altura = 170.0;
        double resultado = receberIMC(peso, altura);
        System.out.println(resultado);
    }

    public static double receberIMC(double peso, double altura) {
        return peso/(altura*altura);
    }
}
