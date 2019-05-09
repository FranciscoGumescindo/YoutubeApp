package com.android.gumeoficial.youtubeapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ShareCompat
import android.view.View
import android.widget.SimpleAdapter
import android.widget.SimpleCursorAdapter
import com.google.android.youtube.player.YouTubeStandalonePlayer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    //Enlace hacia la api de youtube
    val API_KEY = "YOUR API KEY YOUTUBE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reproducirId.setOnClickListener(View.OnClickListener {

            //Referencia a enlaze del video
            val intent=YouTubeStandalonePlayer.createVideoIntent(this,API_KEY,"yWr8ZBefKzc")
            startActivity(intent)


        })

    }
    }

