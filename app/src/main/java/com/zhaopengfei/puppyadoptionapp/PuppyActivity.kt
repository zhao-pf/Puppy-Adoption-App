package com.zhaopengfei.puppyadoptionapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class PuppyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val puppyBean: PuppyBean? = intent.getSerializableExtra("data") as PuppyBean
        setContent {
            Greeting2(puppyBean!!)
        }
    }
}

@Composable
fun Greeting2(it: PuppyBean) {
    Card(
        Modifier
            .padding(8.dp)
            .wrapContentHeight()
            .fillMaxWidth()
            .clickable(onClick = {

            })
    ) {
        Column {
            Image(
                imageResource(it.pic),
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop,
            )
            val height = 32.dp
            Spacer(Modifier.height(height))
            val padding = Modifier.padding(16.dp)
            ScrollableColumn(modifier = padding) {
                Text(
                    "狗狗名称:  \n${it.name}",
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(height))
                Text(
                    "狗狗年龄:  \n${it.age}",
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(height))
                Text(
                    "狗狗来自:  \n${it.from}",
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(height))
                Text(
                    "狗狗品种:  \n${it.varieties}",
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(height))
                Text(
                    "狗狗介绍:  \n${it.introduce}",
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }

}
