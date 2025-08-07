plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

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

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
