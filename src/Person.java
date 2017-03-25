import java.util.ArrayList;

public class Person {
	private Avatar myAvatar;
	private String fName, mName, lName;
	private ArrayList <Subject> myInterests;
	private Contact myContact;
	private ArrayList <Experience> pastExperiences;
	private int bilkentID;
	private boolean isLearner = false;
	private boolean isTutor = false;
	private double rating;
	private int count;
	
	public Person(Avatar avatar, String fName, String mName, String lName, boolean isLearner, boolean isTutor, int bilkentID) {
		myAvatar = avatar;
		rating = 0;
		count = 0;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.isLearner = isLearner;
		this.isTutor = isTutor;
		this.bilkentID = bilkentID;
		myContact = new Contact();
		myInterests = new ArrayList <Subject>();
		pastExperiences = new ArrayList <Experience>();
	}
	
	public Person(Avatar avatar, String fName, String lName, boolean isLearner, boolean isTutor, int bilkentID) {
		rating = 0;
		count = 0;
		myAvatar = avatar;
		this.fName = fName;
		this.lName = lName;
		this.isLearner = isLearner;
		this.isTutor = isTutor;
		this.bilkentID = bilkentID;
		myContact = new Contact();
		myInterests = new ArrayList <Subject>();
		pastExperiences = new ArrayList <Experience>();
	}
	
	public void addRating(double rate) {
		rating += rate;
		rating /= ++count;
	}
	
	public void addContact(String phone, String email) {
		myContact = new Contact(phone, email);
	}
	
	public void addInterest(Subject interest) {
		myInterests.add(interest);
	}
	
	public void addExperience(Experience e) {
		pastExperiences.add(e);
	}
}
