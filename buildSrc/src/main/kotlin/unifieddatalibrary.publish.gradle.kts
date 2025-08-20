import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("Unified Data Library Services API")
        description.set("Unified Data Library Services OpenAPI v3 documentation.")
        url.set("https://unifieddatalibrary.com/storefront/#/api-docs")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Unifieddatalibrary")
                email.set("unifieddatalibrary@bluestaq.com")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/Bluestaq/udl-java-sdk.git")
            developerConnection.set("scm:git:git://github.com/Bluestaq/udl-java-sdk.git")
            url.set("https://github.com/Bluestaq/udl-java-sdk")
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
