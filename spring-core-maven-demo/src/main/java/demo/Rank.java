package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rank {

	@Value("4")
	private int rankNo;
	
	@Value("Good")
	private String description;
	
	public Rank() {
		super();
	}

	public Rank(int rankNo, String description) {
		super();
		this.rankNo = rankNo;
		this.description = description;
	}

	public int getRankNo() {
		return rankNo;
	}

	public void setRankNo(int rankNo) {
		this.rankNo = rankNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Rank [rankNo=" + rankNo + ", description=" + description + "]";
	}
	
}
