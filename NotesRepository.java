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

    public Note getNoteById(int id){
        for (int i = 0; i < size; i++) {
            if (notes[i].getId() == id) {
                return notes[i];
            }
        }
        return null;
    }

    public void deleteNoteById(int id) {
        for (int i = 0; i < size; i++) {
            if (notes[i].getId() == id) {
                for (int j = i; j < size - 1; j++) {
                    notes[j] = notes[j + 1];
                }
                notes[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
