import  java.util.Scanner;

public class OctalToHexadecimal {
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

        String octal_num, hex_num;
        int decnum;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese numero Octal : ");
        octal_num = in.nextLine();

        decnum = Integer.parseInt(octal_num,8);
        hex_num = Integer.toHexString(decnum);

        System.out.print("El numero hexadecimal es : " + hex_num);

    }
}
