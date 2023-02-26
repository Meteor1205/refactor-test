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
        return String.format("%s %s", telephoneNumber.getOfficeAreaCode(), telephoneNumber.getOfficeNumber());
    }

    public String getOfficeAreaCode() {
        return telephoneNumber.getOfficeAreaCode();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.telephoneNumber.setOfficeAreaCode(officeAreaCode);
    }

    public String getOfficeNumber() {
        return telephoneNumber.getOfficeNumber();
    }

    public void setOfficeNumber(String officeNumber) {
        this.telephoneNumber.setOfficeNumber(officeNumber);
    }
}
