public class NotesService {
    
    private NotesRepository notesRepository;

    public NotesService() {
        this.notesRepository = new NotesRepository();
    }

    public void addNote(Note note) {
        notesRepository.addNote(note);
    }

    public void deleteNoteById(int id) {
        notesRepository.deleteNoteById(id);
    }
}
