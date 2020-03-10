package mediator;

public class Mediator
{
	   public static void main(String[] args) 
	   {
	      User kvmanikanta = new User("kvmanikanta");
	      User bhargav = new User("bhargav");

	      kvmanikanta.sendMessage("Welcome to Epam");
	      bhargav.sendMessage("sreeram!");
	   }
	}