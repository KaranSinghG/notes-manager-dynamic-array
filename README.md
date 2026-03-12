# notes-manager-dynamic-array
This project is a console-based Notes Manager built to practice Data Structures and Algorithms (DSA) concepts.  
The system allows users to store and manage notes while implementing a dynamic array manually, similar to how ArrayList works internally.  
The goal of the project is to understand how dynamic storage works without using Java Collections Framework.
## Features
Add a note  
View all notes  
Delete a note  
Search notes
## Time Complexity Analysis
| Operation | Time Complexity | Explanation |
| Add Note | O(1) average |	Direct insertion at next available index |
| Add Note (Resize) | O(n) | Requires copying all existing elements |
| View Notes | O(n) | Iterates through all stored notes |
| Delete Note | O(n) | Elements must shift left after deletion |
| Search Note | O(n) | Linear scan through notes |
## DSA Concepts Practiced
Dynamic array resizing  
Manual memory expansion  
Linear search  
Element shifting after deletion  
ID generation  
Separation of application layers  
## Restrictions
To strengthen understanding of core data structures, the following are not used:  
ArrayList  
LinkedList  
Java Collections Framework  
Only arrays and loops are used to manage storage.
## Demo
TBD
