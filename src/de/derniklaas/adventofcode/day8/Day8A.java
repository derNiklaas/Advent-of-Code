package de.derniklaas.adventofcode.day8;

public class Day8A {

    private static String input = "222201222021222122221212222222202122222022102220222202222120222222120222222222022222022222122221222222220222222222222202202222022222222221222222222222222200222120222222121202222222222022222122112220222212222022222222221222222222122222122222222222222222222222222222222222212222022222222221222222222222222220222120222222221202222222212222222222002221222212222020222222022222222222122222022222222221222222220222221222222222202222022222220222222222222222222200222020222222121202222222202022222222002221222222222222222222121222222222022222122222222222222222220222221222222202212222022222220222222222222222222221222020222122120202022222202022222222222221222202222020222022020222222222222222022222022221222222221222220222222202202222122222222222222222222222222222222022222022120212222222212122222122112220222222222121222122121222222222122222222222022221222222221222222222222212202222122222221221222222022222222220222021222222122222122222222022222022002220222202222021222122221222222222022222122222222221222222220222222022222212222222022222222222222222122222222220222221222222020212122222212122222022112222222212222221222122220222222222222222222222121222222222222222220022222222212222122222221220222222022222222201222221222122220212222222202122222022122222222212222222222222120222222222022222122222122220222222220222220002222222212222122222221221222222022222122202222122222022122212122222212222222022002220222202222122222122121222222222022222022222222220222220221222202212222212222222222222220221222222122222222220222120222122222222022222212022222122112221222212222021222122220222222222022222022222220221222221221222200222222212202202022222220222222222022222122212222220222222221212022222212122222222022221222222202221222022021222222222022222122222222221222221221222222122222202212212122222221221222222122222122221222221222022120222222222202122222222212221222202202022222022022222222222122222222222122221222222222222202222222202202202222222221221222222122222022211222221222022122222122222212022222222020222222222222022222122122222222222022222122222122220222220220202222022222202222222022222221220221222122222122202222222222022122212222222212122222222202220222222202022222122221222222122022222022222221201222221220212221002222212202202122222221220222222222222222220222122222202220202022222212122222122010220222212212220222122022222222022122222022222222212222221222202220202222202202202222222222220221222022222222210222221222122120212222222222222222022121220222222202220222122022222222022222222222222221200222220222222221222222202222212222222220221221222222222122210222120222022222202222222212122222222202220222212222221222222221222222022122222022222020200222222221202211022222202222222222222220221221222022222122201222121222012220212222222202222222222020220222212212121222021022222222122222222222222022210222221221202201212222212222212122222221222220222222222022201222020222112120202122222212222220022212220222222202221222121122222222222022222122222220202222221222212212002222212212222222222222221220222222222122212222020222102222222022222202122222022122221202222212222222222121222222122022222222222121211222220222222200212222222202222122222220220220222122222022201222122222022222212122222212222222122110221202212212022222220220222220022222222022222222202222221222212212002222202222222122222222221221222222222122202222122222022222202222222212122220222102222212212212220222220121222221122222222122222020200222220221222222012222222212202222222222220222222222222022221222122222002022212222222222122222122101221212202202120222020220222221022022222222222221210222221222212212222222212212202122222220220222222022222022212222022222112220222122222222122222022200220222212202021222221220222221022022122222222221212222220220202211112222202202212122222221222221222222222122212222020222022020202122222220122220022010220202212202122222222221222221122122222222222222202222221222222222122222202212202122222220220222222222222222212222022222102222222022222212022220222022222202222202021222021122222221122122022122222121202222222222212200112222202222222122222221220220222122222222210222121222212221222022222012222221222111220212202222021222122220222221122022022222222021210222221220202221012222202222212022222221220220222022222122212222120222122021212222222121022222222220222202222202022222122021222220022122222022222222211222222221202210112222222222212222222222221222222022222022202222222222202221202122222122022221222201221202212212120222020222222221122122022222222022220222221220202212122222212222202222222220222222222222222122200222121222002020202022222120122221022012221222202202220222121120222220222222022122222220222222221221222211222222222222212222222222220222222022222022202222122222200021222222222200222222122010220202222222221222121121222201122022022222222021211222222220202222212222222222202222222222120222222222222022210222121212110022202122222111222220022111220212212222220222122120222222122122122222222121201202221220222211212222202202222122222222121220222022222221221222221202111120212122222002222221022200221212202222122222022120212220022122122220222121201202220220202221102222202202222122222222220220222122222222200222022222212021222022222012122220222202222212202202022222221020222210221122022122222020212222221222212202122222212222222122222222122222222022222121200222121202102020202122222202122221122212221202222202022222120021212212220200022021222222212202221222212220202222212212212222222222222222222122222120010222221222111221222222222002122222122222220222212212120222221222202211122002022122222222211212222220222211022222202222202122222220220221222222222122201222122202120021202022222210222220022222221202212212020222021222222212221011120120222022200212220221212200102222222202202122222222220220222122222120002222221222021122222022222020122220222020221222212212121222221121222200221002122120222121222202221221212211122222212222222022222221022222222022222210020222122222011222202122222101122220022122221202202202121122022122202200122012222220222220220222220221202210012222202202222122221221021220222022222012100222122202202221202122222102222222022121200222212212122222222020202212222212021022222122211212220222212202202222212222202122222220021220222022222020202222121212100120202122222001222220022002212202222212222022120020222210022202221121222020201211221221202200202222202222222222221220120201222122222121122222220212111120202122022022122222022012221212212202222222222221202220221220022122222120222221220221202201202222222122212222220220121202222122222111120222020222120020212022022021222221022111201212222212122022121221202222121212021021222221201211221220222200022222212202222022220212121222222222222012220222121222122221222022022021222221122202222212202212022022022221212210020202222120222221210200222220212210222222222222222122222221022212222022222010012222120202120020212022122120222222022220212202212202222022120122212211221222020222222020200202221221202201202222212022212022220221122201222222222100202222020202020222202022222110222221222210200212222202122222220220222201211212121122222022202221022222222201122222202012212022222212120222222122222001102222020222002121212222022120122222122011102102212212121222120022202202211020220021222021221211022220202202102222212122202122222220120201222022222022220222122202120022212222112212022220222121121012222222120022121020212210012020222222222020210201121221212202022222222002212022221201221221222122222220000222121222211021212222122001022221222010012122212222220222120021221221021221002020222020201201222222202222112222222022212122220221222202222022222222111222120222202022202222222102222220222122112112202222221022020122200210011120002020222220212221120222222220022222222022212122222201120201222122222222221222220212012022222222202121222221122100102222212222120122022220200220021002220122222120211202010220212220102222212112212222221221221221222022222212011222020222012120202022222120022221122102001122222212222022022020221200222022112221222022222200200220202212022222212012212222222201121220222122222220021222121202112101202022102210022220222001222022202202021122022120200222211220101221222120200221011222222220202222212112202122221220221212222022222220210222222222221001202222022000122220222100212112222222120222022121212210100222111021222220200200010222212212222222202022212022220200220221222222222220120222222222001111202022022220222220222221000022212202220022222222212221111011202120222120221221010220222200022222212202212022221200022200022222222001201222222202201002202122012111022222122210210202202212120222020220221221122220021021222222222212220222212202112222212212212122220221220221222022222021200222122202100011212122202002022221022121021012222222121022222020211210210012100122222120222201021221222200002222202202222222220202021200222222222212010222221222121200222122022112222221022100011202212202120122220121220221112001101220222121211220212222202221012212212202222022221202121221022122222011120222020222110010212222122102222222122011211002202202222022020221220210100001120222222121221210020220202220112222102202212022220201220200022222222210000222021222002110212022012012122222022112010012222202022122122221221210100110021120222021201200222220212210002222212022212122220210220200022122222011001222120212121112212122122002122220122022100102212222020022221022210221112022212222222122210212022220212200122222002222202022222200221222022222222110221222122222220101222022012221222220022220110212202202222222020220212222111012100220222221212212011220212222212202102012222222222212221200122222222101221222020202210220202122112001122221022020200222202202220022022122201220002210100021222121220201221221212222002222222022212022221201122222222222222122012222220212212001222022012111122220122011022122212212222222120221200201001002201020222221220222201222212202112222212012202222220201120200222122222110120222121212002212202122012111022222222122012102222222222022220222200211020001201122222221222201002202202201202202112122212120222201021210222122222001222222120202101122222212212200022222022012001012202222022122020222201212221110112022222020212201120202222202202212012122212020221220122221122222222202201222122202001221212202202010122220122112111102212212122122122222210201222112212122222220212210022220202222002222212122222221222212221212122122222222022222022212212002212202202212122221022110122101222202102022120221200220021222011022222122210212010210212222112222222002212222221212222200222022222000012222222102021211212022122201122222222211122001202212122122021120202202002120212022222221200200102222212211012202202002212021221210020202222122222100111222022002002222202222202000222221222000210112222212122222121221212201001211112221022122202210222220212201122222212002212022220200022221022222222222202222022002202121222002012112221222020120101111202222112122022222221222221110200021022120222221000210212200112212102112222120220210020222021222222212012222222112120200212012222011220220020221101202202212211222021021212202010112221222122022202220202222202211022222022222222020221211221221022122222222221222121012002112202012112111120222220012000022212220011022220222220212010212202120222021201222012202222202122202002002222021221220122210120122222112001222122022220111212102022112220220221110021012202212100022020221212212201000220222222222211222200201222200112222102022202122221202021210222122222202110222022122201112212222002102122222020202210121202211202022120220220220221211110221022121200201202021222201202222002022222022222212221210120222222011221222021222122102222012012010021220122102201001212221222022220121200222111120110221022120200211200101212212212222012102212120221220120222221022222022021222222222210110202202112201022221021200110012212200112022020220201201211001111122222220201200220102222200202212222022212220222221120220122022222111202222222212002011222222012202021222120220201120022202110112221122222212010022002020122120222220112222222202222202112122222222221212021222121222222110110222122220102102202222102010120221122001001211002212122222222121212221221120020222222020211210121111202210212212102202212121220210120210221222222221112222222012100222202022112122121222022022202202122202111012102221212212201002012121022020011210202202202211022212002222202121221200122200221022222121112222221122220122212122202211220220220121100102102202120022112121210201121011110222202101012201112201212212022212222012222220221202222222022222222202200222221211011020222102102121122201221002212201022221202022120020211200010220200220202212201222120122202021212222012102222120220212222201122122222120201222220102002000112122012122022200020200012200222202221202110221211212122010000220102221010221110112202122022202102012222221222221120212121022222110202222222020121202022222022021222201121210202110012220120022200222202202200020201222122002210210101200202010022212102112222100220202022220222022222111022222121120201000012012012222021212120112002211022220001222001021222220000220220020202012220201220010202021112212002012201112220200220211220222222010000222021020100121102102002010022201220102201201212222001122110121212200202020022122122100201211221111212210112212012002201010222210121210021222222221220222220001020200012022102221122220220121200221022220222112120022201212122101100021202102121220101222212221222222202012211211220211222221122122222000002222121001020221122202202111021210121112210022022200001022101122212220002100012020002211111210022002222011220222002112210202221211121212120222220022110222020202021220022002022021022212222202111001002221000002221020212212111021012221202120121222222120212202212202102222220101221201222201120222202011020222121000222112112102002010222220221112202112102221222112111120200201112202102122122102200210020122212121011202002222222100221200120200022222222211122222222012210000022102202002020221122021022002222201220122222121221202212210111221102000212222121212222102001212002202201110220220221221020122211111201222022101221122222102102220021201120222112002112221211122201120211212212022100020202202110220010210202120001222012002200111222222121212022122200200000222121102222000012102202111221212221020120002212202120002110120221221212001121021022202000212112121202100110202022202211020222202120220220022202020221222220111221201002202112212122221122202021021212211201212100021001200011021102220222101012201212102202201220202222212200200220200021220100222220020110222120010020202222112202100021202221200001002102200110202002122122220002011102122202110001221201100222212002202022212222212221200221202121122102101010122222012002220212012212112001201222202002111222211101002022221001222121211121221102102002012221110212221112222012212202120221122121200110022201212112222120002212120022212102102012221121100210121122210100002122220101221202021201022122222020211112210202101000202212012222210220212122212000022001112201222220100111021202202002020012211020210021211002010101212212121202222000220122122112212220212012022212022112202102222211021022102020202101222010011010111010100112021110100020021011012010111101100211111101011120201222100212111220211000210101010110201100011121010110100121001211112212120012211201";
    //private static String input = "123456789012";

    private static int width = 25;
    private static int height = 6;

    public static void main(String[] args) {
        String minLayer = "";
        int amount = width * height +1;
        for (int i = 0; i < input.length() / (width * height); i++) {
            String layer = input.substring(i * (width * height), i * (width * height) + (width * height));
            char[] digits = layer.toCharArray();
            int zeros = 0;
            for (char c : digits) {
                if (c == '0') {
                    zeros++;
                }
            }
            if (amount > zeros) {
                amount = zeros;
                minLayer = layer;
            }
        }
        int ones = 0, twos = 0;
        for (char c : minLayer.toCharArray()) {
            if (c == '1') {
                ones++;
            }
            if (c == '2') {
                twos++;
            }
        }
        System.out.println("Amount: " + (ones * twos));
    }
}
