import java.util.ArrayList;

public class Person {
	//AVATAR (add when you learn how)
	private String fName, mName, lName;
	private ArrayList <Subject> myInterests;
	private Contact myContact;
	private int bilkentID;
	private boolean isLearner = false;
	private boolean isTutor = false;
	
	public Person(String fName, String mName, String lName, boolean isLearner, boolean isTutor, int bilkentID) {
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.isLearner = isLearner;
		this.isTutor = isTutor;
		this.bilkentID = bilkentID;
		myContact = new Contact();
		myInterests = new ArrayList <Subject>();
	}
	
	public Person(String fName, String lName, boolean isLearner, boolean isTutor, int bilkentID) {
		this.fName = fName;
		this.lName = lName;A
		this.isLearner = isLearner;
		this.isTutor = isTutor;
		this.bilkentID = bilkentID;
		myContact = new Contact();
		myInterests = new ArrayList <Subject>();
	}
	
	public void addContact(String phone, String email) {
		myContact = new Contact(phone, email);
	}
	
	public void addInterest(Subject interest) {
		myInterests.add(interest);
	}
	
	
}
