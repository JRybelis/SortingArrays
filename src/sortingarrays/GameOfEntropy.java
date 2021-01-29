package sortingarrays;

public class GameOfEntropy {

    public static void main(String[] args) {
        char[][] field = new char[25][125];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (Math.random() < 0.25) {
                    field[i][j] = 'x';
                } else {
                    field[i][j] = '.';
                }
            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------------");

        char[][][] history = new char[50][field.length][field[0].length];
        for (int cell = 0; cell < 50; cell++) {
            history[cell] = field;
            char[][] newField = new char[field.length][field[0].length];
            for (int i = 0; i < newField.length; i++) {
                for (int j = 0; j < newField[i].length; i++) {
                    int neighbour = 0;
                    if (i > 0) {
                        neighbour += (i > 0 && j > 0 && field[i - 1][j - 1] == 'x') ? 1
                                : 0;
                        neighbour += (i > 0 && field[i - 1][j] == 'x') ? 1 : 0;
                        neighbour += (i > 0 && j < field[i].length - 1 && field[i - 1][j
                                + 1] == 'x') ? 1 : 0;
                    }
                    neighbour += (j > 0 && field[i][j - 1] == 'x') ? 1 : 0;
                    neighbour += (j < field[i].length - 1 && field[i][j + 1] == 'x') ? 1
                            : 0;
                    if (i < field.length - 1) {
                        neighbour += (j > 0 && field[i + 1][j - 1] == 'x') ? 1 : 0;
                        neighbour += (field[i + 1][j] == 'x') ? 1 : 0;
                        neighbour += (j < field[i].length - 1 && field[i + 1][j + 1]
                                == 'x') ? 1 : 0;
                    }
                    if (field[i][j] == 'x') {
                        if (neighbour == 2 || neighbour == 3) {
                            newField[i][j] = 'x';
                        } else {
                            newField[i][j] = '.';
                        }
                    } else {
                        if (neighbour == 3) {
                            newField[i][j] = '.';
                        } else {
                            newField[i][j] = '.';
                        }
                    }
                }
            }
            int h;
            for (h = cell; h >= 0; h--) {
                char[][] f = history[h];
                boolean match = true;
                for (int i = 0; match && i < f.length; i++) {
                    for (int j = 0; match && j < f[i].length; j++) {
                        if (f[i][j] != newField[i][j]) {
                            match = false;
                        }
                    }
                }
                if (match) {
                    break;
                }
            }
            if (h >= 0) {
                System.out.println("Iteration " + (cell + 1) + " same as " + h);
                break;
            }

            field = newField;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j]);
                }
                System.out.println("");
            }
            System.out.println((cell + 1) + "--------------------");
        }
    }
}
