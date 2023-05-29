package Wild.friendlist;
import java.util.ArrayList;
public class Demo {


        public static void main(String[] args) {
            Friend adam = new Friend("Adam", 45, "graz", "Austria", 1985);
            Friend bertl = new Friend("Bertl", 65, "Wien","Austria", 1987);
            Friend julius = new Friend("Julius", 25, "Paris", "France", 2013);

            Friendlist friendlist = new Friendlist(); // Objekt der Klasse Friendlist erstellt
            friendlist.addFriend(adam);
            friendlist.print();
            friendlist.addFriend(bertl);
            friendlist.print();
            friendlist.addFriend(julius);
            friendlist.print();
            System.out.println("---------------");
            ArrayList<Friend> from = friendlist.friendsfrom("Paris");
            for(Friend f : from){
                friendlist.print(from);
            }
            System.out.println(friendlist.findOldestFriend());
            System.out.println(friendlist.friendAbroad("France"));
        }

    }


