import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String menu;

        menu="Welcome to SportReservation System\n" +
                "**************\n" +
                "Please choose the activity that you want to reservate : \n" +
                "1)Footbal\n" +
                "2)Swimming\n" +
                "3)Gym\n" +
                "Press q to exit ";
        Scanner input =new Scanner(System.in);


        while(true){
            System.out.println(menu);

            String operation= input.nextLine();
            if (operation.equals("q")){
                System.out.println("Have a nice day!!!");
                break;
            }
            else if(operation.equals("1")){
                Pitches pitch=new Pitches("","");

                System.out.println(pitch.toString());
                System.out.println("Write your Pitch Type:");


                while (true) {
                    String operation1 = input.nextLine();
                    pitch.setName(operation1);

                    if (operation1.equals("Small")) {
                        System.out.println(pitch.toString3());
                        break;
                    } else if (operation1.equals("Big")) {
                        System.out.println(pitch.toString1());
                        break;
                    }
                    else
                        System.out.println("Please write it correctly.");

                }




                    System.out.println("Choose the hour that you want to reservate:");

                    String operation2 = input.nextLine();
                    pitch.setHour(operation2);



                Balls ball=new Balls("");
                System.out.println(ball.toString());
                System.out.println("Please write the ball that you want : ");


                while (true) {
                    String operation3=input.nextLine();

                    if (operation3.equals("Adidas")) {
                        ball.setName(operation3);

                        break;
                    }
                    else if (operation3.equals("Nike")){
                        ball.setName(operation3);

                        break;
                    }
                    else
                        System.out.println("Please write it correctly.");

                }

                Football footbal=new Football(pitch,ball);
                Reservation reservation=new Reservation(footbal,"",false);
                reservation.payy(reservation);
                break;








        }else if (operation.equals("2")){
                Pools pool=new Pools("","");

                System.out.println(pool.toString());
                System.out.println("Write your Pool Type:");

                while (true){
                    String operation1=input.nextLine();
                    pool.setName(operation1);
                    if (operation1.equals("Adults Pool")) {
                        System.out.println(pool.toString1());
                        break;
                    } else if (operation1.equals("Kiddies Pool")) {
                        System.out.println(pool.toString3());
                        break;
                    }
                    else
                        System.out.println("Please write it correctly.");

                }


                System.out.println("Choose the hour that you want to reservate:");
                String operation2=input.nextLine();
                pool.setHour(operation2);
                Equipment equipment=new Equipment("");
                System.out.println(equipment.toString());




                System.out.println("Please select the equipment: ");
                while (true) {
                    String operation3=input.nextLine();

                    if (operation3.equals("Oversleeve")) {
                        equipment.setName(operation3);

                        break;
                    }
                    else if (operation3.equals("Bonnet")){
                        equipment.setName(operation3);

                        break;
                    }
                    else
                        System.out.println("Please write it correctly.");

                }


                Swimming swimming=new Swimming(pool,equipment);

                Reservation reservation=new Reservation(swimming,"",false);
                reservation.payy(reservation);
                break;



        }else if(operation.equals("3")){
                Workouts workout=new Workouts("","");

                System.out.println(workout.toString());
                System.out.println("Write your Workout Type: ");
                while (true) {
                    String operation1=input.nextLine();
                    if (operation1.equals("Plates")) {
                        workout.setName(operation1);
                        System.out.println(workout.toString1());
                        break;
                    } else if (operation1.equals("BodyB")) {
                        workout.setName(operation1);
                        System.out.println(workout.toString2());
                        break;
                    }
                    else if(operation1.equals("Crossfit")){
                        workout.setName(operation1);
                        System.out.println(workout.toString3());
                        break;
                    }
                    else
                        System.out.println("Please write it correctly");

                }






                System.out.println("Choose the hour that you want to reservate:");
                String operation2=input.nextLine();
                workout.setHour(operation2);
                Difficulties difficulty=new Difficulties("");
                System.out.println(difficulty.toString());
                System.out.println("Please select the difficulty: ");

                while(true){
                    String operation3=input.nextLine();
                    if (operation3.equals("Hard")){
                        difficulty.setName(operation3);
                    break;}
                    else if(operation3.equals("Easy")){
                        difficulty.setName(operation3);
                        break;

                    }
                    else
                        System.out.println("Please write it correctly");

                }

                Gym gym=new Gym(workout,difficulty);
                Reservation reservation=new Reservation(gym,"",false);
                reservation.payy(reservation);
                break;


        }else {
            System.out.println("Please choose correctly");
        }
    }



    }
}
