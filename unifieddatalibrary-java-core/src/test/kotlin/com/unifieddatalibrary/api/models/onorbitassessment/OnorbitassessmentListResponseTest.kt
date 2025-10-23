// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitassessment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitassessmentListResponseTest {

    @Test
    fun create() {
        val onorbitassessmentListResponse =
            OnorbitassessmentListResponse.builder()
                .assmtTime(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
                .classificationMarking("U")
                .dataMode(OnorbitassessmentListResponse.DataMode.TEST)
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .assessment("NOMINAL")
                .assmtDetails("This spacecraft appears to be in a stable, 3-axis controlled state")
                .assmtLevel("SIGNATURE")
                .assmtRotPeriod(72.5)
                .assmtSubType("STABLE")
                .assmtUrl("https://unifieddatalibrary.com")
                .autoAssmt(false)
                .collectionUrl("https://unifieddatalibrary.com")
                .addComponent("THRUSTER")
                .addComponent("RWA-2")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .idOnOrbit("25544")
                .idSensor("211")
                .obDuration(1.75)
                .obTime(OffsetDateTime.parse("2025-08-09T23:27:55.862Z"))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("ISS")
                .origSensorId("ORIGSENSOR-ID")
                .satNo(25544)
                .sigDataType("PHOTOMETRY")
                .sourceDl("AXE")
                .addSrcId("49cf9dcf-e97e-43ed-8e21-22e2bb0e3da6")
                .addSrcId("da779fc4-3a37-4caa-a629-289671bc96e8")
                .addSrcTyp("EO")
                .addSrcTyp("SKYIMAGE")
                .transactionId("TRANSACTION-ID")
                .build()

        assertThat(onorbitassessmentListResponse.assmtTime())
            .isEqualTo(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
        assertThat(onorbitassessmentListResponse.classificationMarking()).isEqualTo("U")
        assertThat(onorbitassessmentListResponse.dataMode())
            .isEqualTo(OnorbitassessmentListResponse.DataMode.TEST)
        assertThat(onorbitassessmentListResponse.source()).isEqualTo("Bluestaq")
        assertThat(onorbitassessmentListResponse.id())
            .contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(onorbitassessmentListResponse.assessment()).contains("NOMINAL")
        assertThat(onorbitassessmentListResponse.assmtDetails())
            .contains("This spacecraft appears to be in a stable, 3-axis controlled state")
        assertThat(onorbitassessmentListResponse.assmtLevel()).contains("SIGNATURE")
        assertThat(onorbitassessmentListResponse.assmtRotPeriod()).contains(72.5)
        assertThat(onorbitassessmentListResponse.assmtSubType()).contains("STABLE")
        assertThat(onorbitassessmentListResponse.assmtUrl())
            .contains("https://unifieddatalibrary.com")
        assertThat(onorbitassessmentListResponse.autoAssmt()).contains(false)
        assertThat(onorbitassessmentListResponse.collectionUrl())
            .contains("https://unifieddatalibrary.com")
        assertThat(onorbitassessmentListResponse.components().getOrNull())
            .containsExactly("THRUSTER", "RWA-2")
        assertThat(onorbitassessmentListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitassessmentListResponse.createdBy()).contains("some.user")
        assertThat(onorbitassessmentListResponse.idOnOrbit()).contains("25544")
        assertThat(onorbitassessmentListResponse.idSensor()).contains("211")
        assertThat(onorbitassessmentListResponse.obDuration()).contains(1.75)
        assertThat(onorbitassessmentListResponse.obTime())
            .contains(OffsetDateTime.parse("2025-08-09T23:27:55.862Z"))
        assertThat(onorbitassessmentListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(onorbitassessmentListResponse.origNetwork()).contains("OPS1")
        assertThat(onorbitassessmentListResponse.origObjectId()).contains("ISS")
        assertThat(onorbitassessmentListResponse.origSensorId()).contains("ORIGSENSOR-ID")
        assertThat(onorbitassessmentListResponse.satNo()).contains(25544)
        assertThat(onorbitassessmentListResponse.sigDataType()).contains("PHOTOMETRY")
        assertThat(onorbitassessmentListResponse.sourceDl()).contains("AXE")
        assertThat(onorbitassessmentListResponse.srcIds().getOrNull())
            .containsExactly(
                "49cf9dcf-e97e-43ed-8e21-22e2bb0e3da6",
                "da779fc4-3a37-4caa-a629-289671bc96e8",
            )
        assertThat(onorbitassessmentListResponse.srcTyps().getOrNull())
            .containsExactly("EO", "SKYIMAGE")
        assertThat(onorbitassessmentListResponse.transactionId()).contains("TRANSACTION-ID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitassessmentListResponse =
            OnorbitassessmentListResponse.builder()
                .assmtTime(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
                .classificationMarking("U")
                .dataMode(OnorbitassessmentListResponse.DataMode.TEST)
                .source("Bluestaq")
                .id("026dd511-8ba5-47d3-9909-836149f87686")
                .assessment("NOMINAL")
                .assmtDetails("This spacecraft appears to be in a stable, 3-axis controlled state")
                .assmtLevel("SIGNATURE")
                .assmtRotPeriod(72.5)
                .assmtSubType("STABLE")
                .assmtUrl("https://unifieddatalibrary.com")
                .autoAssmt(false)
                .collectionUrl("https://unifieddatalibrary.com")
                .addComponent("THRUSTER")
                .addComponent("RWA-2")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .idOnOrbit("25544")
                .idSensor("211")
                .obDuration(1.75)
                .obTime(OffsetDateTime.parse("2025-08-09T23:27:55.862Z"))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("ISS")
                .origSensorId("ORIGSENSOR-ID")
                .satNo(25544)
                .sigDataType("PHOTOMETRY")
                .sourceDl("AXE")
                .addSrcId("49cf9dcf-e97e-43ed-8e21-22e2bb0e3da6")
                .addSrcId("da779fc4-3a37-4caa-a629-289671bc96e8")
                .addSrcTyp("EO")
                .addSrcTyp("SKYIMAGE")
                .transactionId("TRANSACTION-ID")
                .build()

        val roundtrippedOnorbitassessmentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitassessmentListResponse),
                jacksonTypeRef<OnorbitassessmentListResponse>(),
            )

        assertThat(roundtrippedOnorbitassessmentListResponse)
            .isEqualTo(onorbitassessmentListResponse)
    }
}
