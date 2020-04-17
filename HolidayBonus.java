public class HolidayBonus {

	public static double []calculateHolidayBonus(double[][] data, double high,double low, double other)
	{
		double single[] = new double[data.length];
		
		for (int i =0; i< data.length;i++)
		{
			for(int j=0;j < data[i].length;j++) 
			{
				if (data[i][j] > 0) {
				if(i == TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, j))
				{
					single[i] +=low;
				}
				else if (i == TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, j))
						{
						single [i] +=high;
						}
				else 
				{
					single[i] += other;
				}
			}
			}
		}
		return single;
		
	}
	
	public static double calculateTotalHolidayBonus(double[][] data,double high,double low,double other)
	{
double total = 0;
		
		for (int i =0; i< data.length;i++)
		{
			for(int j=0;j < data[i].length;j++) 
			{
				if (data[i][j] > 0) {
				if(i == TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, j))
				{
					total +=low;
				}
				else if (i == TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, j))
						{
						total  +=high;
						}
				else 
				{
					total += other;
				}
			}
			}
		}
		return total;
	}

}
