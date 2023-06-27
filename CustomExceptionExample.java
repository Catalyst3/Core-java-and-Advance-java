package ExceptionHandling;

public class CustomExceptionExample {
	    public static void main(String[] args) {
	        try {
	            validateAge(15);
	        } catch (InvalidAgeException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }

	    public static void validateAge(int age) throws InvalidAgeException {
	        if (age < 18) {
	            throw new InvalidAgeException("Invalid age: " + age);
	        } else {
	            System.out.println("Age is valid: " + age);
	        }
	    }
	}
	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}
