package problemsolving.crackingTheCode;

import org.junit.Test;

public class AddTwoBinStrings {

    //add two bin strings
    public String addTwoBinStrings(String b1, String b2, int base) {
        StringBuilder result = new StringBuilder();
        int i1 = 0, i2 = 0, carry = 0;
        while (i1 < b1.length() && i2 < b2.length()) {
            int sum = (b1.charAt(i1) - '0') + (b2.charAt(i2) - '0') + carry;
            int res = sum % base;
            carry = sum / base;
            result.append(res);
            i1++;
            i2++;
        }

        if (i1 < b1.length()) carry = addRest(result, i1, b1, carry);
        else carry = addRest(result, i2, b2, carry);
        if (carry > 0) result.append(carry);
        return result.toString();

    }

    private int addRest(StringBuilder result, int i, String b1, int carry) {
        while (i < b1.length()) {
            int c = b1.charAt(i) - '0';
            int res = (c + carry) % 2;
            carry = (c + carry > 1) ? 1 : 0;
            result.append(res);
            i++;
        }
        return carry;
    }

    @Test
    public void t() {
        int[] arr =new int[255];
        arr['a'] = 20;
        System.out.println(arr['a']++);


        System.out.println(addTwoBinStrings("11", "11", 2));

    }
}
