package com.example.composerpractice

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hallo $name")
//}

// 主な制限として、コンポーズ可能な関数にはパラメータを使用できません。
// このため、Greeting() 関数を直接プレビューすることはできません。
// 代わりに、PreviewGreeting() という 2 番目の関数を作成します。
// この関数は、適切なパラメータで Greeting() を呼び出します。
// @Composable の前に @Preview アノテーションを追加します。
//@Preview
//@Composable
//fun PreviewGreeting() {
//    Greeting("Android")
//}

@Composable
fun NewsStory() {
    val image = painterResource(R.drawable.header)

    Column(modifier = Modifier.padding(16.dp))
    {
        val imageModifier = Modifier
            .height(180.dp)
            .fillMaxWidth()

        Image(image,
            null,
            modifier = imageModifier,
            contentScale = ContentScale.Crop)

        Spacer(Modifier.height(16.dp))

        Text("A day in Shark Fin Cove")
        Text("Davenport, California")
        Text("December 2018")
    }
}

@Preview
@Composable
fun DefaultPreview() {
    NewsStory()
}