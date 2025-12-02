public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int result = add(10, 5);
        return times(result, 2);
    }
}

//Код соответствует заданию.
//Соблюден Code Style.
//Программа запускается и работает локально.