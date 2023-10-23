package seminars.first.hw;

import seminars.first.hw.Calculator;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    public static void main(String[] args) {
//        Задание 1. ** В классе Calculator создайте метод calculateDiscount,
//        который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
//        Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
//        Если метод calculateDiscount получает недопустимые аргументы,
//        он должен выбрасывать исключение ArithmeticException.
//        Не забудьте написать тесты для проверки этого поведения.

        System.out.println(Calculator.calculatingDiscount(-1500, -20));

        assertThat(Calculator.calculatingDiscount(3000.5, -20))
                .isEqualTo(2400.4);
        assertThat(Calculator.calculatingDiscount(3000.5, +20))
                .isEqualTo(3600.6);
        assertThat(Calculator.calculatingDiscount(0, 20))
                .isEqualTo(0);
    }
}