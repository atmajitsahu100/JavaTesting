public class NullPtr{
    public static void main(String[] args) {
        String myString = null;
        try{
            int length = myString.length();
            System.out.println("Length of the string: " + length);
        }
    }
}
