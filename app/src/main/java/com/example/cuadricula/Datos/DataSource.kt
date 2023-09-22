package com.example.cuadricula.Datos
import com.example.cuadricula.R
import com.example.cuadricula.Modelo.Topic

object DataSource {
    val topics = listOf(
        Topic(R.string.architecture, 58, R.drawable.arquitectura),
        Topic(R.string.crafts, 121, R.drawable.artesania),
        Topic(R.string.business, 78, R.drawable.negocio),
        Topic(R.string.culinary, 118, R.drawable.culinario),
        Topic(R.string.design, 423, R.drawable.disenio),
        Topic(R.string.fashion, 92, R.drawable.moda),
        Topic(R.string.film, 165, R.drawable.pelicula),
        Topic(R.string.gaming, 164, R.drawable.jugando),
        Topic(R.string.drawing, 326, R.drawable.dibujo),
        Topic(R.string.lifestyle, 305, R.drawable.estilo_de_vida),
        Topic(R.string.music, 212, R.drawable.musicanew),
        Topic(R.string.painting, 172, R.drawable.cuadro),
        Topic(R.string.photography, 321, R.drawable.fotografia),
        Topic(R.string.tech, 118, R.drawable.tecnologia)
    )
}
