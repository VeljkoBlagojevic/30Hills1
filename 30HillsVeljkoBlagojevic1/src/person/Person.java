//Author Veljko Blagojevic

package person;

public class Person implements PersonInterface {

	private int id;
	private String firstName;
	private String surname;
	private long age;
	private Gender gender;
	private Person[] friends = new Person[50];
	
	public Person() {
		this.friends = new Person[50];
	}
		
	public Person(int id, String firstName, String surname, long age, Gender gender, Person[] friends) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.friends = new Person[50];
		this.friends = friends;
	}
	
	public Person(int id, String firstName, String surname, long age, Gender gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.friends = new Person[50];
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public long getAge() {
		return age;
	}
	
	public void setAge(long age) {
		this.age = age;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Person[] getFriends() {
		return friends;
	}
	
	public void setFriends(Person[] friends) {
		for (int i = 0; i < friends.length; i++) {
			addFriend(friends[i]);
		}
	}
	
	
	@Override
	public String toString() {
		return  "ID: " + id +
				"\n" + 
				"First name: " + firstName +
				"\n" + 
				"Surname: " + surname +
				"\n" + 
				"Age: " + age +
				"\n" + 
				"Gender: " + gender + 
				"\n" /*+ 
				"Friends with: \n" + friendsList()*/
				;
	}

	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}
	
	
	
	public void addFriend(Person friend) {
		friends[friend.getId()-1] = friend;
	}
	
	public void printPerson() {
		System.out.println(toString());
	}
	
	public void printDirectFriends() {
		System.out.println("Selected person is direct friends with: ");
		System.out.println(directFriendsList());
	}
	
	private String directFriendsList() {
		String friendsList = "";
		for (int i = 0; i < friends.length; i++) {
			if(friends[i]!=null)
				friendsList += friends[i].toString() + "\n";
		}
		return friendsList;
	}
	
	public void printIndirectFriends() {
		System.out.println("Selected person is indirect friends with: ");
		System.out.println(indirectFriendsList());
	}

	private String indirectFriendsList() {
		String indirectFriendsList = "";
		for (int i = 0; i < friends.length ; i++) {
			if(friends[i]!=null)
			for (int j = 0; j < friends[i].friends.length ; j++)
				if(friends[i]!=null && friends[i].friends[j]!=null && friends[i].friends[j]!=this && friends[i].friends[j]!=friends[j])
					indirectFriendsList += friends[i].friends[j].toString() + "\n";
		}
		return indirectFriendsList;
	}
	
	
}
