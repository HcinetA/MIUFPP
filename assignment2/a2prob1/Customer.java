package a2prob1;

public class Customer {
    private String firstName;
    private String lastName;
    private String soSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer( String firstName, String lastName , String soSecurityNum){
        this.firstName=firstName;
        this.lastName = lastName;
        this.soSecurityNum = soSecurityNum;
    }


    public String getFirstName (){
        return firstName;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSoSecurityNum() {
        return soSecurityNum;
    }

    public void setSoSecurityNum(String soSecurityNum) {
        this.soSecurityNum = soSecurityNum;
    }


    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", ssn: " + soSecurityNum + "]";
    }
}

