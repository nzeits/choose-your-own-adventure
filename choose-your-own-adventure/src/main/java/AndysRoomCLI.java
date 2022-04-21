
public class AndysRoomCLI {

    public static void main(String[] args) {
        AndysRoom andysRoom = new AndysRoom();
        try {
            andysRoom.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
