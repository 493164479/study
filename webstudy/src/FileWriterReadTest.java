import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReadTest {
    public static void main(String[] args) {

        new FileWriterReadTest().writer(new File("login.txt"));
        new FileWriterReadTest().read(new File("login.txt"));
    }

    public void read(File file)  {
        FileReader fr = null;
        try {
            fr = new FileReader(file);

            char[] chars = new char[1024];

            int lenght ;

            while ((lenght = fr.read(chars))!=-1){
                String s = new String(chars,0,lenght);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr!=null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public void writer(File file)  {
        FileWriter fw = null;
        try {
            fw = new FileWriter(file,true);

            fw.write("hello");
            fw.write("qq");
            fw.write("sg");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
