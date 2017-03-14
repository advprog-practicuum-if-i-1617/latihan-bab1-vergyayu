package gamepacman;

public class ClassPacman {

    int kanan, kiri, atas, bawah;
    int a = 4, b = 4, c = 0, d = 0, e = 0;
    String[][] pac = new String[10][10];

    public void Kanan() {
        this.b = b + 1;
        if (a==0||a==9||b==0||b==9||a==2&&b==7||a==3&&(b==3)||a==4&&(b==2||b==3)||a==6&&(b==3||b==4||b==8)||a==7&&b==3) {
            b = b - 1;
        }
    }

    public void Kiri() {
        this.b = b - 1;
        if (a==0||a==9||b==0||b==9||a==2&&b==7||a==3&&(b==3)||a==4&&(b==2||b==3)||a==6&&(b==3||b==4||b==8)||a==7&&b==3) {

            b = b + 1;
        }
    }

    public void Atas() {
        this.a = a - 1;
        if (a==0||a==9||b==0||b==9||a==2&&b==7||a==3&&(b==3)||a==4&&(b==2||b==3)||a==6&&(b==3||b==4||b==8)||a==7&&b==3) {

            a = a + 1;
        }
    }

    public void Bawah() {
        this.a = a + 1;
        if (a==0||a==9||b==0||b==9||a==2&&b==7||a==3&&(b==3)||a==4&&(b==2||b==3)||a==6&&(b==3||b==4||b==8)||a==7&&b==3) {

            a = a - 1;
        }
    }

    public void Data() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i==0||i==9||j==0||j==9||i==2&&j==7||i==3&&(j==3)||i==4&&(j==2||j==3)||i==6&&(j==3||j==4||j==8)||i==7&&j==3) {
                    pac[i][j] = "#";
                } else if (i == 3 && (j == 4 || j == 8) || i == 5 && j == 5) {
                    pac[i][j] = "*";
                } else {
                    pac[i][j] = " ";
                }
                if (i == a && j == b) {
                    pac[i][j] = "@";
                }
                if (a == 3 && b == 4) {
                    c = 1;
                } else if (c > 0) {
                    pac[3][4] = " ";
                }
                if (a == 3 && b == 8) {
                    d = 1;
                } else if (d > 0) {
                    pac[3][8] = " ";
                }
                if (a == 5 && b == 5) {
                    e = 1;
                } else if (e > 0) {
                    pac[5][5] = " ";
                }
                System.out.print(pac[i][j]);
            }
            System.out.println("");
            if (c > 0 && d > 0 && e > 0) {
                System.out.print("SELAMAT ANDA MENANG :)");
                System.exit(0);
            }
        }
    }
}