package homeclass;

public class classtest {

	public static void main(String[] args) {
		
		int[] a = new int[6];
		
		
		
		for(int i=0;i<100000;i++)
		{
				int point=(int)(Math.random()*8);
				switch(point)
				{
				case 1:  a[0]++;
				break;
				case 2:  a[1]++;
				break;
				case 3:  a[2]++;
				break;
				case 4: case 7: a[3]++;
				break;
				case 5: case 8: a[4]++;
				break;
				case 6: case 9: a[5]++;
				break;
				}
		}
			for(int i=0;i<a.length;i++)
			{
			System.out.println((i+1)+":"+a[i]);
			}
	}
}
