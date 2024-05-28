import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем учебные группы для разных потоков
        StudyGroup progGroup1 = new StudyGroup("Prog Group 1");
        StudyGroup progGroup2 = new StudyGroup("Prog Group 2");
        StudyGroup progGroup3 = new StudyGroup("Prog Group 3");
        StudyGroup analyticsGroup1 = new StudyGroup("Analytics Group 1");
        StudyGroup sysAdminGroup1 = new StudyGroup("Sysadmin Group 1");
        StudyGroup tester1 = new StudyGroup("Tester 1");
        StudyGroup tester2 = new StudyGroup("Tester 2");

        // Создаем потоки
        Stream programmers = new Stream(List.of(progGroup1, progGroup2, progGroup3));
        Stream analysts = new Stream(List.of(analyticsGroup1));
        Stream sysAdmin = new Stream(List.of(sysAdminGroup1));
        Stream tester = new Stream(List.of(tester1, tester2));

        // Создаем список потоков
        List<Stream> streams = new ArrayList<>(List.of(programmers, analysts, sysAdmin, tester));

        // Сортируем потоки
        StreamService streamService = new StreamService();
        streamService.sortStreams(streams);

        // Выводим результат
        for (Stream stream : streams) {
            System.out.println("Stream with " + stream.getGroupCount() + " groups: " + stream.getStudyGroups());
        }
    }
}
