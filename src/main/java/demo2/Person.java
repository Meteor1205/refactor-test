package demo2;

public class Person {
    private String name;
    private TelephoneNumber telephoneNumber;

    public Person() {
        this.telephoneNumber = new TelephoneNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber.toString();
    }

    public String getOfficeAreaCode() {
        return telephoneNumber.getAreaCode();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.telephoneNumber.setAreaCode(officeAreaCode);
    }

    public String getOfficeNumber() {
        return telephoneNumber.getNumber();
    }

    public void setOfficeNumber(String officeNumber) {
        this.telephoneNumber.setNumber(officeNumber);
    }
}
