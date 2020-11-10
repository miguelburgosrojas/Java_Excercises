import java.util.Scanner;

public class OctaltoBinary {
    public static void main(String[] args) {

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


        Scanner in = new Scanner(System.in);
        int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
        long octal_num, tempoctal_num, binary_num, place;
        int rem;
        System.out.println("Ingrese numero octal : ");
        octal_num = in.nextLong();
        tempoctal_num = octal_num;
        binary_num = 0;
        place = 1;
        while (tempoctal_num != 0) {
            rem = (int) (tempoctal_num % 10);
            binary_num = octal_numvalues[rem] * place + binary_num;
            tempoctal_num /= 10;
            place *= 1000;
        }
        System.out.print("El numero en binario es : " + binary_num + "\n");
    }

}

