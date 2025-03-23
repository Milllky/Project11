package ru.netology.tasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void shouldMatchSimpleSuccess() {
        SimpleTask task = new SimpleTask(68, "Домашнее задание");
        boolean actual = task.matches("задание");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldMatchSimpleFail() {
        SimpleTask task = new SimpleTask(68, "Домашнее задание");
        boolean actual = task.matches("работа");
        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldMatchEpicSuccess() {
        Epic epic = new Epic(13, new String[]{"Паспорт", "Билет", "Деньги"});
        boolean actual = epic.matches("Билет");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldMatchEpicFail() {
        Epic epic = new Epic(13, new String[]{"Паспорт", "Билет", "Деньги"});
        boolean actual = epic.matches("Права");
        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldMatchMeetingTopicSuccess() {
        Meeting meet = new Meeting(77, "Совещание", "Разработка", "После обеда");
        boolean actual = meet.matches("Совещание");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldMatchMeetingProjectSuccess() {
        Meeting meet = new Meeting(77, "Совещание", "Разработка", "После обеда");
        boolean actual = meet.matches("Разработка");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldMatchMeetingFail() {
        Meeting meet = new Meeting(77, "Совещание", "Разработка", "После обеда");
        boolean actual = meet.matches("Созвон");
        Assertions.assertFalse(actual);
    }
}
