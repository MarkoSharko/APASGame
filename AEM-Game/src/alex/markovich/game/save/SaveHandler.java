package alex.markovich.game.save;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveHandler {
	private String filePath = "./Data/Save.txt";
	File f;
	BufferedWriter writer;
	PrintWriter printW;
	public SaveHandler(){
		
		 f = new File(filePath);
		try {
			writer = new BufferedWriter( new FileWriter(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
		 printW = new PrintWriter(writer);
		checkFilePath();
	}
	
	public void checkFilePath(){
		if(f.exists()){
			System.out.println("File already exits");
		}else{
			
			try {
				f.createNewFile();
				System.out.println("File created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Shit something went wrong here; Line 18");
			}
		}
	}
	
	public void save(int Health, String Name){
		printW.println(Name);
		printW.println(Health);
		
	}
	
	public String getFilePath(){
		return filePath;
	}
	public void setFilePath(String filePath){
		this.filePath = filePath;
	}
}
