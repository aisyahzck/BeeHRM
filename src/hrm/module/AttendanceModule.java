package hrm.module;

import java.util.*;
import java.time.LocalTime;


import hrm.entity.Attendance;
import hrm.entity.AttendanceID;
import lebah.module.LebahUserModule;
import lebah.portal.action.Command;

public class AttendanceModule extends LebahUserModule {
	
	String path= "apps/attendance";
	
	public String start() {
	
			return path + "/start.vm";
	}
	
	@Command("saveClockIn")
	public String saveClockIn() {
		
	
		AttendanceID attendanceID= attendanceID;
		LocalTime timeIn= timeIn;
		
		
		
		Attendance attendance= new Attendance();
		attendance.setAttendanceID(attendanceID);
		attendance.setTimeIn(timeIn);
		
		
		
		return path + "/attendance.vm";
	}
}
