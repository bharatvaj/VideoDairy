package com.thingstudio.videodairy

import android.content.Context
import java.io.FileOutputStream

class FileWriter {
    /// @todo open output file
    fun openFileOutput(filename: String, context: Int) : FileOutputStream{
        return FileOutputStream(filename)
    }

    public  fun  write(){
        val fos: FileOutputStream = openFileOutput("filename", Context.MODE_PRIVATE)
        /// @todo write using video file
//        fos.write(internalStorageBinding.saveFileEditText.getText().toString().getBytes())
        fos.close()
    }
}