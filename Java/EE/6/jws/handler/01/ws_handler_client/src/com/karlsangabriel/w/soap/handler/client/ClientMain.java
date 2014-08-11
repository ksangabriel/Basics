package com.karlsangabriel.w.soap.handler.client;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.karlsangabriel.ws.soap.handler.HospitalWS;
import com.karlsangabriel.ws.soap.handler.HospitalWSService;
import com.karlsangabriel.ws.soap.handler.PatientBean;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class ClientMain {

	public static void main(String[] args) {
		HospitalWSService service = new HospitalWSService();
		service.setHandlerResolver(new ClientMainHandlerResolve());
		HospitalWS portType = service.getHospitalWSPort();
		PatientBean b = portType.getPatient(1);
		System.out.println(b.getFirstName());
		System.out.println(b.getLastName());
		System.out.println(b.getMiddleName());
	}
	
	static class ClientMainHandlerResolve implements HandlerResolver {

		@Override
		public List<Handler> getHandlerChain(PortInfo portInfo) {
			List<Handler> h = new ArrayList<Handler>();
			h.add(new CMHandler());
			return h;
		}	
	}
	
	static class CMHandler implements SOAPHandler<SOAPMessageContext> {

		@Override
		public boolean handleMessage(SOAPMessageContext context) {
			try {
				Boolean b = (Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
				SOAPMessage msg = context.getMessage();
				
				
				SOAPBody body = msg.getSOAPBody();
				Node node = body.getFirstChild(); // <ns2:getPatient ...>
				Element element = node.getOwnerDocument().createElement("comment");
				element.setAttribute("locale", "en-US");
				element.setTextContent("This is a comment");
				node.appendChild(element);
				
				
				if(b) {
					System.out.println("Send out to service \n==========");
					ByteArrayOutputStream out = new ByteArrayOutputStream();
					msg.writeTo(out);
					String strMsg = new String(out.toByteArray());
					System.out.println(strMsg);
					
					
				} else {
					System.out.println("Receiving from service \n==========");
					
					ByteArrayOutputStream out = new ByteArrayOutputStream();
					msg.writeTo(out);
					String strMsg = new String(out.toByteArray());
					System.out.println(strMsg);
					
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			return true;
		}

		@Override
		public boolean handleFault(SOAPMessageContext context) {
			return true;
		}

		@Override
		public void close(MessageContext context) {
			// TODO Auto-generated method stub
		}

		@Override
		public Set<QName> getHeaders() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
