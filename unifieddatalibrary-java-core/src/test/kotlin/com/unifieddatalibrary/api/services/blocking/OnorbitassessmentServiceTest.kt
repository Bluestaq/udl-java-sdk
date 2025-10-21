// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentCountParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentCreateBulkParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentCreateParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentGetParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentListParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentTupleParams
import com.unifieddatalibrary.api.models.onorbitassessment.OnorbitassessmentUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnorbitassessmentServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitassessmentService = client.onorbitassessment()

        onorbitassessmentService.create(
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
        )
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitassessmentService = client.onorbitassessment()

        val page =
            onorbitassessmentService.list(
                OnorbitassessmentListParams.builder()
                    .assmtTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitassessmentService = client.onorbitassessment()

        onorbitassessmentService.count(
            OnorbitassessmentCountParams.builder()
                .assmtTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitassessmentService = client.onorbitassessment()

        onorbitassessmentService.createBulk(
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
        )
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitassessmentService = client.onorbitassessment()

        val onorbitassessment =
            onorbitassessmentService.get(
                OnorbitassessmentGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        onorbitassessment.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitassessmentService = client.onorbitassessment()

        val response = onorbitassessmentService.queryhelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitassessmentService = client.onorbitassessment()

        val response =
            onorbitassessmentService.tuple(
                OnorbitassessmentTupleParams.builder()
                    .assmtTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitassessmentService = client.onorbitassessment()

        onorbitassessmentService.unvalidatedPublish(
            OnorbitassessmentUnvalidatedPublishParams.builder()
                .addBody(
                    OnorbitassessmentUnvalidatedPublishParams.Body.builder()
                        .assmtTime(OffsetDateTime.parse("2025-08-10T02:44:02.000Z"))
                        .classificationMarking("U")
                        .dataMode(OnorbitassessmentUnvalidatedPublishParams.Body.DataMode.TEST)
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
        )
    }
}
