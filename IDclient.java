import java.util.Scanner;
import java.util.function.Function;
public class IDclient{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter the ID :");
        String inputID = reader.nextLine().toUpperCase();
        if(IDAuth.TaiwanID(inputID))
            System.out.println("\u001B[32mThis ID format is consistent.\u001B[0m");
        else
            System.out.println("\u001B[31mThis ID formate is not consistent.\u001B[0m");
        System.out.print("Please enter the Gmail :");
        inputID = reader.nextLine();
        Function<String,Boolean> func = m -> {return mailMethod(m);};
        if(IDAuth.selfDefineFormat(inputID, func))
            System.out.println("\u001B[32mThis Gmail format is consistent.\u001B[0m");
        else
            System.out.println("\u001B[31mThis Gmail formate is not consistent.\u001B[0m");
        reader.close();
    }
    private static Boolean mailMethod(String Gmail){
        String mailEL = "[a-zA-Z0-9]{8,}@gmail.com";
        if(Gmail.matches(mailEL))
            return true;
        else
            return false;
    }
}