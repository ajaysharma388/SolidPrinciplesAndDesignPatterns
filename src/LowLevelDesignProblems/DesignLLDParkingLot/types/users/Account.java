package LowLevelDesignProblems.DesignLLDParkingLot.types.users;

import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.AccountStatus;
import LowLevelDesignProblems.DesignLLDParkingLot.types.enums.AccountType;

public abstract class Account {
    protected String user_name;
    protected String password;
    protected Person owner;
    protected AccountStatus status;
    protected AccountType type;
    protected Address address;
    // methods
    abstract boolean resetAccountPwd(String password);
}
