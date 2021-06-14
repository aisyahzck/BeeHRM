package hrm.entity;

import java.io.Serializable;

import java.util.Date;
import java.time.LocalDate;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lebah.db.entity.Role;
import lebah.db.entity.User;

@Embeddable
public class AttendanceID implements Serializable {
	
	@OneToOne @JoinColumn(name="userName")
	private User username;
	private LocalDate date;
	
		
    public AttendanceID() {
        
    }
    
	public AttendanceID(User username, LocalDate date) {
        this.username = username;
        this.date = date;
    }

	// getters, equals() and hashCode() methods
	public User getUsername() {
		return username;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setUsername(User username) {
		this.username = username;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttendanceID other = (AttendanceID) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
	// end getters, equals() and hashCode() methods
	
	

}
