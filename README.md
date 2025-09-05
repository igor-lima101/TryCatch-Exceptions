🏦 Bank Account System with Exceptions
📌 Overview

This project evolves a simple Bank Account System by introducing custom exception handling.
Instead of just printing error messages, the system now uses exceptions to manage invalid operations in a cleaner, more robust way.

📂 Structure
🔹 Custom Exceptions

InsufficientFundsException

Thrown when a withdrawal exceeds the account balance.

InvalidAmountException

Thrown for deposits or withdrawals with negative or zero amounts.

public class InsufficientFundsException extends Exception { /* ... */ }
public class InvalidAmountException extends Exception { /* ... */ }

🔹 BankAccount Class

Attributes: accountNumber, holderName, balance.

Methods:

deposit(double amount) → throws InvalidAmountException if the amount is ≤ 0.

withdraw(double amount) → throws InvalidAmountException if ≤ 0, or InsufficientFundsException if balance is insufficient.

🔹 Main Class

Demonstrates the usage of BankAccount.

Uses try/catch blocks to capture exceptions and display proper messages.

Example flow:

Trying to withdraw $500 from an account with $200 → throws InsufficientFundsException.

Trying to deposit -$100 → throws InvalidAmountException.

Valid deposits and withdrawals continue to work normally.

🎯 Concepts Practiced

Custom Exceptions → InsufficientFundsException, InvalidAmountException.

Exception Handling → try/catch blocks to handle runtime errors.

Object-Oriented Programming → encapsulating account data and behavior.
