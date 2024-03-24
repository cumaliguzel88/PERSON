package com.cumaliguzel.person.UI.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cumaliguzel.person.R
import com.cumaliguzel.person.databinding.FragmentKisiDetayBinding
import com.cumaliguzel.person.databinding.FragmentKisiKayitBinding


class KisiKayitFragment : Fragment() {
private lateinit var binding:FragmentKisiKayitBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentKisiKayitBinding.inflate(inflater,container,false)
        binding.toolbarKisiKayit.title="Kişi Kayıt"//toolbar başlık ekleme

        binding.btnKaydet.setOnClickListener {
            val kisi_ad=binding.editTextKisiAd.text.toString()
            val kisi_tel=binding.editTextkisiNumarasi.text.toString()

            kaydet(kisi_ad,kisi_tel)

        }
        return binding.root
    }
     fun kaydet(kisi_ad : String,kisi_tel : String){
        Log.e("Kisi Kaydet","$kisi_ad,$kisi_tel")
    }


}