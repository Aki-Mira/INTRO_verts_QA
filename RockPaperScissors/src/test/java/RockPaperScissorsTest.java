import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RockPaperScissorsTest {

    @DataProvider(name = "gameData")
    public Object[][] gameData() {
        return new Object[][]{
                {"камень", 0, "Камень", "Ничья"},
                {"ножницы", 1, "Ножницы", "Ничья"},
                {"бумага", 2, "Бумага", "Ничья"},
                {"камень", 1, "Ножницы", "Вы выиграли!"},
                {"камень", 2, "Бумага", "Компьютер выиграл!"},
                {"ножницы", 0, "Камень", "Компьютер выиграл!"}
        };
    }

    @Test(dataProvider = "gameData")
    public void testRockPaperScissorsGame(String userChoice, int computerChoice, String computerChoiceName, String expectedOutcome) {
        String result = playRockPaperScissors(userChoice, computerChoice, computerChoiceName);
        Assert.assertEquals(result, expectedOutcome);
    }

    private String playRockPaperScissors(String userChoice, int computerChoice, String computerChoiceName) {
        if (userChoice.equals("камень") && computerChoice == 0) {
            return "Ничья";
        } else if (userChoice.equals("ножницы") && computerChoice == 1) {
            return "Ничья";
        } else if (userChoice.equals("бумага") && computerChoice == 2) {
            return "Ничья";
        } else if (userChoice.equals("камень") && computerChoice == 1) {
            return "Вы выиграли!";
        } else if (userChoice.equals("камень") && computerChoice == 2) {
            return "Компьютер выиграл!";
        } else if (userChoice.equals("ножницы") && computerChoice == 0) {
            return "Компьютер выиграл!";
        } else {
            return "Ничья";
        }
    }
}
