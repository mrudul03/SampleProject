package collections.sample;

import java.util.List;

public class Contact {
	
	private String contactId;
	private String nickName;
	private List<PhoneNumber> phoneNumbers;
	
	public Contact(String contactId, String nickName, List<PhoneNumber> phoneNumbers){
		this.contactId =  contactId;
		this.nickName = nickName;
		this.phoneNumbers = phoneNumbers;
	}

	public String getContactId() {
		return contactId;
	}

	public String getNickName() {
		return nickName;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	
	

}
