package com.example.tugasempat;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class FilmPresenter {
    Context context;
    List<FilmModel> filmModels = new ArrayList<>();
    MainView view;
    public FilmPresenter(MainView view, Context context){
        this.view = view;
        this.context = context;
    }

    public void setData(){
        FilmModel film;

        film = new FilmModel("Vans", R.drawable.vans, "Pada 16 maret 1966, Paul Van Doren dan tiga orang temannya membuat perusahaan baru bernama Van Doren Rubber Co .\n" +
                "(sekarang dikenal Vans) . Vans adalah produsen sepatu,pakaian,dan aksesoris untuk olahraga skateboard , snowboard , BMX , dan selancar.\n" +
                "\n" +
                "Pada awalnya, Paul Van Doren bekerja di pabrik sepatu bermerek Randy's sebagai buruh pembuat sepatu dan penyapu lantai . setelah 20 tahun bekerja disana, ia sudah beberapa kali naik jabatan karena ketekunannya . Sampai akhirnya, Paul manjabat sebagai Vice President di Randy's.\n" +
                "\n" +
                "Akhirnya, ia memutuskan untuk keluar dari perusahaan sepatu tersebut dan pindah ke Southern California . Disana Paul dan temannya mendirikan perusahaan sepatu baru pada 1966 (merupakan cikal bakal Vans)");
        filmModels.add(film);
        film = new FilmModel("Adidas", R.drawable.adidas, "Sejarah merk sepatu yang sangat terkenal ini dimulai pada tahun 1920 oleh Adi (Adolf) Dassler di ruang cuci milik Ibunya. Waktu itu Adi Dassler membuat proyek kecil-kecilan dengan membuat sepatu olahraga. Karena tingginya kualitas sepatu yang dihasilkannya, akhirnya bisnis kecil-kecilan tersebut mulai membuahkan hasil. Pada tahun 1924, Adi Dassler dan saudaranya Rudolf Dassler mendirikan “Dassler Brothers OGH” yang nantinya menjadi cikal bakal Adidas sekarang.");
        filmModels.add(film);
        film = new FilmModel("Puma", R.drawable.puma, "Puma adalah perusahaan internasional yang memproduksi sepatu olahraga serta perlengkapan olahraga lainnya. Perusahaan ini berbasis di Jerman, dan didirikan oleh Rudolf Dassler. Rudolf adalah kakak dari Adolf Dassler, pendiri Adidas.\n" +
                "\n" +
                "Perusahaan ini dikenal dalam dunia sepak bola karena menjadi sponsor pemain sepak bola terkenal seperti Pelé, Eusébio, Johan Cruijff, Enzo Francescoli, Diego Maradona, Didier Deschamps, Lothar Matthäus, dan Kenny Dalglish, dan Robert Pirès. Di Amerika Serikat, Puma terkenal dengan sepatu bola basket kulitnya yang diperkenalkan pada tahun 1968.");
        filmModels.add(film);
        film = new FilmModel("Converse", R.drawable.converse, "Converse adalah sebuah perusahaan sepatu asal Amerika dengan hasil produksi yang terutama terdiri dari alas kaki berjenis olahraga dan brand gaya hidup. Perusahaan telah berdiri sejak tahun 1908 dan, pada tahun 2003, dibeli senilai $ 305.000.000 (USD) sebagai anak perusahaan dari Nike, Inc. Converse memproduksi produk di bawah nama dagang seperti One Star, Chuck Taylor All Star, dan Jack Purcell. Sepatu converse dibedakan dengan sejumlah fitur, termasuk motif lencana bintangnya. Bahkan, sol karet All Star, halus bulat disekitaran di atas, dan melengkung di sekitar jalur telah menjadi khas yang begitu dikenali, pada tahun 2014, Converse mengajukan gugatan ke Komisi Perdagangan Internasional AS yang menuduh Walmart, Skechers, Kmart, dan 28 pengecer lain beserta produsen dengan masalah pelanggaran merek dagang. Dalam upaya untuk melestarikan keaslian sepatu selain fungsinya. Sejumlah perkara diselesaikan, termasuk Fila dan Iconix.[3][4] Selain alas kaki, perusahaan menjual barang-barang lainnya secara global melalui pengecer di lebih dari 160 negara dan melalui sekitar 75-perusahaan milik toko ritel di Amerika Serikat.");
        filmModels.add(film);
        film = new FilmModel("Nike", R.drawable.nike, "Produk sepatu dan pakaian olahraga Nike dengan mudah diidentifikasi oleh khas logo perusahaan, para \"swoosh\" tik, dan slogan \"Just Do It\".\n" +
                "\n" +
                "Berbasis dari nama dewi Yunani yang berarti kemenangan, Nike didirikan tahun 1964 ketika atlet sekaligus pengusaha Oregon bernama Phillip Knight, mengagas impor sepatu lari dari Jepang untuk bersaing dengan merek Jerman seperti Adidas dan Puma yang kemudian mendominasi pasar Amerika Serikat. Keuntungannya adalah bahwa sepatu Jepang lebih murah karena tenaga kerja lebih murah di Jepang.\n" +
                "\n" +
                "Dia mulai menjual sepatu keliling dengan tujuan di stadion atletik, dimana penjualan secara pelan tapi pasti meningkat secara dramatis. Pada 1970-an, Knight dan perusahaan yang berkembang nya melihat awal revolusi jogging dan mulai mmasaran produk untuk pelari non-profesional juga. Ia lantas segera membuka pasar yang lebih luas dan mengubah image sepatu lari menjadi sepatu fashion dan menarik semua orang dari anak-anak sampai dewasa memakainya.");
        filmModels.add(film);
        film = new FilmModel("Asics", R.drawable.asics  , "ASICS Ltd. dimulai sebagai Onitsuka Co., Ltd pada tanggal 1 September 1949.[6] Pendirinya, Kihachiro Onitsuka, mulai memproduksi sepatu basket di rumahnya di kota Kobe, Prefektur Hyogo, Jepang. Onitsuka menjadi sangat terkenal karena desain Mexico 66[7] , di mana terdapat garis-garis khas yang melintas, saat ini identik dengan merek perusahaan. Pada 1977, Onitsuka Tiger digabung dengan GTO dan JELENK untuk membentuk ASICS Corporation. Meskipun telah melakukan nama, produk sepatu ASICS masih diproduksi dan dijual secara internasional di bawah label Onitsuka Tiger.");
        filmModels.add(film);
        film = new FilmModel("New Balance", R.drawable.newbalance, "In New York City, a seemingly ordinary teenager named Clary Fray (Lily Collins) learns that she is descended from a line of Shadowhunters -- half-angel warriors who protect humanity from evil forces. After her mother (Lena Headey) disappears, Clary joins forces with a group of Shadowhunters and enters Downworld, an alternate realm filled with demons, vampires and a host of other creatures. Clary and her companions must find and protect an ancient cup that holds the key to her mother's future.");
        filmModels.add(film);

        view.onSuccess(filmModels);

    }
}
