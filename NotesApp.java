import java.util.Scanner;

public class NotesApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Notes App!");
        NotesService notesService = new NotesService();
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("------------------------------Menu------------------------------");
            System.out.println("1. Add a note");
            System.out.println("2. Delete a note by ID");
            System.out.println("3. View all notes");
            System.out.println("4. Search notes by keyword");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice;
            try {
             choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.nextLine(); // Consume the invalid input
                continue;
            }
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter note text: ");
                    String noteText = scanner.nextLine();
                    notesService.addNote(noteText);
                    break;
                case 2:
                    System.out.print("Enter note ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    notesService.deleteNoteById(idToDelete);
                    break;
                case 3:
                    Note[] allNotes = notesService.getAllNotes();
                    System.out.println("All Notes:");
                    for (Note note : allNotes) {
                        if (note != null) {
                            System.out.println("- " + note.getNoteText());
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    Note[] searchResults = notesService.searchNotesByKeyword(keyword);
                    System.out.println("Search Results:");
                    for (Note note : searchResults) {
                        if (note != null) {
                            System.out.println("- " + note.getNoteText());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
