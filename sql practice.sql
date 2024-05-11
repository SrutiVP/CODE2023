-- Create the library database
CREATE DATABASE IF NOT EXISTS library;

-- Switch to the library database
USE librarydb;

-- Create table for storing information about students
CREATE TABLE IF NOT EXISTS Students (
    StudentID INT PRIMARY KEY ,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100),
    PhoneNumber VARCHAR(15)
);

-- Create table for storing information about books
CREATE TABLE IF NOT EXISTS Books (
    BookID INT PRIMARY KEY ,
    Title VARCHAR(255),
    Author VARCHAR(255),
    PublicationYear INT,
    ISBN VARCHAR(20),
    QuantityAvailable INT
);

-- Create table for storing information about book loans
CREATE TABLE IF NOT EXISTS BookLoans (
    LoanID INT PRIMARY KEY ,
    BookID INT,
    StudentID INT,
    LoanDate DATE,
    ReturnDate DATE,
    FOREIGN KEY (BookID) REFERENCES Books(BookID),
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID)
);

-- Insert some sample data into Students table
INSERT INTO Students (FirstName, LastName, Email, PhoneNumber)
VALUES
    ('John', 'Doe', 'john.doe@example.com', '123-456-7890'),
    ('Jane', 'Smith', 'jane.smith@example.com', '456-789-0123');

-- Insert some sample data into Books table
INSERT INTO Books (Title, Author, PublicationYear, ISBN, QuantityAvailable)
VALUES
    ('To Kill a Mockingbird', 'Harper Lee', 1960, '978-0061120084', 5),
    ('1984', 'George Orwell', 1949, '978-0451524935', 3);

-- Insert some sample data into BookLoans table
INSERT INTO BookLoans (BookID, StudentID, LoanDate, ReturnDate)
VALUES
    (1, 1, '2024-05-01', '2024-05-15'),
    (2, 2, '2024-05-03', NULL);
	
	
selet *from Students;

selet *from Books;

selet *from BookLoans;
