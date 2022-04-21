public class StoryText {

    public static void welcomeToAndysRoom(String userName){
        System.out.println("Hi " + userName + ". Welcome to Andy's room. \n\nYou are a toy but you're just as alive as the " +
                "people in this house.\nYou can't be expected to sit in this room all day waiting for Andy to come back. " +
                "\nYou need adventure! You look around Andy's room and see the door is cracked open. " +
                "\nJust as you're about run for the door, you hear a noise. It's the wind! The window is open too.");
        System.out.print("Which way do you want to go " + userName + "? The door or the window?\n\nEnter door or window: ");
    }

    public static void userChoseDoor(){
        System.out.println("\nYou chose door. You run for the door and wiggle through the crack." +
                "\nOH NO! Dino, Andy's dog, is running down the hallway and picks you up in his mouth." +
                "\nYou're covered in Dino's slobber but it's slippery enough you might be able to wiggle out." +
                "\nDo you wiggle out or see where Dino takes you?");
        System.out.print("\nEnter Yes to wiggle our or No to stay with Dino: ");
    }

    public static void userChoseYesForDog(){
        System.out.println("\nYou wiggle as hard as you can and you fall out of Dino's mouth! " +
                "\nBut you're close to the stairs and fall through the stair railing and land on dark, damp ground." +
                "\nYou're in a plant! And a green army man is in here too! He looks over at you, " +
                "\nturns back to his walkie talkie and says, \"We've got a runaway toy in plant number 5.\"" +
                "\nQuick must go! Do you run to the front door that leads outside or go to the kitchen that's closer?");
        System.out.print("\nEnter 1 for front door or 2 for kitchen: ");
    }

    public static void userChosePlant1(){
        System.out.println("\nYou jump out of the plant and start running for the front door. BARK!" +
                "\nOh no! It's Dino again. He grabs you and runs back upstairs and into Andy's room." +
                "\nYou're back where you started. You'll have to try and escape another time.");
    }

    public static void userChosePlant2(){
        System.out.println("\nYou jump out of the plant and head for the kitchen. You freeze. " +
                "\nYou forgot, Andy's mom is in there making lunch. You try to be still but she turns around " +
                "\nand see you on the floor. \"Andy please bring your toy back to your room.\" " +
                "\nShe hands the toy to Andy and he caries you back up to his room.");
    }

    public static void userChoseNoForDog(){
        System.out.println("\nYou're in Dino's slobbery mouth as he runs downs the stairs and goes outside." +
                "\nDino drops you in the grass. You look around before making your escape and someone picks you up." +
                "\nCrap, it's Andy's mom. \"Ugg, this is gross Dino. I'll have to clean this toy\"" +
                "\nYou've been caught and Andy's mom takes you back inside the house.");
    }

    public static void userChoseWindow(){
        System.out.println("\nYou chose window. You run for the window, climb onto a chair, and then climb onto a desk." +
                "\nYou pull up yourself from the desk onto the window shelf. You're catching your breath and hear, " +
                "\n\"What are you doing up here, cowboy?\" OH NO! It's Woody, the head toy. \"You're supposed to be in your spot. " +
                "\nAndy's going to be home soon.\" Quick think! Do you agree with Woody and go back to your spot or run for the window?");
        System.out.print("\nEnter yes to agree with Woody or no to run for it: ");
    }

    public static void userAgreesWithWoody(){
        System.out.println("\nWoody's right. Andy is going to be home soon and it might be easier to escape another time." +
                "\n\"Sorry Woody, was just exploring the room.\" \"Hi mom!\" You hear from outside. It's Andy! " +
                "\nWoody yells, \"Everyone get in your places. Andy's home!\" You leap down from the window sill and go back to your spot." +
                "\nMaybe you can escape another day.");
    }

    public static void userDisagreesWithWoody(String userName){
        System.out.println("\nYou think 'I can make it to the window.' So you get up and run for the window. BANG! " +
                "\nYou ran into the window screen. How could I forget about the screen! You feel a rope around you." +
                "\nWoody has lassoed you and is pulling you towards him. \"Mr. Potato Head, please take " + userName + " back to their spot." +
                "\n\"You got it boss.\" Mr. Potato Head then carries you back to your spot. " +
                "\nMaybe you can escape another day.");
    }
}
