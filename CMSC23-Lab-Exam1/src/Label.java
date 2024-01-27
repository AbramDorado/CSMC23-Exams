import java.util.StringTokenizer;

public class Label {
    static StringTokenizer theString;
    static String[] arrString;
    static String[] arrNew;
    static char[] arrStore;
    static StringBuilder builder;

    private static void convertToLower(String[] arrString, String[] arrNew, StringTokenizer theString){
        //make the string to lower case
        for (int i = 0; i < arrString.length; i++) {
            String newString = theString.nextToken().toLowerCase();
            arrString[i] = newString.trim();
        }
    }

    private static void moveString(){
        for (int j = 0; j < arrString.length; j++) {
            if(j == 0 || j == 1)
                arrNew[j] = arrString[j];
            else
                arrNew[1] = arrNew[1] + ", " + arrString[j];
        }
    }

    private static void stringComparison(char[] arrStore, StringBuilder builder){
        int set =0;
        for (Character letter : arrStore) {
            if (letter.toString().compareToIgnoreCase("a") == 0 ||
                    letter.toString().compareToIgnoreCase("e") == 0 ||
                    letter.toString().compareToIgnoreCase("i") == 0 ||
                    letter.toString().compareToIgnoreCase("o") == 0 ||
                    letter.toString().compareToIgnoreCase("u") == 0) {
            }
            else {
                if (set == 0 && Character.isAlphabetic(letter)) {
                    builder.append(letter.toString().toUpperCase());
                    set = 1;
                } else
                    builder.append(letter);
            }
        }
    }

    //printLabel method
    private static void printLabel(String nameAndAddress){
        //separate by comma
        theString = new StringTokenizer(nameAndAddress, ",");
        arrString = new String[theString.countTokens()];
        arrNew = new String[2];

        convertToLower(arrString, arrNew, theString);
        moveString();

        for (int i = 0; i < arrNew.length; i++) {
            String newString = arrNew[i];

            arrStore = newString.toCharArray();
            builder = new StringBuilder();

            stringComparison(arrStore, builder);
            arrNew[i] = builder.toString();
        }
        for (String stringFinal : arrNew)
            System.out.println(stringFinal);
    }

    public static void main (String[] args){
        System.out.println("Example:");
        System.out.println("David Jonathan Pasumbal, 1234 Padre Faura St., Ermita, Manila, 1000");
        System.out.println("Output:");
        printLabel("David Jonathan Pasumbal, 1234 Padre Faura St., Ermita, Manila, 1000");
    }

}
