import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class storeToFile {

    static void createfile() throws IOException {
        //Creates a file in documents folder;
        File file = new File("C:\\Users\\gauta\\OneDrive\\Documents\\Passwords\\pass.txt");
        try
        {
            if (file.createNewFile())
            {
                System.out.println("new file created =  " + file.getName());
            }
            else
            {
                System.out.println("file already present!");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occured !" + e);
        }
    }
        static void writefile(String s) throws IOException{
            //writes to the file
            BufferedWriter filewrite = new BufferedWriter(new FileWriter("C:\\Users\\gauta\\OneDrive\\Documents\\Passwords\\pass.txt",true));

            try
            {
                filewrite.write(System.getProperty( "line.separator" ));
                filewrite.write(s);
                System.out.println("file written successfully ");
                filewrite.close();
            }
            catch (IOException e)
            {
                System.out.println("An error occured while writing to the file ");
            }
        }
}
