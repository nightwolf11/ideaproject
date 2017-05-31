package com.xzq.aipcore.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    ServerSocket ss;
    Socket serverSocket;
    InputStream inStream;
    OutputStream outStream;


    public Server() {
        try {
            System.out.println("====================Server==================");
            ss = new ServerSocket(8888);
            serverSocket = ss.accept();
            System.out
                    .println("--------------some guest connected----------------");
            inStream = serverSocket.getInputStream();
            outStream = serverSocket.getOutputStream();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void conn() {
        new Thread() {
            public void run() {
                try {
                    InputStreamReader iReader = new InputStreamReader(inStream);
//                    OutputStreamWriter oWriter  = new OutputStreamWriter(outStream);

                    BufferedReader iBufferStream = new BufferedReader(iReader);
//                    BufferedWriter oBufferStream = new BufferedWriter(oWriter);
                    String line = null;
//                    String lineo = null;
                    while ((line = iBufferStream.readLine()) != null) {
                        System.out.println(line);
                    }
//                    while ((lineo = oBufferStream.toString()) != null) {
//                        System.out.println(lineo);
//                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }


    public static void main(String args[]) {
        Server server = new Server();
        server.conn();
    }
}
