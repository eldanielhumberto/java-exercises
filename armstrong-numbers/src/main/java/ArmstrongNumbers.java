class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numberToCheckString = String.valueOf(numberToCheck);
        int result = 0;

        for (int i = 0; i <= numberToCheckString.length() - 1; i++) {
            int digit = Character.digit(numberToCheckString.charAt(i), 10);
            result += (int) Math.pow(digit, numberToCheckString.length());
        }

        return result == numberToCheck;
    }

}
