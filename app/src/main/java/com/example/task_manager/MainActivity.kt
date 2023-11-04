package com.example.task_manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.task_manager.ui.theme.Task_managerTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.padding



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Task_managerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskImage(
                        text_1 = stringResource(R.string.task_text_1),
                        text_2 = stringResource(R.string.task_text_2))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Task_managerTheme {
        TaskImage(
            text_1 = "All tasks completed",
            text_2 = "Nice work!"
        )
    }
}

@Composable
fun TaskText(text_1: String,text_2: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = text_1,
            modifier = Modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                ),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = text_2,
            fontSize = 16.sp,
        )
    }
}

@Composable
fun TaskImage(text_1: String,text_2: String){
    val image = painterResource(R.drawable.ic_task_completed)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = image,
            contentDescription = null
        )
        TaskText(
            text_1 = text_1,
            text_2 = text_2,
        )
    }
}

