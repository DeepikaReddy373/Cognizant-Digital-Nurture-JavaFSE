-- Exercise 1: Control Structures

CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(100),
    DOB DATE,
    Balance DOUBLE
);

CREATE TABLE Loans (
    LoanID INT PRIMARY KEY,
    CustomerID INT,
    InterestRate DOUBLE
);

INSERT INTO Customers
(CustomerID, Name, DOB, Balance)
VALUES
(1,'John Doe','1950-05-15',12000),
(2,'Jane Smith','1990-07-20',5000);

INSERT INTO Loans
VALUES
(1,1,8),
(2,2,10);

UPDATE Loans
SET InterestRate = InterestRate - 1
WHERE CustomerID = 1;

SELECT * FROM Loans;