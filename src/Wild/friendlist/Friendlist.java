package Wild.friendlist;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Friendlist {


    private List<Friend> friends = new ArrayList<>();

    public List<Friend> getFriends() {
        return friends;
    }

    public void addFriend(Friend f) {
        friends.add(f);
    }

//        public void print() {
//            for (Friend f : friends) {
//                System.out.println(f);
//            }
//// size() anstatt length (array)
//// for (int i = 0; i <friends.size() ; i++) {
//// System.out.println(friends.get(i));
//
//        }

    public void print() {
        for (Friend f : friends) {
            System.out.println(f);
        }
        // size() anstatt length (array)
        // for (int i = 0; i <friends.size() ; i++) {
        //    System.out.println(friends.get(i));

    }

    public void print(ArrayList<Friend> friends) {
        for (Friend f : friends) {
            System.out.println(f);
        }
// print Methode überladen

    }

    public ArrayList<Friend> friendsfrom(String city) {
        ArrayList<Friend> result = new ArrayList<>();
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getCity().equals(city)) {
                result.add(friends.get(i));
            }

        }
        return result;
    }

    public Friend findOldestFriend() {
        int year = Year.now().getValue();
        Friend oldestfriend = friends.get(0);
        int howLong = year - friends.get(0).getKnownSince();
        for (int i = 0; i < friends.size(); i++) {
            if ((year - friends.get(i).getKnownSince()) > howLong) {
                howLong = year - friends.get(i).getKnownSince();
                oldestfriend = friends.get(i);
            }
        }
        return oldestfriend;
    }

    public void removeFriend(Friend f) {
        friends.remove(f); // wie add
    }

    public ArrayList<Friend> friendAbroad(String homeCountry) { // For Schleife
        ArrayList<Friend> result = new ArrayList<>();
        for (int i = 0; i < friends.size(); i++) {
            if (!friends.get(i).getCountry().equals(homeCountry)) {
result.add(friends.get(i));
            }
        }

return result;
    }
}



