import java.time.LocalDateTime;

public class Note {
    private int id;
    private String noteText;
    private LocalDateTime createdTime;

    public Note(int id, String noteText) {
        this.id = id;
        this.noteText = noteText;
        this.createdTime = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getNoteText() {
        return noteText;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    @Override
    public String toString() {
        return "|" + id +
                "|" + noteText +
                "|" + createdTime + "|";
    }
}
