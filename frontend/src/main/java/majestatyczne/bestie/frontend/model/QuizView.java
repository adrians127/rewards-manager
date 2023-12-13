package majestatyczne.bestie.frontend.model;

import javafx.beans.property.*;

import javax.xml.transform.Result;
import java.util.Date;
import java.util.List;

public class QuizView {
    private StringProperty name;
    private IntegerProperty maxScore;
    private ObjectProperty<Date> date;
    private List<Result> results;

    public QuizView(String name, int maxScore, Date date) {
        this.name = new SimpleStringProperty(name);
        this.maxScore = new SimpleIntegerProperty(maxScore);
        this.date = new SimpleObjectProperty<>(date);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty getNameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getMaxScore() {
        return maxScore.get();
    }

    public IntegerProperty getMaxScoreProperty() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore.set(maxScore);
    }

    public Date getDate() {
        return date.get();
    }

    public ObjectProperty<Date> getDateProperty() {
        return date;
    }

    public void setDate(Date date) {
        this.date.set(date);
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
