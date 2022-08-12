package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
    	int sum = 0, reminder = 0;
    	//first 
    	reminder = number%10;
    	sum += reminder;
    	number /= 10;
    	//second 
    	reminder = number%10;
    	sum += reminder;
    	number /= 10;
    	//third 
    	reminder = number%10;
    	sum += reminder;
    	number /= 10;
    	//fourth 
    	reminder = number%10;
    	sum += reminder;
    	number /= 10;
    	System.out.println(sum);
    }
    /**
    public static void main(String[] args) {
    	DigitsSumCalculator dsc = new DigitsSumCalculator();
    	dsc.calculateSum(5959);
    }
    **/    
}