package CursoUdemy.Composicao002;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Post {
    private LocalDate moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Coments> listComents = new ArrayList<>();

    public List<Coments> getListComents() {
        return listComents;
    }

    public Post(LocalDate moment, String title, String content) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = 0;
    }
    public void addComent(Coments coments) {
        this.listComents.add(coments);
    }

    public void removeComent(Coments coments) {
        this.listComents.remove(coments);
    }


    public void addLikes() {
        this.likes += 1;
    }

    public void removeLikes() {
        this.likes -= 1;
    }


    public LocalDate getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(content + "\n");
        sb.append(likes + "\n");
        sb.append(moment + "\n");
        for (Coments c : listComents) {
            System.out.println(c);
        }
        return sb.toString();
    }
}

