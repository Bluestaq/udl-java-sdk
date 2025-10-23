// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitassessment

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitassessmentCreateParamsTest {

    @Test
    fun create() {
        OnorbitassessmentCreateParams.builder()
            .assmtTime(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
            .classificationMarking("U")
            .dataMode(OnorbitassessmentCreateParams.DataMode.TEST)
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
            .addTag("TAG1")
            .addTag("TAG2")
            .transactionId("TRANSACTION-ID")
            .build()
    }

    @Test
    fun body() {
        val params =
            OnorbitassessmentCreateParams.builder()
                .assmtTime(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
                .classificationMarking("U")
                .dataMode(OnorbitassessmentCreateParams.DataMode.TEST)
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
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
                .build()

        val body = params._body()

        assertThat(body.assmtTime()).isEqualTo(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitassessmentCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("026dd511-8ba5-47d3-9909-836149f87686")
        assertThat(body.assessment()).contains("NOMINAL")
        assertThat(body.assmtDetails())
            .contains("This spacecraft appears to be in a stable, 3-axis controlled state")
        assertThat(body.assmtLevel()).contains("SIGNATURE")
        assertThat(body.assmtRotPeriod()).contains(72.5)
        assertThat(body.assmtSubType()).contains("STABLE")
        assertThat(body.assmtUrl()).contains("https://unifieddatalibrary.com")
        assertThat(body.autoAssmt()).contains(false)
        assertThat(body.collectionUrl()).contains("https://unifieddatalibrary.com")
        assertThat(body.components().getOrNull()).containsExactly("THRUSTER", "RWA-2")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.idOnOrbit()).contains("25544")
        assertThat(body.idSensor()).contains("211")
        assertThat(body.obDuration()).contains(1.75)
        assertThat(body.obTime()).contains(OffsetDateTime.parse("2025-08-09T23:27:55.862Z"))
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.origObjectId()).contains("ISS")
        assertThat(body.origSensorId()).contains("ORIGSENSOR-ID")
        assertThat(body.satNo()).contains(25544)
        assertThat(body.sigDataType()).contains("PHOTOMETRY")
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.srcIds().getOrNull())
            .containsExactly(
                "49cf9dcf-e97e-43ed-8e21-22e2bb0e3da6",
                "da779fc4-3a37-4caa-a629-289671bc96e8",
            )
        assertThat(body.srcTyps().getOrNull()).containsExactly("EO", "SKYIMAGE")
        assertThat(body.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(body.transactionId()).contains("TRANSACTION-ID")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OnorbitassessmentCreateParams.builder()
                .assmtTime(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
                .classificationMarking("U")
                .dataMode(OnorbitassessmentCreateParams.DataMode.TEST)
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.assmtTime()).isEqualTo(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitassessmentCreateParams.DataMode.TEST)
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
