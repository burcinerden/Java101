package MineSweeper;

import MineSweeper.MineSweeper;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Welcome to Mine Sweeper Game------------");
        MineSweeper mine =new MineSweeper(2,2);
        mine.run();
    }
}
