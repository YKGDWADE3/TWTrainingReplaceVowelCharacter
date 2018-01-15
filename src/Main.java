import com.tw.practice.Game;
import com.tw.practice.Printer;
import com.tw.practice.StringProcess;
import com.tw.practice.StringReader;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(new StringReader(), new Printer(), new StringProcess());
        game.start();
    }
}
