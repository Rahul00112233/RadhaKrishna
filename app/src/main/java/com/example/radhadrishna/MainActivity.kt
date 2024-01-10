package com.example.radhadrishna

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.radhadrishna.model.DataClass
import com.example.radhadrishna.ui.theme.RadhadrishnaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RadhadrishnaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize().padding(horizontal = 8.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scrollable(
                        topic = listOf(
                            DataClass(
                                image = painterResource(id = R.drawable.kanha),
                                text = "Hare Krishna",
                                icon = Icons.Default.List,
                                views = "108"
                            ),

                            DataClass(
                                image = painterResource(id = R.drawable.kanha),
                                text = "Hare Krishna",
                                icon = Icons.Default.List,
                                views = "108"
                            ),
                            DataClass(
                                image = painterResource(id = R.drawable.kanha),
                                text = "Hare Krishna",
                                icon = Icons.Default.List,
                                views = "108"
                            ),
                            DataClass(
                                image = painterResource(id = R.drawable.kanha),
                                text = "Hare Krishna",
                                icon = Icons.Default.List,
                                views = "108"
                            ),
                            DataClass(
                                image = painterResource(id = R.drawable.kanha),
                                text = "Hare Krishna",
                                icon = Icons.Default.List,
                                views = "108"
                            ),
                            DataClass(
                                image = painterResource(id = R.drawable.kanha),
                                text = "Hare Krishna",
                                icon = Icons.Default.List,
                                views = "108"
                            ),
                            DataClass(
                                image = painterResource(id = R.drawable.kanha),
                                text = "Hare Krishna",
                                icon = Icons.Default.List,
                                views = "108"
                            ),
                            DataClass(
                                image = painterResource(id = R.drawable.kanha),
                                text = "Hare Krishna",
                                icon = Icons.Default.List,
                                views = "108"
                            ),
                            DataClass(
                                image = painterResource(id = R.drawable.kanha),
                                text = "Hare Krishna",
                                icon = Icons.Default.List,
                                views = "108"
                            ),
                            DataClass(
                                image = painterResource(id = R.drawable.kanha),
                                text = "Hare Krishna",
                                icon = Icons.Default.List,
                                views = "108"
                            ),
                            DataClass(
                                image = painterResource(id = R.drawable.kanha),
                                text = "Hare Krishna",
                                icon = Icons.Default.List,
                                views = "108"
                            )
                        ),
                        modifier = Modifier.padding(horizontal = 16.dp)
                    )
                }
            }
        }
    }
}

