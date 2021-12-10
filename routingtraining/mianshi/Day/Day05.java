package Day;

public class Day05 {
    public boolean validTicTacToe(String[] board) {
        int X_count = 0;
        int O_count = 0;
        for (String str : board) {
            for (int i = 0; i < 3;i++) {
                char ctr = str.charAt(i);
                if (ctr == 'X') {
                    X_count++;
                    continue;
                }
                if (ctr == 'O'){
                    O_count++;
                    continue;
                }
            }
        }
        if (O_count > X_count) return false;
        if (O_count + X_count == 0) return true;
        //判定后手赢
        if (O_count == X_count) {
            if (check(board,'X') == false) {
                if (O_count + X_count == 8) return true;
                return check(board,'O');
            }else {
                return false;
            }
        }
        //判定先手赢
        if (X_count - O_count > 1) return false;
        if (X_count + O_count >= 7) return true;
        return check(board,'X') == true && check(board,'O') == false;
    }

    public boolean check(String[] str,char ctr) {
        for (int i = 0; i < 3;i++) {
            if (str[i].charAt(0) == ctr && str[i].charAt(1) == ctr && str[i].charAt(2) == ctr) {return true;}
            if (str[0].charAt(i) == ctr && str[1].charAt(i) == ctr && str[2].charAt(i) == ctr) {return true;}
        }
        if (str[0].charAt(0) == ctr && str[1].charAt(1) == ctr && str[2].charAt(2) == ctr) {return true;}
        if (str[0].charAt(2) == ctr && str[1].charAt(1) == ctr && str[2].charAt(0) == ctr) {return true;}
        return false;

    }

    public static void main(String[] args) {
        Day05 day05 = new Day05();
        String[] strr = new String[]{"XOX","O X","X O"};
        day05.validTicTacToe(strr);
    }
}
