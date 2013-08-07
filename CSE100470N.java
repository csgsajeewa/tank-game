



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author chamath
 */
public class CSE100470N {

    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

       while(true){
           System.out.println("Enter your string or press e to exit");
            String string = br.readLine();
           if(string.equals("e")){
               System.exit(0);
           }
          Graph graph=new Graph();
          graph.checkString(string);
        }

    }

}
