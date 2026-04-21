public class Tabuleiro {

    char[][] matriz;

    public Tabuleiro() {
        matriz = new char[3][3];
        for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = ' ';
            }
        }
    }

    public boolean
    jogar(int linha, int coluna, char simbolo) {

        if (linha >=0 && linha < 3
                && coluna >= 0 && coluna < 3
                && matriz[linha][coluna] == ' ') {

            matriz[linha][coluna] = simbolo;
            return true;
        }

        return false;
    }

    public boolean verificarVitoria(char simbolo) {

        // Linhas
        for (int i = 0; i < 3; i++ ){
            if (matriz[i][0] == simbolo
            && matriz[i][1] == simbolo
            && matriz[i][2] == simbolo) {
                return true;
            }
        }

        // Colunas
        for (int j = 0; j < 3; j++ ){
            if (matriz[0][j] == simbolo
                    && matriz[1][j] == simbolo
                    && matriz[2][j] == simbolo) {
                return true;
            }
        }

        // Diagonais
        if (matriz[0][0] == simbolo &&
            matriz[1][1] == simbolo &&
            matriz[2][2] == simbolo)   {
            return true;
        }

        if (matriz[0][2] == simbolo &&
                matriz[1][1] == simbolo &&
                matriz[2][0] == simbolo)   {
            return true;
        }

        return false;
    }

    public boolean cheio()  {
        for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < 3; j++) {
               if(matriz[i][j] == ' ') {
                   return false;
               }
            }
        }
        return true;
    }

    public void mostrar() {
        System.out.println("-----------");
         for (int i = 0; i < 3; i++){
             System.out.print("| ");
             for (int j = 0; j < 3; j++) {
                 System.out.print(matriz[i][j] + " | ");
             }
             System.out.println("\n-------------");
         }
    }


















}
