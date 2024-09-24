package com.example.viewmodelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.viewmodelapp.ui.theme.ViewModelAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val viewModel: CountViewModel by viewModels()
            ViewModelAppTheme {
                Surface (modifier = Modifier.fillMaxSize()) {
                    TimesCount(viewModel)
                }
            }
        }
    }
}

@Composable
fun TimesCount(viewModel: CountViewModel){



    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Count Times: ${viewModel.counttimes.value}" )
        Spacer(modifier = Modifier.height(16.dp))



            Button(onClick = { viewModel.increaseTimes() }) {
                Text("++")
            }

            Button(onClick = { viewModel.decreaseTimes() }) {
                Text("--")
            }


    }


}