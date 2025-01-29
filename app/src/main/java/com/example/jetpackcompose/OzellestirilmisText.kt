package com.example.jetpackcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OzellistirilmisText(text:String){

    Text(modifier = Modifier.clickable {
        println("text tıklandı")
    }.background(color= Color.White).fillMaxWidth(),text=text)
}

@Preview(showBackground = true)
@Composable
fun OzelPreview(){
    OzellistirilmisText(text="Gülayyyyy Sen İşe Girdin Kanki")
}