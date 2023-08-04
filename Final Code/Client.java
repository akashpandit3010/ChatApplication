import java.net.*;
import java.io.*;
class Client
{
	public static void main(String args[]) throws IOException
  	{
     	//connection
		System.out.println("Waiting for friend!");
		Socket cs =new Socket("localhost",6000);
	     System.out.println("Friend connected!!");

		//asking for name
		System.out.println("What is your name?");
		BufferedReader buff1=new BufferedReader(new InputStreamReader(System.in));
    		String myname=buff1.readLine();
    		PrintWriter pw=new PrintWriter(cs.getOutputStream(),true);
     	pw.println(myname);	

		//getting friends name
		BufferedReader buff2=new BufferedReader(new InputStreamReader(cs.getInputStream()));
		String fname=buff2.readLine();

		System.out.println("Start your converstaion!!");
	    	boolean i=true;
		while(i=true)
		{	
			//sending messages
			System.out.print(">>");
			BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
     		String str1=br1.readLine();
     		pw.println(str1);
			if(str1.equals("END"))
			System.exit(0);
		
			//receiving messages
     		BufferedReader br2=new BufferedReader(new InputStreamReader(cs.getInputStream()));
     		String str2=br2.readLine();
			if(str2.equals("END"))
			System.exit(0);
	     	System.out.println(fname+":"+str2);
		}
		System.out.println("Connection Ended");
     	cs.close();
  	}
}