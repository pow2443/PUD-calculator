package PUD;

import java.text.NumberFormat;


/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* Class: Invoice
* File: Invoice.java
* Description: Save method to claculate bill with several tax and total 
* draw the bill in textarea
* @author: Edgar Hyeongwoo Park
* Environment: PC, Windows 7, jdk1.8, NetBeans 7.0
* Date: 10/25/2015
* @version 1.0
* @see javax.swing.JFrame
* History Log: 10/25/2015, 10/26/2015, 10/27/2015
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Invoice 
{
    
     //Instance variables and constants
    final static double COST_FIRST = 0.07764,
                        COST_SECOND = 0.08852,
                        COST = 0.09893,
                        BPA_CHARGE = 0.00139,
                        SPU_CHARGE = 0.03873,
                        CITY_TAX = 0.06;
                        
    
    double total = 0.0,
           condition=500; 
    
    StringBuffer display = new StringBuffer("");
    
    private String customerName;
    
    private double presentElectricity,
                   previousElectricity,
                   usedElectricity,
                   bpa,
                   spu, 
                   tax,
                   amount; 
        
    
    
    
    //Default constructor
     public Invoice()
    {
        customerName = "";
        presentElectricity = 0.0;
        previousElectricity = 0.0;
        total = 0.0;
        amount = 0.0;
    }
     
    //Overloaded constructor
     public Invoice (String inCoustomer, double inPresent, double inPrevious)
    {
        
        customerName = inCoustomer;
        presentElectricity = inPresent;
        previousElectricity = inPrevious;
        
    }
     
     
    //calculate electricity bill with several taxes
    public double calculateBill ()
    {
        //get used electricity
         usedElectricity = presentElectricity - previousElectricity;
         
                //get condition to calculate bill
                condition = usedElectricity - condition;
                
         //distinguish the condition:Cost of electricity—$0.07764 per kW 
         //for the first 500 units, $0.08852 per kW unit for 501-1000 kW units 
         //and $0.09893 per kW unit thereafter              
                    if(condition<=0)
                    {
                     //calculate bill   
                     amount = usedElectricity * COST_FIRST; 
                     bpa = usedElectricity * BPA_CHARGE;
                     spu = amount * SPU_CHARGE;
                     tax = amount * CITY_TAX;

                     total = amount + bpa + spu + tax;


                    }
                     else if( (condition > 0) && (condition <=500) )
                      {
                        //calculate bill    
                        amount = (COST_FIRST*(usedElectricity - condition))+(COST_SECOND*condition);
                        bpa = usedElectricity * BPA_CHARGE;
                        spu = amount * SPU_CHARGE;
                        tax = amount * CITY_TAX;

                        total = amount + bpa + spu + tax;

                       }
                    else
                     {
                        //calculate bill  
                        amount = (COST_FIRST*(usedElectricity - condition))
                                +(COST_SECOND*(usedElectricity - condition))
                                + (COST*(usedElectricity-(2*(usedElectricity - condition))));
                        bpa = usedElectricity * BPA_CHARGE;
                        spu = amount * SPU_CHARGE;
                        tax = amount * CITY_TAX;

                        total = amount + bpa + spu + tax;
                        
                     }  
                    //return value of total
                    return total;
                    
    } 
    /**
     * Displays the bill with proper justification; Calls another method, 
     * padSpaces, to add additional spaces for justification.
     * Name:    displayBill
     * Date:    10/26/15
     * @return  StringBuffer
     * @see     java.lang.StringBuffer
     * @author  Edgar Hyeongwoo Park
     */ 
    public StringBuffer displayBill ()
    {
        //draw bill
        NumberFormat dollars = NumberFormat.getCurrencyInstance();
        display.append(padSpaces("Customer", customerName + '\n'));
        display.append('\n');
        display.append(padSpaces("Cost of Electricity", dollars.format(amount) + '\n'));
        display.append(padSpaces("BPA Charge", dollars.format(bpa) + '\n'));
        display.append(padSpaces("State Public Utility Charge", dollars.format(spu) + '\n'));
        display.append(padSpaces("City Tax", dollars.format(tax) + '\n'));
        display.append("-------------------------------------------------\n");
        display.append(padSpaces("Total", dollars.format(total) + '\n'));
        return display;
    }
    
    /**
     * Adds spaces between 2 Strings (first and second) in order to make second
     * right-justified.
     * Name:            padSpaces
     * @param first     String
     * @param second    String
     * @return line     StringBuffer composed of first + spaces + second
     */
    private StringBuffer padSpaces (String first, String second)
    {
        final int MAX_SPACES = 50; // width of displayJTextArea
        StringBuffer line = new StringBuffer(first);
        
        // Find number of spaces needed for padding
        int numSpaces = MAX_SPACES - first.length() - second.length();
        
        for (int i = 0; i < numSpaces; i++)
        {
            line.append(" ");
        }
        line.append(second);
        return line;
    }
}
