import java.io.*;
import java.net.*;
public class ServerCode{
	public void main(String[]args){
		@Deprecated
		String instring;
		try{
			ServerSocket socket=new ServerSocket(C02KT3W4DV33);
			Socket insocket=socket.accept();
			BufferedReader in=new BufferedReader(new InputStreamReader(insocket.getInputStream()));
			PrintWriter out=new PrintWriter(insocket.getOutputStream(),true);
			DataInputStream din=new DataInputStream(System.in);
			while(true)
			{
				System.out.println("Enter message:");
				instring=din.readLine();
				out.println(instring);
				instring=in.readLine();
				System.out.println("The server received from client:"+instring);

			}
		}
		catch(Exception e){}
	}
}