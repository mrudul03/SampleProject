package collections.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestCollection {
	
	public static void main(String[] args){
		TestCollection testCollection = new TestCollection();
		testCollection.validateContact();
	}
	
	private void validateContact(){
		int [] n1 = {1, 11, 111};
		Contact contact1 = this.createContact("11", "11N", n1);
		
		int [] n2 = {2, 21, 211};
		Contact contact2 = this.createContact("22", "22N", n2);
		
		int [] n3 = {3, 31, 211};
		Contact contact3 = this.createContact("33", "33N", n3);
		
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add(contact1);
		contacts.add(contact2);
		
		this.addContact(contacts, contact3);
		
	}
	
	private void addContact(List<Contact> contacts, Contact newContact){
		List<PhoneNumber> phoneNumbers1 = contacts.stream().flatMap(
				e -> e.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println("Exisitng Ph Numbers Size:"+phoneNumbers1.size());
		
		List<PhoneNumber> phoneNumbers2 = newContact.getPhoneNumbers();
		System.out.println("New Ph Numbers Size:"+phoneNumbers2.size());

		List<PhoneNumber> phoneNumbers = phoneNumbers1.stream().filter(
				phoneNumbers2::contains).collect(Collectors.toList());
		
		for(PhoneNumber ph:phoneNumbers){
			System.out.println("--"+ph);
		}
	}
	
	Function<PhoneNumber,List<Object>> toKey = p -> Arrays.asList(p.getPhoneNumber(), p.getContactId());
	
	private Contact createContact(String contactId, String nickName, int [] numbers){
		return new Contact(contactId, nickName, 
				this.getPhoneNumbers(contactId, numbers));
	}
	
	private List<PhoneNumber> getPhoneNumbers(String contactId, int [] numbers){
		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for(int n: numbers){
			PhoneNumber phoneNumber = new PhoneNumber(contactId, "", String.valueOf(n));
			phoneNumbers.add(phoneNumber);
		}
		return phoneNumbers;
	}
}
