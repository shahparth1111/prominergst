import java.io.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;

public class Data extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String code="";
	static String path="C:/Prominer/";
	static String path1="C:/Users/"+System.getProperty("user.name")+"/Linkss/";
	public void dataLoad() throws InterruptedException, IOException
	{
		File file11 = new File("C:\\Prominer");
        if (!file11.exists()) {
            if (file11.mkdir()) {
            } 
        }
        File file12 = new File("C:\\Users\\"+System.getProperty("user.name")+"\\Linkss");
        if (!file12.exists()) {
            if (file12.mkdir()) {
            } 
        }
        
        
		File file=new File(path1+"activation.txt");
		if(file.exists()==false)
		{
			try{
			file.createNewFile();
			code=generateRandom();
			SendMailTLS S=new SendMailTLS();
			S.sendCode(code);
			Activation A=new Activation();
			A.setVisible(true);
			A.setAlwaysOnTop(isAlwaysOnTop());
			}catch(Exception cd){}
		}
		else
		{
			try{
			ReadFile R=new ReadFile(path1+"activation.txt");
			String s[]=R.OpenFile(1);
			if(s[0]==null)
			{
				code=generateRandom();
				SendMailTLS S=new SendMailTLS();
				S.sendCode(code);
				Activation A=new Activation();
				A.setVisible(true);
				A.setAlwaysOnTop(isAlwaysOnTop());
			}
			else
			{
				if(s[0].charAt(7)=='P')//Everything Perfect so now Starting the Software
				{
					File file1 = new File("C:\\Prominer");
			        if (!file1.exists()) {
			            if (file1.mkdir()) {
			            } 
			        }
					Home H=new Home();
					H.setVisible(true);
				}
				else
				{
					file.delete();
					File ff=new File(path1+"activation.txt");
					ff.createNewFile();
					System.exit(0);
				}

			}
			}catch(Exception vsc){}
		}
	}
	
	public static int getLines(String filePath) throws IOException
	{
	      BufferedReader reader = new BufferedReader(new FileReader(filePath));
	      int lines = 0;
	      while (reader.readLine() != null) lines++;
  		  reader.close();
  		  lines++;
  		  return lines;
	}
	
	public static String getLine(String uniqueCode, String filename) throws IOException
	{
		ReadFile file=new ReadFile(filename);
		int lines=getLines(filename);
		String S[]=file.OpenFile(lines);
		boolean Stop=false;String toreturn="";
		for(int i=0;i<S.length;i++)
		{
			if(S[i]!=null){
			if(Stop==false)
			{
				Scanner in=new Scanner(S[i]).useDelimiter("\\§");
				String G="";
				while(in.hasNext()==true)
				{
					G=in.next();
					if(G.equalsIgnoreCase(uniqueCode)==true)
					{
						toreturn=S[i];
						Stop=true;
					}
					break;
				}
			}
			}
		}
		return toreturn;
	}
	
	public static String getProductLine(String productCode, String filename) throws IOException
	{
		ReadFile file=new ReadFile(filename);
		int lines=getLines(filename);
		String S[]=file.OpenFile(lines);
		boolean Stop=false;String toreturn="";
		for(int i=S.length-1;i>=0;i--)
		{
			if(Stop==false)
			{
				if(S[i]!=null)
				{
					Scanner in=new Scanner(S[i]).useDelimiter("\\§");
					String G="";
					while(in.hasNext()==true)
					{
						G=in.next();
						System.out.println(G);
						G=in.next();
						if(G.equalsIgnoreCase(productCode)==true)
						{
							toreturn=S[i];
							Stop=true;
						}
						break;
					}
				}
			}
		}
		return toreturn;
	}
	
	
	public static String generateRandom()
	{
		Random r = new Random();
	    String alphabet = "34814328paisdgivlnhew";
	    String randoom="";
	    for (int i = 0; i < 28; i++) {
	    	char raa=alphabet.charAt(r.nextInt(alphabet.length()));
	    	if(i%4==0 && i!=0)
	    	{
	    		randoom+="-";
	    		randoom+=Character.toUpperCase(raa);
	    	}
	    	else if(i==6)
	    	{
	    		randoom+="P";
	    	}
	    	else
	    	{
	    		randoom+=Character.toUpperCase(raa);
	    	}
	    }
	   return randoom;
	}
	
	public static String[] getFirst(String filename) throws IOException
	{
		ReadFile file=new ReadFile(filename);
		int lines=getLines(filename);
		String S[]=file.OpenFile(lines);
		String arr[]=new String[lines-1];
		int count=0;
		for(int i=0;i<S.length;i++)
		{
			if(S[i]!=null)
			{
				Scanner in=new Scanner(S[i]).useDelimiter("\\§");
				String G="";
				while(in.hasNext()==true)
				{
					G=in.next();
					break;
				}
				arr[count++]=G;
			}
		}
		return arr;
	}
	
	
	public static String[] getSecond(String filename) throws IOException
	{
		ReadFile file=new ReadFile(filename);
		int lines=getLines(filename);
		String S[]=file.OpenFile(lines);
		String arr[]=new String[lines-1];
		int count=0;
		for(int i=0;i<S.length-1;i++)
		{
			int count1=0;
			Scanner in=new Scanner(S[i]).useDelimiter("\\§");
			String G="";
			while(in.hasNext()==true)
			{
				String A=in.next();
				if(count1==1)
				{
					G=A;
					break;
				}
				count1++;
			}
			arr[count++]=G;
		}
		return arr;
	}
	
	public static String[] getThird(String filename) throws IOException
	{
		ReadFile file=new ReadFile(filename);
		int lines=getLines(filename);
		String S[]=file.OpenFile(lines);
		String arr[]=new String[lines-1];
		int count=0;
		for(int i=0;i<S.length;i++)
		{
			if(S[i]!=null)
			{
				int count1=0;
				Scanner in=new Scanner(S[i]).useDelimiter("\\§");
				String G="";
				while(in.hasNext()==true)
				{
					String A=in.next();
					if(count1==2)
					{
						G=A;
						break;
					}
					count1++;
				}
				arr[count++]=G;
			}
		}
		return arr;
	}
	
	
	public static String[] getFourth(String filename) throws IOException
	{
		ReadFile file=new ReadFile(filename);
		int lines=getLines(filename);
		String S[]=file.OpenFile(lines);
		String arr[]=new String[lines-1];
		int count=0;
		for(int i=0;i<S.length;i++)
		{
			int count1=0;
			Scanner in=new Scanner(S[i]).useDelimiter("\\§");
			String G="";
			while(in.hasNext()==true)
			{
				String A=in.next();
				if(count1==3)
				{
					G=A;
					break;
				}
				count1++;
			}
			arr[count++]=G;
		}
		return arr;
	}
	
	
	public static String[] getFifth(String filename) throws IOException
	{
		ReadFile file=new ReadFile(filename);
		int lines=getLines(filename);
		String S[]=file.OpenFile(lines);
		String arr[]=new String[lines-1];
		int count=0;
		for(int i=0;i<S.length;i++)
		{
			int count1=0;
			Scanner in=new Scanner(S[i]).useDelimiter("\\§");
			String G="";
			while(in.hasNext()==true)
			{
				String A=in.next();
				if(count1==4)
				{
					G=A;
					break;
				}
				count1++;
			}
			arr[count++]=G;
		}
		return arr;
	}
	
	
	
	public static String getFirstWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";
		while(in.hasNext()==true)
		{
			G=in.next();
			break;
		}
		return G;
	}
	
	
	public static String getSecondWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==1)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	public static String getThirdWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==2)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	
	public static String getFourthWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==3)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	public static String getFifthWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==4)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	public static String getSixthWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==5)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	public static String getSeventhWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==6)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	public static String getEighthWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==7)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	public static String getNinethWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==8)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	public static String getTenthWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==9)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	public static String getEleventhWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==10)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	public static String getTwelthWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==11)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	public static String getThirteenthWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==12)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	public static String getFourteenthWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==13)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	public static String getFifteenthWord(String lineName) throws IOException
	{
		Scanner in=new Scanner(lineName).useDelimiter("\\§");
		String G="";int count=0;
		while(in.hasNext()==true)
		{
			String A=in.next();
			if(count==14)
			{
				G=A;
				break;
			}
			count++;
		}
		return G;
	}
	
	public static void editDatabase(String UID, String newLine, String filename) throws IOException
	{
		ReadFile file=new ReadFile(filename);
		int lines=getLines(filename);
		String S[]=file.OpenFile(lines);
		File fileold=new File(path+"supplier.txt");
		File file1=new File(path+"temperory.txt");
		if(file1.exists()==false)
		{
			file1.createNewFile();
		}
		WriteFile W=new WriteFile(path+"temperory.txt",true);
		for(int i=0;i<S.length;i++)
		{
			if(S[i]!=null)
			{
				Scanner in=new Scanner(S[i]).useDelimiter("\\§");
				while(in.hasNext()==true)
				{
					String A=in.next();
					if(A.equalsIgnoreCase(UID)==true)
					{
						W.writeToFile(newLine);
					}
					else
					{
						W.writeToFile(S[i]);
					}
					break;
				}
			}
		}
		fileold.delete();
		file1.renameTo(new File(filename));
	}
	
	
	public static void deleteDatabase(String UID, String filename) throws IOException
	{
		ReadFile file=new ReadFile(filename);
		int lines=getLines(filename);
		String S[]=file.OpenFile(lines);
		File fileold=new File(path+"supplier.txt");
		File file1=new File(path+"temperory.txt");
		if(file1.exists()==false)
		{
			file1.createNewFile();
		}
		WriteFile W=new WriteFile(path+"temperory.txt",true);
		for(int i=0;i<S.length;i++)
		{
			if(S[i]!=null)
			{
				Scanner in=new Scanner(S[i]).useDelimiter("\\§");
				while(in.hasNext()==true)
				{
					String A=in.next();
					if(A.equalsIgnoreCase(UID)==true)
					{}
					else
					{
						W.writeToFile(S[i]);
					}
					break;
				}
			}
		}
		fileold.delete();
		file1.renameTo(new File(filename));
	}
}
