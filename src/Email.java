import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;  // you have to put in the password length for this to generate a random password of 10 chars or whatever # you put in
    private String alternateEmail;
    private String companySuffix = "AIGcompany.com";

    // constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    //    System.out.println("Email Created: " + this.firstName + " " + this.lastName); // I commented this out because we dont need to see when we print the showInfo method to the user

        // call a method asking for the department - return the department
        this.department = setDepartment();
    //    System.out.println("Department: " + this.department);  // I commented this out because we dont need to see when we print the showInfo method to the user

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;  // toLowercase amkes sure that the email is all lowercase for first and last name
   //     System.out.println("Your email is: " + email);   // I commented this out because we dont need to see when we print the showInfo method to the user


    } // end of email constructor



    // Ask for the department
    private  String setDepartment(){    // \n1, \n2 , \n3 , \n0 are the input options for the user to enter 1, 2, 3, 0
        System.out.println("New Employee: " + firstName + ". Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner inScanner = new Scanner(System.in);
        int depChoice = inScanner.nextInt();
        if (depChoice == 1){return  "sales";}
        else if (depChoice == 2) {return "dev";}
        else if (depChoice == 3) {return "acct";}
        else { return "";}
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char [] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // set mailbox capacity;
    public void setMailBoxCapacity(int capacity){  // this is encapsulation were we are hiding the properties
        this.mailBoxCapacity = capacity;
    }

    // Set alternate email using a method
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password by using a method
    public void changePassword(String password){
        this.password = password;
    }
    public int getMailBoxCapacity(){return mailBoxCapacity;}  // these are public methods that will access the property
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    public String showInfo() {
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +    // \n moves the company email to the next line
                "\nMailbox Capacity: " + mailBoxCapacity + "mb";   // \n moves the mailBoxCapacity to the next line to make it look cleaner for the user to see
    }


} // end of email class
