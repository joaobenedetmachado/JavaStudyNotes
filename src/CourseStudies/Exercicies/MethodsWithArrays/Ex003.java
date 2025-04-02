package CourseStudies.Exercicies.MethodsWithArrays;

public class Ex003 {
    public static void main(String[] args) {
        int[] numero = {1, 2, 4, 5, 6, 213, 42, 99};

        int numeroMaior = 0;
        for (int i = 0; i < numero.length; i++) {
            numeroMaior = 0;

            if (numero[i] > numeroMaior) {
                numeroMaior = numero[i];
            }
        }
        System.out.println(numeroMaior);
    }
}
