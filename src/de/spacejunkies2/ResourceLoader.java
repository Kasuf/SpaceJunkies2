package de.spacejunkies2;
import java.io.InputStream;

final public class ResourceLoader {

	public static InputStream laden(String pfad){
		InputStream input = ResourceLoader.class.getResourceAsStream(pfad);
		if(input == null){
			input = ResourceLoader.class.getResourceAsStream("/"+pfad);
		}
		return input;
	}
	
}