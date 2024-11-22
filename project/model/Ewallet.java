package main.project.model;

import java.util.ArrayList;
import java.util.List;

public class Ewallet {


    private String name = "EraaSoft Cash";

    private List<Account> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }


    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getUserName() + ", " + account.getPassword());
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account findAccount(String userName) {
        for (Account account : accounts) {
            if (account.getUserName().equals(userName)) {
                return account;
            }
        }
        return null;
    }

}
