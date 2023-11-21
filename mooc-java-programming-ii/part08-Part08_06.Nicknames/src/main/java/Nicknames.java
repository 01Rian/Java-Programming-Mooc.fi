
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nickNames = new HashMap<>();

        nickNames.put("matthew's", "matt");
        nickNames.put("michael's ", "mix");
        nickNames.put("arthur's", "artie");

        String mattNickName = nickNames.get("matthew's");

        System.out.println(mattNickName);
    }

}
