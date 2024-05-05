# Lab_Assign-6-Dependency-Inversion

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

Make sure you have a TestProgram that will validate the proposed refactored codes.

![Blank diagram (1)](https://github.com/TJYumul/Lab_Assign-6-Dependency-Inversion/assets/132363388/69e97eab-5374-4d94-81f8-24462893eac1)
