package tcpClient;


import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TcpClient {
    public static void main(String[] args)throws Exception {
 
        Socket socket=new Socket("localhost", 7867);//servere qosulmag ucun socket obyekti yaradiriq 1 ci deyirik hansi ip adrese qosulacan ve sonra deyirik hansi port vasitesile qosulacan
        
      OutputStream outPutStream=  socket.getOutputStream();//socketden getmek ucun kanal acirig
      DataOutputStream dataOutputStream=new DataOutputStream(outPutStream);//datalarin getmesi ucun data obyektinin classini cagiririg
      byte[]bytes=utility.Utility.readbyte("C:\\Users\\User\\Pictures\\Saved Pictures\\photo.jpg");
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        socket.close();//ve connectionu baglayirig
        
        
}
}






// Socket socket=new Socket("localhost", 6755);//servere qosulmag ucun socket obyekti yaradiriq 1 ci deyirik hansi ip adrese qosulacan ve sonra deyirik hansi port vasitesile qosulacan
//        
//      OutputStream outPutStream=  socket.getOutputStream();//socketden getmek ucun kanal acirig
//      DataOutputStream dataOutputStream=new DataOutputStream(outPutStream);//datalarin getmesi ucun data obyektinin classini cagiririg
//      byte[]bytes=utility.Utility.readbyte("C:\\Users\\User\\Pictures\\Saved Pictures\\telegrame.jpg");
//        outPutStream.write(bytes);//gondereceyimiz metni megaleni yazirig gondereceyimiz kanaldan acdigimiz writen metodunda ,ve byte oldugu ucun bizde string oxudugumuz ucun .getbytes metodunu elave edirik
//        socket.close();//ve connectionu baglayirig