package sss;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

final public class Main {

    public static JFrame frame;
    public static DrawPanel drawPanel;
    public static JLabel speed_text;

    public static int b2r = 1;

    public static long startTime;
    public static boolean flag = false;
    public static boolean fileRead = false;

    public static int freightX = 40;
    public static int freightY = 670;
    public static double fspeed = 0;
    public static boolean fup = false, fdown = false, fleft = false, fright = true, fcorner = false;

    public static double posX = 40, posY = 35;
    public static double speed = 0.0;
    public static boolean tup = false, tdown = false, tleft = false, tright = true;
    public static int location = 0;
    public static Queue<Point> next = new LinkedList<Point>();
    public static Point nextStop;

    public static String[] stations = {"Medford", "Alewife", "Melrose", "Stoneham"};
    public static ArrayList<String> picked_stations = new ArrayList<>();
    public static HashMap<String, String> sec2sta = new HashMap<>();
    public static HashMap<String, Integer> visited = new HashMap<>();

    public static HashMap<String, ArrayList<Point>> sections = new HashMap<>();
    public static HashMap<String, Integer> speedLimit = new HashMap<>();
    public static HashMap<String, Point> switches = new HashMap<>();
    public static String[] route;
    public static String current, next_section, prev;

    public static final int LEFT = 0, RIGHT = 1, UP = 2, DOWN = 3, CROSS_RIGHT = 4, CROSS_LEFT = 5, CROSS_RIGHT_UP = 6,
            CROSS_LEFT_UP = 7;
    public static int dir = RIGHT;

    Main() {
        Random rand = new Random();
        int id1 = rand.nextInt(stations.length);
        picked_stations.add(stations[id1]);
        int id2;
        while ((id2 = rand.nextInt(stations.length)) == id1);
        picked_stations.add(stations[id2]);

        visited.put(picked_stations.get(0), 0);
        visited.put(picked_stations.get(1), 0);

        sec2sta.put("S1-1", "Boston");
        sec2sta.put("S1-3", "Boston");
        sec2sta.put("S10-1", "Medford");
        sec2sta.put("S10-2", "Medford");
        sec2sta.put("S5-1", "Alewife");
        sec2sta.put("S5-2", "Alewife");
        sec2sta.put("S19-1", "Melrose");
        sec2sta.put("S19-2", "Melrose");
        sec2sta.put("S25-1", "Stoneham");
        sec2sta.put("S25-2", "Stoneham");
        sec2sta.put("S25-3", "Stoneham");
        sec2sta.put("S29-1", "Reading");
        sec2sta.put("S29-2", "Reading");
    }

    /*
	 * private int oneX = 7; private int oneY = 7;
	 * 
	 * boolean up = false; boolean down = true; boolean left = false; boolean
	 * right = true;
     */
    public static void main(String[] args) {

        new Main().go();
    }

    private void go() {

        frame = new JFrame("Train Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        JPanel buttonPanel = new JPanel();
        JButton start = new JButton("Start");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (!fileRead) {
                    TrackDatabase.generateRoute();
                    TrackDatabase.readTrackdb();
                    fileRead = true;
                }
                fspeed = 1;
                if (location < 0) {
                    location = 0;
                }
                if (location < route.length) {
                    current = route[location];
                }
                // updateNext();
                if (current.equals("S1-1")) {
                    TrackDatabase.generateRoute();
                    TrackDatabase.readTrackdb();
                    dir = RIGHT;
                    location = 0;
                    nextStop = new Point(200, 50);
                } else if (current.equals("S29-1")) {
                    location = route.length - 1;
                    nextStop = new Point(450, 600);
                }
                if (b2r == 1) {
                    if (location + 1 < route.length) {
                        next_section = route[location + 1];
                    }
                } else {
                    if (location - 1 >= 0) {
                        next_section = route[location - 1];
                    }
                }
                speed = speedLimit.get(current) / 100.0;
            }
        });
        buttonPanel.add(start);
        JButton stop = new JButton("Stop");
        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                speed = 0;
            }
        });
        buttonPanel.add(stop);
        speed_text = new JLabel();
        buttonPanel.add(speed_text);
        frame.getContentPane().add(BorderLayout.PAGE_END, buttonPanel);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(700, 765);
        frame.setLocation(375, 0);

        OnTrack.moveIt();
    }

}
