package com.example.jetpackcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
/*
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)){
                        MainScreen()
                    }

                }
            }
        }
    }
}

@Composable
fun MainScreen(){
    Column(
        modifier=Modifier.fillMaxSize().background(Color.LightGray),
        verticalArrangement =  Arrangement.Top

    ){
        Text(text="Gülay", modifier = Modifier.padding(5. dp), color = Color.Red, textAlign = TextAlign.Justify, fontSize = 30.sp)
        Spacer(modifier = Modifier.padding(50. dp))

        Text(text="Gülay", modifier = Modifier.padding(5. dp), color = Color.Red, textAlign = TextAlign.Justify, fontSize = 30.sp)

        OzellistirilmisText(text = "hshhshshsh")
    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
      MainScreen()
    }
}*/
//StateManagement--Button
/*
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)){
                        MainScreen()
                    }

                }
            }
        }
    }
}


@Composable
fun MainScreen(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        var kullaniciGirdisi= remember{mutableStateOf("")}
        var textDeğeri=remember{ mutableStateOf("Merhaba Gülay") }
        TextField(value =kullaniciGirdisi.value , onValueChange ={
            kullaniciGirdisi.value=it

        }, placeholder = {Text("haha")} )


Text(text="Güla")
        Spacer(modifier = Modifier.padding(10. dp))

        Button(onClick = {textDeğeri.value="aaaa"}) {
            Text(text="hahhah")

        }
        Spacer(modifier = Modifier.padding(10. dp))
        Image(bitmap = ImageBitmap.imageResource(id = R.drawable.roma),
            contentDescription = "Roma")
        Spacer(modifier = Modifier.padding(10. dp))

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        MainScreen()
    }
}*/
//State Hoisting
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)){
                       MainScreen()
                    }

                }
            }
        }
    }
}
//1.yöntem
/*@Composable
fun OzelTextField(string:String){
    var benimState=remember{ mutableStateOf(string) }
    TextField(value=benimState.value, onValueChange = {
        benimState.value=it
    })
}*/
//2.Yöntem
@Composable
fun OzelTextField(string:String,onValueChangeFunction:(String)->Unit){

    TextField(value=string, onValueChange = onValueChangeFunction, modifier = Modifier.padding(5. dp))
}
@Composable
fun OzelText(string:String){
    Text(text=string,
        fontWeight = FontWeight.Medium,
        fontSize = 24. sp)
}

@Composable
fun MainScreen(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
var kullaniciAdi=remember{ mutableStateOf("kullanıcı") }
        OzelText("Gülayy")
        OzelText("hheheh")
        OzelTextField(string=kullaniciAdi.value, onValueChangeFunction = {
            kullaniciAdi.value=it

        })
       
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        MainScreen()
    }
}