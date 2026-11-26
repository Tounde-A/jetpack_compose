package com.example.developer_profile

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
    skillTitle: String,
    skills: String,
    info: String,
    onContactClick: () -> Unit,
    buttonText: String,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            ProfileHeader(
                name = name,
                title = title
            )
            ProfileContent(
                skillTitle = skillTitle,
                skills = skills,
                info = info,
                onContactClick = onContactClick,
                buttonText = buttonText
            )
        }
    }
}

@Composable
fun ProfileHeader(
    name: String,
    title: String,
    modifier: Modifier = Modifier
) {
    ProfileName(
        name = name,
        modifier = modifier
    )
    ProfileTitle(
        title = title,
        modifier = modifier
    )
}

@Composable
fun ProfileName(
    name: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = name,
        modifier = modifier
    )
}

@Composable
fun ProfileTitle(
    title: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = title,
        modifier = modifier
    )
}

@Composable
fun ProfileContent(
    skillTitle: String,
    skills: String,
    info: String,
    onContactClick: () -> Unit,
    buttonText: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(top = 30.dp)
    ) {
        ProfileSkillTitle(
            skillTitle = skillTitle,
            modifier = Modifier.padding(bottom = 0.dp)
        )

        ProfileSkills(
            skills = skills,
            modifier = Modifier.padding(0.dp)
        )

        ProfileSecondaryInformation(
            info = info,
            modifier = Modifier.padding(top = 30.dp)
        )

        Box(
            modifier = modifier.padding(top = 30.dp)
        ) {
            ProfileButtonContact(
                onContactClick = {
                    //
                },
                buttonText = buttonText,
                modifier = Modifier
                    .clickable(
                        role = Role.Button,
                        onClick = onContactClick
                    )
                    .semantics {
                        contentDescription = "Contactez moi depuis une autre plateforme."
                    }
            )
        }
    }
}

@Composable
fun ProfileSkillTitle(
    skillTitle: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = skillTitle,
        modifier = modifier
    )
}

@Composable
fun ProfileSkills(
    skills: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = skills,
        modifier = modifier
    )
}

@Composable
fun ProfileButtonContact(
    onContactClick: () -> Unit,
    buttonText: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onContactClick
    ) {
        Text(
            text = buttonText,
            modifier = modifier
        )
    }
}

@Composable
fun ProfileSecondaryInformation(
    info: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = info,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun DeveloperFullstackPreview() {
    Developer_profileTheme {
        ProfileCard(
            name = "Stan Lebaron",
            title = "Developpeur Full Stack",
            skillTitle = "Compétences :",
            skills = "PHP\n" +
                    "Laravel\n" +
                    "Python\n" +
                    "Django\n" +
                    "Java\n" +
                    "Spring Boot\n" +
                    "API REST\n" +
                    "SQL\n" +
                    "MySQL / PostgreSQL\n" +
                    "Architecture MVC\n" +
                    "Authentification et autorisation\n" +
                    "Git / GitLab\n" +
                    "Docker\n" +
                    "CI/CD",
            info = "Je travail pour la société X.",
            onContactClick = {},
            buttonText = "Me contacter",
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DeveloperFrontPreview() {
    Developer_profileTheme {
        ProfileCard(
            name = "Jesse Faden",
            title = "Developpeuse Frontend",
            skillTitle = "Compétences :",
            skills = "HTML5\n" +
                    "CSS3\n" +
                    "JavaScript\n" +
                    "TypeScript\n" +
                    "React.js\n" +
                    "Next.js\n" +
                    "Responsive Design\n" +
                    "Tests Front-End\n" +
                    "UI/UX Design",
            info = "Je créer des interfaces visuelles pour des jeux vidéo.",
            onContactClick = {},
            buttonText = "Voir mon portfolio",
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )
    }
}