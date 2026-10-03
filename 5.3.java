class StringNotValidException extends Exception {

    StringNotValidException(String message) {
        super(message);
    }
}

public class Main {

    static void checkString(String str) throws StringNotValidException {

        if (!str.matches(".*[aeiouAEIOU].*")) {
            throw new StringNotValidException("String does not contain any vowel");
        }

        System.out.println("String is valid");
    }

    public static void main(String[] args) {

        try {
            checkString("rhythm");
        } catch (StringNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}