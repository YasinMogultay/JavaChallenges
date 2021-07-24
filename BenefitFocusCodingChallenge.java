public class BenefitFocusCodingChallenge {
    public static final int SIZE = 26;//alphabet size

    public static void printLetterFrequency(String str) {
        int n = str.length();//size of string
        int[] freq = new int[SIZE];

        //frequency each char in given string
        for (int i = 0; i < n; i++) {
            freq[str.charAt(i) - 'a']++;
        }
        //if frequency != 0 print char along with frequency
        for (int i = 0; i < n; i++) {
            if (freq[str.charAt(i) - 'a'] != 0) {
                System.out.print(str.charAt(i));
                System.out.print(freq[str.charAt(i) - 'a']);
                //update freq of char to 0 to avoid print same char again
                freq[str.charAt(i) - 'a'] = 0;
            }
        }
    }

    // Driver program to test above
    public static void main(String args[]) {
        String str = "aabcccdde";
        printLetterFrequency(str);
    }
}
