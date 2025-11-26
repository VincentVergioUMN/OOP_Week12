package week12.vincent.id.ac.umn;

import java.io.FileWriter;
import java.io.IOException;

public class file_handling_write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter Writer = new FileWriter("myfile.txt");
			Writer.write("Nama saya John Doe\n");
			Writer.write("Saya dari Universitas Multimedia Nusantara");
			Writer.close();
			System.out.println("Succesfully written");
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}

}
