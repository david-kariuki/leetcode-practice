/**
 * @note Google Interview -> Interview Process -> Unique Email Addresses
 * @author David Kariuki
 * @since 17/01/2023
 */
package dk.learning.practice_dsa.google_interview.a_interview_process.unique_email_addresses;

import java.util.HashSet;
import java.util.Set;

public class MySolution {

  /**
   * Main method
   *
   * @param args - String[]
   */
  public static void main(String[] args) {

    String[] emailAddresses =
        new String[] {
          "test.email+alex@leetcode.com",
          "test.e.mail+bob.cathy@leetcode.com",
          "testemail+david@lee.tcode.com"
        };

        System.out.println(numUniqueEmails(emailAddresses));
    }

    /**
     * Method to find the unique emails
     *
     * @param emailAddresses - String
     * @return int - number of unique email addresses
     */
    public static int numUniqueEmails(String[] emailAddresses) {

        Set<String> uniqueEmailAddresses = new HashSet<>(); // Set to hold unique email addresses

        // Loop String array
        for (String emailAddress : emailAddresses) {

            String[] splitEmailAddress = emailAddress.split("@"); // Split email address
            String localNamePart = splitEmailAddress[0];
            String domainPart = splitEmailAddress[1];

            localNamePart = localNamePart.replace(".", ""); // Replace dots with nothing

            // Check for + sign
            if (localNamePart.contains("+")) {
                localNamePart = localNamePart.substring(0, localNamePart.indexOf("+")); // Trim upto + sign
            }

            uniqueEmailAddresses.add(localNamePart + "@" + domainPart); // Add email address to set
        }

        return uniqueEmailAddresses.size(); // Return set size
    }
}
