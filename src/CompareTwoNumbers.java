import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args)
    {
        System.out.println("..................******.................................................................");
        System.out.println(".................*$$$$$V.................................................................");
        System.out.println(".................V$$$$N:.................................................................");
        System.out.println("................:N$$$$V..................................................................");
        System.out.println("................V$$$$N::******.......::::::..*****:........:********::...................");
        System.out.println("...............:N$$$$MFN$$$$$$M*....*$$$$$VVN$$$$$NV:....*FN$$$$$$$$$NF..................");
        System.out.println("...............V$$$$$$$$N$$$$$$N*..:M$$$$$$$$N$$$$$$M:.:M$$$$$$N$$$$$$V..................");
        System.out.println("...............N$$$$NF*:::*N$$$$F..*$$$$$$MV*::I$$$$$*:M$$$$V::::::***:..................");
        System.out.println("..............*$$$$$*......F$$$$I..I$$$$M*.....*$$$$$**$$$$$V*:..........................");
        System.out.println("..............V$$$$I......:M$$$$V.*$$$$$V......V$$$$$*:N$$$$$$NMFV*:.....................");
        System.out.println(".............*N$$$$*......*$$$$$*.I$$$$M:.....:M$$$$M:.:*FN$$$$$$$$N*....................");
        System.out.println(".............V$$$$I......:M$$$$F.*$$$$$V.....:F$$$$$*......:*VI$$$$$M:...................");
        System.out.println("............:N$$$$*....:*N$$$$M:.F$$$$N:....:I$$$$$V.::.......*N$$$$F....................");
        System.out.println("............V$$$$$NMIIMN$$$$$M:.*N$$$$$NMMIMN$$$$N*.:N$NMMIIIM$$$$$M*....................");
        System.out.println("...........:M$$$$$$$$$$$$$$M*:..V$$$$$$$$$$$$$$MV:..V$$$$$$$$$$$$MV:.....................");
        System.out.println("..............:*****VVV***.....*N$$$$V:***VV**:......::***VVV***:........................");
        System.out.println("...............................V$$$$N:...................................................");
        System.out.println("..............................:N$$$$V....................................................");
        System.out.println("..............................V$$$$N*....................................................");
        System.out.println("..............................VIIIIV.....................................................");

        Scanner input = new Scanner(System.in);
        int number1,number2;

        System.out.println("Ingrese el primer numero entero");
        number1 = input.nextInt();

        System.out.println("Ingrese el segundo numero entero");
        number2 = input.nextInt();

        if(number1 == number2)
            System.out.printf("%d == %d\n",number1,number2);
        if(number1 != number2)
            System.out.printf("%d != %d\n",number1,number2);
        if(number1 < number2)
            System.out.printf("%d < %d\n",number1,number2);
        if(number1 > number2)
            System.out.printf("%d > %d\n",number1,number2);
        if(number1 <= number2)
            System.out.printf("%d <= %d",number1,number2);
        if(number1 >= number2)
            System.out.printf("%d >= %d",number1,number2);
    }
}
