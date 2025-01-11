package CursoUdemy.Composicao002;

public class Coments {
    private String coment;

    public Coments(String coment) {
        this.coment = coment;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.coment);

        return sb.toString();
    }
}
