package com.moniliu.horoscopo.activities

import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.moniliu.horoscopo.data.Horoscope
import com.moniliu.horoscopo.R

class DetailActivity : AppCompatActivity() {
    lateinit var signImageView: ImageView
    lateinit var signNameTextView : TextView
    lateinit var signDateTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        signImageView = findViewById(R.id.signImageView)
        signNameTextView = findViewById(R.id.signNameTextView)
        signDateTextView = findViewById(R.id.signDateTextView)



        val name = intent.getIntExtra("HOROSCOPE_name",0)

        val icon = intent.getIntExtra("HOROSCOPE_icon",0)

        val dates = intent.getIntExtra("HOROSCOPE.date", 0)



        val id = intent.getStringExtra("HOROSCOPE_ID")!!

        val horoscope = Horoscope.getById (id)





        signImageView.setImageResource (horoscope.sign)
        signNameTextView.setText(horoscope.name)
        signDateTextView.setText(horoscope.dates)



        supportActionBar?.setTitle(horoscope.name )
        supportActionBar?.setSubtitle(horoscope.dates)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
       // supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_search)


    }

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        return when (item.itemId){
        android.R.id.home -> {
            finish()
        return true
    }

            R.id.menu_favorite ->{
                // me haces una cosa
                Toast.makeText(this, "Favorito", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_share -> {
               // me haces otra cosa
                Toast.makeText(this, "Compartir", Toast.LENGTH_SHORT).show()

                true

            }
            else -> super.onOptionsItemSelected(item)

        }
    }

}