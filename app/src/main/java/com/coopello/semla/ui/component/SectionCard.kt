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
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import com.coopello.semla.R
import com.coopello.semla.ui.theme.SemlaTextFieldColors

@Composable
fun SectionCard(
    title: String,
    placeholder: String,
    sectionContent: String,
    onValueChanged: (String) -> Unit
) {
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
                onValueChange = { onValueChanged(it) },
                modifier = Modifier.fillMaxWidth(),
                textStyle = MaterialTheme.typography.body1,
                placeholder = { Text(text = placeholder) },
                colors = SemlaTextFieldColors()
            )
        }
    }
}
