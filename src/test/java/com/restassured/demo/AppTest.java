package com.restassured.demo;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
  @Before
  public void setUp() {
    RestAssured.port = 4003;
  }

  @Test
  public void get500() {
    get("/statuscodes/500").then().statusCode(500);
  }

  @Test
  public void post500() {
    post("/statuscodes/500").then().statusCode(500);
  }

  @Test
  public void getUser() {
    get("/users/123").then().body("userid", equalTo("123"));
  }
}
