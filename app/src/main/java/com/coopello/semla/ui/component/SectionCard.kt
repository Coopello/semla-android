package com.coopello.semla.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.coopello.semla.R
import com.coopello.semla.ui.theme.SemlaTextFieldColors

@Composable
fun SectionCard(
    title: String,
    placeholder: String
) {
    var sectionContent by remember {
        mutableStateOf("")
    }
    Card(
        shape = RoundedCornerShape(dimensionResource(R.dimen.section_card_corner_radius))
    ) {
        Column(
            modifier = Modifier
                .padding(dimensionResource(R.dimen.section_card_padding))
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.h5.copy(
                    fontWeight = FontWeight.W700
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.section_card_spacer)))
            TextField(
                value = sectionContent,
                onValueChange = { sectionContent = it },
                modifier = Modifier.fillMaxWidth(),
                textStyle = MaterialTheme.typography.body1,
                placeholder = { Text(text = placeholder) },
                colors = SemlaTextFieldColors()
            )
        }
    }
}

@Preview
@Composable
private fun SectionCardPreview() {
    SectionCard(sectionTitle = "あああ")
}
