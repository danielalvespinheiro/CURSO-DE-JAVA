package exercicio195.entities;

import java.util.Date;
import java.util.Objects;

public class Peoples {

	private String username;
	private Date moment;
	
	public Peoples() {}

	public Peoples(String username, Date moment) {
		super();
		this.username = username;
		this.moment = moment;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public java.util.Date getMomnet() {
		return moment;
	}

	public void setMomnet(Date momnet) {
		this.moment = momnet;
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peoples other = (Peoples) obj;
		return Objects.equals(username, other.username);
	}
	
}
