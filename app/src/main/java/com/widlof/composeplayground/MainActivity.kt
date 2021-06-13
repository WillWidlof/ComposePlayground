package com.widlof.composeplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.widlof.composeplayground.core.ui.Dimensions
import com.widlof.composeplayground.core.ui.Dimensions.Companion.toDp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Homepage(title = "Hello!")
        }
    }

    @Composable
    fun Homepage(title: String) {
        MaterialTheme {
            Surface {
                Column {
                    TopAppBar(
                        title = { Text(text = title) }, modifier = Modifier
                            .fillMaxWidth()
                    )
                    Greeting(name = "Testing")
                }
            }
        }
    }

    @Composable
    fun Greeting(name: String) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(PaddingValues(top = Dimensions.DEFAULT_MARGIN.toDp()))
        )
    }

    @Preview(showBackground = true, name = "Text preview")
    @Composable
    fun DefaultPreview() {
        MaterialTheme {
            Homepage(title = "Test Hello!")
        }
    }
}