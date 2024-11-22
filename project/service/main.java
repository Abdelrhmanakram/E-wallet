package main.project.service;

import main.project.service.ApplicationService;
import main.project.service.ApplicationServiceImpl;
import main.project.model.Ewallet;

public class main {

    public static void main(String[] args) {

        Ewallet ewallet = new Ewallet();
        ApplicationService appService = new ApplicationServiceImpl();
        appService.run();
    }


}
