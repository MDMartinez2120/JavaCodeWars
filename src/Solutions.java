import java.util.Arrays;
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
        return String.join("", string.chars().mapToObj(c -> Character.isLetter(c) ? Character.isLowerCase???(c) ? (""+(char) Character.toUpperCase???(c)) :  (""+ (char)Character.toLowerCase???(c)) :  (""+ (char) c)).collect(Collectors.toList()));
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
    public class Money {
        public static int calculateYears(double principal, double interest,  double tax, double desired) {
            int years = 0;
            while (principal < desired) {
                principal += (principal * interest) * (1 - tax);
                years++;
            }
            return years;
        }
    }
    ///////////////////////////////////////////////////////////////////
    public class SquareDigit {

        public int squareDigits(int n) {
            String strng = n + "";
            String[] digits = strng.split("");
            String output = "";

            for (String str : digits) {
                int i = Integer.parseInt(str);
                output +=  i * i;
            }
            return Integer.parseInt(output);
        }

    }

    ///////////////////////////////////////////////////////////////////
    public class DescendingOrder {

        public static int sortDesc(final int num) {
            char[] splitNums = Integer.toString(num).toCharArray();
            Arrays.sort(splitNums);

            char[] orderedNums = new char[splitNums.length];
            for (int i = splitNums.length -1, j = 0; i >= 0; i--, j++){
                orderedNums[j] = splitNums[i];
            }
            return Integer.parseInt(new String(orderedNums));
        }

    }
    ///////////////////////////////////////////////////////////////////
    public class Solution {

        public int solution(int number) {
            int total = 0;

            for (int i = 1; i < number; i++){
                if (i % 3 == 0 && i % 5 == 0){
                    total += i;
                }else if (i % 3 == 0 || i % 5 == 0){
                    total += i;
                }

            }
            return total;
        }

    }
    ///////////////////////////////////////////////////////////////////
    public class SpinWords {

        public String spinWords(String sentence) {
            String out = null;
            String[] array = sentence.split(" ");
            for (int i = 0; i <= array.length - 1; i++) {
                array[i] = array[i].length() >= 5 ? array[i] = new StringBuffer(array[i]).reverse().toString() : array[i];
            }
            out = Arrays.toString(array);
            return out = out.substring(1, out.length() - 1).replaceAll(",", "");
        }
    }
    ///////////////////////////////////////////////////////////////////
    public static String getMiddle(String word) {
        int position;
        int length;

        if (word.length() % 2 == 0)
        {
            position = word.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = word.length() / 2;
            length = 1;
        }
        return word.substring(position, position + length);
    }
    ///////////////////////////////////////////////////////////////////
    public class FindOdd {
        public static int findIt(int[] a) {

            for(int i = 0; i < a.length; i++){
                int num = a[i];
                int count = 0;

                for (int j = 0; j < a.length; j++){
                    if (a[j] == num){
                        count++;
                    }
                }

                if (count % 2 != 0){
                    return num;
                }

            }

            return 0;
        }
    }
    ///////////////////////////////////////////////////////////////////
    public static String whoLikesIt(String... names) {
        int length = names.length;

        switch(length){
            case 0:
                return "no one likes this";
            case 1:
                return String.format("%s likes this", names[0]);
            case 2:
                return String.format("%s and %s like this", names[0], names[1]);
            case 3:
                return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default:
                return String.format("%s, %s and %d others like this", names[0], names[1], length-2);
        }
    }
    ///////////////////////////////////////////////////////////////////
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2]
                ,numbers[3],numbers[4],numbers[5],
                numbers[6],numbers[7],numbers[8],numbers[9]);
    }
    ///////////////////////////////////////////////////////////////////
    public static int countBits(int n){
        return Integer.bitCount(n);
    }
    ///////////////////////////////////////////////////////////////////
    public static String accum(String s) {
        StringBuilder bldr = new StringBuilder();
        int i = 0;
        for(char c : s.toCharArray()) {
            if(i > 0) bldr.append('-');
            bldr.append(Character.toUpperCase(c));
            for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
            i++;
        }
        return bldr.toString();
    }
    ///////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

    }
}
