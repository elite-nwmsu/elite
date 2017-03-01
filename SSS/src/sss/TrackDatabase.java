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
    
    
    public static void readTrackdb() {
        try {
            File file = new File("trackdb.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                // System.out.println(line);
                String[] tokens = line.trim().split(" ");
                if (tokens[0].contains("SW")) {

                    String[] vals = tokens[1].trim().split(",");
                    int x = Integer.valueOf(vals[0]);
                    int y = Integer.valueOf(vals[1]);
                    Point p = new Point(x, y);
                    switches.put(tokens[0], p);
                } else {
                    String[] vals = tokens[1].trim().split(";");
                    ArrayList<Point> points = new ArrayList<>();
                    for (int i = 0; i < vals.length; ++i) {
                        String[] vals2 = vals[i].trim().split(",");
                        int x = Integer.valueOf(vals2[0]);
                       int y = Integer.valueOf(vals2[1]);
                        Point p = new Point(x, y);
                        points.add(p);
                    }
                    int speed = Integer.valueOf(tokens[2].trim());
                    sections.put(tokens[0], points);
                    speedLimit.put(tokens[0], speed);
                }
            }
            in.close();
            in = new Scanner(new File("route2.txt"));

            while (in.hasNextLine()) {
                route = in.nextLine().trim().split(" ");
            }
            in.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        /*for (String name : switches.keySet()) {
			String value = switches.get(name).toString();
			System.out.println(name + " " + value);
		}
		for (String name : sections.keySet()) {
			ArrayList<Point> values = sections.get(name);
			System.out.print(name + " ");
			for (int i = 0; i < values.size(); ++i)
				System.out.print(values.get(i) + " ");
			System.out.print(speedLimit.get(name) + "\n");
		}*/
 /*for (String r : route) {
			System.out.print(r + " ");
		}
		System.out.println();
		for (String s : picked_stations) {
			System.out.println(s);
		}*/
        prev = null;
        /*current = route[location];
		// updateNext();
		nextStop = new Point(200, 50);
		next_section = "S2-1";*/
    }


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


