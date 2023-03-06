import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Game {

    private String arena;
    private LocalDate date;
    // private int year;
    // private int month;
    // private int day;
    private String formattedDate;

    public Game(String arena) {
        // TODO
        this.arena = arena;
        date = LocalDate.now();
        // int Year = date.getYear();
        // int Day = date.getDayOfMonth();
        // int Month = date.getMonthValue();
        // this.year = Year;
        // this.day = Day;
        // this.month = Month;
        String formattedDate = this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.formattedDate = formattedDate;
    }  

    public void begin(Team home, Team away) {
        // TODO
        System.out.println
        (
        "\n - This matchup takes place at the " + this.arena + " arena on "+formattedDate+"." + 
        "\n - Tonight's game is between the " + home.getName() + " and the " + away.getName() + ".\n" +
        "\n - The starting lineup for the home team is: at point guard, " + home.getPlayer("POINT_GUARD") + "; at shooting guard, " + home.getPlayer("SHOOTING_GUARD") + "; at small forward, " + home.getPlayer("SMALL_FORWARD") + "; at power forward, " + home.getPlayer("POWER_FORWARD") + "; and at center, " + home.getPlayer("CENTER")+ ".\n" +
        "\n - The starting lineup for the visiting team is: at point guard, " + away.getPlayer("POINT_GUARD") + "; at shooting guard, " + away.getPlayer("SHOOTING_GUARD") + "; at small forward, " + away.getPlayer("SMALL_FORWARD") + "; at power forward, " + away.getPlayer("POWER_FORWARD")+ "; and at center, " + away.getPlayer("CENTER") +".\n" +
        "\n - Let's give a warm round of applause for both teams as they take the court!"
        );
    }

}

    




