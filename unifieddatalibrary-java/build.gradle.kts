plugins {
    id("unifieddatalibrary.kotlin")
    id("unifieddatalibrary.publish")
}

dependencies {
    api(project(":unifieddatalibrary-java-client-okhttp"))
}
