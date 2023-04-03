## About the app

This program is a basic customer management system that allows users to add, edit, and delete customer information. The program is written in Java and consists of three classes: Customer, Management, and main App.

The Customer class defines the attributes of a customer, including their name, VAT identification number, creation date, and address. It also includes getters and setters for these attributes, and a toString method for displaying a customer's information.

The Management class provides methods for adding, editing, deleting, and listing customers.

The App class is the main class of the program and includes the main method. It allows the user to enter commands to add, edit, delete, or list customers. The program uses a Scanner object to read user input from the command line.

When the user chooses to add a customer, the program prompts them to enter the customer's name, VAT identification number, creation date, and address. The program then creates a new Customer object with this information and adds it to the list of customers.
Naext, user can edit a customer, the program prompts them to enter the index of the customer they want to edit. Then the user can choose which attribute of the customer they want to edit: name, VAT identification number, address, or all of the above. The program then prompts the user to enter the new value for the chosen attribute(s) and updates the customer's information accordingly.

After choosing to delete a customer, the program prompts them to enter the index of the customer they want to delete. The program then removes the customer from the list of customers.

And finally, when the user chooses to list customers, the program displays the list of customers with their name, VAT identification number, creation date, and address.

In addition, the program includes validation for the length of the customer's name, ensuring that it is at least 3 characters long and validation for the length of VAT number, ensuring that it is 11 characters long. 