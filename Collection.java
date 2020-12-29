package week4;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;

	public class Collection {

	    
	    public List<String> readFile() {

	        List<String> list = new ArrayList<>();

	       

	        try( BufferedReader br = new BufferedReader(new InputStreamReader(getClass().
	                              getClassLoader().getResourceAsStream("")));){
	            
	            String line = null;
	            while ((line = br.readLine()) != null) {
	                list.addAll(Arrays.asList(line.split(",")));
	            }
	        } catch (IOException e) {
	          
	            System.out.println("Error with the file: " + e.getMessage());
	        }

	        return list;
	    }


	    public static void main(String[] args) {

	        
	        List<String> list = new Collection().readFile();


	    }
	}
