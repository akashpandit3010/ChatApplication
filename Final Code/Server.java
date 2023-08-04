import java.net.*;
import java.io.*;
class Server
{
	public static void main(String args[]) throws IOException
	{
		//connection
		ServerSocket s=new ServerSocket(6000);
		System.out.println("Waiting for friend!");
		Socket cs1=s.accept();
		System.out.println("Friend connected!!");
		
		//asking for name
		System.out.println("What is your name?");
		BufferedReader buff1=new BufferedReader(new InputStreamReader(System.in));
    		String myname=buff1.readLine();
    		PrintWriter pw=new PrintWriter(cs1.getOutputStream(),true);
     	pw.println(myname);	

		//getting friends name
		BufferedReader buff2=new BufferedReader(new InputStreamReader(cs1.getInputStream()));
		String fname=buff2.readLine();

		//loop for repeated messages
		boolean i=true;
		while(i=true)
		{
			
			//Receiving messages
			BufferedReader br1=new BufferedReader(new InputStreamReader(cs1.getInputStream()));
			String str1=br1.readLine();
			if(str1.equals("END"))
			System.exit(0);
			System.out.println(fname+":"+str1);
		
			//sending messages
			System.out.print(">>");
			BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
    			String str2=br2.readLine();
			if(str1.equals("END"))
			System.exit(0);
     		pw.println(str2);
		}
		System.out.println("Connection Ended");		
		s.close();
		cs1.close();
		
	}
}