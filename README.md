# E-Wallet Application  

This project is a simple **E-Wallet** application developed in **Java** using **Object-Oriented Programming (OOP)** principles. The application allows users to manage their e-wallet accounts, including signing up, logging in, depositing, withdrawing funds, and checking account details with balance.  

## Features  

- **User Registration**: Create a new e-wallet account with basic details.  
- **User Login**: Secure login functionality for users.  
- **Deposit Funds**: Add money to the e-wallet balance.  
- **Withdraw Funds**: Withdraw money from the e-wallet (ensures sufficient balance).  
- **View Account Details**: Display user details and current wallet balance.  

## Project Structure  

The application is structured using core OOP concepts, including encapsulation, inheritance, and polymorphism.  

### Classes  

1. **User**  
   - Attributes:  
     - `String username`  `bigger than 8 char`
     - `String password`  `contain upper letter , small letter and numbers`    
   - Methods:  
     - `register()`  
     - `login()`
     - `logout()`
     - `deposit(double amount)`  
     - `withdraw(double amount)`  
     - `viewDetails()`  

2. **EWalletSystem**  
   - Manages the overall workflow of the application.  
   - Handles user input and interactions.  

## How to Run  

1. Clone the repository:  
   ```bash  
   git clone https://github.com/Abdelrhmanakram/E-wallet.git  
