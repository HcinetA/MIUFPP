public class RecString

{
    public char FindMinChar(String str) {

        if (str.isEmpty()) {
            System.out.println("Empty String " );
        }

        else if (str.length() == 1)  {

            return  str.charAt(0);
        }

        char firstChar = str.charAt(0);
        String restOfString = str.substring(1);
        char minChar = FindMinChar(restOfString);

        if (firstChar < minChar) {
            return firstChar ;
        }
        else
            return minChar;


    }

    public static void main(String[] args) {
        RecString rs = new RecString();
        char result = rs.FindMinChar("zidmin");
        System.out.println("the minimum char: " + result);
    }
}
