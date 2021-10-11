import java.util.Scanner;

//Application for printing out the useful information about Java integer primitives
public class PrimitivesInformationAppl {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in); //input data from the console
		while(true) {
			System.out.println("enter integer primitive type (long, int, short, char, byte) or exit");
			String line = scanner.nextLine();
			if (line.equals("exit")) {
				break;
			}
			printInformationByType(line);
		}
		System.out.println("thanks for using our application & bye");

	}

	private static void printInformationByType(String type) {
		// your homework should contain switch by the given type (long, int, short, char, byte)
		//for default there should be out: Wrong primitive type
		// for each type there should be an appropriate method of printing information of the type
		
		//for example, printCharInformation - method printing out the info about type "char"
		switch(type) {
		case "long":
			// V.R. It is good idea to implement "long" logic in tghe separate
			// private static method. Like the following:
			// private static void printLongInformation()
			// Each case calls the suitable method
			long minValue = 1; 
			long maxValue = 1;
			int nBits = 1;
			while(minValue > 0) {
				minValue =  (minValue * 2);//compiler casts minValue to int, multiplies on 2 
				nBits = nBits + 1;
			}
			// V.R. It is possible to declare the variable maxValue and to
			// initialize it in the line. Like the following:
			// long maxValue=(minValue-1);
			maxValue =  (minValue - 1);
			System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n", minValue, maxValue, nBits / 8);
			break;
		case "int":
			int minValueInt = 1; 
			int maxValueInt = 1;
			int nBitsInt = 1;
			while(minValueInt > 0) {
				minValueInt =  (minValueInt * 2);//compiler casts minValue to int, multiplies on 2 
				nBitsInt = nBitsInt + 1;
			}
			maxValueInt =  (minValueInt - 1);
			System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n", minValueInt, maxValueInt, nBitsInt / 8);
			break;
		case "char":
			char minValueChar = 1; 
			char maxValueChar = 1;
			int nBitsChar = 1;
			while(minValueChar > 0) {
				minValueChar = (char) (minValueChar * 2);//compiler casts minValue to int, multiplies on 2 
				nBitsChar = nBitsChar + 1;
			}
			maxValueChar =  (char)(minValueChar - 1);
			System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n",(int) minValueChar, (int) maxValueChar, nBitsChar / 8);
			break;
		case "short":
			short minValueShort = 1; 
			short maxValueShort = 1;
			int nBitsShort = 1;
			while(minValueShort > 0) {
				minValueShort = (short) (minValueShort * 2);//compiler casts minValue to int, multiplies on 2 
				nBitsShort = nBitsShort + 1;
			}
			maxValueShort =  (short)(minValueShort - 1);
			System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n",(int) minValueShort, (int) maxValueShort, nBitsShort / 8);
			break;
		case "byte":
			byte minValueByte = 1; 
			byte maxValueByte = 1;
			int nBitsByte = 1;
			while(minValueByte > 0) {
				minValueByte = (byte) (minValueByte * 2);//compiler casts minValue to int, multiplies on 2 
				nBitsByte = nBitsByte + 1;
			}
			maxValueByte =  (byte)(minValueByte - 1);
			System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n",(int) minValueByte, (int) maxValueByte, nBitsByte / 8);
			break;
			// V.R. It is better to add which type is wrong.
			// For example. fffafag is the wrong type
			default:System.out.printf("Wrong type!!!");
		}
	}

}
