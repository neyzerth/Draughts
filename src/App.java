import UI.Color;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(
                                "  ○ ◉ ◌ ◍ ◎ ● ⊛ ⊗ ⨷   \n" +
            Color.inverted("  ○ ◉ ◌ ◍ ◎ ● ⊛ ⊗ ⨷  \n") + 
            Color.inverted(Color.inverted("  ○ ◉ ◌ ◍ ◎ ● ⊛ ⊗ ⨷  "))
        );
        
        table();
    }

    public static void table(){
        System.out.println("   1  2  3  4  5  6  7  8 ");
        for (int i = 97; i <= 104; i++) {
            System.out.println(files(i));
        }
        
    }
    public static String whiteBox(){
        return Color.inverted("   ");
    }
    public static String blackBox(){
        return "   ";
    }

    public static String files(int c){
        char fileLetter = (char) c;
        int div = c % 2;

        String file =  String.valueOf(fileLetter)+" ";
        for (int i = 0; i < 8; i++) {
            file  += i % 2 == div ? whiteBox() : blackBox();
        }
        return file;
    }
}
