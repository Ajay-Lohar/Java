package introduction;

import java.util.List;

public class BulkWhatsAppSender {

	public static List<String> readFile(String fileName){
		System.out.println("File read successfully");
		return null;
	}

	public static List<String> validateContacts(List<String> contacts){
		System.out.println("Contacts validated successfully");
		return null;
	}

	public static void sendWa(List<String> contacts){
		System.out.println("WhatsApp message sent");
	}

	public static void main(String[] args){
		sendWa ( validateContacts ( readFile("fileName") ) );
	}

}