package CourseStudies.Exercicies.Methods;

public class Ex002 {
    public static void main(String[] args) {
        String resposta = verificarIdadeECategoria(18);
        System.out.println(resposta);
    }

    public static String verificarIdadeECategoria(Integer idade) {
        if (idade > 0 && idade <= 10) {
            return "Infantil";
        } else if (idade >= 11 && idade <= 17){
            return "Juvenil";
        } else if (idade >= 18) {
            return "Maior de Idade";
        }
        return "erro, ";
    }
}
