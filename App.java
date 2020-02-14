package EpamAss1.CleanCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
       SimpleAndCompoundInterest s = new SimpleAndCompoundInterest();
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       double principle = Double.parseDouble(br.readLine());
       double rateOfInterest = Double.parseDouble(br.readLine());
       double time = Double.parseDouble(br.readLine());
       double simpleInterest = s.calculateSimpleInterest(principle,rateOfInterest,time);
       double compoundInterest = s.calculateCompoundInterest(principle,rateOfInterest,time);
       bw.write("Simple Interest : " + simpleInterest + "\n");
       bw.write("Compound Interest : " + compoundInterest + "\n");
       bw.flush();
    }
}
