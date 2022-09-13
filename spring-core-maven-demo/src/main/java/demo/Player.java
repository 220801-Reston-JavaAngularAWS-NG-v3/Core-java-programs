package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player {
	private String firstName;
	private String lastName;
	private String sport;
	
	@Autowired // feild injection 
	private Rank rank;
	
	public Player() {
		super();
	}

	//@Autowired // constructor injection
	public Player(String firstName, String lastName, String sport, Rank rank) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sport = sport;
		this.rank = rank;
	}

	public String getFirstName() {
		return firstName;
	}
	
	@Value("John")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Value("Carter")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSport() {
		return sport;
	}
	
	@Value("football")
	public void setSport(String sport) {
		this.sport = sport;
	}

	public Rank getRank() {
		return rank;
	}

	//@Autowired // setter injection
	public void setRank(Rank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Player [firstName=" + firstName + ", lastName=" + lastName + ", sport=" + sport + ", rank=" + rank
				+ "]";
	}
	
}
