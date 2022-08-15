package com.coopello.semla

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.coopello.semla.network.api.QiitaApi
import com.coopello.semla.network.body.PostItemBody
import com.coopello.semla.ui.component.SectionCard
import com.coopello.semla.ui.theme.SemlaTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var sectionContent by remember {
                mutableStateOf("")
            }
            SemlaTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = stringResource(R.string.app_name),
                                    fontWeight = FontWeight.W700
                                )
                            },
                            backgroundColor = colorResource(R.color.white),
                            contentColor = colorResource(R.color.blue)
                        )
                    },
                    floatingActionButton = {
                        FloatingActionButton(onClick = {
                            lifecycleScope.launch {
                                QiitaApi.qiitaService.postItem(
                                    PostItemBody(
                                        body = "# ${MockData.sectionList[0].first}\n${sectionContent}\n# ${MockData.sectionList[1].first}\n${sectionContent}\n# ${MockData.sectionList[2].first}\n${sectionContent}\n# ${MockData.sectionList[3].first}\n${sectionContent}\n\n`Posted via Semla Android`"
                                    )
                                )
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Outlined.Check,
                                contentDescription = stringResource(R.string.fab_icon_description)
                            )
                        }
                    }
                ) {
                    LazyColumn(
                        modifier = Modifier
                            .padding(16.dp)
                    ) {
                        items(
                            items = MockData.sectionList,
                            contentType = { it }
                        ) {
                            SectionCard(
                                title = it.first,
                                placeholder = it.second,
                                sectionContent = sectionContent,
                                onValueChanged = { new: String -> sectionContent = new }
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                        }
                    }
                }
            }
        }
    }
}

private object MockData {
    val sectionList = listOf<Pair<String, String>>(
        "一言まとめ" to "記事の内容を一言でまとめましょう！",
        "深掘りした内容" to "調査・勉強をする中で深ぼった内容をまとめましょう！",
        "自分の考え" to "調査・勉強を経て、自分なりの意見や考えをまとめましょう！",
        "参考文献" to "参考文献のリンクや書籍名を列挙しましょう！"
    )
}
