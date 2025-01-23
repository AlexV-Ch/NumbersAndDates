public class TrucksAndContainers {
    private int yashchKont = 27;
    private int kontAuto = 12;
    private int kolAvto = 0;
    private int kolKon = 0;
    private int kolvoYashchikov;

    public TrucksAndContainers(int kolvoYashchikov) {
        if (kolvoYashchikov <= 0) {
            this.kolvoYashchikov = 0;
        } else {
            this.kolvoYashchikov = kolvoYashchikov;
        }
    }

    public int getKolvoYashchikov() {
        return kolvoYashchikov;
    }

    public void setKolvoYashchikov(int kolvoYashchikov) {
        this.kolvoYashchikov = kolvoYashchikov;
    }

    public void getKolvoKonAvto() {
        System.out.println("Количество ящиков - " + getKolvoYashchikov());
        System.out.println("Количество контейнеров - " + getKolvoKon());
        System.out.println("Количество автомобилей - " + getKolvoAuto());

        if (kolvoYashchikov == 0) {
            System.out.println("Где груз?");
        } else {
            System.out.println("Грузовик " + ++kolAvto);
            System.out.println("   Контейнер " + ++kolKon);
            for (int i = 1; i <= kolvoYashchikov; i++) {
                System.out.println("      Ящик - " + i);
                if (i % (27 * 12) == 0) {
                    System.out.println("Грузовик " + ++kolAvto);
                }
                if (i % 27 == 0) {
                    System.out.println("   Контейнер " + ++kolKon);
                }

            }
            System.out.println("Необходимо:");
            System.out.println("Грузовиков:  " + kolAvto);
            System.out.println("Контейнеров: " + kolKon);
        }

    }



// Расчет кол-ва контейнеров
    public int getKolvoKon() {
        if (kolvoYashchikov == 0) {
            return 0;
        } else {
            int kolvoKon = kolvoYashchikov / yashchKont;
            int kolvoYaOst = kolvoYashchikov % yashchKont;
            if (kolvoKon == 0) {
                return 1;
            } else {
                if (kolvoKon > 0 && kolvoYaOst == 0) {
                    return kolvoKon;
                } else {
                    return kolvoKon + 1;
                }
            }
        }
    }

    // Расчет кол-ва машин
    public int getKolvoAuto() {
        if (kolvoYashchikov == 0) {
            return 0;
        } else {
            int kolvoAvt = getKolvoKon() / kontAuto;
            int kolvoKonOst = getKolvoKon() % kontAuto;
            if (kolvoAvt == 0) {
                return 1;
            } else {
                if (kolvoAvt > 0 && kolvoKonOst == 0) {
                    return kolvoAvt;
                } else {
                    return kolvoAvt + 1;
                }
            }
        }
    }






    }

