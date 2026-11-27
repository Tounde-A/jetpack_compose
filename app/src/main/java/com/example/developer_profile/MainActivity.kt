package com.example.developer_profile

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.res.painterResource
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

data class ProfilUi(
    val id: Int,
    val name: String,
    val title: String,
    val skills: List<String>,
    val description: String
)

data class ProjectUi(
    val id: Int,
    val title: String,
    val subject: String,
    val client: String,
    val category: String
)

fun DeveloperFullStackProfil(): ProfilUi {
    return ProfilUi(
        id = 1,
        name = "Stan Lebaron",
        title = "Developpeur Full Stack",
        skills = listOf("PHP", "Laravel", "Python", "Django", "Java", "Spring Boot", "API REST", "SQL", "MySQL / PostgreSQL", "Architecture MVC", "Authentification et autorisation"),
        description = "Je travail pour la société X."
    )
}

fun DeveloperFontProfil(): ProfilUi {
    return ProfilUi(
        id = 2,
        name = "Jesse Faden",
        title = "Developpeuse Front end",
        skills = listOf("HTML5", "CSS3", "JavaScript", "TypeScript", "React.js", "Next.js", "Responsive Design", "SQL", "Tests Front-End", "UI/UX Design"),
        description = "Je créer des interfaces visuelles pour des jeux vidéo."
    )
}

fun sampleProject(): ProjectUi {
    return ProjectUi(
        id = 1,
        title = "Refonte du site web",
        subject = "Modernisation de l'interface et amélioration de l'expérience utilisateur",
        client = "TechNova",
        category = "Développement web"
    )
}

fun sampleProjects(): List<ProjectUi> {
    return listOf(
        sampleProject(),
        ProjectUi(
            id = 2,
            title = "Application mobile de fitness",
            subject = "Suivi des entraînements et des performances sportives",
            client = "FitLife",
            category = "Application mobile"
        ),
        ProjectUi(
            id = 3,
            title = "Gestion des stocks",
            subject = "Création d'un outil de gestion et de suivi des stocks",
            client = "LogiPlus",
            category = "Logiciel métier"
        ),
        ProjectUi(
            id = 4,
            title = "Plateforme e-commerce",
            subject = "Développement d'une boutique en ligne avec paiement sécurisé",
            client = "UrbanShop",
            category = "E-commerce"
        ),
        ProjectUi(
            id = 5,
            title = "Application de réservation",
            subject = "Gestion des réservations et des disponibilités en temps réel",
            client = "Hotelia",
            category = "Application web"
        ),
        ProjectUi(
            id = 6,
            title = "Tableau de bord analytique",
            subject = "Visualisation des indicateurs de performance et statistiques",
            client = "DataVision",
            category = "Data / BI"
        ),
        ProjectUi(
            id = 7,
            title = "Système de gestion RH",
            subject = "Centralisation des informations et gestion des congés",
            client = "PeopleFirst",
            category = "Logiciel métier"
        ),
        ProjectUi(
            id = 8,
            title = "Application de livraison",
            subject = "Suivi des commandes et géolocalisation des livreurs",
            client = "ExpressGo",
            category = "Application mobile"
        ),
        ProjectUi(
            id = 9,
            title = "API de gestion des utilisateurs",
            subject = "Développement d'une API REST avec authentification sécurisée",
            client = "CloudSystems",
            category = "Backend / API"
        ),
        ProjectUi(
            id = 10,
            title = "Plateforme de formation",
            subject = "Gestion des cours, des apprenants et des évaluations",
            client = "LearnUp",
            category = "Application web"
        )
    )
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
    profil: ProfilUi,
    onContactClick: () -> Unit,
    buttonText: String,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.background),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                ProfilImage(
                    profilTitle = profil.title,
                    modifier = modifier.fillMaxWidth().padding(bottom = 16.dp).padding(top = 16.dp)
                )
                ProfileHeader(
                    name = profil.name,
                    title = profil.title
                )
                ProfileContent(
                    skills = profil.skills,
                    description = profil.description,
                    modifier = modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "Quelques réalisations :",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.secondary
                )
                // Barre de recherche

                Box(
                    modifier = Modifier
                        .padding(top = 10.dp)
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
    }
}

@Composable
fun ProfilImage(profilTitle: String, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = android.R.drawable.ic_menu_gallery),
        contentDescription = "Image du produit $profilTitle",
        modifier = modifier
    )
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
        style = MaterialTheme.typography.headlineMedium,
        color = MaterialTheme.colorScheme.primary,
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
        style = MaterialTheme.typography.titleSmall,
        color = MaterialTheme.colorScheme.secondary,
        modifier = modifier
    )
}

@Composable
fun ProfileContent(
    skills: List<String>,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(top = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Mes compétences :",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.tertiary,
            modifier = Modifier.padding(bottom = 10.dp)

        )

        ProfileSkills(
            skills = skills,
            modifier = Modifier.padding(0.dp)
        )

        ProfileSecondaryInformation(
            description = description,
            modifier = Modifier
                .padding(top = 30.dp)
                .padding(horizontal = 20.dp)
        )
    }
}

@Composable
fun ProfileSkills(
    skills: List<String>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        skills.forEach { skill ->
            Text(
                text = skill,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.tertiary,
            )
        }
    }
}

@Composable
fun ProfileButtonContact(
    onContactClick: () -> Unit,
    buttonText: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onContactClick,
        modifier = modifier
    ) {
        Text(
            text = buttonText,
            modifier = modifier
        )
    }
}

@Composable
fun ProfileSecondaryInformation(
    description: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = description,
        style = MaterialTheme.typography.bodySmall,
        color = MaterialTheme.colorScheme.primary,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun DeveloperFullstackPreview() {
    Developer_profileTheme {
        ProfileCard(
            profil = DeveloperFullStackProfil(),
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
            profil = DeveloperFontProfil(),
            onContactClick = {},
            buttonText = "Voir mon portfolio",
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )
    }
}

@Preview(
    showBackground = true,
    name = "Profil - Dark Theme"
)
@Composable
fun ProfilScreenDarkPreview() {
    Developer_profileTheme(darkTheme = true) {
        ProfileCard(
            profil = DeveloperFullStackProfil(),
            onContactClick = {},
            buttonText = "Me contacter",
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )
    }
}

@Preview(
    showBackground = true,
    name = "Profil - Light Theme"
)
@Composable
fun ProfilScreenLightPreview() {
    Developer_profileTheme(darkTheme = false) {
        ProfileCard(
            profil = DeveloperFontProfil(),
            onContactClick = {},
            buttonText = "Voir mon portfolio",
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )
    }
}