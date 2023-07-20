package findthebomb;

public class Bomb {
    public String findBomb(String name) {
        String result = "";
        if (name == null || name == ""){
            result = "";
        } else if (name.toLowerCase().contains("bomb")) {
            result = "DUCK!";
        }else {
            result = "Relax, There is no Bomb.";
        }
        return result;
    }
}
