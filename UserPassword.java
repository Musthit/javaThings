
package com.mycompany.javacollections;
import java.util.HashMap;
import java.util.Scanner;

/**º
 *
 * @author mushit
 * User&Password 0.1
 */
public class UserPassword {

    public static void main(String[] args) {
        /*Implement access control to the restricted area of a program. 
        A username and password should be requested. If the user enters the data correctly, the program will display 'Access granted to the restricted area.
        ' The user will have a maximum of 3 attempts. If the attempts are exhausted, the program will display 'Sorry, you do not have access to the restricted area.'
        Usernames with their corresponding passwords should be stored in a HashMap data structure.*/

        HashMap<String, String> user = new HashMap();
        //You can add users with his passwords with 'user.put(key:"username",value:"password")'.
        user.put("user1", "user1password");
        user.put("user2", "user2password");
        user.put("user3", "user3password");

        Scanner tec = new Scanner(System.in);
        //Number of tries 
        int logintry = 3;
        
        String usu;
        System.out.println("Restricted area access, please identify yourself. (You have " + logintry + " attemps left)");
        do {
            for (int i = 0; i < 3; i++) {
                System.out.print("User: ");
                usu = tec.next();
                if (user.containsKey(usu)) {
                    System.out.print("Password: ");
                    String password = tec.next();
                    if (password.equals(user.get(usu))) {
                        System.out.println("Access granted to the restricted area, Welcome " + usu);
                        return;
                    } else {
                        System.out.println("Incorrect Password.");
                        logintry--;
                        System.out.println("Nº of available attempts: " + logintry);
                    }
                } else {
                    System.out.println("Incorrect user.");
                    logintry--;
                    System.out.println("Nº of available attempts: " + logintry);
                }
                if (logintry == 0) {
                    System.out.println("Sorry, you do not have access to the restricted area. Exiting...");
                    return;
                }
            }
        } while (true);
    }
}
