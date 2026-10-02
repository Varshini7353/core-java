package com.book.bookservice;

import com.book.bookservice.atm.Atm;
import com.book.bookservice.attendance.Attendance;
import com.book.bookservice.bankaccount.BankAccount;
import com.book.bookservice.booking.Ticket;
import com.book.bookservice.cosmetics.Cosmetics;
import com.book.bookservice.course.Xworkz;
import com.book.bookservice.gitrepository.GitRepository;
import com.book.bookservice.hotel.Hotel;
import com.book.bookservice.insurance.Insurance;
import com.book.bookservice.laptop.Laptop;
import com.book.bookservice.lib.Book;
import com.book.bookservice.mobile.Mobile;
import com.book.bookservice.restaurant.Restaurant;
import com.book.bookservice.shipping.Order;
import com.book.bookservice.movie.Movie;
import com.book.bookservice.softwareLicense.SoftwareLicense;
import com.book.bookservice.warehouse.Warehouse;

public class BooksRunner {

    public static  void main(String[] args) {

        System.out.println("Main started");
        Book book1 = new Book();
        book1.bookId = 1;
        book1.bookName = "Verity";
        book1.price = 465;
        book1.author="Ramesh kumar";
        book1.publisher = "jeevitha publisher";



        Book book2 = new Book();
        book2.bookId = 2;
        book2.bookName = "Verity";
        book2.price = 465;
        book2.author = "Ramesh kumar";
        book2.publisher = "jeevitha publisher";


        System.out.println("-------------------");
        boolean isEqual = book1.equals(book2);
        System.out.println("is book1 equal to book2: " + isEqual);




        Ticket ticket=new Ticket();
        ticket.ticketId=1;
        ticket.movieName="DC";
        ticket.price=850.00;
        ticket.seatNumber=23;
        ticket.theatreName="Navrang";

        Ticket ticket1=new Ticket();
        ticket1.ticketId=1;
        ticket1.movieName="DC";
        ticket1.price=850.00;
        ticket1.seatNumber=23;
        ticket1.theatreName="Navrang";


        System.out.println("------------------------");
        boolean isEquals=ticket.equals(ticket);
        System.out.println("ticket equals ticket1:" + isEquals);


        Order order=new Order();
        order.orderId=1;
        order.productName="clothes";
        order.address="Bangalore";
        order.price=900.00;
        order.customerName="Varsha";

        Order order1=new Order();
        order1.orderId=1;
        order1.productName="Dumbles";
        order1.address="Bangalore";
        order1.price=900.00;
        order1.customerName="Varsha";


        System.out.println("------------------------------");
        boolean isEquals1=order.equals(order1);
        System.out.println("order equals to order1:"+isEquals1);



        Xworkz course=new Xworkz();
        course.courseId=1;
        course.courseName="Xworkz";
        course.duration="6 months";
        course.fee=30000.00;
        course.location="Vijayanagar";

        Xworkz course1=new Xworkz();
        course1.courseId=1;
        course1.courseName="Xworkz";
        course1.duration="6 months";
        course1.fee=30000.00;
        course1.location="Vijayanagar";

        System.out.println("-----------------------------------");
        boolean isEquals2=course.equals(course1);
        System.out.println("is course equals to course1:"+isEquals2);


        Insurance insurance=new Insurance();
        insurance.policyId=1;
        insurance.policyName="Health insurance";
        insurance.company="LIC";
        insurance.premium=90000.00;
        insurance.policyHolderName="Sreeram";

        Insurance insurance1=new Insurance();
        insurance1.policyId=1;
        insurance1.policyName="Health insurance";
        insurance1.company="LIC";
        insurance1.premium=90000.00;
        insurance1.policyHolderName="Sreeram";


        System.out.println("------------------------------");
        boolean isEquals3=insurance.equals(insurance1);
        System.out.println("insurance equals to insurance1:"+isEquals3);


        Cosmetics cosmetics=new Cosmetics();
        cosmetics.productId=1;
        cosmetics.productName="Lipstick";
        cosmetics.brand="Mac";
        cosmetics.price=900.00;
        cosmetics.address="Bhasham circle";


        Cosmetics cosmetics1=new Cosmetics();
        cosmetics1.productId=3;
        cosmetics1.productName="Lipstick";
        cosmetics1.brand="Mac";
        cosmetics1.price=900.00;
        cosmetics1.address="Bhasham circle";


        System.out.println("-------------------------------------");
        boolean isEquals4=cosmetics.equals(cosmetics1);
        System.out.println("cosmetics equals to cosmetics1:"+isEquals4);


        Hotel hotel=new Hotel();
        hotel.hotelId=101;
        hotel.hotelName="Taj hotel";
        hotel.location="Rajajinagar";
        hotel.famousDish="Chicken biryani";
        hotel.noOfRooms=67;


        Hotel hotel1=new Hotel();
        hotel1.hotelId=101;
        hotel1.hotelName="Taj hotel";
        hotel1.location="Rajajinagar";
        hotel1.famousDish="Chicken biryani";
        hotel1.noOfRooms=67;

        System.out.println("--------------------------");
        boolean isEquals5=hotel.equals(hotel1);
        System.out.println("hotel equals to hotel1:"+isEquals5);


        Movie movie=new Movie();
        movie.movieId=1;
        movie.movieName="Toxic";
        movie.hero="Yash";
        movie.rating=9.7;
        movie.ticketPrice=90;


        Movie movie1=new Movie();
        movie1.movieId=1;
        movie1.movieName="Toxic";
        movie1.hero="Darshan";
        movie1.rating=9.7;
        movie1.ticketPrice=90;


        System.out.println("----------------------------");
        boolean isEquals6=movie.equals(movie1);
        System.out.println("movie equals to movie1:"+isEquals6);


        BankAccount account=new BankAccount();
        account.bankId=1;
        account.accountNumber=897678767;
        account.accountHolder="Abhi";
        account.bankName="Axis bank";
        account.balance=900000.00;


        BankAccount account1=new BankAccount();
        account1.bankId=1;
        account1.accountNumber=897678767;
        account1.accountHolder="Abhi";
        account1.bankName="Axis bank";
        account1.balance=900000.00;


        System.out.println("------------------------------------");
        boolean isEquals7=account.equals(account1);
        System.out.println("account equals to account1:"+isEquals7);



        Mobile mobile=new Mobile();
        mobile.mobileId=12;
        mobile.brand="iphone 17 pro";
        mobile.model="Apple";
        mobile.price=1500000.00;
        mobile.strorage="250GB";


        Mobile mobile1=new Mobile();
        mobile1.mobileId=12;
        mobile1.brand="iphone 13";
        mobile1.model="Apple";
        mobile1.price=1500000.00;
        mobile1.strorage="250GB";


        System.out.println("--------------------------------------");
        boolean isEquals8=mobile.equals(mobile1);
        System.out.println("mobile equals to mobile1:"+isEquals8);



        Laptop laptop=new Laptop();
        laptop.laptopId=1;
        laptop.brand="HP";
        laptop.model="Victus";
        laptop.price=68000.00;
        laptop.processor="ryzen 5";

        Laptop laptop1=new Laptop();
        laptop1.laptopId=3;
        laptop1.brand="HP";
        laptop1.model="Victus";
        laptop1.price=68000.00;
        laptop1.processor="ryzen 5";


        System.out.println("---------------------------------");
        boolean isEquals9=laptop.equals(laptop1);
        System.out.println("laptop equals to laptop1:"+isEquals9);


        Attendance attendance=new Attendance();
        attendance.attendanceId=1;
        attendance.employeeName="Varshini";
        attendance.date="21-09-26";
        attendance.checkInTime="9 am";
        attendance.attendanceStatus="Present";

        Attendance attendance1=new Attendance();
        attendance1.attendanceId=1;
        attendance1.employeeName="Varshini";
        attendance1.date="21-09-26";
        attendance1.checkInTime="9 am";
        attendance1.attendanceStatus="Present";

        System.out.println("---------------------------------");
        boolean isEquals10=attendance.equals(attendance1);
        System.out.println("attendance equals to attendance1:"+isEquals10);



        Restaurant restaurant=new Restaurant();
        restaurant.restaurantId=1;
        restaurant.restaurantName="Silver spoon";
        restaurant.location="Gubbi";
        restaurant.cuisine="Indian";
        restaurant.rating="5 star";

        Restaurant restaurant1=new Restaurant();
        restaurant1.restaurantId=2;
        restaurant1.restaurantName="Silver spoon";
        restaurant1.location="Gubbi";
        restaurant1.cuisine="Indian";
        restaurant1.rating="5 star";


        System.out.println("---------------------------------");
        boolean isEquals11=restaurant.equals(restaurant1);
        System.out.println("restaurant equals to restaurant1:"+isEquals11);


        Warehouse house=new Warehouse();
        house.warehouseId=1;
        house.warehouseName="Distribution Centers";
        house.location="Tumkur";
        house.managerName="Darshan";
        house.capacity="90 sq meters";

        Warehouse house1=new Warehouse();
        house1.warehouseId=1;
        house1.warehouseName="Distribution Centers";
        house1.location="Tumkur";
        house1.managerName="Darshan";
        house1.capacity="90 sq meters";


        System.out.println("---------------------------------");
        boolean isEquals12=house.equals(house1);
        System.out.println("house equals to house1:"+isEquals12);




        Atm atm=new Atm();
        atm.atmId=101;
        atm.location="Vijayanagar";
        atm.bankName="Sbi bank";
        atm.city="Bangalore";
        atm.status="Active";

        Atm atm1=new Atm();
        atm1.atmId=101;
        atm1.location="Vijayanagar";
        atm1.bankName="Sbi bank";
        atm1.city="Bangalore";
        atm1.status="Deactivate";


        System.out.println("---------------------------");
        boolean isEquals13=atm.equals(atm1);
        System.out.println("atm equals to atm1:"+isEquals13);


        GitRepository repository=new GitRepository();
        repository.repositoryId=11;
        repository.repositoryName="Core java";
        repository.ownerName="Varshini";
        repository.visibility="Public";
        repository.branchName="Polymorphism programs";


        GitRepository repository1=new GitRepository();
        repository1.repositoryId=11;
        repository1.repositoryName="Core java";
        repository1.ownerName="Varshini";
        repository1.visibility="Public";
        repository1.branchName="Polymorphism programs";


        System.out.println("--------------------------------------");
        boolean isEquals14=repository.equals(repository1);
        System.out.println("repository equals to repository1:"+isEquals14);




        SoftwareLicense license=new SoftwareLicense();
        license.licenseId=1;
        license.licenseType="Subscription";
        license.softwareName="Adobe Photoshop";
        license.expiryDate="2026-12-01";
        license.licenseKey="A1B2C-D3E4F-G5H6I-J7K8L";


        SoftwareLicense license1=new SoftwareLicense();
        license1.licenseId=1;
        license1.licenseType="Subscription";
        license1.softwareName="Adobe Photoshop";
        license1.expiryDate="2026-12-01";
        license1.licenseKey="A1B2C-D3E4F-G5H6I-J7K8L";


        System.out.println("--------------------------------------");
        boolean isEquals15=license.equals(license1);
        System.out.println("license equals to license1:"+isEquals15);



















    }
}
