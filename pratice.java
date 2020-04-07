import java.util.*;

public class pratice{
	public static void main(final String[] arg){
		final Date date = new Date();
		final String dateString = date.toString();
		Scanner scanner = new Scanner(System.in);
		final ArrayList<Double> arrayList = new ArrayList<Double>();
		System.out.println(" ");
		System.out.print("Time is  ");
		System.out.println(dateString);
		System.out.println("");
		System.out.println("Please enter the number you want to enter.");
		while(true){
			try{
				String nextString = scanner.next();
				if(nextString.equals("X")||nextString.equals("x"))
					break;
				Double nextNum = Double.parseDouble(nextString);		
				arrayList.add(nextNum);
				System.out.println(arrayList.toString());
			}
			catch(final Exception e){
				System.err.println("-- Invalid Input --");
				System.out.println(arrayList.toString());
				scanner = new Scanner(System.in);
			}
		}
		scanner.close();
		Double sum = 0.0d; 
		for(final Double number:arrayList){
			sum = sum + number;
		}
		System.out.println("---------------------------");
		System.out.println("");
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + sum/arrayList.size());
	}
} 
