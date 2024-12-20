package com.paulobusato.androiddocs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.input.key.KeyEventType
import androidx.compose.ui.input.key.key
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.input.key.onPreviewKeyEvent
import androidx.compose.ui.input.key.type
import androidx.compose.ui.tooling.preview.Preview
import com.paulobusato.androiddocs.ui.theme.AndroidDocsTheme

// https://developer.android.com/quick-guides/content/pause-and-resume-media-playback-with-spacebar?hl=en

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidDocsTheme {
                Column(
                    modifier = Modifier.onKeyEvent { event ->
                        if (event.type = KeyEventType.KeyUp && event.key == Key.Spacebar) {

                        }
                    }
                ) {  }
            }
        }
    }
}