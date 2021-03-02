package com.example.adopt_a_pup

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun PuppyDetails(
    puppyId: String,
    modifier: Modifier = Modifier
) {
    val puppy = PuppyRepo.puppies.first { it.id == puppyId }
    val scrollState = ScrollState(0)
    Column(
        modifier = modifier
            .verticalScroll(scrollState)
            .fillMaxWidth()
    ) {
        CoilImage(
            data = puppy.imageUrl,
            contentDescription = "Picture of ${puppy.name}",
            modifier = Modifier.height(300.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        PuppyDetailsName(name = puppy.name)
        Spacer(modifier = Modifier.height(16.dp))
        PuppyInfoText(text = getShortDescriptionString(puppy.age, puppy.gender, puppy.breed))
        Spacer(modifier = Modifier.height(16.dp))
    }
}

fun getShortDescriptionString(age: Int, gender: Gender, breed: String): String {
    return "I'm ${if (age <= 1) "a" else "an"} $age year old " +
            "${gender.name.toLowerCase()} " +
            "$breed puppy"
}

@Composable
fun PuppyInfoText(text: String) {
    Text(
        text = buildAnnotatedString {
            withStyle(style = SpanStyle(fontSize = 24.sp)) { append(text) }
        },
        Modifier.padding(start = 16.dp, end = 16.dp),
    )
}

@Composable
fun PuppyDetailsName(name: String) {
    Text(
        text = buildAnnotatedString {
            withStyle(style = SpanStyle(fontSize = 24.sp)) {
                append("Hi, I'm ")
            }
            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 48.sp)) {
                append(name)
            }
        },
        Modifier.padding(start = 16.dp, end = 16.dp),
    )
}

@Preview
@Composable
fun DetailsPreview() {
    Surface {
        PuppyDetails(PuppyRepo.puppies.first().id)
    }
}

