package main.project.service;

import main.project.model.Account;
import main.project.model.Ewallet;


public class AccountServiceImpl implements AccountService {

    private  Ewallet ewallet;

    public AccountServiceImpl(Ewallet ewallet) {
        this.ewallet = ewallet;
    }


    @Override
    public boolean createAccount(Account account) {
        for (Account acc : ewallet.getAccounts()) {
            if (acc.getUserName().equals(account.getUserName())) {
                System.out.println("Account already exists with username: " + account.getUserName());
                return false;
            }
        }
        ewallet.addAccount(account);
        return true;
    }



    @Override
    public boolean loginAccount(Account account) {
        System.out.println("Attempting login for: " + account.getUserName() + ", " + account.getPassword());
        for (Account acc : ewallet.getAccounts()) {
            System.out.println("Checking against: " + acc.getUserName() + ", " + acc.getPassword());
            if (acc.getUserName().equals(account.getUserName()) &&
                    acc.getPassword().equals(account.getPassword())) {
                return true;
            }
        }
        return false;
    }


}
