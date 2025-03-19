package CourseStudies.Exercicies.Methods;

public class Ex001 {
    public static void main(String[] args) {
        String resposta = verificarIdade(18);
        System.out.println(resposta);
    }

    public static String verificarIdade(Integer idade) {
        if (idade < 18) {
            return "Menor de idade";
        } else {
            return "Maior de idade";
        }
    }
}
