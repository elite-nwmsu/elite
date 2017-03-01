/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sss;

/**
 *
 * @author S525724
 */
public class Point {
    public int x, y;

        public Point(int x, int y) {
            // TODO Auto-generated constructor stub
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            String s = "x: " + x + " y: " + y;
            return s;
        }
}
