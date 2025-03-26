# DigitalLibrary

### Compile and Run

1. Compile the Java files:

javac Book.java Library.java Main.java

2. Run the program:

java Main

### Challenges I faced during the project creation:-

Handling User Input – Managing user entries properly can be tricky. For example, entering letters instead of numbers might cause errors, and extra care is needed to handle such cases.

Data Loss on Program Exit – Since books are stored temporarily in memory, all records disappear when the program closes. Using a file or database could help retain the data.

Error Handling – If a user tries to modify or delete a book that doesn't exist, the program might not provide clear feedback. Proper error messages can improve the experience.

Updating Book Details – When editing a book's information, users must enter all details again. Skipping a field might cause inconsistencies if not handled well.

Search Efficiency – The current search method checks each book one by one. This approach works for small collections but may slow down with large datasets.

User Experience – Running the system in a text-based interface limits usability. A graphical version or a web-based system could make it more intuitive.


