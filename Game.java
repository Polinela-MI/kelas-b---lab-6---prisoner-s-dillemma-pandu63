public class Game {
    private int Player1;
    private int Player2;

    public Game(int player1, int player2) {
        Player1 = player1;
        Player2 = player2;
    }

    public int getPlayer1() {
        return Player1;
    }

    public void setPlayer1(int player1) {
        Player1 = player1;
    }

    public int getPlayer2() {
        return Player2;
    }

    public void setPlayer2(int player2) {
        Player2 = player2;
    }

    public void hitungPlayoff() {
        if (this.Player1.getStrategi() == 0) {
            this.Player1.setSkor(8);
        }
        else if (this.Player2.getStrategi() == 0) {
            this.Player2.setSkor(8);
        }
        if (this.Player1.getStrategi() == 0) {
            this.Player1.getSkor(4);
        }
        else if(this.Player2.getStrategi()==1){
            this.Player2.setSkor(10);

    }
}