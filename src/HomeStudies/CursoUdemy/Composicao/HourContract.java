package CursoUdemy.Composicao;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double perHour;
    private Integer hours;

    public HourContract(Date date, Double perHour, Integer hours) {
        this.date = date;
        this.perHour = perHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPerHour() {
        return perHour;
    }

    public void setPerHour(Double perHour) {
        this.perHour = perHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue() {
        return hours * perHour;
    }
}
