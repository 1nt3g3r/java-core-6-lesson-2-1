public class MathTests {
    public static void main(String[] args) {
        int w = 5;
        int h = 9;

        int s = w * h; //+-*/

//        System.out.println(s);


        //Unary ++
        int age = 10;
        age++; //++, --
        System.out.println(age);

        //+=, -=, *=, /=
        age += 5; //age = age + 5;

        int weight = 100;
        weight /= 4;
        System.out.println(weight);

        //5 / 2 = 2 как результат, и 1 - остача
        int mod = 4 % 2;
        System.out.println(mod);

        int number = 100;
        boolean zeroEnds = number % 10 == 0;
        System.out.println(zeroEnds);

        System.out.println(4 != 5);

        System.out.println(10 <= 20); //<, <=, >, >=

        char c = '5';
        boolean isDigit = c >= '0' && c <= '9';
        System.out.println(isDigit);

        char symbol = 'X';
        boolean isVowel =
                symbol == 'E' ||
                symbol == 'U' ||
                symbol == 'I' ||
                symbol == 'O' ||
                symbol == 'A' ||
                symbol == 'Y';
        System.out.println(isVowel);

    }
}
