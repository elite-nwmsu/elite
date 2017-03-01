/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sss;

import static sss.Main.CROSS_LEFT;
import static sss.Main.CROSS_LEFT_UP;
import static sss.Main.CROSS_RIGHT;
import static sss.Main.CROSS_RIGHT_UP;
import static sss.Main.DOWN;
import static sss.Main.LEFT;
import static sss.Main.RIGHT;
import static sss.Main.UP;
import static sss.Main.b2r;
import static sss.Main.current;
import static sss.Main.dir;
import static sss.Main.fdown;
import static sss.Main.flag;
import static sss.Main.fleft;
import static sss.Main.freightX;
import static sss.Main.freightY;
import static sss.Main.fright;
import static sss.Main.fspeed;
import static sss.Main.fup;
import static sss.Main.next;
import static sss.Main.nextStop;
import static sss.Main.picked_stations;
import static sss.Main.posX;
import static sss.Main.posY;
import static sss.Main.speed;
import static sss.Main.speedLimit;
import static sss.Main.startTime;
import static sss.Main.visited;

/**
 *
 * @author S525909
 */
public class OnTrack {
    
    public static void moveIt() {
        while (true) {
            //System.out.println(prev + " " + current + " " + dir + " " + posX + " " + posY);
            Main.speed_text.setText("Speed: " + (int) (speed * 100));

            if (fright) {
                freightX += fspeed;
                if (freightX > 640) {
                    fright = false;
                    fup = true;
                }
            }
            if (fup) {
                freightY -= fspeed;
                if (freightY < 290) {
                    fup = false;
                    fleft = true;
                }
            }
            if (fleft) {
                freightX -= fspeed;
                if (freightX < 25) {
                    fleft = false;
                    fdown = true;
                } else if (freightX < 300) {
                    fdown = false;
                } else if (freightX < 400) {
                    fdown = true;
                }

            }
            if (fdown) {
                freightY += fspeed;
                if (freightY > 670) {
                    fdown = false;
                    fright = true;
                }
            }
            if (speed != 0) {

                if (!flag) {
                    if ((posX >= 600 && posX <= 610) && current.equals("S5-2")) {
                        if (picked_stations.contains("Alewife")) {
                            if ((b2r == 1 && visited.get("Alewife") == 0) || (b2r == 0 && visited.get("Alewife") == 1)) {
                                speed = 0;
                                flag = true;
                                startTime = System.currentTimeMillis();
                               System.out.println("Waiting at Alewife station");
                                if (b2r == 1) {
                                    visited.put("Alewife", 1);
                                } else {
                                    visited.put("Alewife", 2);
                                }
                                continue;
                            }

                        }
                    } else if ((posX >= 600 && posX <= 610) && current.equals("S5-1")) {
                        if (picked_stations.contains("Alewife")) {
                            if ((b2r == 1 && visited.get("Alewife") == 0) || (b2r == 0 && visited.get("Alewife") == 1)) {
                                speed = 0;
                                flag = true;
                                startTime = System.currentTimeMillis();
                                System.out.println("Waiting at Alewife station");
                                if (b2r == 1) {
                                    visited.put("Alewife", 1);
                                } else {
                                    visited.put("Alewife", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX >= 150 && posX <= 160) && current.equals("S10-1")) {
                        if (picked_stations.contains("Medford")) {
                            if ((b2r == 1 && visited.get("Medford") == 0) || (b2r == 0 && visited.get("Medford") == 1)) {
                                speed = 0;
                                flag = true;
                                startTime = System.currentTimeMillis();
                                System.out.println("Waiting at Medford station");
                                if (b2r == 1) {
                                    visited.put("Medford", 1);
                                } else {
                                    visited.put("Medford", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX >= 150 && posX <= 160) && current.equals("S10-2")) {
                        if (picked_stations.contains("Medford")) {
                            if ((b2r == 1 && visited.get("Medford") == 0) || (b2r == 0 && visited.get("Medford") == 1)) {
                                speed = 0;
                                flag = true;
                                startTime = System.currentTimeMillis();
                                System.out.println("Waiting at Medford station");
                                if (b2r == 1) {
                                    visited.put("Medford", 1);
                                } else {
                                    visited.put("Medford", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX >= 410 && posX <= 420) && current.equals("S19-1")) {
                        if (picked_stations.contains("Melrose")) {
                            if ((b2r == 1 && visited.get("Melrose") == 0) || (b2r == 0 && visited.get("Melrose") == 1)) {
                                speed = 0;
                                flag = true;
                                startTime = System.currentTimeMillis();
                                System.out.println("Waiting at Melrose station");
                                if (b2r == 1) {
                                    visited.put("Melrose", 1);
                                } else {
                                    visited.put("Melrose", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX >= 410 && posX <= 420) && current.equals("S19-2")) {
                        if (picked_stations.contains("Melrose")) {
                            if ((b2r == 1 && visited.get("Melrose") == 0) || (b2r == 0 && visited.get("Melrose") == 1)) {
                                speed = 0;
                                flag = true;
                                startTime = System.currentTimeMillis();
                                System.out.println("Waiting at Melrose station");
                                if (b2r == 1) {
                                    visited.put("Melrose", 1);
                                } else {
                                    visited.put("Melrose", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX >= 110 && posX <= 120) && current.equals("S25-2")) {
                        if (picked_stations.contains("Stoneham")) {
                            if ((b2r == 1 && visited.get("Stoneham") == 0) || (b2r == 0 && visited.get("Stoneham") == 1)) {
                                speed = 0;
                                flag = true;
                                startTime = System.currentTimeMillis();
                                System.out.println("Waiting at Stoneham station");
                                if (b2r == 1) {
                                    visited.put("Stoneham", 1);
                                } else {
                                    visited.put("Stoneham", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX >= 110 && posX <= 120) && current.equals("S25-3")) {
                        if (picked_stations.contains("Stoneham")) {
                            if ((b2r == 1 && visited.get("Stoneham") == 0) || (b2r == 0 && visited.get("Stoneham") == 1)) {
                                speed = 0;
                                flag = true;
                                startTime = System.currentTimeMillis();
                                System.out.println("Waiting at Stoneham station");
                                if (b2r == 1) {
                                    visited.put("Stoneham", 1);
                                } else {
                                    visited.put("Stoneham", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX >= 510 && posX <= 520) && current.equals("S29-1")) {
                        if (picked_stations.contains("Reading")) {
                            if ((b2r == 1 && visited.get("Reading") == 0) || (b2r == 0 && visited.get("Reading") == 1)) {
                                speed = 0;
                                flag = true;
                                startTime = System.currentTimeMillis();
                                System.out.println("Waiting at Reading station");
                                if (b2r == 1) {
                                    visited.put("Reading", 1);
                                } else {
                                    visited.put("Reading", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX >= 510 && posX <= 520) && current.equals("S29-2")) {
                        if (picked_stations.contains("Reading")) {
                            if ((b2r == 1 && visited.get("Reading") == 0) || (b2r == 0 && visited.get("Reading") == 1)) {
                                speed = 0;
                                flag = true;
                                startTime = System.currentTimeMillis();
                                System.out.println("Waiting at Reading station");
                                if (b2r == 1) {
                                    visited.put("Reading", 1);
                                } else {
                                    visited.put("Reading", 2);
                                }
                                continue;
                            }
                        }
                    }
                }

                /*System.out.println(posX + " " + posY + " " + nextStop + " DIR: " + dir);
				System.out.println(current + " " + next_section);
				System.out.println(next);*/
                if (dir == RIGHT) {
                    posX += speed;
                    if (posX >= nextStop.x) {
                        // posX = nextStop.x;
                        if (!next.isEmpty()) {
                            nextStop = next.poll();
                        } else {
                            Route.updateNext();
                        }
                        Route.updateDir();
                    }
                } else if (dir == LEFT) {
                    posX -= speed;
                    if (posX <= nextStop.x) {
                        // posX = nextStop.x;
                        if (!next.isEmpty()) {
                            nextStop = next.poll();
                        } else {
                            Route.updateNext();
                        }
                        Route.updateDir();
                    }
                } else if (dir == UP) {
                    posY -= speed;
                    if (posY <= nextStop.y) {
                        // posY = nextStop.y;
                        if (!next.isEmpty()) {
                            nextStop = next.poll();
                        } else {
                            Route.updateNext();
                        }
                        Route.updateDir();
                    }
                } else if (dir == DOWN) {
                    posY += speed;
                    if (posY >= nextStop.y) {
                        // posY = nextStop.y;
                        if (!next.isEmpty()) {
                            nextStop = next.poll();
                        } else {
                            Route.updateNext();
                        }
                        Route.updateDir();
                    }
                } else if (dir == CROSS_RIGHT) {
                    posX += speed;
                    posY += speed;
                    if (posY >= nextStop.y || posX >= nextStop.x) {
                        // posY = nextStop.y;
                        if (!next.isEmpty()) {
                            nextStop = next.poll();
                        } else {
                            Route.updateNext();
                        }
                        Route.updateDir();
                    }
                } else if (dir == CROSS_LEFT) {
                    posX -= speed;
                    posY += speed;
                    if (posY >= nextStop.y || posX <= nextStop.x) {
                        // posY = nextStop.y;
                        if (!next.isEmpty()) {
                            nextStop = next.poll();
                        } else {
                            Route.updateNext();
                        }
                        Route.updateDir();
                    }
                } else if (dir == CROSS_LEFT_UP) {
                    posX -= speed;
                    posY -= speed;
                    if (posY <= nextStop.y || posX <= nextStop.x) {
                        // posY = nextStop.y;
                        if (!next.isEmpty()) {
                            nextStop = next.poll();
                        } else {
                            Route.updateNext();
                        }
                        Route.updateDir();
                    }
                } else if (dir == CROSS_RIGHT_UP) {
                    posX += speed;
                    posY -= speed;
                    if (posY <= nextStop.y || posX >= nextStop.x) {
                        // posY = nextStop.y;
                        if (!next.isEmpty()) {
                            nextStop = next.poll();
                        } else {
                            Route.updateNext();
                        }
                        Route.updateDir();
                    }
                }
            } else {
                if (flag) {
                    if (System.currentTimeMillis() - startTime >= 2000) {
                        flag = false;
                        System.out.println("Leaving station");
                        speed = speedLimit.get(current) / 100.0;
                    }
                }
            }
            try {
                Thread.sleep(10);
            } catch (Exception exc) {
            }
            Main.frame.repaint();
        }
    }

    
}
