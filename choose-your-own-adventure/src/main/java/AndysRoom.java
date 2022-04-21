import java.util.Scanner;

public class AndysRoom {

    public void run() {
        Scanner scanner = new Scanner(System.in);
//could add on another concept - energy level. if the energy level hits 0 the toy gets send back to their spot

//add on if they enter an incorrect choice
        //Main starting story
        System.out.print("What is your name: ");
        String userName = scanner.nextLine();
        StoryText.welcomeToAndysRoom(userName);
        String chooseDoorOrWindow = scanner.nextLine();

        //Option 1 - Door
        if (chooseDoorOrWindow.equalsIgnoreCase("door")) {
            StoryText.userChoseDoor();
            String dogChoice = scanner.nextLine();
            //Yes = wiggle out of dog's mouth
            if (dogChoice.equalsIgnoreCase("yes")) {
                StoryText.userChoseYesForDog();
                String plantChoice = scanner.nextLine();
                //Plant 1 - run for the front door
                if (plantChoice.equals("1")) {
                    StoryText.userChosePlant1();
                } else if (plantChoice.equals("2")) {
                    StoryText.userChosePlant2();
                }
                //Plant 2 - go through the kitchen
            } else if (dogChoice.equalsIgnoreCase("no")) {
                //No = stay in dog's mouth
                StoryText.userChoseNoForDog();
            }
        }

        //Option 2 - Window
        if (chooseDoorOrWindow.equalsIgnoreCase("window")) {
            StoryText.userChoseWindow();
            String windowChoice = scanner.nextLine();
            if (windowChoice.equalsIgnoreCase("yes")) {
                //Yes = go back to your spot
                StoryText.userAgreesWithWoody();
            } else if (windowChoice.equalsIgnoreCase("no")) {
                //No = run for the window
                StoryText.userDisagreesWithWoody(userName);
            }
        }
    }
}
