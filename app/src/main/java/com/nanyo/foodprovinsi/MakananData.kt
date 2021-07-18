package com.nanyo.foodprovinsi

object MakananData {

    private val makananName = arrayOf(
        "Nasi Lengko",
        "Mie Aceh",
        "Bika Ambon",
        "Rendang",
        "Gulai Ikan Patin",
        "Pempek",
        "Seruit",
        "Kerak Telor",
        "Lumpia",
        "Nasi Gudeg"
    )

    private val makananDetail = arrayOf(
        //nasi lengko 1
        "Sega lengko (nasi lengko dalam bahasa Indonesia) adalah makanan khas asli Cirebon, Jawa Barat. Makanan yang sederhana ini sarat akan protein dan karbohidrat serta rendah kalori karena bahan-bahan yang digunakan adalah 100% non-hewani. Bahan-bahannya antara lain: nasi putih (panas-panas lebih baik), tempe goreng, tahu goreng, mentimun (mentah segar, dicacah), tauge (direbus), daun kucai (dipotong kecil-kecil), bawang goreng, bumbu kacang (seperti bumbu rujak, pedas atau tidak, tergantung selera), dan kecap manis. Umumnya kecap manis yang dipergunakan adalah kecap manis encer, bukan yang kental. Kemudian disiramkan ke atas semua bahan.\n" +
                "\n" +
                "Tempe dan tahu goreng dipotong-potong kecil dan diletakkan di atas sepiring nasi. Mentimun dicacah, lalu ditaburi pula di atasnya, juga toge rebus, serta disiram bumbu kacang di atasnya, dan potongan daun kucai, lalu diberi kecap secukupnya sampai kecoklatan, dan di taburi bawang goreng. Sekeping kerupuk aci yang putih, yang bundar atau kotak, menjadi kondimennya. Sebagian orang suka melumuri kerupuknya dengan kecap, sebelum mulai dimakan. Beberapa orang suka meminta nasi lengkonya diberi seujung sutil atau dua minyak yang dipakai untuk menggoreng tempe dan tahu.\n" +
                "\n" +
                "Untuk menambah selera makan, biasanya makanan ini disajikan dengan ditambah 5 atau 10 tusuk sate kambing yang disajikan secara terpisah di piring lain.",
        //mie aceh 2
        "Mie Aceh adalah masakan mie pedas khas Aceh di Indonesia. Mie kuning tebal dengan irisan daging sapi, daging kambing atau makanan laut (udang dan cumi) disajikan dalam sup sejenis kari yang gurih dan pedas. Mie Aceh tersedia dalam tiga jenis, Mie Aceh Goreng (digoreng dan kering), Mie Aceh Tumis (dengan sedikit kuah) dan Mie Aceh Kuah (sup). Biasanya ditaburi bawang goreng dan disajikan bersama emping, potongan bawang merah, mentimun, dan jeruk nipis.",
        //bika ambon 3
        "Bika ambon adalah penganan khas Medan, Indonesia. Terbuat dari bahan-bahan seperti telur, gula, dan santan, bika ambon umumnya dijual dengan rasa pandan, meskipun kini juga tersedia rasa-rasa lainnya seperti durian, keju, dan cokelat. Bika ambon biasanya dapat bertahan dalam kondisi terbaik selama empat hari karena setelah itu kue tersebut mulai mengeras.\n" +
                "\n" +
                "Menurut penjelasan M Muhar Omtatok, seorang budayawan dan sejarawan, kue bika ambon terilhami dari Bika atau Bingka. Selanjutnya dimodifikasi dengan bahan pengembang berupa nira/tuak enau hingga berongga dan berbeda dari kue Bika asalnya. Selanjutnya M Muhar Omtatok menyebutkan bahwa kue ini disebut bika ambon karena pertama sekali dijual dan popular di simpang Jl Ambon-Sei Kera Medan.[butuh rujukan]\n" +
                "\n" +
                "Bika ambon dikenal sebagai oleh-oleh khas Kota Medan, Sumatra Utara. Di Medan, Jalan Mojopahit di daerah Medan Petisah terdapat sedikitnya 30 toko yang menjual kue ini.[1] Setiap toko di lokasi ini bisa menjual lebih dari 1.000 bungkus bika ambon perhari apabila menjelang hari raya.[1] Diperkirakan, sebutan bika ambon muncul dari kebiasaan masyarakat yang dahulu baru mengenal bika yang diproduksi di Jalan Ambon, Medan. Penyebutan bika ambon akhirnya menjadi tradisi seiring dengan berkembangnya industri makanan ini.",
        //rendang 4
        "Rendang atau randang adalah masakan daging asli Indonesia yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama menggunakan aneka rempah-rempah dan santan. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan.\n" +
                "\n" +
                "Rendang dapat dijumpai di Rumah Makan Padang di seluruh dunia. Masakan ini populer di Indonesia dan negara-negara Asia Tenggara lainnya, seperti Malaysia, Singapura, Brunei, Filipina dan Thailand. Di daerah asalnya, Minangkabau, rendang disajikan di berbagai upacara adat dan perhelatan istimewa. Meskipun rendang merupakan masakan tradisional Minangkabau, teknik memasak serta pilihan dan penggunaan bumbu rendang berbeda-berda menurut daerah.",
        //gulai ikan patin 5
        "Gulai Ikan Patin adalah masakan yang populer di masyarakat Jambi. Gulai ini dimasak dengan menggunakan tempoyak, yaitu daging buah durian yang telah difermentasi. Tetapi ada sebagian orang yang memilih untuk mengganti tempoyak dengan santan kelapa untuk menghindari bau dan rasa tempoyak yang cukup menyengat.",
        //pempek 6
        "Pempek atau empek-empek adalah makanan yang terbuat dari daging ikan yang digiling lembut yang dicampur tepung kanji atau tepung sagu, serta komposisi beberapa bahan lain seperti telur, bawang putih yang dihaluskan, penyedap rasa, dan garam. Pempek biasanya disajikan dengan kuah cuka yang memiliki rasa asam, manis, dan pedas. Pempek sering disebut sebagai makanan khas Palembang,[1] meskipun hampir semua daerah di Sumatera Selatan memproduksinya.\n" +
                "\n" +
                "Pempek dapat ditemukan dengan mudah di Kota Palembang; ada yang menjualnya di restoran, ada yang di pinggir jalan, dan pula yang dipikul. Pada tahun 1980-an, penjual biasa memikul satu keranjang penuh pempek sambil berjalan kaki berkeliling menjajakan dagangannya.",
        //seruit 7
        "Seruit adalah makanan khas daerah Lampung, Indonesia, yaitu masakan ikan yang digoreng atau dibakar dicampur sambal terasi, tempoyak (olahan durian) atau mangga. Jenis ikan adalah besarnya ikan sungai seperti belide, baung, layis dll, ditambah lalapan. Sedangkan minumannya adalah serbat, terbuat dari jus buah mangga kwini. Di toko-toko makanan dan oleh-oleh, juga terdapat makanan khas yaitu sambal Lampung, lempok (dodol), keripik pisang, kerupuk kemplang, manisan dll.\n" +
                "\n" +
                "Seperti masyarakat di banyak daerah di Indonesia, masyarakat Lampung adalah masyarakat yang gemar berkumpul dan bersilaturahmi, baik antar keluarga maupun antar-tetangga. Mereka berkumpul di acara pernikahan, acara adat, atau acara keagamaan.\n" +
                "\n" +
                "Secara kultural, Lampung memiliki dua masyarakat adat, yakni Lampung Sai Batin dan Lampung Pepadun. Keduanya sama-sama memiliki kebiasaan berkumpul. Saat berkumpul, diperlukan makanan yang bisa dinikmati bersama-sama. Makanan tersebut adalah seruit. Namun, kebiasaan makan seruit tidak memliki oleh semua masyarakat adat. Hanya seruit secara turun termurun. Bagi Lampung Pepadun, seruit adalah makanan pokok.",
        //kerak telor 8
        "Kerak telur adalah makanan asli daerah Jakarta (Betawi), dengan bahan-bahan beras ketan putih, telur ayam atau bebek, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir. Kerak telor dapat ditemukan pada hari biasa. Anda bisa menemukan kerak telor di sekitar Kota Tua, Jakarta Barat. Menurut sejarah, Kerak Telor sudah ada dari zaman kolonial Belanda, kerak telor diciptakan oleh masyarakat Betawi secara tak sengaja Pada tahun 1970-an .[1]Makanan ini dihidangkan saat pesta dan hajatan besar para pembesar pada masa itu. Semakin bergulirnya waktu, kehadiran kuliner-kuliner barat menggeser pesona kerak telor ini.",
        //lumpia 9
        "Lumpia atau terkadang dieja sebagai lun pia adalah sejenis jajanan tradisional Tionghoa. Lumpia yang dikenal oleh orang Indonesia merupakan lafal Bahasa Hokkian.\n" +
                "\n" +
                "Lumpia terdiri dari lembaran tipis tepung gandum yang dijadikan sebagai pembungkus isian yang umumnya adalah rebung, telur, sayuran segar, daging, atau makanan laut.\n" +
                "\n" +
                "Di Indonesia, lumpia dikenal sebagai jajanan khas Semarang dengan tata cara pembuatan dan bahan-bahan yang telah disesuaikan dengan tradisi setempat.",
        //nasi gudeg10
        "Gudeg (bahasa Jawa: ꦒꦸꦝꦼꦒ꧀, translit. Gudheg) adalah makanan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat masakan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg biasanya dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu dan sambal goreng krecek."

    )

