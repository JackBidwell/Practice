

class stringclass {

    public static void main(String[] args){

        String name = "Jack";

        /* result of if the string is compared to the value
        boolean result = name.equals("Jack");
        */
        /* Count the charecters in a string name
        int result = name.length();
        */
        //char result = name.charAt(0);
        //int result = name.indexOf("J");
        //boolean result = name.isEmpty();
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim()
        String result = name.replaceAll(name, "AHHH");

        System.out.println(result);

    }

}
