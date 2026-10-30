package com.example.developer_profile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.developer_profile.ui.theme.Developer_profileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Developer_profileTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Developer_profileTheme {
        Greeting("Android")
    }
}

@Composable
fun ProfileCard(
    name: String,
    title: String,
    skills: String,
    info: String,
    buttonText: String,
    onContactClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface() { }

    Surface(
        modifier = modifier
            .clickable(
                role = Role.Button,
                onClick = onContactClick
            )
            .semantics{
                contentDescription = "Ouvrir le formulaire de contact."
            }
    ) {
        ProfileButtonContact(
            buttonText = buttonText,
            onContactClick = {
                //
            }
        )
    }
}

@Composable
fun ProfileHeader(
    name: String,
    title: String,
    modifier: Modifier = Modifier
) {
    ProfileName(
        name = name
    )
    ProfileTitle(
        title = title
    )
}

@Composable
fun ProfileName(
    name: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = name
    )
}

@Composable
fun ProfileTitle(
    title: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = title
    )
}

@Composable
fun ProfileContent(
    name: String,
    title: String,
    skills: String,
    info: String,
    buttonText: String,
    onContactClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(24.dp)
    ) {
        ProfileHeader(
            name = name,
            title = title,
            modifier = Modifier.padding()
        )

        ProfileSkills(
            skills = skills,
            modifier = Modifier.padding()
        )

        ProfileSecondaryInformation(
            info = info,
            modifier = Modifier.padding()
        )

        ProfileButtonContact(
            buttonText = buttonText,
            onContactClick = onContactClick
        )

    }
}



@Composable
fun ProfileSkills(
    skills: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = skills
    )
}

@Composable
fun ProfileButtonContact(
    buttonText: String,
    onContactClick: () -> Unit,
    modifier: Modifier = Modifier
) {

}

@Composable
fun ProfileSecondaryInformation(
    info: String,
    modifier: Modifier = Modifier
) {
    //
}

@Preview(showBackground = true)
@Composable
fun DeveloperFullstackPreview() {
    Developer_profileTheme {
        //
    }
}

@Preview(showBackground = true)
@Composable
fun DeveloperFrontPreview() {
    Developer_profileTheme {
        //
    }
}