    private val makananImage = arrayOf(
        R.drawable.jabar_nasi_lengko,
        R.drawable.aceh_mie_aceh,
        R.drawable.sumut_bika_ambon,
        R.drawable.sumbar_rendang,
        R.drawable.jambi_gulai_ikan_patin,
        R.drawable.sumsel_pempek,
        R.drawable.lampung_seruit,
        R.drawable.jakarta_kerak_telor,
        R.drawable.jateng_lumpia,
        R.drawable.yogyakarta_nasi_gudeg
    )

    private val khasProvinsi = arrayOf(
        "Khas Provinsi Jawa Barat",
        "Khas Provinsi Aceh",
        "Khas Provinsi Sumatera Utara",
        "Khas Provinsi Sumatera Barat",
        "Khas Provinsi Jambi",
        "Khas Provinsi Sumatera Selatan",
        "Khas Provinsi Lampung",
        "Khas Provinsi D.K.I Jakarta",
        "Khas Provinsi Jawa Tengah",
        "Khas Provinsi D.I Yogyakarta"
    )

    private val jenisFood = arrayOf(
        //Nasi Lengko
        "Jenis           : Hidangan Nasi\n" +
                "Nama Alternatif : Sega Lengko (Cirebon atau Sunda)\n" +
                "Dibuat oleh     : Cirebon dan Sunda\n" +
                "Suhu Penyajian  : Hangat/panas",
        //Mie Aceh
        "Hidangan Utama : Mie, Daging, atau Seafood\n" +
                "Suhu Penyajian : Hangat/panas",
        //Bika Ambon
        "Hidangan Utama : Tapioka, Tepung Sagu, Telur,\n" +
                "                 Gula, Santan\n" +
                "Variasi        : Kue Bingka",
        //Rendang
        "Variasi        : Ayam Rendang, Bebek Rendang, Hati Rendang\n" +
                "Suhu Penyajian : Hangat/panas/dingin",
        //Gulai ikan patin
        "Suhu Penyajian : Hangat/panas",
        //Pempek
        "Suhu Penyajian : Hangat/panas\n" +
                "Variasi       : Lenggang, Tekwan, Rujak Mie",
        //Seruit
        "Suhu Penyajian : Hangat",
        //Kerak Telor
        "Suhu Penyajian : Hangat/panas",
        //Lumpia
        "Hidangan Utama : Sayur, Daging\n" +
                "Variasi        : Digoreng atau segar",
        //Nasi Gudeg
        "Variasi        : Solo Gudeg, Gudeg Putih\n" +
                "Suhu Penyajian : Hangat/panas"
    )


    val listData: ArrayList<Makanan>
        get() {
            val list = arrayListOf<Makanan>()
            for (position in makananName.indices){
                val makanan = Makanan()
                makanan.name = makananName[position]
                makanan.detail = makananDetail[position]
                makanan.photo = makananImage[position]
                makanan.khas = khasProvinsi[position]
                makanan.jenis = jenisFood[position]
                list.add(makanan)
            }

            return list
        }
}