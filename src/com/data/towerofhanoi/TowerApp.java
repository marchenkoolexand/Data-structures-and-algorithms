package com.data.towerofhanoi;

public class TowerApp {

    static int nDisk = 3;

    public static void main(String[] args) {
        doTower(nDisk, 'A', 'B', 'C');
    }

    public static void doTower(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.print("Disk 1 from" + from + " to " + to);
        } else {
            doTower(topN - 1, from, to, inter);
            System.out.println("Disk " + topN + " from " + from + " to " + to);
            doTower(topN - 1, inter, from, to);
        }
    }
}
