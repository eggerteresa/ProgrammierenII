package Wild.Event;

import java.util.Objects;

public class Event {
    private EventType type;
    private String title;
    private String ort;
    private double preis;

    @Override
    public String toString() {
        return "Wild.Event{" +
                "type=" + type +
                ", title='" + title + '\'' +
                ", ort='" + ort + '\'' +
                ", preis=" + preis +
                '}';
    }

@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return type == event.type && title.equals(event.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, title);
    }

    public Event(EventType type, String title, String ort, double preis) {
        this.type = type;
        this.title = title;
        this.ort = ort;
        this.preis = preis;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
