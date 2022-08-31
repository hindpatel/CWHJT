package JTCWH;

public class JT10StringMethods {

    public static void main(String[] args) {

        /*String a = "Hind";
        String a1 = new String("Hind");*/
        String name = "HindPatel";
                     //012345678
/*        int value = name.length();
        System.out.println(value);

        String tlctring = name.toLowerCase();
        System.out.println(tlctring);

        String tucstring = name.toUpperCase();
        System.out.println(tucstring);

        String nonTrimmedString  = "      Hind       ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        //OR
        //System.out.println(nonTrimmedString.trim());*/

        //System.out.println(name.substring(1,6));

        //System.out.println(name.replace('i','a'));

/*        System.out.println(name.startsWith("Hind"));
        System.out.println(name.endsWith("tel"));*/

 /*       System.out.println(name.charAt(0));

        System.out.println(name.indexOf("Patel"));*/

        String modifiedName = "HindPatelteltel";
                             //012345678911234
        System.out.println(modifiedName.indexOf("tel", 5));
        System.out.println(modifiedName.lastIndexOf("tel", 13));

        System.out.println(name.equals("HindPatel"));
        System.out.println(name.equalsIgnoreCase("hindpAtel"));

        System.out.println("I am escape seq\n \r \" \\ double \t quotes\b \". ");





    }
}
