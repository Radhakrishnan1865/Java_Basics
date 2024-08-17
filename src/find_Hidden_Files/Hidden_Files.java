package find_Hidden_Files;

import java.io.File;
import java.io.FileFilter;

public class Hidden_Files {

	public static void main(String[] args) {
		
		File[] hiddenfiles=new File("C:\\Users\\KaruppuSamy\\Desktop\\INTERVIEW QUESTIONS\\New folder")
				.listFiles(new FileFilter() {
					
					@Override
					public boolean accept(File pathname) {
						
						return pathname.isHidden();
					}
				});
		for(File file:hiddenfiles) {
			
		String name=file.getName();
		System.out.println(name);
		}
	}
}
