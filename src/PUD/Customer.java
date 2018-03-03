package PUD;

/**
 * Class:       Customer
 * File:        Customer.java
 * <pre>
 * Description: This is PUD_DUI class with default constructor and
 *                a overloaded constructor that has three private
 *                The overloaded constructor is used in EmployeeGUI class
 *                for instantiating Customer object with parametes: name, address,
 *                city, state, and zip code. Also, get methods are used for getting information, , 
 *                and payrate of customer by using getName(), getAddress(), getCity(),detSteate() and 
 *                getZip() method.
 * Platform:    PC, Windows 7, jdk1.8, NetBeans 7.0
 * Date:        25/10/2015
 * History Log: 26/10/2015, 27/10/2015
 * @version:    6.1
 * @see:        javax.swing.JFrame
 * @author:     Edgar Hyeongwoo Park
 * </pre>
 */
public class Customer 
{
    // instance variables
    private String CustomerName;
    private String CustomerAddress;
    private String CustomerCity;
    private String CustomerState;
    private String CustomerZip;
//    private int CustomerZip;
    /**
     * Default constructor with no argument
     */
    public Customer()
    {
        this("", "", "", "", "");
    }
    /**
     * 
     * @param name
     * @param address
     * @param city
     * @param state 
     * @param zip
     */
    public Customer(String name, String address, String city, String state, String zip)
    {
//        Player(name, address, city, state, zip);
        this.CustomerName = name;
        this.CustomerAddress = address;
        this.CustomerCity = city;
        this.CustomerState = state;
        this.CustomerZip = zip;      
    }
    /**
     * 
     * @param name 
     */
    public void setCustomerName(String name)
    {
        CustomerName = name;
    }
    /**
     * 
     * @return CustomerName
     */
    public String getCustomerName()
    {
        return CustomerName;
    }
    
    /**
     * 
     * @param address 
     */
    public void setCustomerAddress(String address)
    {
        CustomerAddress = address;
    }
    /**
     * 
     * @return CustomerAddress
     */
    public String getCustomerAddress()
    {
        return CustomerAddress;
    }
    /**
     * 
     * @param city
     */
    public void setCustomerCity(String city)
    {
        CustomerCity = city;
    }
    /**
     * 
     * @return CustomerCity
     */
    public String getCustomerCity()
    {
        return CustomerCity;
    }
    /**
     * 
     * @param state 
     */
    public void setCustomerState(String state)
    {
        CustomerState = state;
    }
    /**
     * 
     * @return CustomerState
     */
    public String getCustomerState()
    {
        return CustomerState;
    }
    
    /**
     * 
     * @param zip 
     */
    public void setCustomerZip(String zip)
    {
        CustomerZip = zip;
    }
    /**
     * 
     * @return CustomerZip
     */
    public String getCustomerZip()
    {
        return CustomerZip;
    }
    
    /**
     * overriden toString method to print out the results
     * @return 
     */
    @Override
    public String toString()
    {
        return "";
    }
    /**
     * 
     * @param cust
     * @return false
     */
    public boolean equals(Customer cust)
    {
        return false;
    }
}
