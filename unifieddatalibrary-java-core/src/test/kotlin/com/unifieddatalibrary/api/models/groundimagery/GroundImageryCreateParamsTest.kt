// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.groundimagery

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroundImageryCreateParamsTest {

    @Test
    fun create() {
        GroundImageryCreateParams.builder()
            .classificationMarking("U")
            .dataMode(GroundImageryCreateParams.DataMode.TEST)
            .filename("Example file name")
            .imageTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
            .source("Bluestaq")
            .id("GROUNDIMAGERY-ID")
            .checksumValue("120EA8A25E5D487BF68B5F7096440019")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .filesize(0L)
            .format("PNG")
            .idSensor("SENSOR-ID")
            .addKeyword("KEYWORD1")
            .addKeyword("KEYWORD2")
            .name("Example name")
            .notes("Example notes")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("OPS1")
            .origSensorId("ORIGSENSOR-ID")
            .region(
                "POLYGON((26.156175339112 67.3291113966927,26.0910220642717 67.2580009640721,26.6637992964562 67.1795862381682,26.730115808233 67.2501237475598,26.156175339112 67.3291113966927))"
            )
            .regionGeoJson(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
            .regionNDims(2)
            .regionSRid(4326)
            .regionText(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
            .regionType("Polygon")
            .sourceDl("AXE")
            .subjectId("SUBJECT-ID")
            .addTag("PROVIDER_TAG1")
            .addTag("PROVIDER_TAG2")
            .transactionId("37bdef1f-5a4f-4776-bee4-7a1e0ec7d35a")
            .build()
    }

    @Test
    fun body() {
        val params =
            GroundImageryCreateParams.builder()
                .classificationMarking("U")
                .dataMode(GroundImageryCreateParams.DataMode.TEST)
                .filename("Example file name")
                .imageTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .source("Bluestaq")
                .id("GROUNDIMAGERY-ID")
                .checksumValue("120EA8A25E5D487BF68B5F7096440019")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .filesize(0L)
                .format("PNG")
                .idSensor("SENSOR-ID")
                .addKeyword("KEYWORD1")
                .addKeyword("KEYWORD2")
                .name("Example name")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origSensorId("ORIGSENSOR-ID")
                .region(
                    "POLYGON((26.156175339112 67.3291113966927,26.0910220642717 67.2580009640721,26.6637992964562 67.1795862381682,26.730115808233 67.2501237475598,26.156175339112 67.3291113966927))"
                )
                .regionGeoJson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .regionNDims(2)
                .regionSRid(4326)
                .regionText(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .regionType("Polygon")
                .sourceDl("AXE")
                .subjectId("SUBJECT-ID")
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .transactionId("37bdef1f-5a4f-4776-bee4-7a1e0ec7d35a")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(GroundImageryCreateParams.DataMode.TEST)
        assertThat(body.filename()).isEqualTo("Example file name")
        assertThat(body.imageTime()).isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("GROUNDIMAGERY-ID")
        assertThat(body.checksumValue()).contains("120EA8A25E5D487BF68B5F7096440019")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.filesize()).contains(0L)
        assertThat(body.format()).contains("PNG")
        assertThat(body.idSensor()).contains("SENSOR-ID")
        assertThat(body.keywords().getOrNull()).containsExactly("KEYWORD1", "KEYWORD2")
        assertThat(body.name()).contains("Example name")
        assertThat(body.notes()).contains("Example notes")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.origSensorId()).contains("ORIGSENSOR-ID")
        assertThat(body.region())
            .contains(
                "POLYGON((26.156175339112 67.3291113966927,26.0910220642717 67.2580009640721,26.6637992964562 67.1795862381682,26.730115808233 67.2501237475598,26.156175339112 67.3291113966927))"
            )
        assertThat(body.regionGeoJson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(body.regionNDims()).contains(2)
        assertThat(body.regionSRid()).contains(4326)
        assertThat(body.regionText())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(body.regionType()).contains("Polygon")
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.subjectId()).contains("SUBJECT-ID")
        assertThat(body.tags().getOrNull()).containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
        assertThat(body.transactionId()).contains("37bdef1f-5a4f-4776-bee4-7a1e0ec7d35a")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GroundImageryCreateParams.builder()
                .classificationMarking("U")
                .dataMode(GroundImageryCreateParams.DataMode.TEST)
                .filename("Example file name")
                .imageTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(GroundImageryCreateParams.DataMode.TEST)
        assertThat(body.filename()).isEqualTo("Example file name")
        assertThat(body.imageTime()).isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
