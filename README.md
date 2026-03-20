# 📝 Notes Manager (Dynamic Array Implementation)

A console-based Notes Manager built to practice Data Structures and Algorithms (DSA) concepts.

This project focuses on implementing a dynamic array from scratch, mimicking how ArrayList works internally — without using Java’s Collections Framework.

---

## 🚀 Features

- Add a note  
- View all notes  
- Delete a note  
- Search notes  

---

## ⏱️ Time Complexity Analysis

| Operation          | Time Complexity | Explanation                                      |
|--------------------|----------------|--------------------------------------------------|
| Add Note           | O(1) (average) | Direct insertion at next available index         |
| Add Note (Resize)  | O(n)           | Requires copying all existing elements           |
| View Notes         | O(n)           | Iterates through all stored notes                |
| Delete Note        | O(n)           | Elements shift left after deletion               |
| Search Note        | O(n)           | Linear scan through notes                        |

---

## 🧠 DSA Concepts Practiced

- Dynamic array resizing  
- Manual memory expansion  
- Linear search  
- Element shifting after deletion  
- Unique ID generation  
- Separation of application layers  

---

## 🚫 Restrictions

To strengthen understanding of core data structures, the following are NOT used:

- ArrayList  
- LinkedList  
- Java Collections Framework  

Only arrays and loops are used to manage storage.

---

## 📸 Demo

![Notes Manager Demo](https://github.com/user-attachments/assets/807f2d0a-53dc-46b3-9d2c-438449c94fe2)
