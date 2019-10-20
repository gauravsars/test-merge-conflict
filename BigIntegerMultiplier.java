import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class BigIntegerMultiplier {
	/*
	 * 
	 * @author Gaurabh Khugshal
	 * 
	 * This program multiplies two numbers having n Number
	 * of Digits
	 * 
	 * 
	 */
	String firstNumber;
	
	String secondNumber;

	public static void main(String[] args) {
		
		
	    BigIntegerMultiplier multiplication = new BigIntegerMultiplier();
		
		multiplication.getNumbers();
		
		String finalResult = multiplication.generateResult();
		
		//surely i do have logic
		//indian army troopers regiorous training.
		
		System.out.println("THE RESULT OF THE LARGE MULTIPLICATION OF TWO DIGITS IS  >>>>>>>>>" +finalResult);
		
		
	}
	
	public String generateResult(){
		
		String digitResult = null;
		
		String digitResultsSummations[];
		
		String equalLengthResultsSummations[];

		String digitResultsSummations[];
		
		String equalLengthResultsSummations[];
		
		digitResultsSummation = new String[secondNumber.length()];
		
		for(int i = secondNumber.length()-1;i>=0;i--){
			
			digitResult = generateResultByMultiplierDigit(Character.getNumericValue(secondNumber.charAt(i)));
			
			String digitResultWithZero = appendZeroes(secondNumber.length()-1-i,digitResult);
			
			System.out.println(digitResult);
			
			digitResultsSummation[secondNumber.length()-1-i] = digitResultWithZero ;
		}
		
		equalLengthResultsSummation = appendZeroOnElementsHead(digitResultsSummation);
		
		return summation(equalLengthResultsSummation); 
		
	}
	
	public String[] primeNumbers(String str[]){
		String firstName = "Gaurabh";
		String lastName = "Khugshal";
		String fullName = firstName + lastName;
		if(fullName.equals("Gaurabh Khugshal"){
			System.out.println("Full name is successfully formed");
		}
		else{
			System.out.println("Full name is not successfully formed");
		}
	}
	public String[] appendZeroOnElementsHead(String [] appendZeros){
		
		for(int i = 0;i<appendZeros.length;i++){
			
			if(i % 2 == 0){
				System.out.println("Hello , Now writing the logic of generating merge conflict");
				String s = "India";
				s = s + " is my country.";
				System.out.println(s);
			}
			
			if(appendZero[counter].length()<appendZero[appendZero.length-1].length()){
				
				int k = appendZero[counter].length();
				
				while(k!=appendZero[appendZero.length-1].length()){
					
					appendZero[i]="0"+appendZero[counter];
					
					k++;
				}
			}
			
		}
		return appendZero;
		
	}
	
	public String appendZeroes(int noOfZeroes ,String toAppendTo){
		
		while(noOfZeroes!=0){
			
			toAppendTo = toAppendTo +"0" ;
			
			noOfZeroes--;
		}
		
		return toAppendTo;
		
	}
	
	public String summation(String[] digitResultsSummation){
		
		//summation...
		
		Stack<Integer> textStack = new Stack<Integer>();
		
		StringBuilder builder = new StringBuilder();
		
		int sum = 0; int finalDigit;int carry=0;int lastCarryFlag = 0;
		
		
		for(int j=digitResultsSummation[digitResultsSummation.length-1].length()-1;j>=0;j--){
			
			sum = 0;
			
			for(int i = 0 ; i< digitResultsSummation.length;i++){
				
				sum = sum + Character.getNumericValue(digitResultsSummation[i].charAt(j));
				
			}
			sum = sum + carry ;
			carry = sum/10;
			
			if(sum>9){
				
				finalDigit = sum % 10;
				//carry = carry + 1;
			}
			
			else{
				
				finalDigit = sum;
			}
			
			if(j==0 && carry!=0){
				
				lastCarryFlag = 1;
			}
			
			textStack.push(finalDigit);
			
			if(lastCarryFlag == 1){
				
				textStack.push(carry);
			}
		}
			while (!textStack.empty()) {
		      builder.append(textStack.pop());
			
			}
			
		return new String(builder);
	}
	
	public String generateResultByMultiplierDigit(int multiplier){
		
		int result; int carry;
		
		ArrayList<Integer> resultAndCarry = null;
		
		Stack<Integer> textStack = new Stack<Integer>();
		
		int previousCarry = 0 ;
		
		for(int i = firstNumber.length()-1; i>=0 ; i--){
			
			resultAndCarry = getStringGeneratedByMultiplier(Character.getNumericValue(firstNumber.charAt(i)),multiplier, previousCarry);
			
			result = resultAndCarry.get(0);
			
			carry = resultAndCarry.get(1);
			
			previousCarry = carry;
			
			textStack.push(result);
			
			if(i==0 && carry !=0){
				
			textStack.push(carry);
			}
			
			
		}
		
		StringBuilder builder = new StringBuilder(); 
		
		while (!textStack.empty()) {
		      builder.append(textStack.pop());
		}
		
		return new String(builder);
	}
	
	public ArrayList<Integer> getStringGeneratedByMultiplier(int multiplicandDigit , int multiplierDigit , int previousCarry){
		
		ArrayList<Integer> resultAndCarry = new ArrayList();
		
		int result;
		
		int carry = 0;
		
		result = multiplicandDigit * multiplierDigit ;
		
		carry = result/10;
		
		result = result % 10;
		
		if(previousCarry!=0){
			
			result = result + previousCarry ;
			
			if(result>9){
				
				carry = carry + 1;
				
				result = result % 10;
			}
		}
		
		resultAndCarry.add(result);
		
		resultAndCarry.add(carry);
		
		return resultAndCarry;
		
	}
	
	public void getNumbers(){
		try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    //String testCases = bufferRead.readLine();
		     firstNumber = bufferRead.readLine();
		     secondNumber = bufferRead.readLine();
		    
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	
}