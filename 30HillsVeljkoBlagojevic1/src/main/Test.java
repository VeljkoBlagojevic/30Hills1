//Author: Veljko Blagojevic

package main;

import person.Gender;
import person.Person;

public class Test {
	public static void main(String[] args) {

		
		Person p1 = new Person(1, "Paul", "Crowe", 28, Gender.MALE);
		Person p2 = new Person(2, "Rob", "Fitz", 23, Gender.MALE);
		Person p3 = new Person(3, "Ben", "O'Carolan", 0, Gender.MALE);
		Person p4 = new Person(4, "Victor", "", 28, Gender.MALE);
		Person p5 = new Person(5, "Peter", "Mac", 29, Gender.MALE);
		Person p6 = new Person(6, "John", "Barry", 18, Gender.MALE);
		Person p7 = new Person(7, "Sarah", "Lane", 30, Gender.FEMALE);
		Person p8 = new Person(8, "Susan", "Downe", 28, Gender.FEMALE);
		Person p9 = new Person(9, "Jack", "Stam", 28, Gender.MALE);
		Person p10 = new Person(10, "Amy", "Lane", 24, Gender.FEMALE);
		Person p11 = new Person(11, "Sandra", "Phelan", 28, Gender.FEMALE);
		Person p12 = new Person(12, "Laura", "Murphy", 33, Gender.FEMALE);
		Person p13 = new Person(13, "Lisa", "Daly", 28, Gender.FEMALE);
		Person p14 = new Person(14, "Mark", "Johnson", 28, Gender.MALE);
		Person p15 = new Person(15, "Seamus", "Crowe", 24, Gender.MALE);
		Person p16 = new Person(16, "Daren", "Slater", 28, Gender.MALE);
		Person p17 = new Person(17, "Dara", "Zoltan", 48, Gender.MALE);
		Person p18 = new Person(18, "Marie", "D", 28, Gender.FEMALE);
		Person p19 = new Person(19, "Catriona", "Long", 28, Gender.FEMALE);
		Person p20 = new Person(20, "Katy", "Couch", 28, Gender.FEMALE);
		
		p1.setFriends(new Person[] {p2});
		p2.setFriends(new Person[] {p1,p3});
		p3.setFriends(new Person[] {p2,p4,p5,p7});
		p4.setFriends(new Person[] {p3});
		p5.setFriends(new Person[] {p3,p6,p11,p10,p7});
		p6.setFriends(new Person[] {p5});
		p7.setFriends(new Person[] {p3,p5,p20,p12,p8});
		p8.setFriends(new Person[] {p7});
		p9.setFriends(new Person[] {p12});
		p10.setFriends(new Person[] {p5,p11});
		p11.setFriends(new Person[] {p5,p10,p19,p20});
		p12.setFriends(new Person[] {p7,p9,p13,p20});
		p13.setFriends(new Person[] {p12,p14,p20});
		p14.setFriends(new Person[] {p13,p15});
		p15.setFriends(new Person[] {p14});
		p16.setFriends(new Person[] {p18,p20});
		p17.setFriends(new Person[] {p18,p20});
		p18.setFriends(new Person[] {p17});
		p19.setFriends(new Person[] {p11,p20});
		p20.setFriends(new Person[] {p7,p11,p12,p13,p16,p17,p19});
	
		//Printing all the information about person number 3
		p3.printPerson();
		
		//Printing direct friends: those people who are directly connected to the third person;
		p3.printDirectFriends();
		
		//Printing friends of friends: those who are two steps away from the third person but not directly connected to the third person;
		p3.printIndirectFriends();

		
	}
	
}
