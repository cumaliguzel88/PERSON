package com.cumaliguzel.person.UI.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.cumaliguzel.person.R
import com.cumaliguzel.person.databinding.FragmentAnasayfaBinding
import com.cumaliguzel.person.databinding.FragmentKisiDetayBinding


class KisiDetayFragment : Fragment() {
private lateinit var binding: FragmentKisiDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentKisiDetayBinding.inflate(inflater,container,false)
        binding.toolbarKisiDetay.title="Kişi Detay"
        val bundle:KisiDetayFragmentArgs by navArgs()
        val gelenKisi=bundle.kisi
        binding.kisiadtexGuncelle.setText(gelenKisi.kisi_ad)
        binding.kisiTelGuncelle.setText(gelenKisi.kisi_tel)
        binding.btnGuncelle.setOnClickListener {
            val kisi_ad=binding.kisiadtexGuncelle.text.toString()
            val kisi_tel=binding.kisiTelGuncelle.text.toString()
            guncelle(gelenKisi.kisi_id,kisi_ad,kisi_tel)
        }




        return binding.root
    }
    fun guncelle(kisi_id:Int,kisi_ad : String,kisi_tel : String){
        Log.e("Kisi Kaydet","$kisi_id,$kisi_ad,$kisi_tel")
    }
}