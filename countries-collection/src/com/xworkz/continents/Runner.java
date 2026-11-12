package com.xworkz.continents;

import java.util.ArrayList;
import java.util.Collection;

public class Runner {

    public static void main(String[] args) {

        Collection asiaContinent = new ArrayList();
        Collection antarctica = new ArrayList();
        Collection southAmerica = new ArrayList();
        Collection northAmerica = new ArrayList();
        Collection africa = new ArrayList();
        Collection europe = new ArrayList();
        Collection Australia = new ArrayList();

        //add
        asiaContinent.add("India");
        asiaContinent.add("Nepal");
        asiaContinent.add("Pakistan");
        asiaContinent.add("Srilanka");

        //add
        africa.add("Egypt");
        africa.add("Sudan");
        africa.add("Nigeria");

        //add
        europe.add("Iceland");
        europe.add("Swedan");
        europe.add("Denmark");

        Collection worldContinents = new ArrayList();

        //addAll
        worldContinents.addAll(asiaContinent);
        worldContinents.addAll(antarctica);
        worldContinents.addAll(southAmerica);
        worldContinents.addAll(northAmerica);
        worldContinents.addAll(africa);
        worldContinents.addAll(europe);
        worldContinents.addAll(Australia);

        //size
        System.out.println(asiaContinent.size());
        System.out.println(asiaContinent);

        //contains
        boolean hasAfrica = africa.contains("Sudan");
        System.out.println(hasAfrica);

        boolean hasAsia = asiaContinent.contains("BanglaDesh");
        System.out.println(hasAsia);

        //containsAll
        boolean hasCountries = asiaContinent.containsAll(africa);
        System.out.println(hasCountries);

        boolean hasEurope = europe.containsAll(europe);
        System.out.println(hasEurope);

        //isEmpty
        System.out.println("Is continents empty now:"+ worldContinents.isEmpty());

        //remove
        asiaContinent.remove("Pakistan");
        System.out.println(asiaContinent);

        //removeAll
        worldContinents.removeAll(europe);
        System.out.println(worldContinents);

        //clear
        worldContinents.clear();
        System.out.println(worldContinents);

        //retainAll
        worldContinents.retainAll(asiaContinent);
        System.out.println(asiaContinent);




    }
}
