//package Employee;
//
//public class Calc {
//    public  static boolean empos(){
//        //Data
//
//        String name =  "No Name";
//        String position = "Null";
//        int salary =  10;
//        int bonus = 20;
//
//        int receptionist = 400;
//        int security = 300;
//        int accountant = 600;
//        int frontend = 1400;
//        int fullstack = 2400;
//        int backend = 1800;
//
//        void  calSalary(String name, String position, int salary,  int bonus){
//            this.name = name;
//            this.position = position;
//            this.salary = salary;
//            this.bonus = bonus;
//        }
//
//
//
//        void calculator(String position){
//    //        System.out.println("Receptionist, Security, Accountant, Frontend, Backend, Fullstack");
//            if(position == 'Receptionist'  :  '"receptionist'){
//                System.out.println('Heki');
//    }
//}
//}

package Employee;

public class Calc {
//    public  static String empos() {
    //Data

    String name = "No Name";
    String position = "Null";
    int salary = 0;
    int bonus = 20;

//    int receptionist = 400;
//    int security = 300;
//    int accountant = 600;
//    int frontend = 1400;
//    int fullstack = 2400;
//    int backend = 1800;


    void setData(String name, String position){
        this.name  =name;
            this.position =position;
}

void setAmount(){
    if(position  ==  "Accountant"){
        salary =  600;
        bonus  = 289;
        int inal =  salary + bonus;

        System.out.println("Mr/Mrs/Miss " + name + " Your Salary For This Month Is " +  salary + " And You Recieved A Bonus Of " + bonus + " So You Would Be Recieving " + inal + " for this month as your total pay");
    }else if(position  ==  "Receptionist"){
        salary =  400;
        bonus  = 129;
        int inal = salary + bonus;
        System.out.println("Mr/Mrs/Miss " + name + " Your Salary For This Month Is " +  salary + " And You Recieved A Bonus Of " + bonus + " So You Would Be Recieving " + inal + " for this month as your total pay");
    }else if(position  ==  "Security"){
        salary =  300;
        bonus  = 113;
        int inal = salary + bonus;
        System.out.println("Mr/Mrs/Miss " + name + " Your Salary For This Month Is " +  salary + " And You Recieved A Bonus Of " + bonus + " So You Would Be Recieving " + inal + " for this month as your total pay");
    }else if(position  ==  "Frontend"){
        salary =  1400;
        bonus  = 423;
        int inal = salary + bonus;
        System.out.println("Mr/Mrs/Miss " + name + " Your Salary For This Month Is " +  salary + " And You Recieved A Bonus Of " + bonus + " So You Would Be Recieving " + inal + " for this month as your total pay");
    }else if(position  ==  "Fullstack"){
        salary =  2400;
        bonus  = 513;
        int inal = salary + bonus;
        System.out.println("Mr/Mrs/Miss " + name + " Your Salary For This Month Is " +  salary + " And You Recieved A Bonus Of " + bonus + " So You Would Be Recieving " + inal + " for this month as your total pay");
    }else if(position  ==  "Backend"){
        salary =  1800;
        bonus  = 473;
        int inal = salary + bonus;
        System.out.println("Mr/Mrs/Miss " + name + " Your Salary For This Month Is " +  salary + " And You Recieved A Bonus Of " + bonus + " So You Would Be Recieving " + inal + " for this month as your total pay");
    }else{
        System.out.println("Sorry Mr/Mrs/Miss " + name  + " Your are not Registered To Our Company.");
    }
}




    }
//}