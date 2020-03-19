package tcpserver;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class TcpServer {

    public static void main(String[] args) throws Exception {
        readAsByte();
        }
    
        public static void readAsByte()throws Exception{
            ServerSocket ourFirstServerSocket = new ServerSocket(7867);//port ucun obyekt yaradiriq ,hansiki bu obywekt deyir menim portumu yaz//u
        while (true) {//sonsuz dovr yaradirigki qebul olan datanin ardi kesilmesin
            System.out.println("musterini gozleyirem");
            Socket connection = ourFirstServerSocket.accept();//gelen datani birlesdiririk,bu bize elaqe ni qaytarir ve deyirki kanal ac
            DataInputStream dataStream=new DataInputStream(connection.getInputStream());
            byte[] arr=readmessage(dataStream);
            System.out.println("message length="+arr.length);
            utility.Utility.writebytes("C:\\Users\\User\\Pictures\\Saved Pictures\\photo157.jpg", arr);
        
    }
        }

    public static byte[] readmessage(DataInputStream din) throws Exception {
     int msgLen=din.readInt();
     byte[]msg=new byte[msgLen];
     din.readFully(msg);
     return msg;
    }

    public static void readAsWString() throws Exception {
        ServerSocket ourFirstServerSocket = new ServerSocket(8755);//port ucun obyekt yaradiriq ,hansiki bu obywekt deyir menim portumu yaz//u
        while (true) {//sonsuz dovr yaradirigki qebul olan datanin ardi kesilmesin
            System.out.println("musterini gozleyirem");
            Socket connection = ourFirstServerSocket.accept();//gelen datani birlesdiririk,bu bize elaqe ni qaytarir ve deyirki kanal ac
            System.out.println("yeni musteri geldi");
            InputStream is = connection.getInputStream();//burda gonderilen connectiona gore bir kanal acilir,
            InputStreamReader reader = new InputStreamReader(is);//ve acilan kanalda oxunmaga baslayir
            BufferedReader bReader = new BufferedReader(reader);//oxunulan meluumatlar toplanir ve 
            String messageFromClient = bReader.readLine();//bu metod deyirki oxu string qaytar bize;
            System.out.println("meaageFromClient=" + messageFromClient);//deyirki gelen esaji chapa ver

        }
    }

}

//burda sirf yazilanlari qebul etmek ucun nezerde tutlmusdur
//  ServerSocket ourFirstServerSocket = new ServerSocket(8755);//port ucun obyekt yaradiriq ,hansiki bu obywekt deyir menim portumu yaz//u
//        while (true) {//sonsuz dovr yaradirigki qebul olan datanin ardi kesilmesin
//            System.out.println("musterini gozleyirem");
//            Socket connection = ourFirstServerSocket.accept();//gelen datani birlesdiririk,bu bize elaqe ni qaytarir ve deyirki kanal ac
//            System.out.println("yeni musteri geldi");
//            InputStream is = connection.getInputStream();//burda gonderilen connectiona gore bir kanal acilir,
//            InputStreamReader reader = new InputStreamReader(is);//ve acilan kanalda oxunmaga baslayir
//            BufferedReader bReader = new BufferedReader(reader);//oxunulan meluumatlar toplanir ve 
//            String messageFromClient = bReader.readLine();//bu metod deyirki oxu string qaytar bize;
//            System.out.println("meaageFromClient=" + messageFromClient);//deyirki gelen esaji chapa ver
