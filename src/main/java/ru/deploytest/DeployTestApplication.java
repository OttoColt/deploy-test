package ru.deploytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeployTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeployTestApplication.class, args);
        int counter = 0;
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("###########- " + ++counter + " -###########");
        }
    }
}
