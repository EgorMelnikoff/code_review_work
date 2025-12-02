public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Делить на ноль нельзя!");
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    //Сложение a и b и вычитание из суммы с
    public int solver(int a, int b, int c) {
        int sum = add(a, b);
        return dif(sum, c);
    }
}