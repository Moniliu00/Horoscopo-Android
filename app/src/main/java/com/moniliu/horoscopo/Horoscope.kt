package com.moniliu.horoscopo

import android.R

data class Horoscope (
    val id: String,
    val name:Int,
    val dates:Int,
    val sign:Int

){

    companion object{
        private val horoscopeList: List<Horoscope> = listOf(
            Horoscope("aries", com.moniliu.horoscopo.R.string.horoscope_name_aries, com.moniliu.horoscopo.R.string.horoscope_date_aries, com.moniliu.horoscopo.R.drawable.aries_icon),
            Horoscope("taurus", com.moniliu.horoscopo.R.string.horoscope_name_taurus, com.moniliu.horoscopo.R.string.horoscope_date_taurus, com.moniliu.horoscopo.R.drawable.taurus_icon),
            Horoscope("gemini", com.moniliu.horoscopo.R.string.horoscope_name_gemini, com.moniliu.horoscopo.R.string.horoscope_date_gemini, com.moniliu.horoscopo.R.drawable.gemini_icon),
            Horoscope("cancer", com.moniliu.horoscopo.R.string.horoscope_name_cancer, com.moniliu.horoscopo.R.string.horoscope_date_cancer, com.moniliu.horoscopo.R.drawable.cancer_icon),
            Horoscope("leo", com.moniliu.horoscopo.R.string.horoscope_name_leo, com.moniliu.horoscopo.R.string.horoscope_date_leo, com.moniliu.horoscopo.R.drawable.leo_icon),
            Horoscope("virgo", com.moniliu.horoscopo.R.string.horoscope_name_virgo, com.moniliu.horoscopo.R.string.horoscope_date_virgo, com.moniliu.horoscopo.R.drawable.virgo_icon),
            Horoscope("libra", com.moniliu.horoscopo.R.string.horoscope_name_libra, com.moniliu.horoscopo.R.string.horoscope_date_libra, com.moniliu.horoscopo.R.drawable.libra_icon),
            Horoscope("scorpio", com.moniliu.horoscopo.R.string.horoscope_name_scorpio, com.moniliu.horoscopo.R.string.horoscope_date_scorpio, com.moniliu.horoscopo.R.drawable.scorpio_icon),
            Horoscope("sagittarius", com.moniliu.horoscopo.R.string.horoscope_name_sagittarius, com.moniliu.horoscopo.R.string.horoscope_date_sagittarius, com.moniliu.horoscopo.R.drawable.sagittarius_icon),
            Horoscope("capricorn", com.moniliu.horoscopo.R.string.horoscope_name_capricorn, com.moniliu.horoscopo.R.string.horoscope_date_capricorn, com.moniliu.horoscopo.R.drawable.capricorn_icon),
            Horoscope("aquarius", com.moniliu.horoscopo.R.string.horoscope_name_aquarius, com.moniliu.horoscopo.R.string.horoscope_date_aquarius, com.moniliu.horoscopo.R.drawable.aquarius_icon),
            Horoscope("pisces", com.moniliu.horoscopo.R.string.horoscope_name_pisces, com.moniliu.horoscopo.R.string.horoscope_date_pisces, com.moniliu.horoscopo.R.drawable.pisces_icon)
        )

        fun getAll() : List<Horoscope>{
            return horoscopeList

        }

      fun getById (id: String): Horoscope {

           return horoscopeList.find  { it.id == id } !!
      }

    }
}