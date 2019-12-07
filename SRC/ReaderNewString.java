package zijide;

import java.io.FileReader;
import java.sql.SQLException;

public class ReaderNewString {
	public static void main(String[] args)throws Exception{
		FileReader fr = null;
		fr = new FileReader("d:\\test.txt");
		char[] buf = new char[3];
		int len= 0;
		while((len=fr.read(buf))!=-1){
     		System.out.println(new String(buf,0,len));
			System.out.println(new String(buf));
		}
		fr.close();
	}

}
