import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Ex10_09 {
    public static void main(String[] args) throws Exception{

        FileInputStream fis =new FileInputStream("/temp/javapr.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        //한국어 출력 가능하게(안깨지게) 해주는  9행

        int ch;

        while ( (ch= fis.read()) != -1)
            System.out.print((char) ch);

        fis.close();
    }
}
