package hrm.entity;

import java.time.LocalTime;

import java.util.Date;

import javax.persistence.*;




@Table(name= "attendance")
@Entity
public class Attendance {

	@EmbeddedId @Column(length=50)
	private  AttendanceID attendanceID;
	private LocalTime timeIn;
	private LocalTime timeOut;
	 

	 //constructor
	 
	 //getter setter
	 public AttendanceID getAttendanceID() {
			return attendanceID;
		}

	public void setAttendanceID(AttendanceID attendanceID) {
		this.attendanceID = attendanceID;
		}


	public LocalTime getTimeIn() {
		timeIn= java.time.LocalTime.now();
		return timeIn;
		}

	public LocalTime getTimeOut() {
		timeOut= java.time.LocalTime.now();
		return timeOut;
		}


	public void setTimeIn(LocalTime timeIn) {
		this.timeIn = timeIn;
		}

	public void setTimeOut(LocalTime timeOut) {
		this.timeOut = timeOut;
		}
	 
	 
	
	 
	 
	 
	
}

