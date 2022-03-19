package com.reqres.qa.get;

import io.restassured.RestAssured;

public class GetUsers {
	public static void main(String[] args) {
		RestAssured.given().baseUri("https://reqres.in")
	}

}
