package com.example.radhadrishna

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.radhadrishna.model.DataClass
import com.example.radhadrishna.ui.theme.RadhadrishnaTheme

@Composable
fun Scrollable(
    topic:List<DataClass>,
    modifier: Modifier
){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
    ){
        items(topic.size){
            Topic(
                image = topic[it].image,
                text = topic[it].text,
                icon = topic[it].icon,
                number = topic[it].views
            )
        }
    }
}





@Composable
fun Topic(
    image: Painter,
    text: String,
    icon: ImageVector,
    number: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.padding(all = 4.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(width = 64.dp, height = 64.dp)
                    .aspectRatio(1f),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = text,
                    modifier = Modifier.padding(top = 12.dp, end = 12.dp, bottom = 4.dp),
                    fontWeight = FontWeight.Bold
                )
                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    Icon(imageVector = icon, contentDescription = null)
                    Text(
                        text = number,
                        modifier = Modifier
                            .padding(start = 8.dp),
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

