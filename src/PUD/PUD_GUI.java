/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*Project Name : PUD Invoice
*@Author : Edgar Hyeongwoo Park  
*Due date : 11/03/2015
*Purpose: PUD Calculator help to calculate electricity bill
*Description Project1 : Calculator provides electricity bill 
*from given user's information.
*After getting input address, name, account number, present electricity and previous electricity from user, 
*the calculator calculates several taxes and bill. 
*Images cited work: park.jpg(http://cliparts.co/parking-lot-clip-art)
*                   PUDlogo.jpg(http://www.electricleague.net/files/luncheons/2010_jan_luncheon_snopud_presentation.pdf)
*                   (This picture doesn't require copyright to me because I use this picture for education)
*                   electronic.jpg(http://elitetrack.com/spark/)
*                   (This picture doesn't require copyright to me because I use this picture for education)
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package PUD;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* Class: PUD_GUI
* File: PUD_GUI.java
* Description: Calculate electricity bill
* several tax and total 
* @author: Edgar Hyeongwoo Park
* Environment: PC, Windows 7, jdk1.8, NetBeans 7.0
* Date: 10/25/2015
* @version 1.0
* @see javax.swing.JFrame
* History Log: 10/25/2015, 10/26/2015, 10/27/2015
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class PUD_GUI extends javax.swing.JFrame {
    
   
    NumberFormat dollors = NumberFormat.getCurrencyInstance();
    StringBuffer display = new StringBuffer("");
    private final String FILE_NAME = "src/PUD/Customer.txt";
    private ArrayList customerArrayList = new ArrayList();
    private static Customer myCustomer;
    DefaultListModel listModel = new DefaultListModel();  
/**
 * set a date in format of MM/dd/yyyy
 * @return void
 */
public void SetDate()
{
        
        DateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
                Date today = new Date();
                 this.setTitle("Pujet Sound Energy Invoice -- " + dateFormatter.format(today));
    
}
 
    
 
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Constructor:     Default constructor
     * Description:     Creates the form, sets default button, loads the icon,
     *                  calls setDate(), centers the form, calls readPatients()
     * </pre>
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */
    public PUD_GUI() {
        initComponents();
        // Set calculateJButton as default
        this.getRootPane().setDefaultButton(displayJButton);
        
        // Set icon image
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/PUD/park.jpg"));
    
        
        // Center the form
        this.setLocationRelativeTo(null);
        
        SetDate();
        // Add patients from file to combo box
        
        readCustomer();
        
        
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method:          readPCustomers()
     * Description:     Reads cutomer names from text file, loads names into
     *                  customerJComboBox
     * @author          Edgar Hyeongwoo Park
     * </pre>
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */

     private void readCustomer()
    {        
        FileReader inputFile;
        BufferedReader input;
        
        try
        {
            String name = "", address = "", city = "", state = "", zip = "";

            inputFile = new FileReader(FILE_NAME);
            input = new BufferedReader(inputFile);

            
            //Read a line of input from the text file            
            String lineOfInput = input.readLine();
            
            // populate the ArrayList and JList
            while(lineOfInput != null)      // on the file
            {
                // parse and grab all characters up to the point with delimeter
                StringTokenizer inputField = new StringTokenizer(lineOfInput, ",");
                
                
                while (inputField.hasMoreElements())    // on each line
                {
                    // read as an object, so parse to string [.toString()]
                    name = inputField.nextElement().toString();// read name
                    listModel.addElement(name);
                    nameJComboBox.addItem(name);//add Items in ComboBox
                    address = inputField.nextElement().toString();
                    
                    city = inputField.nextElement().toString();
                    state = inputField.nextElement().toString();
                    zip = inputField.nextElement().toString();


                    myCustomer = new Customer(name, address, city, state, zip);
                    customerArrayList.add(myCustomer);             
                   
                }
                // read new line
                lineOfInput = input.readLine();
            }
            
        }        
        catch(FileNotFoundException fnEx)
        {
            JOptionPane.showMessageDialog(null, "File Open Error");
        }
        catch(IOException ioEx)
        {
            JOptionPane.showMessageDialog(null, "File Error"); 
        }   
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jButton4 = new javax.swing.JButton();
        PUDlogo = new javax.swing.JLabel();
        invoiceJPanel = new javax.swing.JPanel();
        meterJLabel = new javax.swing.JLabel();
        dateJLabel = new javax.swing.JLabel();
        dateJTextField = new javax.swing.JTextField();
        presentJLabel = new javax.swing.JLabel();
        presentJTextField = new javax.swing.JTextField();
        previousJLabel = new javax.swing.JLabel();
        previousJTextField = new javax.swing.JTextField();
        unitsJLabel = new javax.swing.JLabel();
        unitsJTextField = new javax.swing.JTextField();
        accountJLabel = new javax.swing.JLabel();
        accountJFormattedTextField = new javax.swing.JFormattedTextField();
        pudaddressJScrollPanel = new javax.swing.JScrollPane();
        pudaddressJTextArea = new javax.swing.JTextArea();
        electronicJLabel = new javax.swing.JLabel();
        informationPanel = new javax.swing.JPanel();
        nameJLabel = new javax.swing.JLabel();
        nameJComboBox = new javax.swing.JComboBox();
        addressJLabel = new javax.swing.JLabel();
        addressJTextField = new javax.swing.JTextField();
        cityJLabel = new javax.swing.JLabel();
        cityJTextField = new javax.swing.JTextField();
        statesJLabel = new javax.swing.JLabel();
        statesJComboBox = new javax.swing.JComboBox();
        zipJLabel = new javax.swing.JLabel();
        zipJTextField = new javax.swing.JTextField();
        greetingJLabel = new javax.swing.JLabel();
        billJTextArea = new javax.swing.JTextArea();
        buttonJPanel = new javax.swing.JPanel();
        printJButton = new javax.swing.JButton();
        displayJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();
        quitJButton = new javax.swing.JButton();
        saveJButton = new javax.swing.JButton();
        pudJMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        clearJMenuItem = new javax.swing.JMenuItem();
        printJMenuItem = new javax.swing.JMenuItem();
        saveJMenuItem = new javax.swing.JMenuItem();
        quitJMenuItem = new javax.swing.JMenuItem();
        actionJMenu = new javax.swing.JMenu();
        displayJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setResizable(false);

        PUDlogo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        PUDlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PUD/PUDlogo.jpg"))); // NOI18N
        PUDlogo.setToolTipText("PUDlogo");

        invoiceJPanel.setToolTipText("input values");
        invoiceJPanel.setEnabled(false);

        meterJLabel.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        meterJLabel.setText("Meter Readings");
        meterJLabel.setToolTipText("discription");

        dateJLabel.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        dateJLabel.setText("Invoice Date");
        dateJLabel.setToolTipText("discription");

        dateJTextField.setEditable(false);
        dateJTextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        dateJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        dateJTextField.setToolTipText("date of bill");
        dateJTextField.setEnabled(false);

        presentJLabel.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        presentJLabel.setText("Present");
        presentJLabel.setToolTipText("discription");

        presentJTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        presentJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        presentJTextField.setToolTipText("input the present electricity");

        previousJLabel.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        previousJLabel.setText("Previous");
        previousJLabel.setToolTipText("discription");

        previousJTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        previousJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        previousJTextField.setToolTipText("input the previous electricity");

        unitsJLabel.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        unitsJLabel.setText("Total Units");
        unitsJLabel.setToolTipText("discription of used electricity");

        unitsJTextField.setEditable(false);
        unitsJTextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        unitsJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        unitsJTextField.setToolTipText("used electricity");
        unitsJTextField.setEnabled(false);

        accountJLabel.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        accountJLabel.setText("Account #");
        accountJLabel.setToolTipText("discription");

        try {
            accountJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        accountJFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        accountJFormattedTextField.setToolTipText("customer's account number");
        accountJFormattedTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        javax.swing.GroupLayout invoiceJPanelLayout = new javax.swing.GroupLayout(invoiceJPanel);
        invoiceJPanel.setLayout(invoiceJPanelLayout);
        invoiceJPanelLayout.setHorizontalGroup(
            invoiceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoiceJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(invoiceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unitsJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(presentJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(previousJLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(invoiceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoiceJPanelLayout.createSequentialGroup()
                        .addGroup(invoiceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meterJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(previousJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(invoiceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountJLabel)))
                    .addGroup(invoiceJPanelLayout.createSequentialGroup()
                        .addComponent(presentJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(dateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoiceJPanelLayout.createSequentialGroup()
                        .addComponent(unitsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(accountJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        invoiceJPanelLayout.setVerticalGroup(
            invoiceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoiceJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoiceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meterJLabel)
                    .addComponent(dateJLabel))
                .addGap(14, 14, 14)
                .addGroup(invoiceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(presentJLabel)
                    .addComponent(presentJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(invoiceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoiceJPanelLayout.createSequentialGroup()
                        .addGroup(invoiceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(previousJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(previousJLabel))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoiceJPanelLayout.createSequentialGroup()
                        .addComponent(accountJLabel)
                        .addGap(10, 10, 10)))
                .addGroup(invoiceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unitsJLabel)
                    .addComponent(unitsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pudaddressJScrollPanel.setToolTipText("address of company");

        pudaddressJTextArea.setEditable(false);
        pudaddressJTextArea.setBackground(new java.awt.Color(204, 204, 204));
        pudaddressJTextArea.setColumns(20);
        pudaddressJTextArea.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pudaddressJTextArea.setRows(5);
        pudaddressJTextArea.setText("Snohomish Country PUD\nP.O. Box 1100\nEverett, WA 98206-1100\nWWW.snopud.com\n425-731-1000");
        pudaddressJTextArea.setToolTipText("address of company");
        pudaddressJTextArea.setAutoscrolls(false);
        pudaddressJTextArea.setCaretColor(new java.awt.Color(204, 204, 204));
        pudaddressJScrollPanel.setViewportView(pudaddressJTextArea);

        electronicJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PUD/electronic.jpg"))); // NOI18N
        electronicJLabel.setToolTipText("picture of electricity");

        informationPanel.setToolTipText("information");

        nameJLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nameJLabel.setText("Name :");
        nameJLabel.setToolTipText("discription");

        nameJComboBox.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nameJComboBox.setToolTipText("select your name");
        nameJComboBox.setName(""); // NOI18N
        nameJComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameJComboBoxMouseClicked(evt);
            }
        });
        nameJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJComboBoxActionPerformed(evt);
            }
        });

        addressJLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        addressJLabel.setText("Address :");
        addressJLabel.setToolTipText("discription");

        addressJTextField.setEditable(false);
        addressJTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        addressJTextField.setToolTipText("input customer address");
        addressJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressJTextFieldActionPerformed(evt);
            }
        });

        cityJLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cityJLabel.setText("City :");
        cityJLabel.setToolTipText("discription");

        cityJTextField.setEditable(false);
        cityJTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cityJTextField.setToolTipText("input customer city");

        statesJLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        statesJLabel.setText("State :");
        statesJLabel.setToolTipText("discription");

        statesJComboBox.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        statesJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY" }));
        statesJComboBox.setToolTipText("input customer state");
        statesJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statesJComboBoxActionPerformed(evt);
            }
        });

        zipJLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        zipJLabel.setText("Zip :");
        zipJLabel.setToolTipText("discription");

        zipJTextField.setEditable(false);
        zipJTextField.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        zipJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        zipJTextField.setToolTipText("Zip code");

        javax.swing.GroupLayout informationPanelLayout = new javax.swing.GroupLayout(informationPanel);
        informationPanel.setLayout(informationPanelLayout);
        informationPanelLayout.setHorizontalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressJLabel)
                    .addComponent(cityJLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameJLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informationPanelLayout.createSequentialGroup()
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(informationPanelLayout.createSequentialGroup()
                        .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statesJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zipJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zipJTextField))))
        );
        informationPanelLayout.setVerticalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJLabel)
                    .addComponent(nameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressJLabel)
                    .addComponent(addressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cityJLabel)
                        .addComponent(statesJLabel)
                        .addComponent(statesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zipJLabel))
                    .addComponent(zipJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        greetingJLabel.setFont(new java.awt.Font("SansSerif", 2, 24)); // NOI18N
        greetingJLabel.setForeground(new java.awt.Color(0, 51, 255));
        greetingJLabel.setText("Thank you for being our customer!");
        greetingJLabel.setToolTipText("greeting");

        billJTextArea.setEditable(false);
        billJTextArea.setColumns(20);
        billJTextArea.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        billJTextArea.setRows(5);
        billJTextArea.setToolTipText("output your bill");

        buttonJPanel.setToolTipText("buttons");

        printJButton.setBackground(new java.awt.Color(255, 255, 51));
        printJButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        printJButton.setMnemonic('P');
        printJButton.setText("Print Invoice");
        printJButton.setToolTipText("print the bill");
        printJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJButtonActionPerformed(evt);
            }
        });

        displayJButton.setBackground(new java.awt.Color(255, 255, 153));
        displayJButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        displayJButton.setMnemonic('D');
        displayJButton.setText("Display Bill");
        displayJButton.setToolTipText("calculate and show the bill");
        displayJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayJButtonActionPerformed(evt);
            }
        });

        clearJButton.setBackground(new java.awt.Color(255, 255, 51));
        clearJButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        clearJButton.setMnemonic('C');
        clearJButton.setText("Clear");
        clearJButton.setToolTipText("clear your input values");
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });

        quitJButton.setBackground(new java.awt.Color(255, 255, 51));
        quitJButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        quitJButton.setMnemonic('Q');
        quitJButton.setText("Quit");
        quitJButton.setToolTipText("exit");
        quitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitJButtonActionPerformed(evt);
            }
        });

        saveJButton.setBackground(new java.awt.Color(255, 255, 102));
        saveJButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        saveJButton.setText("Save Bill");
        saveJButton.setToolTipText("save bill in ElectricityBill text file");

        javax.swing.GroupLayout buttonJPanelLayout = new javax.swing.GroupLayout(buttonJPanel);
        buttonJPanel.setLayout(buttonJPanelLayout);
        buttonJPanelLayout.setHorizontalGroup(
            buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonJPanelLayout.createSequentialGroup()
                        .addComponent(clearJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quitJButton))
                    .addComponent(printJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        buttonJPanelLayout.setVerticalGroup(
            buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonJPanelLayout.createSequentialGroup()
                .addComponent(displayJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clearJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quitJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pudJMenuBar.setToolTipText("insted of buttons");
        pudJMenuBar.setEnabled(false);

        fileJMenu.setMnemonic('F');
        fileJMenu.setText("File");
        fileJMenu.setToolTipText("instead of buttons");

        clearJMenuItem.setMnemonic('C');
        clearJMenuItem.setText("Clear");
        clearJMenuItem.setToolTipText("clear all your input vlaues");
        clearJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(clearJMenuItem);

        printJMenuItem.setMnemonic('P');
        printJMenuItem.setText("Print");
        printJMenuItem.setToolTipText("print the bill ");
        printJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printJMenuItem);

        saveJMenuItem.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        saveJMenuItem.setMnemonic('S');
        saveJMenuItem.setText("Save");
        saveJMenuItem.setToolTipText("save the bill");
        saveJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(saveJMenuItem);

        quitJMenuItem.setMnemonic('Q');
        quitJMenuItem.setText("Quit");
        quitJMenuItem.setToolTipText("exit the program");
        quitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(quitJMenuItem);

        pudJMenuBar.add(fileJMenu);

        actionJMenu.setMnemonic('t');
        actionJMenu.setText("Action");
        actionJMenu.setToolTipText("instead of display button");

        displayJMenuItem.setText("Display");
        displayJMenuItem.setToolTipText("display the bill");
        displayJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayJMenuItemActionPerformed(evt);
            }
        });
        actionJMenu.add(displayJMenuItem);

        pudJMenuBar.add(actionJMenu);

        helpJMenu.setMnemonic('H');
        helpJMenu.setText("Help");
        helpJMenu.setToolTipText("help to understand the calculator");

        aboutJMenuItem.setMnemonic('A');
        aboutJMenuItem.setText("About");
        aboutJMenuItem.setToolTipText("help to understand the calculator");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        pudJMenuBar.add(helpJMenu);

        setJMenuBar(pudJMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(billJTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(informationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pudaddressJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(electronicJLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(PUDlogo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(invoiceJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(greetingJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(PUDlogo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(invoiceJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pudaddressJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(electronicJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billJTextArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greetingJLabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Method: aboutJMenuItemActionPerformed
     * bringing description about program to help user
     * @param evt java.awt.event.ActionEvent
     * @return void
     */
    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        // TODO add your handling code here:
       AboutGUI myAbout = new AboutGUI(); //Bring AboutGUI form  
        myAbout.setVisible(true);//show the AboutGUI 
    }//GEN-LAST:event_aboutJMenuItemActionPerformed
/**
     * Method: addressJTextFieldActionPerformed
     * bringing description about program to help user
     * @param evt java.awt.event.ActionEvent
     * @return void
     */
    private void addressJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressJTextFieldActionPerformed
/**
     * Method: statesJComboBoxActionPerformed
     * bringing description about program to help user
     * @param evt java.awt.event.ActionEvent
     * @return void
     */
    private void statesJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statesJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statesJComboBoxActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Constructor: Default constructor
     * method : displayJButtonActionPerformed
     * Description : Calculate by used electricity and show the bill with taxes 
     * @return void
     * @param evt--java.awt.event.ActionEvent
     * @see java.awt.event.ActionEvent
     * Author : Edgar Hyeongwoo Park
     * </pre>
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */
    private void displayJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayJButtonActionPerformed
        
         //date formatter for bill             
         DateFormat dateFormatter = new SimpleDateFormat("dd MMM, yyyy");
         Date today = new Date();
                
        
        double present = 0.0, previous = 0.0, total= 0.0;
        String name, message;
        message = "Please enter correct your information for all required fields. \n"
                   + "(Input only positive numbers for present and pevious electrocity.)";        
        
        //get inputs
        try{
            
            //get inputs
             present = (Double.parseDouble(presentJTextField.getText()));
             previous = (Double.parseDouble(previousJTextField.getText()));
             name = nameJComboBox.getSelectedItem().toString();
            //check exception situation in conditions        
            if((previous <= 0) || (present <= 0)) 
                {
                
                //showing message
                message = "Value of present and previous muse not be 0";
                    throw new NumberFormatException();
                
                }
            //check exception situation in conditions 
            else if((present < previous))
                {
                //showing message
                message = " Valae of present must be greater than value of previous ";
                throw new NumberFormatException();
                
                }
            //check exception situation in conditions 
            else if(((present - previous) == 0))
                {
                
                //showing message
                message = " You have not used electricity, so you don't have bill. ";
                throw new NumberFormatException();
                
                }
            else
                {
                //set bill's date
                dateJTextField.setText(dateFormatter.format(today));
                unitsJTextField.setText(String.valueOf(present - previous));        
                    
                    //declare invoice 
                    Invoice myBill = new Invoice(name, present, 
                                                previous);
                        //call Invoice to calculate electricity bill
                        total = myBill.calculateBill();
                 
                       //display the bill through Invoice 
                       display.delete(0, display.length());
                       display = myBill.displayBill();
                       billJTextArea.setText(display.toString()); 
                }
                
            } 
            
        //catching exception situation   
        catch(NumberFormatException numEx)
        {
            
         //showing a message about exception situation
        JOptionPane.showMessageDialog(null, message, "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        
        }
        
        
        
             
    }//GEN-LAST:event_displayJButtonActionPerformed
    /**
     * Method: printJButtonActionPerformed
     * prints the form
     * @param evt--java.awt.event.ActionEvent
     * @return void
     */
    private void printJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJButtonActionPerformed
       //using an exisiting helper file from
        //http://www.apl.jhu.edu/~hall/java/Swing-Tutorial/Swing-Tutorial/-Printing.html
        PrintUtilities.printComponent(this);      
        
    }//GEN-LAST:event_printJButtonActionPerformed
/**
     * Method: quitButtonActionPerformed
     * exits the program
     * @param evt--java.awt.event.ActionEvent
     * @return void
     */
    private void quitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitJButtonActionPerformed
        
        System.exit(0); //Exit
        
    }//GEN-LAST:event_quitJButtonActionPerformed
/**
     * Method: clearJButtonActionPerformed
     * clears all the textfields and resets combobox
     * @param evt 
     * @return void
     */
    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
       
        //renew the variable to calculate again with new input value  
        billJTextArea.setText("");
        presentJTextField.setText("");
        dateJTextField.setText("");
        previousJTextField.setText("");
        accountJFormattedTextField.setText("");
        unitsJTextField.setText("");
        nameJComboBox.setSelectedIndex(0);
        addressJTextField.setText("");
        cityJTextField.setText("");
        zipJTextField.setText("");
        statesJComboBox.setSelectedIndex(0);
        presentJTextField.requestFocus();
        
        
    }//GEN-LAST:event_clearJButtonActionPerformed
 /**
 * method : clearJMenuItemActionPerformed
 * acting like clear button 
 * @param evt java.awt.event.ActionEvent
 * @return void 
 */
    private void clearJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJMenuItemActionPerformed
        
        clearJButtonActionPerformed(evt);//acting like clearJButton
        
    }//GEN-LAST:event_clearJMenuItemActionPerformed
    /**
     * Method: printJMenuItemActionPerformed
     * prints the form
     * @param evt--java.awt.event.ActionEvent
     * @reture void
     */
    private void printJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJMenuItemActionPerformed
     
        printJButtonActionPerformed(evt);//acting like printJButton
        
    }//GEN-LAST:event_printJMenuItemActionPerformed
    /**
     * Method: quitJMenuItemActionPerformed
     * exits the program
     * @param evt--java.awt.event.ActionEvent
     * return void
     */
    private void quitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitJMenuItemActionPerformed
       quitJButtonActionPerformed(evt);//acting like quitJButton
    }//GEN-LAST:event_quitJMenuItemActionPerformed
    /**
     * Method: displayJMenuItemActionPerformed
     * display the electricity bill
     * @param evt--java.awt.event.ActionEvent
     * return void
     */
    private void displayJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayJMenuItemActionPerformed
       displayJButtonActionPerformed(evt);//acting like displayJButton 
    }//GEN-LAST:event_displayJMenuItemActionPerformed
    /**
     * Method: saveJMenuItemActionPerformed
     * display the electricity bill
     * @param evt--java.awt.event.ActionEvent
     * return void
     */
    private void saveJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJMenuItemActionPerformed
        
        //create file to write 
        try 
        {
            FileWriter fwrtier= new FileWriter("src/PUD/ElectricityBill.txt",true);
            PrintWriter outputFile = new PrintWriter(fwrtier);
            outputFile.println(display);
            outputFile.close();
            
        }
        catch(IOException exp)//catch error
        {
            
            exp.printStackTrace();
            
        }
        
    }//GEN-LAST:event_saveJMenuItemActionPerformed
 /**
     * Method: nameJComboBoxMouseClicked
     * display CUTOMER NAME
     * @param evt--java.awt.event.ActionEvent
     * return void
     */
    private void nameJComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameJComboBoxMouseClicked

    }//GEN-LAST:event_nameJComboBoxMouseClicked

    private void nameJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJComboBoxActionPerformed
        
        boolean found = false;
        String name = "", address = "", city = "", state = "", zip = "";
