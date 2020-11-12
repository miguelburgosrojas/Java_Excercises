public class CountCharactersString {
    public static void main(String[] args)
    {
        Watermark_BPS();
        String test = "Vamos a contar numeros del 1 al 10";
        System.out.println("El string es : " + test);
        count(test);
    }

    public static void count(String x)
    {
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num =0;
        int other = 0;

        for(int i=0; i < x.length(); i++)
        {
            if(Character.isLetter(ch[i])){
                letter ++;
            }
            else if(Character.isDigit(ch[i])){
                num ++;
            }
            else if(Character.isSpaceChar(ch[i])){
                space++;
            }
            else{
                other++;
            }
        }
        System.out.println("Letter : " + letter);
        System.out.println("Space : " + space);
        System.out.println("numer : " + num);
        System.out.println("Otros : "+ other);

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
