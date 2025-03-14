package CursoUdemy.PolimorfismoHeranca;

public class OutEmployed extends Employed{

    public OutEmployed(String name, Integer hours, double valuePerHours) {
        super(name, hours, valuePerHours);
    }

    @Override
    public double payment() {
        return (getHours() * getValuePerHours())*1.1;
    }
}
