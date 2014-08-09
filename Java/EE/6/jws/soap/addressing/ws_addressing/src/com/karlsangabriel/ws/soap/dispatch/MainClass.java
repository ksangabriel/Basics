package com.karlsangabriel.ws.soap.dispatch;

import javax.xml.ws.Endpoint;

public class MainClass {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/SumWS", new SumWS());
	}
}
