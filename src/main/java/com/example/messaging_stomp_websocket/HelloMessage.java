package com.example.messaging_stomp_websocket;

public class HelloMessage {

  private String name;
  private String age;

  public HelloMessage() {
  }

  public HelloMessage(String name, String age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }
}