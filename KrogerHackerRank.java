import java.util.*;

public class KrogerHackerRank {
    public static void main(String[] args) {

    }

    public static int getUniqueCharacter(String s) {
        // Write your code here

        //created hashmap map is gonna map from a character to an integer
        HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
        //created a for loop to iterate through the string
        for (int i = 0; i < s.length(); i++) {
            //now we wanna check to character, its in our map or we havent seen the character
            //I'm storing the current character to currentCharacter to check map has it or not
            char currentCharacter = s.charAt(i);
            //if our map doesnt containt the current ch we gonna put current ch index
            if (!hMap.containsKey(currentCharacter)) {
                hMap.put(currentCharacter, i);
            } else {
                //if we seen the character before means map does contains the key we will
                //invalidate that index with adding -1
                //if we see -1 its not a solution because -1 is not a valid index
                hMap.put(currentCharacter, -1);
            }
        }

        //minimum index that we've seen a unique character
        int minIndex = Integer.MAX_VALUE;
        //so we're going to go through in our maps
        for (char c : hMap.keySet()) {
            // if .get(c) greater than negative means its unique
            if (hMap.get(c) > -1 && hMap.get(c) < minIndex) {
                minIndex = hMap.get(c);
            }
        }

        // if min == max value means there is no unique ch so we return -1
        //otherwise we wanna return our actually minimum index
        if (minIndex == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minIndex;
        }
    }

    public static String sort(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static List<String> funWithAnagrams(List<String> text) {
        // Write your code here
        List<String> answers = new ArrayList<>();
        HashSet<String> found = new HashSet<>();
        for(String word : text){
            String key = sort(word); // other function
            //after the string sorted we compare whether the key exist in hast set or not
            if(!found.contains(key)){
                answers.add(word);
                found.add(key);
            }
        }
        //returning sorted string with removed anagrams
        return answers;
    }


}