//        int zip = 0;
        String cutomerName = nameJComboBox.getSelectedItem().toString();
        
        // Find the employee in the Arrayist
        Iterator<Customer> custIterator = customerArrayList.iterator();
        //search for the selected employee
        while(custIterator.hasNext() && !found)
        {
            
            myCustomer = custIterator.next();
            if(cutomerName.contains(myCustomer.getCustomerName()))
            {
                found = true;
                
                //display the employee name and gross pay
                name = myCustomer.getCustomerName();
                address = myCustomer.getCustomerAddress();
                city = myCustomer.getCustomerCity();
                state = myCustomer.getCustomerState();
                zip = myCustomer.getCustomerZip();
                
                nameJComboBox.setSelectedItem(name);
                addressJTextField.setText(address);
                cityJTextField.setText(city);
                statesJComboBox.setSelectedItem(state); 
                zipJTextField.setText(zip);
            }
            
        }
    }//GEN-LAST:event_nameJComboBoxActionPerformed

    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    * Method: main()
    * Description: Call the constructor to create the form.
    * @return: void
    * @param: args are the command line strings
    * @author: Edgar Hyeongwoo Park
    * Date: 10/26/2015
    *<pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PUD_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PUD_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PUD_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PUD_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PUD_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PUDlogo;
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JFormattedTextField accountJFormattedTextField;
    private javax.swing.JLabel accountJLabel;
    private javax.swing.JMenu actionJMenu;
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JTextArea billJTextArea;
    private javax.swing.JPanel buttonJPanel;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JButton clearJButton;
    private javax.swing.JMenuItem clearJMenuItem;
    private javax.swing.JLabel dateJLabel;
    private javax.swing.JTextField dateJTextField;
    private javax.swing.JButton displayJButton;
    private javax.swing.JMenuItem displayJMenuItem;
    private javax.swing.JLabel electronicJLabel;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JLabel greetingJLabel;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JPanel invoiceJPanel;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel meterJLabel;
    private javax.swing.JComboBox nameJComboBox;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JLabel presentJLabel;
    private javax.swing.JTextField presentJTextField;
    private javax.swing.JLabel previousJLabel;
    private javax.swing.JTextField previousJTextField;
    private javax.swing.JButton printJButton;
    private javax.swing.JMenuItem printJMenuItem;
    private javax.swing.JMenuBar pudJMenuBar;
    private javax.swing.JScrollPane pudaddressJScrollPanel;
    private javax.swing.JTextArea pudaddressJTextArea;
    private javax.swing.JButton quitJButton;
    private javax.swing.JMenuItem quitJMenuItem;
    private javax.swing.JButton saveJButton;
    private javax.swing.JMenuItem saveJMenuItem;
    private javax.swing.JComboBox statesJComboBox;
    private javax.swing.JLabel statesJLabel;
    private javax.swing.JLabel unitsJLabel;
    private javax.swing.JTextField unitsJTextField;
    private javax.swing.JLabel zipJLabel;
    private javax.swing.JTextField zipJTextField;
    // End of variables declaration//GEN-END:variables
}
