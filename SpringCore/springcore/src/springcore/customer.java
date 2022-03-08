package springcore;

public class customer {
    private  int customerId;
    private String  customerName;
    private String customerContact;
    private Address customerAddress;


    public customer(){}

    public customer(int customerId, String customerName, String customerContact, Address customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerAddress = customerAddress;
    }

    public int getcustomerId() {
        return customerId;
    }

    public void setcustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getcustomerName() {
        return customerName;
    }

    public void setcustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getcustomerContact() {
        return customerContact;
    }

    public void setcustomerContact(String  customerContact) {
        this.customerContact = customerContact;
    }

    public Address getcustomerAddress() {
        return customerAddress;
    }

    public void setcustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void customerDetail(){
        System.out.println("Customer Id: "+getcustomerId()+"\n"+
                           "Name: "+getcustomerName()+"\n"+
                           "Customer Contact: "+getcustomerContact()+"\n"+
                            "Address: "+
                            "Street: "+getcustomerAddress().getStreet()+" City: "+getcustomerAddress().getCity()+" State: "+getcustomerAddress().getState()+" Country: "+getcustomerAddress().getCountry()+" zip: "+getcustomerAddress().getZip());
    }

}