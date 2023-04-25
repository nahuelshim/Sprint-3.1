package N2Ex1.Implementations;

import N2Ex1.Interfaces.Phone;

public class SpainPhone implements Phone {

    private String longDistance;
    private String mobile;
    private String prefix;

    public SpainPhone() {

        this.longDistance = "+34";
        this.mobile = "";
        this.prefix = "";
    }

    @Override
    public String showPhoneFormat() {
        return "(" + longDistance + mobile + prefix + ") ";
    }

}