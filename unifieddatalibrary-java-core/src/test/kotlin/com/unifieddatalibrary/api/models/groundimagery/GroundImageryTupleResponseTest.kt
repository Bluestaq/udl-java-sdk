// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.groundimagery

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroundImageryTupleResponseTest {

    @Test
    fun create() {
        val groundImageryTupleResponse =
            GroundImageryTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(GroundImageryTupleResponse.DataMode.TEST)
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
                .origNetwork("ORIG")
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
                .updatedAt(OffsetDateTime.parse("2018-01-02T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(groundImageryTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(groundImageryTupleResponse.dataMode())
            .isEqualTo(GroundImageryTupleResponse.DataMode.TEST)
        assertThat(groundImageryTupleResponse.filename()).isEqualTo("Example file name")
        assertThat(groundImageryTupleResponse.imageTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(groundImageryTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(groundImageryTupleResponse.id()).contains("GROUNDIMAGERY-ID")
        assertThat(groundImageryTupleResponse.checksumValue())
            .contains("120EA8A25E5D487BF68B5F7096440019")
        assertThat(groundImageryTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(groundImageryTupleResponse.createdBy()).contains("some.user")
        assertThat(groundImageryTupleResponse.filesize()).contains(0L)
        assertThat(groundImageryTupleResponse.format()).contains("PNG")
        assertThat(groundImageryTupleResponse.idSensor()).contains("SENSOR-ID")
        assertThat(groundImageryTupleResponse.keywords().getOrNull())
            .containsExactly("KEYWORD1", "KEYWORD2")
        assertThat(groundImageryTupleResponse.name()).contains("Example name")
        assertThat(groundImageryTupleResponse.notes()).contains("Example notes")
        assertThat(groundImageryTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(groundImageryTupleResponse.origNetwork()).contains("ORIG")
        assertThat(groundImageryTupleResponse.origSensorId()).contains("ORIGSENSOR-ID")
        assertThat(groundImageryTupleResponse.region())
            .contains(
                "POLYGON((26.156175339112 67.3291113966927,26.0910220642717 67.2580009640721,26.6637992964562 67.1795862381682,26.730115808233 67.2501237475598,26.156175339112 67.3291113966927))"
            )
        assertThat(groundImageryTupleResponse.regionGeoJson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(groundImageryTupleResponse.regionNDims()).contains(2)
        assertThat(groundImageryTupleResponse.regionSRid()).contains(4326)
        assertThat(groundImageryTupleResponse.regionText())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(groundImageryTupleResponse.regionType()).contains("Polygon")
        assertThat(groundImageryTupleResponse.sourceDl()).contains("AXE")
        assertThat(groundImageryTupleResponse.subjectId()).contains("SUBJECT-ID")
        assertThat(groundImageryTupleResponse.tags().getOrNull())
            .containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
        assertThat(groundImageryTupleResponse.transactionId())
            .contains("37bdef1f-5a4f-4776-bee4-7a1e0ec7d35a")
        assertThat(groundImageryTupleResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-02T16:00:00.123Z"))
        assertThat(groundImageryTupleResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groundImageryTupleResponse =
            GroundImageryTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(GroundImageryTupleResponse.DataMode.TEST)
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
                .origNetwork("ORIG")
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
                .updatedAt(OffsetDateTime.parse("2018-01-02T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedGroundImageryTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groundImageryTupleResponse),
                jacksonTypeRef<GroundImageryTupleResponse>(),
            )

        assertThat(roundtrippedGroundImageryTupleResponse).isEqualTo(groundImageryTupleResponse)
    }
}
