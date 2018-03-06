package collections.sample;

public class PhoneNumber {
	
	private String contactId;
	private String type;
	private String phoneNumber;
	
	public PhoneNumber(String contactId, String type, String phoneNumber){
		this.contactId = contactId;
		this.type = type;
		this.phoneNumber = phoneNumber;
	}
	
	public String getContactId() {
		return contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString(){
		return "Contact Id:"+this.contactId+" Type:"+ this.type+ " phoneNumber:"+this.phoneNumber;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == null) return false;
	    if(!(o instanceof PhoneNumber)) return false;
	    PhoneNumber ph = (PhoneNumber)o;
	    if(!this.phoneNumber.equals(ph.phoneNumber)) return false;
	    else return true;
	}
	
	@Override
	public int hashCode(){
		return phoneNumber.hashCode();
	}

}
