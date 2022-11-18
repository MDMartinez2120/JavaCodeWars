import java.util.stream.Collectors;

public class Solutions {

    public class CodeWars {
        public static int strCount(String str, char letter) {
            int count = 0;

            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == letter){
                    count++;
                }
            }
            return count;
        }
    }
    ///////////////////////////////////////////////////////////////////
    public class Counter {
        public int countSheeps(Boolean[] arrayOfSheeps) {
            int count = 0;

            for (int i = 0; i < arrayOfSheeps.length; i++){
                if (arrayOfSheeps[i] != null && arrayOfSheeps[i] == true){
                    count++;
                }
            }
            return count;
        }
    }
    ///////////////////////////////////////////////////////////////////
    public class TotalPoints {

        public static int points(String[] games) {
            int totalPoints = 0;

            for (String item:games){
                int x = (int) item.charAt(0);
                int y = (int) item.charAt(2);

                if (x > y){
                    totalPoints += 3;
                }else if (x == y){
                    totalPoints++;
                }
            }
            return totalPoints;
        }
    }
    ///////////////////////////////////////////////////////////////////
    public class Solution {

        public static int areaOrPerimeter (int l, int w) {
            if (l == w){
                return l * w;
            }else {
                return l*2 + w*2;
            }
        }
    }
    ///////////////////////////////////////////////////////////////////
    public class Kata{

        public static String switchItUp(int number){
            String numString = "";

            switch(number){
                case 0:
                    numString = "Zero";
                    break;
                case 1:
                    numString = "One";
                    break;
                case 2:
                    numString = "Two";
                    break;
                case 3:
                    numString = "Three";
                    break;
                case 4:
                    numString = "Four";
                    break;
                case 5:
                    numString = "Five";
                    break;
                case 6:
                    numString = "Six";
                    break;
                case 7:
                    numString = "Seven";
                    break;
                case 8:
                    numString = "Eight";
                    break;
                case 9:
                    numString = "Nine";
                    break;
            }
            return numString;
        }

    }
    ///////////////////////////////////////////////////////////////////
    public class Solution2 {

        public static String repeatStr(final int repeat, final String string) {
            String repeated = string.repeat(repeat);
            return repeated;
        }

    }
    ///////////////////////////////////////////////////////////////////
    public class Troll {
        public static String disemvowel(String str) {
            return str.replaceAll("[aeiouAEIOU]", "");
        }
    }
    ///////////////////////////////////////////////////////////////////
    public class Vowels {

        public static int getCount(String str) {
            int count = 0;

            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                    count++;
            }
            return count;
        }

    }
    ///////////////////////////////////////////////////////////////////
    public static String swap(String st){

        return st.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o", "O").replaceAll("u", "U");

    }
    ///////////////////////////////////////////////////////////////////
    public class Square {
        public static boolean isSquare(int n) {
            if (Math.ceil((double)Math.sqrt(n)) ==
                    Math.floor((double)Math.sqrt(n))){
                return true;
            }else {
                return false;
            }
        }
    }
    ///////////////////////////////////////////////////////////////////
     public static String highAndLow(String numbers) {
            String[] array = numbers.split(" ");
            String highest = array[0];
            String lowest = array[0];

            for (int i = 0; i < array.length; i++){
                if (Integer.parseInt(highest) <= Integer.parseInt(array[i])){
                    highest = array[i];
                }else if(Integer.parseInt(lowest) >= Integer.parseInt(array[i])){
                    lowest = array[i];
                }
            }
            return (highest + " " + lowest);
        }

    ///////////////////////////////////////////////////////////////////
    public class Movie {

        public static int movie(int card, int ticket, double perc) {
            int visits = 0;
            double systemA = 0;
            double systemB = card;

            while (Math.ceil(systemB) >= systemA) {
                visits++;
                systemA += ticket;
                systemB += ticket * Math.pow(perc, visits);
            }
            return visits;
        }
    }
    ///////////////////////////////////////////////////////////////////
    public class XO {

        public static boolean getXO (String str) {

            String xValues = str.replaceAll("[^xX]", "");
            String oValues = str.replaceAll("[^oO]", "");

            return xValues.length() == oValues.length();

        }
    }
    ///////////////////////////////////////////////////////////////////
    public class FindDivisor {

        public long numberOfDivisors(int n) {
            long counter = 0;

            for (int i = 1; i <= n; i++){
                if (n % i == 0){
                    counter++;
                }
            }
            return counter;
        }

    }
    ///////////////////////////////////////////////////////////////////
    public class Solution {

        public static boolean isAscOrder(int[] arr) {
            for (int i = 0; i < arr.length-1; i++){
                if (arr[i] >= arr[i+1]){
                    return false;
                }
            }
            return true;
        }

    }
    ///////////////////////////////////////////////////////////////////
    public static String toAlternativeString(String string) {
        return String.join("", string.chars().mapToObj(c -> Character.isLetter(c) ? Character.isLowerCase​(c) ? (""+(char) Character.toUpperCase​(c)) :  (""+ (char)Character.toLowerCase​(c)) :  (""+ (char) c)).collect(Collectors.toList()));
    }
    ///////////////////////////////////////////////////////////////////
    public class StringToNumber {
        public static int stringToNumber(String str) {
            int convert =Integer.parseInt(str);
            return convert;
        }
    }
    ///////////////////////////////////////////////////////////////////
    class SolutionRemove {
        static String removeExclamationMarks(String s) {
            String removed = s.replaceAll("!", "");
            return removed;
        }
    }
    ///////////////////////////////////////////////////////////////////
    public class HelpAlex{
        public static String hoopCount(int n){
            String good = "Great, now move on to tricks";
            String alright = "Keep at it until you get it";
            if (n < 10){
                return alright;
            }else {
                return good;
            }
        }
    }
    ///////////////////////////////////////////////////////////////////
    public class OppositesAttract {

        public static boolean isLove(final int flower1, final int flower2) {
            boolean petals1 = (flower1 % 2) == 0;
            boolean petals2 = (flower2 % 2) == 0;

            if (petals1 != petals2) {
                return true;
            }
            return false;

        }

    }
    ///////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

    }
}
