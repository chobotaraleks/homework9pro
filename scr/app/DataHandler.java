public class DataHandler {

    // Узагальнений метод для обробки масивів даних
    public <T> String handleData(T[] items) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        // Цикл для обробки елементів масиву
        for (T item : items) {
            count++;
            sb.append(String.format("(%d) %s ", count, item));
        }
        return sb.toString().trim();
    }
}
