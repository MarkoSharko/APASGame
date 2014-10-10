package alex.markovich.game.save;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveHandler {
	private String filePath = "./Data/Save.txt";
	File f;
	BufferedWriter writer;
	PrintWriter printW;
	public String [] array;
	
	public SaveHandler(){
		
		 f = new File(filePath);
		
		checkFilePath();
	}
	
	public void checkFilePath(){
		if(f.exists()){
			System.out.println("File already exits, ");
			readFile();
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
	
	public void readFile(){
		Scanner file = null;
		try {
			file = new Scanner(new File(filePath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> lines = new ArrayList<String>();
	
		while (file.hasNext())
		{
			String nextWord = file.nextLine();
			lines.add(nextWord);
			System.out.println(nextWord);
		}
		array = lines.toArray(new String[lines.size()]);
		
	}
	
	@SuppressWarnings("resource")

		
	
	public void save(int Health, String Name, String played, int armor, int damage){
		try {
			System.out.println("Creating buffer writer");
			writer = new BufferedWriter( new FileWriter(filePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
		 printW = new PrintWriter(writer);
		printW.println(Name);
		printW.println(Health);
		printW.println(played);
		printW.println(armor);
		printW.println(damage);
		printW.close();
		
	}
	
	public String getFilePath(){
		return filePath;
	}
	public void setFilePath(String filePath){
		this.filePath = filePath;
	}
}
