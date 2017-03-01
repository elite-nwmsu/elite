/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import static sss.Main.prev;
import static sss.Main.route;
import static sss.Main.sections;
import static sss.Main.speedLimit;
import static sss.Main.switches;

/**
 *
 * @author S525893
 */
public class TrackDatabase {

    public static void generateRoute() {
        try {
            PrintWriter out = new PrintWriter(new FileWriter(new File("route2.txt")));
            Random rand = new Random();
            String s = "S1-1 S2-1 S3-1 ";
            if (rand.nextDouble() < 0.5) {
                s += "S4-1 ";
            } else {
                s += "S4-2 ";
            }
            if (rand.nextDouble() < 0.5) {
                s += "S5-2 S6-2 ";
            } else {
                s += "S5-1 S6-1 ";
            }
            s += "S7-1 ";
            if (rand.nextDouble() < 0.5) {
                s += "S8-1 ";
            } else {
                s += "S8-2 ";
            }
            s += "S9-1 ";
            if (rand.nextDouble() < 0.5) {
                s += "S10-1 ";
            } else {
                s += "S10-2 ";
            }
            s += "S11-1 S12-1 S18-1 ";
            if (rand.nextDouble() < 0.5) {
                s += "S19-1 ";
            } else {
                s += "S19-2 ";
            }
            s += "S20-1 S21-1 ";
            if (rand.nextDouble() < 0.5) {
                s += "S22-1 ";
            } else {
                s += "S22-2 ";
            }
            s += "S23-1 S24-1 ";
            if (rand.nextDouble() < 0.5) {
                s += "S25-2 ";
            } else {
                s += "S25-3 ";
            }
            s += "S26-1 S27-1 S28-1 S29-1";

            out.println(s);
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
