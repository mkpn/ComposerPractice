package com.example.composerpractice

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composerpractice.ui.theme.ComposerPracticeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Android")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hallo $name")
}

// 主な制限として、コンポーズ可能な関数にはパラメータを使用できません。
// このため、Greeting() 関数を直接プレビューすることはできません。
// 代わりに、PreviewGreeting() という 2 番目の関数を作成します。
// この関数は、適切なパラメータで Greeting() を呼び出します。
// @Composable の前に @Preview アノテーションを追加します。
@Preview
@Composable
fun PreviewGreeting(){
    Greeting("Android")
}