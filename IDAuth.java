import java.util.function.Function;

public class IDAuth {
    public static Boolean TaiwanID(String id){
        String idEL = "[A-Z][12][0-9]{8,8}";
        if(id.matches(idEL)){
            char firstAph = id.charAt(0);
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
            int idAuthNum = firstNum/10 + (firstNum%10)*9 + Character.getNumericValue(id.charAt(9));
            for(int i = 1; i<=8; i++){
                idAuthNum += Character.getNumericValue(id.charAt(i))*(9-i);
            }
            if(idAuthNum%10 == 0)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public static Boolean selfDefineFormat(String id,Function<String,Boolean> func){
        return func.apply(id);
    }
}