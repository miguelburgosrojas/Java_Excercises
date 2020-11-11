import java.util.Scanner;

public class AreaOfPolygon {
    public static void main(String[] args)
    {
        Watermark_BPS();
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el numero de lados de un poligono : ");
        int ns = input.nextInt();
        System.out.print("Ingrese la longitud de uno de los lados : ");
        double side = input.nextDouble();
        System.out.print("El area es : "+ polygonArea(ns,side)+"\n");
    }

    public static double polygonArea(int ns, double side)
    {
        return (ns*(side*side)) / (4.0 * Math.tan((Math.PI/ns)));
    }

    public static void Watermark_BPS()
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
    }
}
