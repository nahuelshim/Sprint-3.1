package N2Ex1.Implementations;

import N2Ex1.Interfaces.Phone;

public class ArgentinaPhone implements Phone {

    private String longDistance;
    private String mobile;
    private String prefix;

    public ArgentinaPhone() {

        this.longDistance = "+54";
        this.mobile = " 9";
        this.prefix = " 223";
    }

    @Override
    public String showPhoneFormat() {
        return "(" + longDistance + mobile + prefix + ") ";
    }

}
