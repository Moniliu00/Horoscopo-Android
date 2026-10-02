package com.moniliu.horoscopo

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HoroscopeAdapter(
    val items: List<Horoscope>,
    val onItemClick: (position: Int) -> Unit
) : RecyclerView.Adapter<HoroscopeViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HoroscopeViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_horoscope, parent, false)

        return HoroscopeViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: HoroscopeViewHolder,
        position: Int
    ) {

        val horoscope = items[position]

        // Mostrar los datos
        holder.render(horoscope)

        // Colores translúcidos de cada signo
        val colors = listOf(
            "#66F44336", // Aries - rojo
            "#664CAF50", // Tauro - verde
            "#66FFEB3B", // Géminis - amarillo
            "#662196F3", // Cáncer - azul
            "#66FF9800", // Leo - naranja
            "#669C27B0", // Virgo - morado
            "#66E91E63", // Libra - rosa
            "#6600BCD4", // Escorpio - cyan
            "#66795548", // Sagitario - marrón
            "#66607D8B", // Capricornio - azul gris
            "#6603A9F4", // Acuario - azul claro
            "#668BC34A"  // Piscis - verde
        )

        // Crear fondo
        val background = GradientDrawable()

        background.shape = GradientDrawable.RECTANGLE

        // Esquinas redondeadas
        background.cornerRadius = 12f

        // Color translúcido
        background.setColor(
            Color.parseColor(colors[position])
        )

        // Borde blanco translúcido
        background.setStroke(
            1,
            Color.parseColor("#55FFFFFF")
        )

        // Aplicar fondo a la celda
        holder.itemView.background = background

        // Al pulsar
        holder.itemView.setOnClickListener {
            onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}


class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val signImageView: ImageView =
        view.findViewById(R.id.signImageView)

    val nameTextView: TextView =
        view.findViewById(R.id.nameTextView)

    val datesTextView: TextView =
        view.findViewById(R.id.datesTextView)

    fun render(horoscope: Horoscope) {

        // Como name y dates son recursos de Android (Int)
        nameTextView.setText(horoscope.name)

        datesTextView.setText(horoscope.dates)

        signImageView.setImageResource(horoscope.sign)
    }
}
