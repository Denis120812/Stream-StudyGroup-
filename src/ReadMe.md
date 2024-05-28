Пояснение

1. StudyGroup.java: Класс StudyGroup представляет учебную группу с именем.
2. Stream.java: Класс Stream содержит список учебных групп и реализует интерфейс Iterable для итерирования по группам. Также добавлен метод getGroupCount для получения количества групп в потоке.
3. StreamComparator.java: Класс StreamComparator реализует интерфейс Comparator и сравнивает два потока по количеству учебных групп.
4. StreamService.java: Класс StreamService содержит метод sortStreams, который сортирует список потоков с использованием StreamComparator.
5. Main.java: Класс Main создает учебные группы и потоки, сортирует потоки и выводит результат на консоль.
