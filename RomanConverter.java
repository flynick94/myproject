
public class RomanConverter {

    public boolean isRoman(String number) {
        String[] romanNumerals = {"I", "V", "X"};

        for (int i = 0; i < romanNumerals.length; i++) {
            if(number.contains(romanNumerals[i])) {
                return true;
            }
        }
        return false;
    }

    public String convertToRoman(Integer arabianNumber) {
        String romanNumberResult = "";

        while (arabianNumber > 0) {
            while (arabianNumber >= 1000) {
                romanNumberResult = romanNumberResult + "M";
                arabianNumber = arabianNumber - 1000;
            }
            while (arabianNumber >= 900) {
                romanNumberResult = romanNumberResult + "CM";
                arabianNumber = arabianNumber - 900;
            }
            while (arabianNumber >= 500) {
                romanNumberResult = romanNumberResult + "D";
                arabianNumber = arabianNumber - 500;
            }
            while (arabianNumber >= 400) {
                romanNumberResult = romanNumberResult + "CD";
                arabianNumber = arabianNumber - 400;
            }
            while (arabianNumber >= 100) {
                romanNumberResult = romanNumberResult + "C";
                arabianNumber = arabianNumber - 100;
            }
            while (arabianNumber >= 90) {
                romanNumberResult = romanNumberResult + "XC";
                arabianNumber = arabianNumber - 90;
            }
            while (arabianNumber >= 50) {
                romanNumberResult = romanNumberResult + "L";
                arabianNumber = arabianNumber - 50;
            }
            while (arabianNumber >= 40) {
                romanNumberResult = romanNumberResult + "XL";
                arabianNumber = arabianNumber - 40;
            }
            while (arabianNumber >= 10) {
                romanNumberResult = romanNumberResult + "X";
                arabianNumber = arabianNumber - 10;
            }
            while (arabianNumber >= 9) {
                romanNumberResult = romanNumberResult + "IX";
                arabianNumber = arabianNumber - 9;
            }
            while (arabianNumber >= 5) {
                romanNumberResult = romanNumberResult + "V";
                arabianNumber = arabianNumber - 5;
            }
            while (arabianNumber >= 4) {
                romanNumberResult = romanNumberResult + "IV";
                arabianNumber = arabianNumber - 4;
            }
            while (arabianNumber >= 1) {
                romanNumberResult = romanNumberResult + "I";
                arabianNumber = arabianNumber - 1;
            }
        }
        return romanNumberResult;
    }

    public int convertToArabian(String romanNumber) {
        int arabianNumber = -1;

        if(romanNumber.equals("I")) {
            arabianNumber = 1;
        } else if(romanNumber.equals("II")) {
            arabianNumber = 2;
        } else if(romanNumber.equals("III")) {
            arabianNumber = 3;
        } else if(romanNumber.equals("IV")) {
            arabianNumber = 4;
        } else if(romanNumber.equals("V")) {
            arabianNumber = 5;
        } else if(romanNumber.equals("VI")) {
            arabianNumber = 6;
        } else if(romanNumber.equals("VII")) {
            arabianNumber = 7;
        } else if(romanNumber.equals("VIII")) {
            arabianNumber = 8;
        } else if(romanNumber.equals("IX")) {
            arabianNumber = 9;
        } else if (romanNumber.equals("X")) {
            arabianNumber = 10;
        }

        return arabianNumber;
    }
}