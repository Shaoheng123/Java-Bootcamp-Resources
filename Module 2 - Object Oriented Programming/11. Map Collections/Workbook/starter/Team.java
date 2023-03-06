import java.util.HashMap;
import java.util.Map;


public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
        // TODO
        //set the name
        this.name = name;
        //set players= new Hashmap
        this.players = new HashMap<>();
        // Team.setName("sh");
    }
    
    public String getName() {
        // TODO
        return this.name;
    }

    public void setName(String name) {
        // TODO
        this.name = name;
    }

    public String getPlayer(String position) {
        // TODO
        return players.get(position);
        // return null;
    }

    public void setPlayer(String position, String player) {
        // TODO
        players.put(position,player);
    }    

    
}
