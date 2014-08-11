package com.karlsangabriel.ws.soap.handler;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HospitalWS {
	
	@WebMethod
	public PatientBean getPatient(int i) {
		PatientBean b = new PatientBean();
		b.setFirstName("karl");
		b.setLastName("San Gabriel");
		b.setMiddleName("Rosco");
		return b;
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/HWS", new HospitalWS());
	}

}
