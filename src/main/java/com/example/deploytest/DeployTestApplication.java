package com.example.deploytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeployTestApplication {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("서버 기동 중");
    Thread.sleep(10000);
    SpringApplication.run(DeployTestApplication.class , args);
  }

}
