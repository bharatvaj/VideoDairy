package com.thingstudio.videodairy

import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            takeVideo()
        }
    }

    public fun takeVideo(){
        val takePicture = registerForActivityResult(ActivityResultContracts.TakeVideo())  {
//            FileWriter.write(it);
            imageView.setImageBitmap(it)
        }

        val imageuri: Uri = Uri.parse("/storage/emulated/0/file.mp4")
        takePicture.launch(imageuri)


//        val imageUri: Uri = ...
//        button.setOnClickListener {
//            takePicture.launch(imageUri)
//        }
    }
}