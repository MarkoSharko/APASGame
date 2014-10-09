package alex.markovich.game.save;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SaveHandler {
	private String filePath = "./Data/Save.txt";
	File f;
	BufferedWriter writer;
	PrintWriter printW;
	public SaveHandler(){
		
		 f = new File(filePath);
		try {
			System.out.println("Creating buffer writer");
			writer = new BufferedWriter( new FileWriter(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
		 printW = new PrintWriter(writer);
		checkFilePath();
		System.out.println(getName());
	}
	
	public void checkFilePath(){
		if(f.exists()){
			System.out.println("File already exits, ");
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
	
	public boolean DoesFileExist(){
		if(f.exists()){
			return true;
		}else
			return false;
	}
	
	@SuppressWarnings("resource")
	public String getName(){
		Scanner x = null;
		String s = null;
		try{
			x = new Scanner(new File(filePath));
		}catch (IOException e){
			System.out.println("Shit something went wrong.");
		}
		while(x.hasNext()){
			 s = x.next();
			 System.out.println(s);
			 return s;
		}
		
		return s;
		
	}
	
	public void save(int Health, String Name){
		printW.println(Name);
		printW.println(Health);
		printW.close();
		
	}
	
	public String getFilePath(){
		return filePath;
	}
	public void setFilePath(String filePath){
		this.filePath = filePath;
	}
}
