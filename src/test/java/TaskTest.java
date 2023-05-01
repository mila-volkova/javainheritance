import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testMatchesForSimpleTaskWhenTrue() {
        SimpleTask task = new SimpleTask(5, "Позвонить родителям");
        boolean actual = task.matches("родителям");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForSimpleTaskWhenFalse() {
        SimpleTask task = new SimpleTask(5, "Позвонить родителям");
        boolean actual = task.matches("бабушке");
        Assertions.assertFalse(actual);
    }

    @Test
    public void testMatchesForSimpleTaskWhenTrue1() {
        Meeting task = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        boolean actual = task.matches("приложения");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesForSimpleTaskWhenFalse1() {
        Meeting task = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        
        boolean actual = task.matches("обработка");
        Assertions.assertFalse(actual);
    }
    @Test
   public void testMatchesForSimpleTaskWhenTrue2() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
    Epic subtask = new Epic(55, subtasks);
    boolean actual = subtask.matches("Молоко");
    boolean expected = true;
    Assertions.assertTrue(actual);


} @Test
    public void testMatchesForSimpleTaskWhenFalse2() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic subtask = new Epic(55, subtasks);
        boolean actual = subtask.matches("Сахар");
        boolean expected = false;
        Assertions.assertFalse(actual);


    }
}