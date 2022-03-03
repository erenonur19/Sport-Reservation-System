import java.util.Scanner;

public class Reservation {
    Object object;
    private String TCNo;
    private boolean pay=false;


    Reservation(Object object,String TCNo, boolean pay){
        this.object=object;
        this.TCNo=TCNo;
        this.pay=pay;


    }

    public void payy(Reservation reservation){
        System.out.println("****************Redirecting to Payment Screen****************");

        System.out.println("Options: \n" +
                "1.By Internet\n"+
                "2.By Hand");
        Scanner input=new Scanner(System.in);
        String operation4=input.nextLine();
        if(operation4.equals("1")){
            reservation.setPay(true);
        }
        else if(operation4.equals("2")){
            reservation.setPay(false);
        }

        System.out.println("Please enter your TCK No: ");
        String operation5=input.nextLine();
        reservation.setTCNo(operation5);

        System.out.println("Your reservation organized succesfully.\n" + "TCK No: "+ reservation.getTCNo());
        System.out.println("Payment status: " + reservation.isPay());
        System.out.println(reservation.object);





        ;

    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getTCNo() {
        return TCNo;
    }

    public void setTCNo(String TCNo) {
        this.TCNo = TCNo;
    }

    public String isPay() {
        if (pay){
            return "Fee is Paid.";
        }
        else
            return "Fee is not Paid.";

    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }
    public boolean getPay() {
        return pay;
    }









}

