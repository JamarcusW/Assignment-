import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

	public static double[][] readFile(java.io.File file)
			throws java.io.FileNotFoundException {


		int cols = 0,rows = 0, rowIndex = 0, colIndex = 0;

		double data[][] = null;

		if (file!=null)
		{
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine())
			{
				scanner.nextLine();
				rows++;
			}
			data = new double [rows][];

			scanner.close();

			scanner = new Scanner (file);

			while (scanner.hasNextLine())
			{
				cols = 0;
				String temp = scanner.nextLine();
				Scanner col =new Scanner  (temp);
				while(col.hasNext()) 
				{
					col.next()	;
					cols++;
				}
				data [rowIndex]= new double [cols];
				System.out.println("rows " + rowIndex + "has columns "+ cols);
				col.close();

				rowIndex++;
			}
			scanner.close();

			scanner = new Scanner (file);
			rowIndex = 0;
			while (scanner.hasNextLine())
			{
				String temp = scanner.nextLine();
				Scanner col =new Scanner  (temp);
				while(col.hasNext()) 
				{
					data [rowIndex][colIndex] = Double.parseDouble(col.next())	;
					colIndex++;
				}
				col.close();
				colIndex = 0;
				rowIndex++;
			}
			scanner.close();
		}


		return data;
	}

	public static void writeToFile(double[][] data,java.io.File outputFile)throws java.io.FileNotFoundException

	{
		PrintWriter printwriter = new PrintWriter(outputFile);

		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				printwriter.print(data[row][col] +" ");
			}
			printwriter.println();
		}


	}


	public static double getTotal(double[][] data) {

		double sum = 0;
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				sum = sum + data[row][col];
			}
		}

		return sum;
	}

	public static double getHighestInArray(double[][] data) {

		double max = 0;
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (max < data[row][col])
					max = data[row][col];
			}
		}
		return max;
	}
	public static double getLowestInArray(double[][] data) {

		double min = data[0][0];
		for (int row = 0; row < data.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (min > data[row][col])
					min = data[row][col];
			}
		}
		return min;
	}

	public static double getHighestInColumn (double[][] data, int col) 
	{ 
		double max = 0; 

		double maxm = 0; 

		for (int j = 0; j < data.length; j++) 
		{
			if(col < data[j].length)

			{
				if (data[j][col] > maxm) 
					maxm = data[j][col]; 
			}
		}
		max = maxm;


		return max;

	}
	public static double getLowestInColumn (double[][] data, int col) 
	{ 
		double min = 0; 



		for (int j = 0; j < data.length; j++) 
		{
			for ( int i = 0; i < data[j].length; i++ )
			{
				if(col < data[j].length){


					double minm = data[j][col];
					if (data[j][col] < minm) 
					{
						minm = data[j][col];
						min = minm; 
					}
				}
			}
		}



		return min;

	}

	public static int getHighestInColumnIndex (double[][] data, int col) 
	{ 

		int row= 0;
		double maxm = 0; 

		for (int j = 0; j < data[col].length; j++) 
		{
			if(col < data[j].length)

			{
				if (data[j][col] > maxm) 
					row = j;
			}
		}
		return row;

	}
	public static int getLowestInColumnIndex (double[][] data, int col) 
	{ 

		int row= 0;


		for (int j = 0; j < data.length; j++) 
		{
			for (int i = 0; i < data.length; i++) 
			{
				if(col < data[j].length)
				{
					double maxm = data[j][col];
					if (data[j][col] <maxm) 
						row = j;
				}
			}
		}
		return row;

	}

	public static double getColumnTotal (double[][] data,int col) 
	{ 
		double total = 0;

		for (int j = 0; j < data.length; j++){

			if(col < data[j].length)
			{

				total += data[j][col]; 
			}
		}
		return total;
	}

	public static double getRowTotal(double[][] data, int row) {

		double total = 0;

		for (int i = 0; i < data[row].length; i++) {
			total += data[row][i];
		}

		return total;
	}

	public static double getHighestInRow(double[][] data, int row) {

		double max = 0;

		for (int j = 0; j < data[row].length; j++) 
		{ 
			if (data[row][j] > max) { 
				max = data[row][j]; 
			} 
		}
		return max;


	}

	public static int getHighestInRowIndex(double[][] data, int row) {

		int max = 0;

		for (int j = 0; j < data[row].length; j++) 
		{ 
			if (data[row][j] > max) { 
				max = j; 
			} 
		}
		return max;


	}
	public static double getLowestInRow(double[][] data, int row) {

		double min = 0;

		for (int j = 0; j < data[row].length; j++) 
		{ 
			if (data[row][j] < min) { 
				min = data[row][j]; 
			} 
		}
		return min;


	}
	public static double getLowestInRowIndex(double[][] data, int row) {

		double min = 0;

		for (int j = 0; j < data[row].length; j++) 
		{ 
			if (data[row][j] < min) { 
				min = j; 
			} 
		}
		return min;


	}
	public static double getAverage(double data[][]){
		int counter=0;
		double sum = 0;
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[i].length;j++){
				sum = sum+data[i][j];
				counter++;
			}
		}

		return sum / counter;
	}
}


