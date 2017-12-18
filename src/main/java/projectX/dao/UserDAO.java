package projectX.dao;

import java.util.List;

import projectX.User;
import java.util.ArrayList;

public class UserDAO {

	// List is working as a database
	private static final List<User> users = new ArrayList<>();

	static {
		users.add(new User("Danny", "Odenkirchen", "2837", 0));
		users.add(new User("Dominic", "NG", "2237", 1));
		users.add(new User("Henk", "Quisqo", "4234", 2));
		users.add(new User("Koen", "Alblas", "3453", 3));
		users.add(new User("Christiaan", "Alblas", "6454", 4));
		users.add(new User("Paul", "Alblas", "2342", 5));
	}

	//  Search function with firstName
	public static User findUser(String name) throws NullPointerException {
		for (User user : users) {
			if (user.getFirstName().equals(name))
				return user;
		}
		throw new NullPointerException("User not found");
	}

	// returns full list of users
	public static List<User> getUsers() {
		return users;
	}

	// delete function for selected user
	public static void deleteUser(User user) {
		users.remove(user);
		System.out.println(user.getFirstName() + " has just been removed");
	}
	
	// return User with the given userID
	public static User getUserWithID(int userID) {
		return users.get(userID);
	}
	
	// update function for selected user
	public static void updateUser(User user) {
		users.get(user.getUserID()).setFirstName(user.getFirstName());
		System.out.println("User: " + user.getFirstName() + " has been updated");
	}
	
}
