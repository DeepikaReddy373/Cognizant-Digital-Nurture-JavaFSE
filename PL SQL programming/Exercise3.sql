-- Exercise 3: Transfer Funds

CREATE TABLE Accounts(
    id INT PRIMARY KEY,
    balance DOUBLE
);

INSERT INTO Accounts VALUES
(1,1000),
(2,500);

UPDATE Accounts
SET balance = balance - 200
WHERE id = 1;

UPDATE Accounts
SET balance = balance + 200
WHERE id = 2;

SELECT * FROM Accounts;