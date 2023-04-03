package app;
public class Customer {
    private String name;
    private String vatIdNum;
    private String cdate;
    private String address;


    //define atributes of Customer
    public Customer(String name, String vatIdNum, String cdate, String address) {
        this.name = name;
        this.vatIdNum = vatIdNum;
        this.cdate = cdate;
        this.address = address;
    }

    //settery i gettery

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getVatIdNum() 
    {
        return vatIdNum;
    }

    //validation
    public void setVatIdNum(String vatIdNum) {
        if (vatIdNum.length() == 11) {
            this.vatIdNum = vatIdNum;
        } else {
            throw new IllegalArgumentException("VAT identification number must be 11 characters long. Please, try again");
        }
    }

    public String getCDate() 
    {
        return cdate;
    }

    public void setCDate(String cdate) 
    {
        this.cdate = cdate;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    //toString method
    @Override
    public String toString() 
    {
        return "Name: " + name + "\nVAT ID: " + vatIdNum + "\nCreation Date: " + cdate + "\nAddress: " + address;
    }
}  
