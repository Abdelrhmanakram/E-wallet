package main.project.service;

import main.project.model.Account;
import main.project.model.Ewallet;


import java.util.Scanner;

public class ApplicationServiceImpl implements ApplicationService {

    Ewallet ewallet = new Ewallet();
    AccountServiceImpl accountService = new AccountServiceImpl(ewallet);
    private ValidationService validationService = new ValidationServiceImpl();

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome Sir");

        System.out.println("Please Enter your choose");
        System.out.println();
        System.out.println("a.login     b.signup   c.exit");
        char choose = scanner.next().charAt(0);
        switch (choose) {
            case 'a':
                login(new Account());
                break;
            case 'b':
                signup();
                break;
            case 'c':
                System.out.println("you are welcome.");
                break;
            default:
                System.out.println("Invalid Choose");
        }
    }

    private void signup() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter User name");
        String name = scanner.nextLine();

        System.out.println("Please Enter password");
        String password = scanner.nextLine();


        if (!validationService.validateUserName(name)) {
            System.out.println("Invalid UserName");
            return;
        }

        if (!validationService.validatePassword(password)) {
            System.out.println("Invalid Password");
            return;
        }

        if (accountService.createAccount(new Account(name, password))) {
            System.out.println("Account Created");
        } else {
            System.out.println("Account not Created " );
        }

    }

    private void login(Account account) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter User name");
        String name = scanner.nextLine();

        System.out.println("Please Enter password");
        String password = scanner.nextLine();

        AccountServiceImpl accountService = new AccountServiceImpl(ewallet);
        if (accountService.loginAccount(new Account(name, password))) {
            accountServices(ewallet.findAccount(name));
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }

    }

    private void accountServices(Account account) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Deposit\n2. Withdraw\n3. Show Details\n4. Logout");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    account.deposit(amount);
                    System.out.println("Amount deposited!");
                }
                case 2 -> {
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    if (account.withdraw(amount)) {
                        System.out.println("Amount withdrawn!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                }
                case 3 -> System.out.println(account.getAccountDetails());
                case 4 -> {
                    System.out.println("Logged out.");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }


}
