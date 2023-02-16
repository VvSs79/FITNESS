package dto;

import util.Role;
import util.Status;

import java.util.UUID;

public class UserCreated {
    private UUID uuidUser;
    private String FIOuser;
    private String mailUser;
    private String password;
    private Role UserRole;
    private Status UserStatus;

    public UserCreated(UUID uuidUser, String FIOuser, String mailUser, String password, Role userRole, Status userStatus) {
        this.uuidUser = uuidUser;
        this.FIOuser = FIOuser;
        this.mailUser = mailUser;
        this.password = password;
        UserRole = userRole;
        UserStatus = userStatus;
    }

    public UUID getUuidUser() {
        return uuidUser;
    }

    public void setUuidUser(UUID uuidUser) {
        this.uuidUser = uuidUser;
    }

    public String getFIOuser() {
        return FIOuser;
    }

    public void setFIOuser(String FIOuser) {
        this.FIOuser = FIOuser;
    }

    public String getMailUser() {
        return mailUser;
    }

    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getUserRole() {
        return UserRole;
    }

    public void setUserRole(Role userRole) {
        UserRole = userRole;
    }

    public Status getUserStatus() {
        return UserStatus;
    }

    public void setUserStatus(Status userStatus) {
        UserStatus = userStatus;
    }

    @Override
    public String toString() {
        return "UserCreated{" +
                "uuidUser=" + uuidUser +
                ", FIOuser='" + FIOuser + '\'' +
                ", mailUser='" + mailUser + '\'' +
                ", password='" + password + '\'' +
                ", UserRole=" + UserRole +
                ", UserStatus=" + UserStatus +
                '}';
    }
}
