public class NotesRepository {
    private Note[] notes;
    private int size;
    private int capacity = 10;

    public NotesRepository() {
        this.notes = new Note[capacity];
        this.size = 0;
    }

    public void addNote(Note note) {
        if (size == capacity) {
            resize();
        }
        notes[size] = note;
        size++;
    }

    private void resize() {
        capacity = capacity * 2;
        Note[] newNotes = new Note[capacity];
        for (int i = 0; i < size; i++) {
            newNotes[i] = notes[i];
        }
        notes = newNotes;
    }

    public Note[] getAllNotes() {
        Note[] allNotes = new Note[size];
        for (int i = 0; i < size; i++) {
            allNotes[i] = notes[i];
        }
        return allNotes;
    }
}
