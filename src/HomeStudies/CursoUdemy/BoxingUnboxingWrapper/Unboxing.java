package CursoUdemy.BoxingUnboxingWrapper;

public class Unboxing {
    public static void main(String[] args) {

        int x = 1;

        Object obj = x;
        System.out.println(obj);

        int y = (int) obj;
        System.out.println(y);

        /*os tipos primitivos sempre que nao definidos sao igual a 0*/
        /* ja nas wrapper classes (Integer, Double, String), serao NULL por padrao, ate que sejam definidas*/


        Integer x1 = 1;

        Object obj1 = x1;
        System.out.println(obj1);

        Integer y1 = (int) obj1;
        System.out.println(y1);
    }
}
