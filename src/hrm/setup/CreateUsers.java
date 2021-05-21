package hrm.setup;

import lebah.db.entity.Persistence;
import lebah.db.entity.Role;
import lebah.db.entity.User;

public class CreateUsers {

	public static void main(String[] args) {
		
		createAdminSys();
		createStaff();
		
	}
	
	public static void createAdminSys() {
		
		User user = new User();
		user.setUserName("adminSys");
		user.setUserPassword("adminsys");
		
		user.setFirstName("System Admin");
		
		Role role = Persistence.db().find(Role.class, "admin");
		if ( role != null) user.setRole(role);
		
		Persistence.db().save(user);
		
	}
	
	public static void createStaff() {
		
		User user = new User();
		user.setUserName("user");
		user.setUserPassword("user");
		
		user.setFirstName("Staff");
		
		Role role = Persistence.db().find(Role.class, "user");
		if ( role != null) user.setRole(role);
		
		Persistence.db().save(user);
		
	}

}
