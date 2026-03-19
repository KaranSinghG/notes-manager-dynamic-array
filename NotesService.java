import java.util.Arrays;

public class NotesService {
    
    private NotesRepository notesRepository;
    private int nextId = 1;

    public NotesService() {
        this.notesRepository = new NotesRepository();
    }

    public void addNote(String noteText) {
        if(noteText == null || noteText.trim().isEmpty()) {
            System.out.println("Note text cannot be empty");
            return;
        }
        Note note = new Note(nextId++, noteText);
        notesRepository.addNote(note);
    }

    public void deleteNoteById(int id) {
        notesRepository.deleteNoteById(id);
    }

    public Note[] getAllNotes() {
        return notesRepository.getAllNotes();
    }

    public Note getNoteById(int id) {
        return notesRepository.getNoteById(id);
    }

    public Note[] searchNotesByKeyword(String keyword) {
        if(keyword == null || keyword.trim().isEmpty()) {
            System.out.println("Keyword cannot be empty");
            return new Note[0];
        }
        Note[] allNotes = notesRepository.getAllNotes();
        Note[] searchResults = new Note[allNotes.length];
        int resultIndex = 0;
        for(Note note : allNotes) {
            if(note == null) continue;
            if(note.getNoteText().toLowerCase().contains(keyword.toLowerCase())) {
                searchResults[resultIndex++] = note;
            }
        }
        return Arrays.copyOf(searchResults, resultIndex);
    }

}
