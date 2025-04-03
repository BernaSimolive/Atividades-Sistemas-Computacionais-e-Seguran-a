package org.example.service;

import org.example.domain.Hast;
import org.example.domain.Names;

import java.util.ArrayList;
import java.util.List;

public class HastService {
    private static String[][] headquarters;
    private static List<Names> hasts = new ArrayList<>();

    public static void initializeHeadquarters(int rows) {
        headquarters = new String[rows][];
    }
    public static void createHast(int jagged, int line){
            headquarters[jagged] = new String[line];
    }

    public static void  registerHast(int jagged , int line, Names value){
//        var num = jagged +""+ line;
//        headquarters[jagged][line] = value;
//        hasts.add(new Hast(Integer.parseInt(num)));
        System.out.println(headquarters[jagged][line]);
    }
}
