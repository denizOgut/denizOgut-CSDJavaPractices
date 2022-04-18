**1.** abc üç basamaklı bir tamsayıdır ve aşağıdaki koşulları sağlamaktadır:
<br> </br>
koşul 1 cba > abc olacak <br> </br>
koşul 2 abc asal sayı olacak <br> </br>
koşul 3 cba asal sayı olacak <br> </br>
koşul 4 ab asal sayı olacak <br> </br>
koşul 5 bc asal sayı olacak <br> </br>
koşul 6 cb asal sayı olacak <br> </br>
koşul 7 ba asal sayı olacak

113 sayısı bu koşulları sağlamaktadır! <br> </br>
koşul 1 cba > abc olacak 311 > 113<br> </br>
koşul 2 abc asal sayı olacak 113 asal<br> </br>
koşul 3 cba asal sayı olacak 311 asal<br> </br>
koşul 4 ab asal sayı olacak 11 asal<br> </br>
koşul 5 bc asal sayı olacak 13 asal<br> </br>
koşul 6 cb asal sayı olacak 31 asal<br> </br>
koşul 7 ba asal sayı olacak 11 asal<br> </br>
Yukarıdaki koşulların hepsini sağlayan tüm abc sayılarını bulan programı yazınız.

**2.** Aşağıda açıkl anan **isPrimeX** isimli metodu yazınız:

**isPrimeX** metodu içerisinde gönderilen argumanın asal olup olmadığı test edilecek , eğer sayı asal ise bu kez sayının
basamak değerleri toplanarak elde edilen sayının asal olup olmadığı test edilecektir. Bu işlem sonuçt a tek basamaklı b ir sayı
kalana kadar devam edilecektir. Eğer en son elde edilen tek basamaklı sayı dahil tüm sayılar asal ise **isPrimeX** metodu true
değerine geri dönecektir. Eğer herhangi bir kademede asal olmayan bir sayı elde edilirse metot false değerin e geri
dönecektir.


**3.** Parametre si ile aldığı int türden bir sayının basamaksal kökünü bulan **calculateDigitalRoot** isimli metodu yazınız ve test
ediniz

Açıklamalar:
* Bir sayının basamaksal kökü tüm basamaklarının toplanması ile elde edilen sayıdır. Basamakl arı topla ma işlemi
tek basamakl ı bir sayı elde edilene kadar sürdürülür
36987 **-->** 3 + 6 + 9 + 8 + 7 = 33
33 **-->** 3 + 3 = 6  basamaksal kök

**4.** Pozitif bir sayının factorian sayısı olup olmadığını test eden isFactorian isimli metodu yazınız ve test edi niz.

Açıklamalar:
* Basamaklarının f aktoriyelleri toplamı kendisine eşit olan sayıya factorian denir.
* Sayma sayılarında (pozitif sayılarda) 4 tane factorian sayı vardır. Bunlardan ilk ikisi şüphesiz 1 ve 2'dir
* Diğerlerini de bulan test kodunu yazınız
* İpucu: K alan iki sayı da 100000 değerinden küçüktür

**5.** Aşağıdaki açıklamalara göre bir tamsayının super asal (super prime) olup olmadığını test eden isSuperPrime isimli
metodu yazınız ve test ediniz.
Not: Super asal sayılara asal indeksli asal sayılar (prime indexed primes) da denir

Açıklamalar:
* Tüm a sal sayıların 1 değerinden başlayarak indeklendiğini düşünelim:<br> </br>
1 --> 2<br> </br>
2 --> 3<br> </br>
3 --> 5<br> </br>
4 4 --> 7> 7<br> </br>
5 5 --> 11 *> 11 *<br> </br>
6 6 --> 13> 13<br> </br>
7 7 --> 17 *> 17 *<br> </br>
......
Eğer asal sayının indeksi de yani kaçıncı asal sayı olduğu da asal ise bu sayı Eğer asal sayının indeksi de yani kaçıncı asal sayı olduğu da asal ise bu sayı super asal super asal sayıdırsayıdır..

**6.** n pozitif bir tamsay ı üzere ve a, b, c, d birbirinden farklı pozitif tamsayılar olmak üzere eğer

n = a ^ 3 + b ^ 3 = c ^ 3 + d ^ 3

eşitliğini sağlayacak şekilde a, b, c ve d tamsayıları var ise n bir Hardy Ramanujan sayısıdır

1729 = 9 ^ 3 + 10 ^ 3 = 1 ^ 3 + 12 ^ 3

Buna göre 100000'den küçük olan tüm Hardy Ramanujan sayılarını ekrana bastıran programı yazınız

**7.** Parametresi ile aldığı int türden bir sayının 10'luk sistemde Harshad sayısı olup olmadığını test eden **isDecimalHarshad**
isimli metodu NumberUtil sınıfı içerisinde yazınız ve test ediniz.

Açıklamalar:
* Basamaklarının toplamına bölünebilen sayılara Harshad (Niven) sayılar denir
* Metot negatif sayılar için false değerine dönecektir

**8** Parametresi ile aldığı int türden bir sayının Collatz serisine ilişkin sayılarını ekrana basan **printCollatz** metodunu
yazınız

Açıklamalar:
* Collatz conjecture n bir pozitif tamsayı olmak üzere her yeni n değeri içi n aşağıdaki kurallar uygulanacaktır:

 n, 1 değerine eşit ise işlemler sonlandırılacaktır

 n çift ise yeni n değeri olarak n / 2, n tek ise yeni n değeri olarak 3 * n + 1 alınacaktır
 
<p>
Örnek:
72543 217630 108815 326446 163223 489 670 244835 7 345 06 367253 1101760
550880 275440 137720 68860 34430 17215 51646 25823 77470 38735 116206
58103 1 74310 87155 261466 130733 392200 196100 98050 49025 147076 73538
36769 110308 55154 27577 82732 41366 20683 62050 31025 93076 46538 23 269
6980 8 3 4904 17452 8726 4363 13090 6545 19636 9818 4909 14728 7364 3682
1841 5524 2762 1381 4144 2072 1036 518 259 778 389 1168 584 292 146 73
220 110 55 166 83 250 125 376 188 94 47 142 71 214 107 322 161 484 242
121 364 182 91 274 137 412 206 103 310 155 466 233 700 350 175 526 263
790 395 1186 593 1780 890 445 1336 668 334 167 502 251 754 377 113 2 566
283 850 425 1276 638 319 958 479 1438 719 2158 1079 3238 1619 4858 2429
7288 3644 1822 911 2734 1367 4102 2051 6154 3077 9232 4616 2308 115 4 577
1732 866 433 1300 650 325 976 488 244 122 61 184 92 46 23 70 35 106 53
160 80 40 20 10 5 16 8 4 2 1
</p>