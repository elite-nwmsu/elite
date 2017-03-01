/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sss;

import java.util.ArrayList;
import static sss.Main.b2r;
import static sss.Main.current;
import static sss.Main.next_section;
import static sss.Main.posX;
import static sss.Main.posY;
import static sss.Main.prev;

/**
 *
 * @author S525700
 */
public class Route {
    
    public static void updateNext() {
        String key;
        if (b2r == 1) {
            /*if (location + 1 < route.length && picked_stations.contains(sec2sta.get(route[location+1])) && visited.get(sec2sta.get(route[location+1])) == 0) {
				speed = 0;
				flag = true;
				startTime = System.currentTimeMillis();
				visited.put(sec2sta.get(route[location+1]), 1);
				System.out.println("Waiting at station: " + sec2sta.get(route[location+1]));
				return;
				long time = System.currentTimeMillis();
				while(System.currentTimeMillis() - time <= 2000);
			}*/
            Main.location++;
            if (Main.location >= Main.route.length) {
                Main.speed = 0;
                b2r = 0;
                prev = null;
                return;
            }
            key = Main.route[Main.location];
            prev = current;
            current = key;
            Main.speed = Main.speedLimit.get(current) / 100.0;
            if (Main.location + 1 < Main.route.length) {
                next_section = Main.route[Main.location + 1];
            } else {
                next_section = key;
            }
        } else {
            Main.location--;
            if (Main.location < 0) {
                Main.speed = 0;
                b2r = 1;
                prev = null;
                return;
            }
            key = Main.route[Main.location];
            prev = current;
            current = key;
            Main.speed = Main.speedLimit.get(current) / 100.0;
            if (Main.location - 1 >= 0) {
                next_section = Main.route[Main.location - 1];
            } else {
                next_section = key;
            }
        }

        ArrayList<Point> tempPoints = Main.sections.get(key);
        for (int i = 0; i < tempPoints.size(); ++i) {
            if (b2r == 1) {
                Main.next.add(tempPoints.get(i));
            } else {
                Main.next.add(tempPoints.get(tempPoints.size() - i - 1));
            }
        }
        //System.out.println("Inside update: " + current + " " + next_section);
    }
}

    