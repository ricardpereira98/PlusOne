public class PlusOne {
    // 499 -> 500  4099 -> 4199 // 9999-> 10000
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int nLast = size - 1;

        //ultimo numero
        int lastDigit = digits[nLast];

        //se o ultimo numero for 9, passa a 0, e soma 1 ao da esquerda
        if (lastDigit == 9) {

            if (size == 1) {
                int[] aux = new int[size + 1];
                aux[0] = 1;
                aux[1] = 0;
                return aux;
            } else {
                digits[nLast] = 0;
            }

            for (int i = nLast - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                    if (i == 0) {
                        int[] aux = new int[size + 1];
                        aux[0] = 1;
                        for (int j = 1; j < size; j++) {
                            for (int digit : digits) {
                                aux[j] = digit;
                            }
                        }
                        return aux;
                    }

                } else {
                    digits[i] = digits[i] + 1;
                    return digits;
                }
            }

        } else {
            digits[nLast] = digits[nLast] + 1;
        }

        return digits;
    }
}


