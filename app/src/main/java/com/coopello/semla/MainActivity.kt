package com.coopello.semla

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.ui.res.stringResource
import com.coopello.semla.ui.theme.SemlaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SemlaTheme {
                Scaffold(
                    floatingActionButton = {
                        FloatingActionButton(onClick = { /* TODO: Qiita に投稿する処理を実装 */ }) {
                            Icon(
                                imageVector = Icons.Outlined.Check,
                                contentDescription = stringResource(R.string.fab_icon_description)
                            )
                        }
                    }
                ) {
                }
            }
        }
    }
}
