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

    public static void main(String[] args) {

    }
}
