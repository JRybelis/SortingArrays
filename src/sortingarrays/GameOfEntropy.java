package sortingarrays;

public class GameOfEntropy {
    
    public static void main(String[] args) {
        char[][] field = new char[50][50];
        
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++){
                if (Math.random() < 0.25) {
                field[i][j] = 'x';
            } else {
                    field[i][j] = '.';
                }
            }
        }
    }
}
