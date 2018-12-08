package latihan5;
class ThrowDemo {
    public static void main(String[] args){
        String input = "Invalid input";
    
    try {
        if (input.equals("Invalid input")) {
            throw new RuntimeException("throw demo");
        } else {
            System.out.println("After throwing");
        }
    }
    catch(RuntimeException e) {
        System.out.println("Exception caught here.");
        System.out.println(e);
    }
    }
}
