package com.cumaliguzel.person.UI.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.cumaliguzel.person.Data.entity.Kisiler
import com.cumaliguzel.person.UI.fragment.AnasayfaFragmentDirections
import com.cumaliguzel.person.databinding.CardTasarimBinding
import com.cumaliguzel.person.databinding.FragmentAnasayfaBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar

class KisilerAdapter(var mContext: Context,var kisilerListesi : List<Kisiler>) : RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KisilerAdapter.CardTasarimTutucu {
        //Card tasarima erişim
       val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false )
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: KisilerAdapter.CardTasarimTutucu, position: Int) {
        //persol change
        //erişşim ve kodlama
        //bu kısım loop gibi çalışır
        val kisi=kisilerListesi.get(position)
        val t=holder.tasarim
        t.textViewKisiAd.text=kisi.kisi_ad
        t.textView2kisiTel.text=kisi.kisi_tel
        //karta tıklandığında yapılacak olan geçis
        t.cardViewSatir.setOnClickListener {
            val gecis=AnasayfaFragmentDirections.gecisKisiDetay(kisi=kisi)
            Navigation.findNavController(it).navigate(gecis)
        }
        t.imageViewSil.setOnClickListener {
            Snackbar.make(it,"${kisi.kisi_ad}silinsin mi?",Snackbar.LENGTH_LONG)
                .setAction("YES"){
                   Snackbar.make(it,"Veri Tabanı eklenince bu özellik devreye girecek",Snackbar.LENGTH_LONG).show()
                }
                .show()
        }



    }

    override fun getItemCount(): Int {
        //return size
        return  kisilerListesi.size
    }



}