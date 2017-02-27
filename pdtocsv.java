//to compile the program
//javac pdtocsv.java

//to run the program
//java pdtocsv

//imports the scanner which will read the file
import java.util.Scanner;

//import io classes like file
import java.io.*;

//classes have to be named the same as the file
public class pdtocsv{
    
    static String data[][] = {
	{"Incident Control Number", ""},
	{"Incident Type", ""},
	{"Incident Entered Rank", ""},
	{"Incident Entered Name", ""},
	{"Date Received", ""},
	{"Occured Date", ""},
	{"Occured Time", ""},
	{"ID Number", ""},
	{"IA Number", ""},
	{"Created Date", ""},
	{"Created Time", ""},
	{"Incident Summary", ""},
	{"Incident Street Number", ""},
	{"Incident Street Name", ""}
    };

    //main method
    public static void main (String args[]){
	/*
	for(String s : args)
	    System.out.println(s);
	*/

	//args[0] is the first command line argument. It does not include "java" or "pdtocsv"

	//try will attempt to load the file, if it can't it will print out the error.
	
	File file;
	try{
	    //every object has new in java
	    file = new File(args[0]);
	    
	    Scanner in = new Scanner(file);

	    //Reads like the first line is an EOF for somereason
	    String first = in.nextLine();
	    
	    while(in.hasNextLine()){
		//System.out.println(in.nextLine());
		String line = in.nextLine();
		attemptDataCollection(line, in);
		//System.out.println(line);
		/*String vals[] = line.split(": ");
		for(String s: vals)
		    System.out.print(s + "|");
		    System.out.println();*/
	    }

	} catch(FileNotFoundException e){
	    e.printStackTrace();
	}
	
	for(String s[]: data)
	    System.out.println(s[0] + "\t" + s[1]);
	
    }

    static void attemptDataCollection(String line, Scanner in){
	System.out.println(line);
	if(line.contains("Incident Entered By")){
	    //System.out.println(line);
	    String vals[] = line.split(": ");
	    data[3][1] = vals[1];
	}
	if(line.contains("Incident Summary")){
	    //String vals[] = line.split(": ");
	    //data[0][1] = vals[1];
	    data[11][1] = in.nextLine();
	}
    }
}
