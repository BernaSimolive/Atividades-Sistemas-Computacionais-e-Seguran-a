package org.example;

import org.example.domain.Hast;
import org.example.domain.Names;
import org.example.service.HastService;
import org.example.service.NamesService;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean stop = true;

        while (stop){
            Names names = new Names();
            System.out.println("DIGITA UM NOME: ");
            names.setName(keyboard.next());
            NamesService.registerName(names);
            System.out.println("QUER PARA ? false SIM  true PARA NÃO");
            stop = Boolean.parseBoolean(keyboard.next());
        }
        var list = NamesService.getNames();
        List<Hast> hasts = new ArrayList<>();
        for (Names names : list) {
            hasts.add(new Hast(names.getName().length(),0,0,names));
        }
        Collections.sort(hasts);
        HastService.initializeHeadquarters(hasts.getLast().getNumber()+1);
        System.out.println(hasts);
        System.out.println("numero repetidos removido");
        Set<Hast> hastSet = new HashSet<>(hasts);

        for (Hast i: hastSet){
            int count = Collections.frequency(hasts, i);
            System.out.println("frequencia "+ i.getNumber()+"------"+ count);
           HastService.createHast(i.getNumber(),count);
        }





    }
}