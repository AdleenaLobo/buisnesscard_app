package com.example.buisnesscard_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.buisnesscard_app.ui.theme.Buisnesscard_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Buisnesscard_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CompInfo(stringResource(R.string.contact_no), stringResource(R.string.sharing) , stringResource(R.string.email_id))
                }
            }
        }
    }
}
@Composable
fun AboutInfo(info: String, myicon: ImageVector, description: String, modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
    ){

        Icon(
            myicon,
            contentDescription = description,
            modifier = Modifier

        )

        Text(
            text = info,
            modifier = modifier
        )
    }
}
@Composable
fun CompInfo(contact: String , share: String , email: String ) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        AboutInfo(contact, Icons.Rounded.Call, "call icon")
        AboutInfo(share, Icons.Rounded.Share, "share icon")
        AboutInfo(email, Icons.Rounded.Email, "email icon")
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Buisnesscard_appTheme {
        CompInfo(stringResource(R.string.contact_no), stringResource(R.string.sharing) , stringResource(R.string.email_id))
    }
}