import javax.swing.JOptionPane;

public class SumOfIntegers {

	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("Please enter the "
				+ "LAST NUMBER"
				+ "\n        in your "
				+ "range of numbers"
				+ "\n             to be summed: ");
		
		int rangeNum = Integer.parseInt(userInput);
		
		//do something to run sum of numbers algorithm
		JOptionPane.showMessageDialog(null, "The sum of numbers from 1 to " +
		rangeNum + " is " + new SumOfIntegers().rangeNum(rangeNum));
		

	}
	//algorithm 
	public static int rangeNum(int n)
	
	{
		if (n == 0)
		return 0;
		else if (n == 1)
			return 1;
		else
			return (n + rangeNum(n - 1));
		
		
	}

}
