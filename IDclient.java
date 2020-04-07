import java.util.Scanner;

public class IDclient{
    public static void main(String[] args){
        String idEL = "[A-Z][12][0-9]{8,8}";
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter the ID :");
        String inputID = reader.nextLine().toUpperCase();
        if(inputID.matches(idEL)){
            char firstAph = inputID.charAt(0);
            int firstNum = 0;
            if(firstAph <= 'H'){
                firstNum = (int)firstAph - 55;
            }else if(firstAph == 'I'){
                firstNum = 34;
            }else if(firstAph <= 'N'){
                firstNum = (int)firstAph - 56;
            }else if(firstAph == 'O'){
                firstNum = 35;
            }else{
                firstNum = (int)firstAph - 57;
            }
            int idAuthNum = firstNum/10 + (firstNum%10)*9 + Character.getNumericValue(inputID.charAt(9));
            for(int i = 1; i<=8; i++){
                idAuthNum += Character.getNumericValue(inputID.charAt(i))*(9-i);
            }
            if(idAuthNum%10 == 0)
                System.out.println("\u001B[32mThis ID format is consistent.\u001B[0m");
            else
                System.out.println("\u001B[31mThis ID formate is not consistent.\u001B[0m");
        }
        else
            System.out.println("\u001B[31mThis ID formate is not consistent.\u001B[0m");
        reader.close();
    }
}