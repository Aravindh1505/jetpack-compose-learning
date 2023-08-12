package com.aravindh.composelearning

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aravindh.composelearning.custom.CustomSpacer
import com.aravindh.composelearning.ui.theme.ComposeLearningTheme


@Composable
fun ProfileCard() {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        shape = RoundedCornerShape(corner = CornerSize(10.dp)),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            ProfileImage()
            Divider()
            ProfileContent()
            Portfolio()
            SocialMedia()
        }
    }
}

@Composable
fun ProfileImage() {
    CustomSpacer()
    Image(
        painter = painterResource(id = R.drawable.ic_profile),
        contentDescription = "Profile Image",
        modifier = Modifier
            .size(180.dp)
            .clip(CircleShape)
            .border(1.dp, Color.Gray, CircleShape)
            .padding(1.dp),
        contentScale = ContentScale.Crop
    )
    CustomSpacer(height = 15.dp)
}

@Composable
fun ProfileContent() {
    CustomSpacer(height = 15.dp)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Aravindh Samidurai",
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Serif,
            fontSize = 24.sp
        )
        Text(
            text = "Mobile Developer",
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.Serif,
            fontSize = 18.sp
        )
        CustomSpacer(height = 5.dp)
        Text(
            text = "Android - Kotlin | Compose | Flutter | IoT",
            fontWeight = FontWeight.W200,
            fontFamily = FontFamily.Serif,
            fontSize = 14.sp
        )
        CustomSpacer(height = 20.dp)
        Text(
            text = "Software Engineer with over 7+ years of Mobile Application Development experience in a " +
                    "wide variety of industries, such as healthcare, banking, education, and automotive " +
                    "industry",
            modifier = Modifier.padding(10.dp),
            fontWeight = FontWeight.W200,
            fontFamily = FontFamily.Serif,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun SocialMedia() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val fb = if (isSystemInDarkTheme()) R.drawable.ic_facebook_light else R.drawable.ic_facebook_dark
        val li = if (isSystemInDarkTheme()) R.drawable.ic_linkedin_light else R.drawable.ic_linkedin_dark
        val ins = if (isSystemInDarkTheme()) R.drawable.ic_instagram_light else R.drawable.ic_instagram_dark
        val yt = if (isSystemInDarkTheme()) R.drawable.ic_youtube_light else R.drawable.ic_youtube_dark
        val tt = if (isSystemInDarkTheme()) R.drawable.ic_twitter_light else R.drawable.ic_twitter_dark


        Image(painter = painterResource(id = fb), contentDescription = "Facebook")
        Image(painter = painterResource(id = li), contentDescription = "Linkedin")
        Image(painter = painterResource(id = ins), contentDescription = "Instagram")
        Image(painter = painterResource(id = yt), contentDescription = "Youtube")
        Image(painter = painterResource(id = tt), contentDescription = "Twitter")
    }
}

@Composable
fun Portfolio() {
    CustomSpacer(height = 20.dp)
    Button(onClick = { }) {
        Text(text = "Follow")
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileCardPreview() {
    ComposeLearningTheme {
        ProfileCard()
    }
}