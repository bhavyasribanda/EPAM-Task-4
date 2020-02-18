package EpamAss1.CleanCode2;

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
        //System.out.println( "Hello World!" );
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	double areaOfHouse = 0.0;
    	areaOfHouse = Double.parseDouble(br.readLine());
    	String buildingType = null;
    	buildingType = br.readLine();
    	BuildingHouse b = new BuildingHouse();
    	bw.write("Total cost of building is equal to : " + b.buildingCost(areaOfHouse, buildingType));
    	bw.flush();
    }
}
