package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
    	int reminder, reverse = 0;
    	// first digit
    	reminder = number%10;
    	reverse = reverse*10+reminder;
    	number /= 10;
    	//second digit
    	reminder = number%10;
    	reverse = reverse*10+reminder;
    	number /= 10;
    	//third digit
    	reminder = number%10;
    	reverse = reverse*10+reminder;
    	number /= 10;
    	/**
    	while (number !=0) {
    		reminder = number%10;
    		reverse = reverse*10+reminder;
    		number = number/10;
    	}
    	**/
    	System.out.println(reverse);
    }    
}


