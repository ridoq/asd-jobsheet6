#   Percobaan 1

##  Soal
1. Jelaskan fungsi kode program berikut

    ```java
        if (data[j - 1] > data[j]) {
            temp = data[j];
            data[j] = data[j - 1];
            data[j - 1] = temp;
        }
    ```

2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan  
4. Pada Insertion sort, apakah tujuan dari perintah 
---

##  Jawaban

1.  Fungsi Kode Program (Swap): Potongan kode tersebut berfungsi untuk menukar posisi dua elemen dalam array jika elemen sebelumnya lebih besar dari elemen saat ini (proses Swapping).
2.  berikut code nya

    ```java
        int min = i;
        for (int j = i + 1; j < jumData; j++) {
            if (data[j] < data[min]) {
                min = j;
            }
        }
    ```
3.  Kondisi while pada Insertion Sort: Kondisi j >= 0 && data[j] > temp berarti perulangan terus berjalan selama indeks j belum mencapai batas awal array DAN elemen pada data[j] masih lebih besar dari nilai yang sedang diurutkan (temp).
4.  Tujuan data[j+1] = temp: Perintah ini bertujuan untuk menempatkan nilai temp ke posisi yang tepat (posisi yang seharusnya) setelah elemen-elemen lain yang lebih besar telah digeser ke kanan.

---

#   Percobaan 2