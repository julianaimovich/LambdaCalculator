public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // если переменная b равна 0, возникает ошибка java.lang.ArithmeticException, т.к. на 0 делить нельзя
        // данную ошибку можно решить применением метода isPositive
        // если результат выполнения false - выполнить метод из класса Calculator, например сложение,
        // передав b в качестве одного из аргументов
        while (!(calc.isPositive.test(b))) {
            b = calc.plus.apply(b, 1);
        }
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
    }
}