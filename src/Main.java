public class Main {   // title: email app

    /* Once completed, the program should do a few things:

    • It should generate a new email based on the employee’s first name, last name, and department.
    • Generate a random string for their password.
    • Have set methods to change the password.
    • Have get methods to display name, email, and mailbox capacity.  */


    public static void main(String[] args) {

        Email email1 = new Email("John", "Doo");   // all this code with only 1 constructor

    //   email1.setAlternateEmail("jd@gmail.com");  // this sets what the alternate email will be this will come after the company email
    //    System.out.println(email1.getAlternateEmail());

        System.out.println(email1.showInfo());  // println printsout all the info in the showInfo variable method we created in the email class



    } // end of amin method


} // end of main class