package CourseStudies.Exercicies.Heranca.Ex005;

public class Main {
    public static void main(String[] args) {
        Aero aviao = new Aero("Voa no ceu a 1000 pes de altura", 1.43, 10000, 280);

        Terrestre carro = new Terrestre("Anda na estrada", 3.4, 1000, 4);

        Aquatico sub = new Aquatico("Anda no mar", 5.4, 2400, 2.2);

        System.out.println(sub);
        System.out.println(carro);
        System.out.println(aviao);
    }
}
