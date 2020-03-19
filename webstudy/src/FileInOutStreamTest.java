import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutStreamTest {
    public static void main(String[] args) {
        InputStreamTest(new File("login2.txt"),new File("login.txt"));
    }

    public  static void InputStreamTest(File srcFile,File desFile)  {

        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream(srcFile);
            fis = new FileInputStream(desFile);

            byte[] bytes = new byte[1024];
            int lenght;

            while((lenght = fis.read(bytes))!=-1){
                fos.write(bytes,0,lenght);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos!=null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis!=null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
