import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws CalculatorException {
        RomanConverter converter = new RomanConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа: ");
        String rawInput = scanner.nextLine();

// Сплитим выражения по пробелам
        String[] rawInputSplit = rawInput.split(" ");
        if(rawInputSplit.length < 3) {
            throw new CalculatorException("Cтрока не является математической операцией");
        }
        String numberString1 = rawInputSplit[0].trim();
        String numberString2 = rawInputSplit[2].trim();
        String operator = rawInputSplit[1].trim();

        if(rawInputSplit.length > 3) {
            throw new CalculatorException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

// Опрееделяем формат чисел
        if(converter.isRoman(numberString1) && converter.isRoman(numberString2)) {
            int number1;
            int number2;

            number1 = converter.convertToArabian(numberString1);
            number2 = converter.convertToArabian(numberString2);

            int resultNumber = -1;
            if(operator.equals ("+")) {
                resultNumber = number1 + number2;
            } else if( operator.equals("-")) {
                resultNumber = number1 - number2;
            } else if(operator.equals("/")) {
                resultNumber = number1 / number2;
            } else if(operator.equals("*")) {
                resultNumber = number1 * number2;
            }

            if(resultNumber < 0) {
                throw new CalculatorException("В римской системе нет отрицательных чисел");
            }
            if(resultNumber == 0) {
                throw new CalculatorException("Результат не может быть равен 0");
            }
            String romanResult = converter.convertToRoman(resultNumber);
            System.out.println("Результат: " + romanResult);
        } else if(!converter.isRoman(numberString1) && !converter.isRoman(numberString2)) {
            int number1;
            int number2;

            number1 = Integer.parseInt(numberString1);
            number2 = Integer.parseInt(numberString2);

            Integer resultNumber = -1;
            if(operator.equals("+")) {
                resultNumber = number1 + number2;
            } else if(operator.equals("-")) {
                resultNumber = number1 - number2;
            } else if(operator.equals("/")) {
                resultNumber = number1 / number2;
            } else if(operator.equals("*")) {
                resultNumber = number1 * number2;
            }
            System.out.println("Результат: " + resultNumber);

        } else {
            throw new CalculatorException("Используются одновременно разные системы счисления");
        }
    }
}

