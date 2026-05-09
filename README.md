Java Simple Inventory System

A simple Java console application created to practice Object-Oriented Programming, CRUD logic, filtering, stock management, and inventory summary calculations.

This project manages a list of products, allows stock updates, filters products by category, deletes products, and calculates the total inventory value.

Features
Create product objects
Add products to inventory
Print all products
Filter products by category
Search product by name
Update product stock
Delete product from inventory
Handle missing products
Calculate total stock quantity
Calculate total inventory value
Technologies Used
Java
IntelliJ IDEA
GitHub
Concepts Practiced
Classes and objects
Constructors
Private fields
Getter methods
Methods
ArrayList
For-each loop
If / else statements
Validation
CRUD logic
Search and filtering
Basic business logic
Summary calculation
Project Structure

java-simple-inventory-system
src

Main.java
Product.java
Inventory.java
How It Works

The project has three main files.

Product.java

This class represents a product.

Each product has:

product name
category
price
stock quantity

The class includes methods to:

return product information
update stock quantity
calculate total product value
print product details
Inventory.java

This class manages the list of products.

It includes methods to:

add products
print all products
filter products by category
find products by name
update product stock
delete products
print inventory summary
Main.java

This file runs the program.

It creates product objects, adds them to the inventory, updates stock, deletes products, filters products, and prints the final inventory summary.

Example Output
JAVA SIMPLE INVENTORY SYSTEM

Product added: Laptop
Product added: Mouse
Product added: Office Chair
Product added: Desk

Stock updated for Laptop.
Product not found: Keyboard
Product deleted: Desk
Delete failed. Product not found: Monitor

INVENTORY SUMMARY
Total Products: 3
Total Stock Quantity: 35
Total Inventory Value: 8509.65 EUR

What I Learned

Through this project, I practiced CRUD logic in Java. I learned how to add, read, update, delete, search, and filter objects stored in an ArrayList.

This project helped me understand the basic logic behind inventory management systems and prepared me for larger backend projects.
