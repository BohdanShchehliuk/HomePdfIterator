package CodeWar;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        int numberN = 0;
        int numberS = 0;
        int numberW = 0;
        int numberE = 0;
        int time = 10;
        if (walk.length != time) {
            return false;
        } else {

            for (char tmp : walk) {
                if (tmp == 'n') {
                    numberN = numberN+1;
                }
                if (tmp == 's') {
                    numberS = numberS+1;
                }
                if (tmp == 'e') {
                    numberE = numberE+1;
                }
                if (tmp == 'w') {
                    numberW = numberW+1;
                }
            }
            if (numberN == numberS && numberE == numberW) {
            System.out.println(numberN);
            System.out.println(numberS);
            System.out.println(numberE);
            System.out.println(numberW);
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        TenMinWalk tenMinWalk = new TenMinWalk();

        char[] walk = {'n','n','n','s','n','s','n','s','n','s'};
        System.out.println(tenMinWalk.isValid(walk));

    }
}

