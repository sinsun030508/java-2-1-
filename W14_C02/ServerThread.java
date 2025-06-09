package W14_C02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

import java.io.InputStreamReader;

//import jdk.internal.org.jline.utils.InputStreamReader;

public class ServerThread extends Thread{
 private Socket socket;
 private ArrayList<ServerThread> threadList;
private BufferedWriter out;

public ServerThread(Socket socket2, ArrayList<ServerThread> threadList) {
	// TODO Auto-generated constructor stub
	this.socket = socket;
	this.threadList = threadList;
}
@Override
public void run() {
	
	try {
	BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));//입력
	out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//출력
	String inMsg = null;
	
	while(true) {
		inMsg = in.readLine();
		if(inMsg.equalsIgnoreCase("bye")) {
			this.socket.close();
		}
	}
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
	
	}
	private void sendAllClient(String outMsg) {
		
	}
}

