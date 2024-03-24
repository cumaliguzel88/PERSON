package com.cumaliguzel.person.UI.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.cumaliguzel.person.Data.entity.Kisiler
import com.cumaliguzel.person.R
import com.cumaliguzel.person.UI.adapter.KisilerAdapter
import com.cumaliguzel.person.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentAnasayfaBinding.inflate(inflater,container,false)
        binding.rv.layoutManager=LinearLayoutManager(requireContext())
        binding.toolbarAnasayfa.title="Kişiler"

        val kisilerListesi=ArrayList<Kisiler>()
        val k1=Kisiler(1,"Cumali","0522581224")
        val k2=Kisiler(2,"Samet","0544881722")
        val k3=Kisiler(3,"Yunus Emre","0587996621")
        val k4=Kisiler(4,"İbrahim","0557846621")
        val k5=Kisiler(5,"Abdurahman","055559631")
        val k6=Kisiler(6,"Mustafa","05010975541")
        val k7=Kisiler(7,"Ali","05508866447")
        val k8=Kisiler(8,"Nizam","0521215587")
        val k9=Kisiler(9,"Emir","0588996644")
        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)
        kisilerListesi.add(k4)
        kisilerListesi.add(k5)
        kisilerListesi.add(k6)
        kisilerListesi.add(k7)
        kisilerListesi.add(k8)
        kisilerListesi.add(k9)
        val kisilerAdapter=KisilerAdapter(requireContext(),kisilerListesi)
        binding.rv.adapter=kisilerAdapter









        binding.fabBtn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisKayit)
        }
        binding.searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextChange(newText: String): Boolean {
                ara(newText)

                return true
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                ara(query)
                return true
            }
        })


        return binding.root
    }
    fun ara(aramaKelimesi:String){
        Log.e("kisi ara",aramaKelimesi)
    }

}