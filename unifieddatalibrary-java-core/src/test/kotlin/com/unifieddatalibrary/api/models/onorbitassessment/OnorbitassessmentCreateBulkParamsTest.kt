// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitassessment

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitassessmentCreateBulkParamsTest {

    @Test
    fun create() {
        OnorbitassessmentCreateBulkParams.builder()
            .addBody(
                OnorbitassessmentCreateBulkParams.Body.builder()
                    .assmtTime(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
                    .classificationMarking("U")
                    .dataMode(OnorbitassessmentCreateBulkParams.Body.DataMode.TEST)
                    .source("Bluestaq")
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .assessment("NOMINAL")
                    .assmtDetails(
                        "This spacecraft appears to be in a stable, 3-axis controlled state"
                    )
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            OnorbitassessmentCreateBulkParams.builder()
                .addBody(
                    OnorbitassessmentCreateBulkParams.Body.builder()
                        .assmtTime(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
                        .classificationMarking("U")
                        .dataMode(OnorbitassessmentCreateBulkParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .id("026dd511-8ba5-47d3-9909-836149f87686")
                        .assessment("NOMINAL")
                        .assmtDetails(
                            "This spacecraft appears to be in a stable, 3-axis controlled state"
                        )
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                OnorbitassessmentCreateBulkParams.Body.builder()
                    .assmtTime(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
                    .classificationMarking("U")
                    .dataMode(OnorbitassessmentCreateBulkParams.Body.DataMode.TEST)
                    .source("Bluestaq")
                    .id("026dd511-8ba5-47d3-9909-836149f87686")
                    .assessment("NOMINAL")
                    .assmtDetails(
                        "This spacecraft appears to be in a stable, 3-axis controlled state"
                    )
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OnorbitassessmentCreateBulkParams.builder()
                .addBody(
                    OnorbitassessmentCreateBulkParams.Body.builder()
                        .assmtTime(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
                        .classificationMarking("U")
                        .dataMode(OnorbitassessmentCreateBulkParams.Body.DataMode.TEST)
                        .source("Bluestaq")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                OnorbitassessmentCreateBulkParams.Body.builder()
                    .assmtTime(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
                    .classificationMarking("U")
                    .dataMode(OnorbitassessmentCreateBulkParams.Body.DataMode.TEST)
                    .source("Bluestaq")
                    .build()
            )
    }
}
