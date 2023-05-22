package serversc; 
import java.io.*;
 import java.net.*;
public class Serversc {
public static void main(String[] args) {
String instr;
 try
{
ServerSocket scsoket = new ServerSocket(8537);
Socket clsocket = scsoket.accept();
BufferedReader br = new BufferedReader(new InputStreamReader(clsocket.getInputStream()));
PrintWriter pw = new PrintWriter(clsocket.getOutputStream(),true);
DataInputStream dis = new DataInputStream(System.in);
while(true) 
{
System.out.println("Enter Message: ");
 instr = dis.readLine(); 
 pw.println(instr);
instr = br.readLine();
System.out.println("Client: "+instr); 
}
}
catch(Exception e){} }
}