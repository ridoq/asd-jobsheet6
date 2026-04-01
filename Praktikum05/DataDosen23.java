package Praktikum05;

public class DataDosen23 {
    Dosen23[] dataDosen = new Dosen23[10];
    int idx;

    void tambah(Dosen23 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx++] = dsn;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void sortingASC() { // Bubble Sort berdasarkan Usia Termuda
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    Dosen23 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() { // Selection Sort berdasarkan Usia Tertua
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            Dosen23 tmp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }
}
