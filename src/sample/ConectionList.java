package sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConectionList {
    public static void main(String[] args) {
        ArrayList<Integer>[] al = new ArrayList[1276];
        for (int i = 0; i < 1276; i++) {
            al[i] = new ArrayList<Integer>();
        }
        for (int i = 1; i <1276 ; i++) {
            //List<Integer> l1=new ArrayList<Integer>();
            if(i%25==0)al[i].add(i-1);
            if(i%25==4)al[i].add(i+1);
            if(i>25)al[i].add(i-25);
            if(i<1251)al[i].add(i+25);
        }
        for (int i = 0; i <1275 ; i++) {
            System.out.println(al[i]);
        }
    }
}
