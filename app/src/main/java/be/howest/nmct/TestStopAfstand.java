package be.howest.nmct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/**
 * Created by Bryan on 13/02/2015.
 */
public class TestStopAfstand {
    public static void main(String [] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner s = new Scanner(System.in);
        pw.println("reactietijd?:");
        pw.flush();
        float reactietijd = Float.parseFloat(br.readLine());
        // float reactietijd = Float.parseFloat(s.nextFloat);

        pw.println("snelheid?:");
        pw.flush();
        int snelheid = Integer.parseInt(br.readLine());
        //s.close();

        pw.println("Type wegdek (DROOG of NAT)");
        pw.flush();
        String wegdek = br.readLine();

        StopAfstandInfo sai = new StopAfstandInfo();
        //sai.setReactietijd(3.5f);
        sai.setReactietijd(reactietijd);
        //sai.setSnelheid(120);
        sai.setSnelheid(snelheid);

        sai.setTypeWeg(wegdek);
        System.out.println(sai.toString());
    }

}


