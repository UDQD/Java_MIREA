package pac;
import java.io.*;


public class main {
    public static void main(String[] args) throws Exception {

        FileWriter f = new FileWriter("text_2.txt");
        f.write("ssdfbhfsdfbsf\n");
        f.write("efhfbsf\n");
        f.write("12356666\n");
        f.write("kiubyy\n");
        f.flush();
        f.close();

        FileReader fr = new FileReader("text_2.txt");
        BufferedReader br = new BufferedReader(fr);
        while(br.ready()){
            System.out.println(br.readLine());
        }
    }
}
