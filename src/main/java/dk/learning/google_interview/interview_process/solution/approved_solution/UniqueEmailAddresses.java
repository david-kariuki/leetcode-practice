/**
 * @note Google Interview -> Interview Process -> Unique Email Addresses
 * @author David Kariuki
 * @since 17/01/2023
 */

package dk.learning.google_interview.interview_process.solution.approved_solution;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {


    /**
     * Main method
     *
     * @param args - String[]
     */
    public static void main(String[] args) {

        String[] emailAddresses = new String[]{
                "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"
        };

        System.out.println(numUniqueEmails(emailAddresses));
    }

    /**
     * Method to find the unique emails
     *
     * @param emails - String
     * @return int - number of unique email addresses
     */
    public static int numUniqueEmails(String[] emails) {
        // hash set to store all the unique emails
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            StringBuilder cleanMail = new StringBuilder();

            // iterate over each character in email
            for (int i = 0; i < email.length(); ++i) {
                char currChar = email.charAt(i);

                // stop adding characters to localName
                if (currChar == '+' || currChar == '@') break;

                // add this character if not '.'
                if (currChar != '.') cleanMail.append(currChar);
            }

            // compute domain name (substring from end to '@')
            StringBuilder domainName = new StringBuilder();

            for (int i = email.length() - 1; i >= 0; --i) {
                char currChar = email.charAt(i);
                domainName.append(currChar);
                if (currChar == '@') break;
            }

            domainName = domainName.reverse();
            cleanMail.append(domainName);
            uniqueEmails.add(cleanMail.toString());
        }

        return uniqueEmails.size();
    }
}
