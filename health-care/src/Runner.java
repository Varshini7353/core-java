import com.xworkz.fortis.doctor.Doctor;



public class Runner extends RuntimeException {


    public static void main(String[] args) {

        System.out.println("Main started");

        try {
            Class<Doctor> doctorClass = (Class<Doctor>) Class.forName("com.xworkz.fortis.doctor.Doctor");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }




        //outofmemoryerror
        int a[]=new int[100000*100000];

        try {
            m1();
        }catch (Exception e){
            e.printStackTrace();

        }
        System.out.println("Main ended");
    }

    public static  void m1 ()throws Exception{
        System.out.println("m1 started");

        try {
            m2();
        }catch (Exception ee){

        }

        System.out.println("m2 ended");
    }

    public static void m2() throws Exception{
        System.out.println("m2 stared");

        try {
            m3();
        }catch (Exception ee){

        }

        System.out.println("m3 ended");
    }

    public static void m3() throws Exception{
        System.out.println("m3 started");

       //try {
         //   String str = null;
           // str.equals("");
        //}catch (Exception ee){

        //}
        //stackoverflowerror

        m2();



        System.out.println("m3 eneded");


    }
}
