import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        boolean creating = true;
        Scanner snext = new Scanner(System.in);

        System.out.println("Please type a passowrd to check.");
        String main;

        while(creating){

            main = snext.nextLine();

            if(main.length() <= 7 || main.length() >= 17){
                System.out.print("Password must be within 8 to 16 characters long.\nPlease try again: ");
                continue;
            }
            else{
                if(hasUpperAndLower(main)){
                    if(hasNumbers(main)){
                        if(hasSymbols(main)){
                            System.out.println("This password is great!");
                            break;
                        }
                        else{
                            System.out.print("Password must contian one of these symbols; !@#$%^&*()-=+_\nPlease try again: ");
                        }
                    }
                    else{
                        System.out.print("Password must contain some numnbers.\nPlease try agian: ");
                    }
                }
                else{
                    System.out.print("Password must have both uppercase and lowercase lettering.\nPlease try again: ");
                }
            }

            
        }
        snext.close();
    }

    public static boolean hasUpperAndLower(String input){
            
        return input.matches(".*[a-z].*") && input.matches(".*[A-Z].*");
    }

    public static boolean hasNumbers(String input){
            
        return input.matches(".*\\d.*");
    }

    public static boolean hasSymbols(String input){
            
        return input.matches(".*[!@#$%^&*()\\-=+_].*");
    }
}
