/**
 * Created by Student18 on 17.04.2017.
 */
public class Helper {
    public static String getInitials(String name){
        String firstLetter = name.substring(0,1);
        int spaseIndex = name.indexOf(' ');
        if(spaseIndex == -1) {
            return firstLetter.toUpperCase();
        }
        String secondLetter = name.substring(spaseIndex + 1, spaseIndex + 2);
        return (firstLetter + secondLetter).toUpperCase();
    }
}
