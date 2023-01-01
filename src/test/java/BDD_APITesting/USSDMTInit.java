package BDD_APITesting;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class USSDMTInit {

    @Test
    public void ussdMTInit() throws IOException {

        //read json request from json file and store in a byte array
        byte[] req = Files.readAllBytes(Paths.get("src\\test\\java\\BDD_Requests\\USSDMTInit.json"));

        //Convert byte array into string
        String requestJSON = new String(req);
        System.out.println("USSD MTInit Request: "+requestJSON);

        RestAssured.baseURI="http://35.237.228.192:9090/ussd/outbound/tel:+94777777745";

        RequestSpecification httpRequest =RestAssured.given();

        httpRequest.header("Cache-Control","no-cache");
        httpRequest.header("Content-Type","application/json");
        httpRequest.header("Authorization","Bearer eyJ4NXQiOiJZVEJqWVdRMk1tVTVOV0UxTjJJMlpUaGpabVk0WkRBNU0yWTRZMlEwWldNMk1EaGlZemM1TnpOak1UVTVNR0l4WWpWak5XRmlaVGRtWWpsbU5EWTFZdyIsImtpZCI6IllUQmpZV1EyTW1VNU5XRTFOMkkyWlRoalptWTRaREE1TTJZNFkyUTBaV00yTURoaVl6YzVOek5qTVRVNU1HSXhZalZqTldGaVpUZG1ZamxtTkRZMVl3X1JTMjU2IiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJhZG1pbiIsImF1dCI6IkFQUExJQ0FUSU9OIiwiYXVkIjoiNEFvel9tQmZHSlVOR3NjaFNHYTE0WndmdkZFYSIsIm5iZiI6MTY2NDI1MjY3MiwiYXpwIjoiNEFvel9tQmZHSlVOR3NjaFNHYTE0WndmdkZFYSIsInNjb3BlIjoiZGVmYXVsdCIsImlzcyI6Imh0dHBzOlwvXC9heG9uZWN0LW1vbmV0aXNlci1rbTo0NDNcL29hdXRoMlwvdG9rZW4iLCJleHAiOjkyMjMzNzIwMzY4NTQ3NzUsImlhdCI6MTY2NDI1MjY3MiwianRpIjoiODhhZWI4YjgtYjk3Yi00NjhmLThlNGQtZDhlYThmZTY1Nzc3In0.DwHtP1tQRgMBvwxZaAgNREAXB3AEWr9v4k9RGwgbADWPVmWa5WI7K-8aGDp_y_BG_JHvbIl5NFGGNmSE19Pp5zY9OwnaQ3LE8w45dbuc83RJ3MhTLOAcpTZ1E93pmu68ZioXsnSdYnQzApr_augTLrEp1_wpVa4HIbT411vmFZ99Gaywpss5Yt4feH-YGre7Ig7uM6Z4LsFwgZrVQVNy627luxtbCfDjW9HDwasiXKx0QZtCDsk3-esUtRah6eVbrMoBHAf1xDzjuxz5wDxytJxJnjCmM25jBAs0LHlLGS-a1LSmGFbKYoL216xtWXOxbCctbN625v8fvwjsjclBPg");

        httpRequest.body(requestJSON);

        Response response = httpRequest.request(Method.POST);

        String responseBody = response.getBody().asString();
        System.out.println("USSD Response: "+responseBody);

        Assert.assertEquals(response.jsonPath().getString("outboundUSSDMessageRequest.ussdAction"),"mtinit");




    }
}
