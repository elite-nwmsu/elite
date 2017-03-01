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

public static void updateDir() {

        if (current.equals("S2-1")) {
            if (prev.equals("S1-1")) {
                Main.dir = Main.RIGHT;
            } else if (prev.equals("S3-1")) {
                Main.dir = Main.LEFT;
            }
        } else if (current.equals("S3-1")) {
            if (prev.equals("S2-1")) {
                Main.dir = Main.RIGHT;
            } else if (prev.equals("S4-2")) {
                Main.dir = Main.CROSS_LEFT_UP;
                if (posY <= 50) {
                    Main.dir = Main.LEFT;
                }
            } else if (prev.equals("S4-1")) {
                Main.dir = Main.LEFT;
            }
        } else if (current.equals("S4-1")) {
            if (prev.equals("S3-1")) {
                Main.dir = Main.RIGHT;
            } else if (prev.equals("S5-2")) {
                Main.dir = Main.CROSS_LEFT_UP;
                if (posY <= 50) {
                    Main.dir = Main.LEFT;
                }
            } else if (prev.equals("S5-1")) {
                Main.dir = Main.LEFT;
            }
        } else if (current.equals("S4-2")) {
            if (prev.equals("S3-1")) {
                Main.dir = Main.CROSS_RIGHT;
                if (posX >= 450 || posY >= 100) {
                    Main.dir = Main.RIGHT;
                }
            } else if (prev.equals("S6-2")) {
                Main.dir = Main.LEFT;
            } else if (prev.equals("S3-2")) {
                Main.dir = Main.RIGHT;
            }
        } else if (current.equals("S5-1")) {
            if (prev.equals("S4-1")) {
                Main.dir = Main.RIGHT;
            } else if (prev.equals("S6-1")) {
                Main.dir = Main.LEFT;
            } else if (prev.equals("S4-2")) {
                Main.dir = Main.CROSS_RIGHT_UP;
                if (posY <= 50) {
                    Main.dir = Main.RIGHT;
                }

            }
        } else if (current.equals("S5-2")) {
            if (prev.equals("S4-1")) {
                Main.dir = Main.CROSS_RIGHT;
                if (posX >= 550 || posY >= 100) {
                    Main.dir = Main.RIGHT;
                }
            } else if (prev.equals("S6-2")) {
                Main.dir = Main.LEFT;
            } else if (prev.equals("S4-2")) {
                Main.dir = Main.RIGHT;
            }
        } else if (current.equals("S6-1")) {
            if (prev.equals("S5-1")) {
               Main.dir=Main.RIGHT;
                if (posX >= 650) {
                   Main.dir=Main.DOWN;
                }
            } else if (prev.equals("S7-1")) {
               Main.dir= Main.UP;
                if (posY <= 45) {
                   Main.dir= Main.LEFT;
                }
            }
        } else if (current.equals("S6-2")) {
            if (prev.equals("S5-2")) {
               Main.dir=Main.DOWN;
                if (posX >= 620 && posY >= 180) {
                   Main.dir= Main.CROSS_RIGHT;
                }
            } else if (prev.equals("S7-1")) {
               Main.dir= Main.CROSS_LEFT_UP;
                if (posX <= 620 || posY <= 180) {
                   Main.dir= Main.UP;
                }
            }
        } else if (current.equals("S7-1")) {
            if (prev.equals("S6-1") || prev.equals("S6-2")) {
               Main.dir=Main.DOWN;
                if (posY >= 250) {
                   Main.dir= Main.LEFT;
                }
            } else if (prev.equals("S8-1") || prev.equals("S8-2")) {
               Main.dir=Main.RIGHT;
                if (posX >= 640) {
                   Main.dir= Main.UP;
                }
            }
        } else if (current.equals("S8-1")) {
            if (prev.equals("S7-1")) {
               Main.dir= Main.CROSS_LEFT_UP;
                if (posY <= 200 || posX <= 550) {
                   Main.dir= Main.LEFT;
                }
                if (posX <= 400) {
                   Main.dir= Main.CROSS_LEFT;
                }
            } else if (prev.equals("S9-1")) {
               Main.dir= Main.CROSS_RIGHT_UP;
                if (posY <= 200 || posX >= 400) {
                   Main.dir=Main.RIGHT;
                }
                if (posX >= 550) {
                   Main.dir= Main.CROSS_RIGHT;
                }
            }

        } else if (current.equals("S8-2")) {
            if (prev.equals("S7-1")) {
               Main.dir= Main.LEFT;
            } else if (prev.equals("S9-1")) {
               Main.dir=Main.RIGHT;
            }
        } else if (current.equals("S9-1")) {
            if (prev.equals("S8-1") || prev.equals("S8-2")) {
               Main.dir= Main.LEFT;
            } else if (prev.equals("S10-1") || prev.equals("S10-2")) {
               Main.dir=Main.RIGHT;
            }
        } else if (current.equals("S10-1")) {
            if (prev.equals("S9-1")) {
               Main.dir= Main.LEFT;
            } else if (prev.equals("S11-1")) {
               Main.dir=Main.RIGHT;
            }
        } else if (current.equals("S10-2")) {
            if (prev.equals("S9-1")) {
               Main.dir= Main.CROSS_LEFT;
                if (posY >= 300 || posX <= 250) {
                   Main.dir= Main.LEFT;
                }
                if (posX <= 100) {
                   Main.dir= Main.CROSS_LEFT_UP;
                }
            } else if (prev.equals("S11-1")) {
               Main.dir= Main.CROSS_RIGHT;
                if (posY >= 300 || posX >= 100) {
                   Main.dir=Main.RIGHT;
                }
                if (posX >= 250) {
                   Main.dir= Main.CROSS_RIGHT_UP;
                }
            }
        } else if (current.equals("S11-1")) {
            if (prev.equals("S10-1") || prev.equals("S10-2")) {
               Main.dir= Main.LEFT;
                if (posX <= 40) {
                   Main.dir=Main.DOWN;
                }
            } else if (prev.equals("S12-1")) {
               Main.dir= Main.UP;
                if (posY <= 250) {
                   Main.dir=Main.RIGHT;
                }
            }
        } else if (current.equals("S12-1")) {
            if (prev.equals("S11-1")) {
               Main.dir=Main.RIGHT;
            } else if (prev.equals("S18-1")) {
               Main.dir= Main.LEFT;
            }
        } else if (current.equals("S13-1")) {
            if (prev.equals("S12-1") || prev.equals("S14-1")) {
               Main.dir= Main.CROSS_RIGHT;
                if (posX >= 400 || posY <= 300) {
                   Main.dir=Main.RIGHT;
                }
            }
        } else if (current.equals("S16-1")) {
            if (prev.equals("S17-1")) {
               Main.dir=Main.DOWN;
                if (posY >= 650) {
                   Main.dir= Main.LEFT;
                }
                if (posX <= 40) {
                   Main.dir= Main.UP;
                }
            }
        } else if (current.equals("S17-1")) {
            if (prev.equals("S13-1")) {
               Main.dir=Main.RIGHT;
                if (posX >= 650) {
                   Main.dir=Main.DOWN;
                }
            }
        } else if (current.equals("S18-1")) {
            if (prev.equals("S12-1") || prev.equals("S13-1") || prev.equals("S14-1")) {
               Main.dir=Main.RIGHT;
            } else if (prev.equals("S19-1") || prev.equals("S19-2")) {
               Main.dir= Main.LEFT;
            }
        } else if (current.equals("S19-1")) {
            if (prev.equals("S18-1")) {
               Main.dir=Main.RIGHT;
            } else if (prev.equals("S20-1")) {
               Main.dir= Main.LEFT;
            }
        } else if (current.equals("S19-2")) {
            if (prev.equals("S18-1")) {
               Main.dir= Main.CROSS_RIGHT;
                if (posX >= 400 || posY >= 400) {
                   Main.dir=Main.RIGHT;
                }
                if (posX >= 500) {
                   Main.dir= Main.CROSS_RIGHT_UP;
                }
            }
            if (prev.equals("S20-1")) {
               Main.dir= Main.CROSS_LEFT;
                if (posX <= 550 || posY >= 400) {
                   Main.dir= Main.LEFT;
                }
                if (posX <= 400) {
                   Main.dir= Main.CROSS_LEFT_UP;
                }
            }
        } else if (current.equals("S20-1")) {
            if (prev.equals("S19-1")) {
               Main.dir=Main.RIGHT;
                if (posX >= 620) {
                   Main.dir=Main.DOWN;
                }
            } else if (prev.equals("S19-2")) {
               Main.dir= Main.CROSS_RIGHT_UP;
                if (posY <= 350) {
                   Main.dir=Main.RIGHT;
                }
                if (posX >= 620) {
                   Main.dir=Main.DOWN;
                }
            } else if (prev.equals("S21-1")) {
               Main.dir= Main.UP;
                if (posY <= 350) {
                   Main.dir= Main.LEFT;
                }
            }
        } else if (current.equals("S21-1")) {
            if (prev.equals("S20-1")) {
               Main.dir=Main.DOWN;
                if (posY >= 470) {
                   Main.dir= Main.LEFT;
                }
            } else if (prev.equals("S22-1") || prev.equals("S22-2")) {
               Main.dir=Main.RIGHT;
                if (posX >= 600) {
                   Main.dir= Main.UP;
                }
            }
        } else if (current.equals("S22-1")) {
            if (prev.equals("S21-1")) {
               Main.dir= Main.CROSS_LEFT_UP;
                if (posX <= 550 || posY <= 420) {
                   Main.dir= Main.LEFT;
                }
                if (posX <= 450) {
                   Main.dir= Main.CROSS_LEFT;
                }
            } else if (prev.equals("S23-1")) {
               Main.dir= Main.CROSS_RIGHT_UP;
                if (posX >= 450 || posY <= 420) {
                   Main.dir=Main.RIGHT;
                }
                if (posX >= 550) {
                   Main.dir= Main.CROSS_RIGHT;
                }
            }
        } else if (current.equals("S22-2")) {
            if (prev.equals("S21-1")) {
               Main.dir= Main.LEFT;
            } else if (prev.equals("S23-1")) {
               Main.dir=Main.RIGHT;
            }
        } else if (current.equals("S23-1")) {
            if (prev.equals("S22-1") || prev.equals("S22-2")) {
               Main.dir= Main.LEFT;
            } else if (prev.equals("S24-1") || prev.equals("S25-1")) {
               Main.dir=Main.RIGHT;
            }
        } else if (current.equals("S24-1")) {
            if (prev.equals("S23-1")) {
               Main.dir= Main.CROSS_LEFT;
                if (posX <= 300 || posY >= 520) {
                   Main.dir= Main.LEFT;
                }
            } else if (prev.equals("S25-2") || prev.equals("S25-3")) {
               Main.dir=Main.RIGHT;
                if (posX >= 300) {
                   Main.dir= Main.CROSS_RIGHT_UP;
                }
            }
        } else if (current.equals("S25-1")) {
            if (prev.equals("S23-1")) {
               Main.dir= Main.LEFT;
            }
        } else if (current.equals("S25-2")) {
            if (prev.equals("S24-1")) {
               Main.dir= Main.LEFT;
            } else if (prev.equals("S26-1")) {
               Main.dir=Main.RIGHT;
            }
        } else if (current.equals("S25-3")) {
            if (prev.equals("S24-1")) {
               Main.dir= Main.CROSS_LEFT;
                if (posX <= 250 || posY >= 550) {
                   Main.dir= Main.LEFT;
                }
                if (posX <= 100) {
                   Main.dir= Main.CROSS_LEFT_UP;
                }
            } else if (prev.equals("S26-1")) {
               Main.dir= Main.CROSS_RIGHT;
                if (posX >= 100 || posY >= 550) {
                   Main.dir=Main.RIGHT;
                }
                if (posX >= 250) {
                   Main.dir= Main.CROSS_RIGHT_UP;
                }
            }
        } else if (current.equals("S26-1")) {
            if (prev.equals("S25-2") || prev.equals("S25-3")) {
               Main.dir= Main.LEFT;
                if (posX <= 50 || posY >= 550) {
                   Main.dir=Main.DOWN;
                }
                if (posY >= 650) {
                   Main.dir=Main.RIGHT;
                }
            } else if (prev.equals("S27-1")) {
               Main.dir= Main.LEFT;
                if (posX <= 50 && posY > 520) {
                   Main.dir= Main.UP;
                }
                if (posY <= 520) {
                   Main.dir=Main.RIGHT;
                }
            }
        } else if (current.equals("S27-1")) {
            if (prev.equals("S26-1")) {
               Main.dir=Main.RIGHT;
            } else if (prev.equals("S28-1")) {
               Main.dir= Main.LEFT;
            }
        } else if (current.equals("S28-1")) {
            if (prev.equals("S27-1")) {
               Main.dir=Main.RIGHT;
            } else {
               Main.dir= Main.LEFT;
            }
        } else if (current.equals("S29-1")) {
            if (prev == null) {
               Main.dir= Main.LEFT;
            } else if (prev.equals("S28-1")) {
               Main.dir=Main.RIGHT;
            }
        } else if (current.equals("S29-2")) {
            if (prev.equals("S28-1")) {
               Main.dir= Main.CROSS_RIGHT;
                if (posX >= 500 || posY >= 630) {
                   Main.dir=Main.RIGHT;
                }
            } else {
               Main.dir= Main.LEFT;
                if (posX <= 500) {
                   Main.dir= Main.CROSS_LEFT_UP;
                }
            }
        }

    }
}

    