package org.example.service;

import org.example.domain.Names;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NamesService {
    private static final List<Names> names = new ArrayList<>();

    public static void registerName(Names name){
       names.add(name);
    }

    public static List<Names> getNames() {
        return Collections.unmodifiableList(names);
    }


}
