package CursoUdemy.PolimorfismoHeranca;

public class Employed {
    private String name;
    private Integer hours;
    private double ValuePerHours;

    public Employed(String name, Integer hours, double valuePerHours) {
        this.name = name;
        this.hours = hours;
        ValuePerHours = valuePerHours;
    }

    public double payment() {
        return hours * ValuePerHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double getValuePerHours() {
        return ValuePerHours;
    }

    public void setValuePerHours(double valuePerHours) {
        ValuePerHours = valuePerHours;
    }
}
