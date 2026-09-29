package com.transportation.buses;

import com.transportation.buses.bmtc.Bmtc;
import com.transportation.buses.platform.Platform;

public class BmtcRunner {

    public static void main(String[] args) {

        Bmtc bmtc=new Bmtc();

        String[] buses1 = {"500D", "500A", "500C", "500N"};
        String[] buses2 = {"201R", "201", "201A", "201B"};
        String[] buses3 = {"335E", "335", "335A", "335B"};
        String[] buses4 = {"365", "365A", "365B", "365C"};
        String[] buses5 = {"500K", "500L", "500M", "500P"};
        String[] buses6 = {"401K", "401", "401A", "401B"};
        String[] buses7 = {"210", "210A", "210B", "210C"};
        String[] buses8 = {"600", "600A", "600B", "600C"};
        String[] buses9 = {"290", "290A", "290B", "290C"};
        String[] buses10 = {"171", "171A", "171B", "171C"};
        String[] buses11 = {"25", "25A", "25B", "25C"};
        String[] buses12 = {"215", "215A", "215B", "215C"};
        String[] buses13 = {"201", "201A", "201B", "201C"};
        String[] buses14 = {"356", "356A", "356B", "356C"};
        String[] buses15 = {"600K", "600L", "600M", "600N"};
        String[] buses16 = {"500", "500A", "500B", "500C"};
        String[] buses17 = {"411", "411A", "411B", "411C"};
        String[] buses18 = {"362", "362A", "362B", "362C"};
        String[] buses19 = {"335", "335A", "335B", "335C"};
        String[] buses20 = {"171A", "171B", "171C", "171D"};
        String[] buses21 = {"210A", "210B", "210C", "210D"};
        String[] buses22 = {"401", "401A", "401B", "401C"};
        String[] buses23 = {"500D", "500E", "500F", "500G"};
        String[] buses24 = {"365A", "365B", "365C", "365D"};
        String[] buses25 = {"290A", "290B", "290C", "290D"};
        String[] buses26 = {"335E", "335F", "335G", "335H"};


        Platform platform = new Platform();
        platform.setPlatformId(1);
        platform.setPlatformName("Platform 1");
        platform.setBusNumber("500D");
        platform.setDestination("Electronic City");
        platform.setDepartureTime("08:30 AM");
        platform.setBuses(buses1);

        Platform platform1 = new Platform();
        platform1.setPlatformId(2);
        platform1.setPlatformName("Platform 2");
        platform1.setBusNumber("201R");
        platform1.setDestination("Banashankari");
        platform1.setDepartureTime("08:45 AM");
        platform1.setBuses(buses2);

        Platform platform2 = new Platform();
        platform2.setPlatformId(3);
        platform2.setPlatformName("Platform 3");
        platform2.setBusNumber("335E");
        platform2.setDestination("Majestic");
        platform2.setDepartureTime("09:00 AM");
        platform2.setBuses(buses3);

        Platform platform3 = new Platform();
        platform3.setPlatformId(4);
        platform3.setPlatformName("Platform 4");
        platform3.setBusNumber("365");
        platform3.setDestination("Kempegowda Bus Station");
        platform3.setDepartureTime("09:15 AM");
        platform3.setBuses(buses4);

        Platform platform4 = new Platform();
        platform4.setPlatformId(5);
        platform4.setPlatformName("Platform 5");
        platform4.setBusNumber("500K");
        platform4.setDestination("Silk Board");
        platform4.setDepartureTime("09:30 AM");
        platform4.setBuses(buses5);

        Platform platform5 = new Platform();
        platform5.setPlatformId(6);
        platform5.setPlatformName("Platform 6");
        platform5.setBusNumber("401K");
        platform5.setDestination("Yelahanka");
        platform5.setDepartureTime("09:45 AM");
        platform5.setBuses(buses6);

        Platform platform6 = new Platform();
        platform6.setPlatformId(7);
        platform6.setPlatformName("Platform 7");
        platform6.setBusNumber("210");
        platform6.setDestination("Kengeri");
        platform6.setDepartureTime("10:00 AM");
        platform6.setBuses(buses7);

        Platform platform7 = new Platform();
        platform7.setPlatformId(8);
        platform7.setPlatformName("Platform 8");
        platform7.setBusNumber("600");
        platform7.setDestination("Bannerghatta");
        platform7.setDepartureTime("10:15 AM");
        platform7.setBuses(buses8);

        Platform platform8 = new Platform();
        platform8.setPlatformId(9);
        platform8.setPlatformName("Platform 9");
        platform8.setBusNumber("290");
        platform8.setDestination("Hebbal");
        platform8.setDepartureTime("10:30 AM");
        platform8.setBuses(buses9);

        Platform platform9 = new Platform();
        platform9.setPlatformId(10);
        platform9.setPlatformName("Platform 10");
        platform9.setBusNumber("171");
        platform9.setDestination("Jayanagar");
        platform9.setDepartureTime("10:45 AM");
        platform9.setBuses(buses10);

        Platform platform10 = new Platform();
        platform10.setPlatformId(11);
        platform10.setPlatformName("Platform 11");
        platform10.setBusNumber("25");
        platform10.setDestination("Shivajinagar");
        platform10.setDepartureTime("11:00 AM");
        platform10.setBuses(buses11);

        Platform platform11 = new Platform();
        platform11.setPlatformId(12);
        platform11.setPlatformName("Platform 12");
        platform11.setBusNumber("215");
        platform11.setDestination("Vijayanagar");
        platform11.setDepartureTime("11:15 AM");
        platform11.setBuses(buses12);

        Platform platform12 = new Platform();
        platform12.setPlatformId(13);
        platform12.setPlatformName("Platform 13");
        platform12.setBusNumber("201");
        platform12.setDestination("Banashankari");
        platform12.setDepartureTime("11:30 AM");
        platform12.setBuses(buses13);

        Platform platform13 = new Platform();
        platform13.setPlatformId(14);
        platform13.setPlatformName("Platform 14");
        platform13.setBusNumber("356");
        platform13.setDestination("Rajajinagar");
        platform13.setDepartureTime("11:45 AM");
        platform13.setBuses(buses14);

        Platform platform14 = new Platform();
        platform14.setPlatformId(15);
        platform14.setPlatformName("Platform 15");
        platform14.setBusNumber("600K");
        platform14.setDestination("Bannerghatta");
        platform14.setDepartureTime("12:00 PM");
        platform14.setBuses(buses15);

        Platform platform15 = new Platform();
        platform15.setPlatformId(16);
        platform15.setPlatformName("Platform 16");
        platform15.setBusNumber("500");
        platform15.setDestination("Electronic City");
        platform15.setDepartureTime("12:15 PM");
        platform15.setBuses(buses16);


        Platform platform16 = new Platform();
        platform16.setPlatformId(17);
        platform16.setPlatformName("Platform 17");
        platform16.setBusNumber("411");
        platform16.setDestination("Kengeri");
        platform16.setDepartureTime("12:30 PM");
        platform16.setBuses(buses17);

        Platform platform17 = new Platform();
        platform17.setPlatformId(18);
        platform17.setPlatformName("Platform 18");
        platform17.setBusNumber("362");
        platform17.setDestination("Jayanagar");
        platform17.setDepartureTime("12:45 PM");
        platform17.setBuses(buses18);

        Platform platform18 = new Platform();
        platform18.setPlatformId(19);
        platform18.setPlatformName("Platform 19");
        platform18.setBusNumber("335");
        platform18.setDestination("Majestic");
        platform18.setDepartureTime("01:00 PM");
        platform18.setBuses(buses19);


        Platform platform19 = new Platform();
        platform19.setPlatformId(20);
        platform19.setPlatformName("Platform 20");
        platform19.setBusNumber("171A");
        platform19.setDestination("Shivajinagar");
        platform19.setDepartureTime("01:15 PM");
        platform19.setBuses(buses20);

        Platform platform20 = new Platform();
        platform20.setPlatformId(21);
        platform20.setPlatformName("Platform 21");
        platform20.setBusNumber("210A");
        platform20.setDestination("Kengeri");
        platform20.setDepartureTime("01:30 PM");
        platform20.setBuses(buses21);

        Platform platform21 = new Platform();
        platform21.setPlatformId(22);
        platform21.setPlatformName("Platform 22");
        platform21.setBusNumber("401");
        platform21.setDestination("Yelahanka");
        platform21.setDepartureTime("01:45 PM");
        platform21.setBuses(buses22);

        Platform platform22 = new Platform();
        platform22.setPlatformId(23);
        platform22.setPlatformName("Platform 23");
        platform22.setBusNumber("500D");
        platform22.setDestination("Electronic City");
        platform22.setDepartureTime("02:00 PM");
        platform22.setBuses(buses23);


        Platform platform23 = new Platform();
        platform23.setPlatformId(24);
        platform23.setPlatformName("Platform 24");
        platform23.setBusNumber("365A");
        platform23.setDestination("Kempegowda Bus Station");
        platform23.setDepartureTime("02:15 PM");
        platform23.setBuses(buses24);

        Platform platform24 = new Platform();
        platform24.setPlatformId(25);
        platform24.setPlatformName("Platform 25");
        platform24.setBusNumber("290A");
        platform24.setDestination("Hebbal");
        platform24.setDepartureTime("02:30 PM");
        platform24.setBuses(buses25);

        Platform platform25 = new Platform();
        platform25.setPlatformId(26);
        platform25.setPlatformName("Platform 26");
        platform25.setBusNumber("335E");
        platform25.setDestination("Majestic");
        platform25.setDepartureTime("02:45 PM");
        platform25.setBuses(buses26);


        bmtc.addBuses(platform);
        bmtc.addBuses(platform1);
        bmtc.addBuses(platform2);
        bmtc.addBuses(platform3);
        bmtc.addBuses(platform4);
        bmtc.addBuses(platform5);
        bmtc.addBuses(platform6);
        bmtc.addBuses(platform7);
        bmtc.addBuses(platform8);
        bmtc.addBuses(platform9);
        bmtc.addBuses(platform10);
        bmtc.addBuses(platform11);
        bmtc.addBuses(platform12);
        bmtc.addBuses(platform13);
        bmtc.addBuses(platform14);
        bmtc.addBuses(platform15);
        bmtc.addBuses(platform16);
        bmtc.addBuses(platform17);
        bmtc.addBuses(platform18);
        bmtc.addBuses(platform19);
        bmtc.addBuses(platform20);
        bmtc.addBuses(platform21);
        bmtc.addBuses(platform22);
        bmtc.addBuses(platform23);
        bmtc.addBuses(platform24);
        bmtc.addBuses(platform25);
        bmtc.getBusInfo();



    }
}
