// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.sgi.SgiCountParams
import com.unifieddatalibrary.api.models.sgi.SgiCreateBulkParams
import com.unifieddatalibrary.api.models.sgi.SgiCreateParams
import com.unifieddatalibrary.api.models.sgi.SgiGetDataByEffectiveAsOfDateParams
import com.unifieddatalibrary.api.models.sgi.SgiGetParams
import com.unifieddatalibrary.api.models.sgi.SgiTupleParams
import com.unifieddatalibrary.api.models.sgi.SgiUnvalidatedPublishParams
import com.unifieddatalibrary.api.models.sgi.SgiUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SgiServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sgiService = client.sgi()

        sgiService.create(
            SgiCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SgiCreateParams.DataMode.TEST)
                .effectiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .sgiDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .source("Bluestaq")
                .id("SGI-ID")
                .analyzerAttenuation(5.1)
                .ap(1.23)
                .apDuration(3)
                .coeffDegree(listOf(1, 2, 3))
                .coeffOrder(listOf(1, 2, 3))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .ctce(listOf(1.23, 342.3, 1.32))
                .ctci(listOf(1.23, 342.3, 1.32))
                .dst(1.23)
                .dtc(1.23)
                .e10(1.23)
                .e54(1.23)
                .f10(1.23)
                .f10High(187.5)
                .f10Low(185.5)
                .f54(1.23)
                .f81(1.23)
                .frequencies(listOf(25.0, 25.125, 25.25, 25.375, 25.5, 25.625, 25.75, 25.875))
                .gamma(25)
                .idSensor("57c96c97-e076-48af-a068-73ee2cb37e65")
                .kIndex(1)
                .kp(4.66)
                .kpDuration(3)
                .m10(1.23)
                .m54(1.23)
                .mode(1)
                .normFactor(2.12679e-7)
                .observedBaseline(listOf(15, 32, 25, 134, 0, 6, 19, 8))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .origSensorId("ORIGSENSOR-ID")
                .powers(listOf(67.1, 65.2, 68.1, 74.3, 68.1, 96.4, 97.3, 68.1))
                .precedence(SgiCreateParams.Precedence.R)
                .rawFileUri("rawFileURI")
                .rbDuration(24)
                .rbIndex(1.02947164506)
                .rbRegionCode(2)
                .s10(1.23)
                .s54(1.23)
                .state(SgiCreateParams.State.I)
                .stationName("Boulder")
                .stce(listOf(1.23, 342.3, 1.32))
                .stci(listOf(1.23, 342.3, 1.32))
                .sunspotNum(151.1)
                .sunspotNumHigh(152.1)
                .sunspotNumLow(150.1)
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .transactionId("TRANSACTION-ID")
                .type("JBH09")
                .y10(1.23)
                .y54(1.23)
                .build()
        )
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sgiService = client.sgi()

        sgiService.update(
            SgiUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SgiUpdateParams.DataMode.TEST)
                .effectiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .sgiDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .source("Bluestaq")
                .bodyId("SGI-ID")
                .analyzerAttenuation(5.1)
                .ap(1.23)
                .apDuration(3)
                .coeffDegree(listOf(1, 2, 3))
                .coeffOrder(listOf(1, 2, 3))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .ctce(listOf(1.23, 342.3, 1.32))
                .ctci(listOf(1.23, 342.3, 1.32))
                .dst(1.23)
                .dtc(1.23)
                .e10(1.23)
                .e54(1.23)
                .f10(1.23)
                .f10High(187.5)
                .f10Low(185.5)
                .f54(1.23)
                .f81(1.23)
                .frequencies(listOf(25.0, 25.125, 25.25, 25.375, 25.5, 25.625, 25.75, 25.875))
                .gamma(25)
                .idSensor("57c96c97-e076-48af-a068-73ee2cb37e65")
                .kIndex(1)
                .kp(4.66)
                .kpDuration(3)
                .m10(1.23)
                .m54(1.23)
                .mode(1)
                .normFactor(2.12679e-7)
                .observedBaseline(listOf(15, 32, 25, 134, 0, 6, 19, 8))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .origSensorId("ORIGSENSOR-ID")
                .powers(listOf(67.1, 65.2, 68.1, 74.3, 68.1, 96.4, 97.3, 68.1))
                .precedence(SgiUpdateParams.Precedence.R)
                .rawFileUri("rawFileURI")
                .rbDuration(24)
                .rbIndex(1.02947164506)
                .rbRegionCode(2)
                .s10(1.23)
                .s54(1.23)
                .state(SgiUpdateParams.State.I)
                .stationName("Boulder")
                .stce(listOf(1.23, 342.3, 1.32))
                .stci(listOf(1.23, 342.3, 1.32))
                .sunspotNum(151.1)
                .sunspotNumHigh(152.1)
                .sunspotNumLow(150.1)
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .transactionId("TRANSACTION-ID")
                .type("JBH09")
                .y10(1.23)
                .y54(1.23)
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
        val sgiService = client.sgi()

        val page = sgiService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sgiService = client.sgi()

        sgiService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sgiService = client.sgi()

        sgiService.count(
            SgiCountParams.builder()
                .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .sgiDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val sgiService = client.sgi()

        sgiService.createBulk(
            SgiCreateBulkParams.builder()
                .addBody(
                    SgiCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(SgiCreateBulkParams.Body.DataMode.TEST)
                        .effectiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .sgiDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .source("Bluestaq")
                        .id("SGI-ID")
                        .analyzerAttenuation(5.1)
                        .ap(1.23)
                        .apDuration(3)
                        .coeffDegree(listOf(1, 2, 3))
                        .coeffOrder(listOf(1, 2, 3))
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .ctce(listOf(1.23, 342.3, 1.32))
                        .ctci(listOf(1.23, 342.3, 1.32))
                        .dst(1.23)
                        .dtc(1.23)
                        .e10(1.23)
                        .e54(1.23)
                        .f10(1.23)
                        .f10High(187.5)
                        .f10Low(185.5)
                        .f54(1.23)
                        .f81(1.23)
                        .frequencies(
                            listOf(25.0, 25.125, 25.25, 25.375, 25.5, 25.625, 25.75, 25.875)
                        )
                        .gamma(25)
                        .idSensor("57c96c97-e076-48af-a068-73ee2cb37e65")
                        .kIndex(1)
                        .kp(4.66)
                        .kpDuration(3)
                        .m10(1.23)
                        .m54(1.23)
                        .mode(1)
                        .normFactor(2.12679e-7)
                        .observedBaseline(listOf(15, 32, 25, 134, 0, 6, 19, 8))
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .origSensorId("ORIGSENSOR-ID")
                        .powers(listOf(67.1, 65.2, 68.1, 74.3, 68.1, 96.4, 97.3, 68.1))
                        .precedence(SgiCreateBulkParams.Body.Precedence.R)
                        .rawFileUri("rawFileURI")
                        .rbDuration(24)
                        .rbIndex(1.02947164506)
                        .rbRegionCode(2)
                        .s10(1.23)
                        .s54(1.23)
                        .state(SgiCreateBulkParams.Body.State.I)
                        .stationName("Boulder")
                        .stce(listOf(1.23, 342.3, 1.32))
                        .stci(listOf(1.23, 342.3, 1.32))
                        .sunspotNum(151.1)
                        .sunspotNumHigh(152.1)
                        .sunspotNumLow(150.1)
                        .addTag("PROVIDER_TAG1")
                        .addTag("PROVIDER_TAG2")
                        .transactionId("TRANSACTION-ID")
                        .type("JBH09")
                        .y10(1.23)
                        .y54(1.23)
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
        val sgiService = client.sgi()

        val sgi =
            sgiService.get(SgiGetParams.builder().id("id").firstResult(0L).maxResults(0L).build())

        sgi.validate()
    }

    @Test
    fun getDataByEffectiveAsOfDate() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sgiService = client.sgi()

        val response =
            sgiService.getDataByEffectiveAsOfDate(
                SgiGetDataByEffectiveAsOfDateParams.builder()
                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .sgiDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sgiService = client.sgi()

        val response = sgiService.queryhelp()

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
        val sgiService = client.sgi()

        val response =
            sgiService.tuple(
                SgiTupleParams.builder()
                    .columns("columns")
                    .effectiveDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .sgiDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val sgiService = client.sgi()

        sgiService.unvalidatedPublish(
            SgiUnvalidatedPublishParams.builder()
                .addBody(
                    SgiUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(SgiUnvalidatedPublishParams.Body.DataMode.TEST)
                        .effectiveDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .sgiDate(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .source("Bluestaq")
                        .id("SGI-ID")
                        .analyzerAttenuation(5.1)
                        .ap(1.23)
                        .apDuration(3)
                        .coeffDegree(listOf(1, 2, 3))
                        .coeffOrder(listOf(1, 2, 3))
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .ctce(listOf(1.23, 342.3, 1.32))
                        .ctci(listOf(1.23, 342.3, 1.32))
                        .dst(1.23)
                        .dtc(1.23)
                        .e10(1.23)
                        .e54(1.23)
                        .f10(1.23)
                        .f10High(187.5)
                        .f10Low(185.5)
                        .f54(1.23)
                        .f81(1.23)
                        .frequencies(
                            listOf(25.0, 25.125, 25.25, 25.375, 25.5, 25.625, 25.75, 25.875)
                        )
                        .gamma(25)
                        .idSensor("57c96c97-e076-48af-a068-73ee2cb37e65")
                        .kIndex(1)
                        .kp(4.66)
                        .kpDuration(3)
                        .m10(1.23)
                        .m54(1.23)
                        .mode(1)
                        .normFactor(2.12679e-7)
                        .observedBaseline(listOf(15, 32, 25, 134, 0, 6, 19, 8))
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .origSensorId("ORIGSENSOR-ID")
                        .powers(listOf(67.1, 65.2, 68.1, 74.3, 68.1, 96.4, 97.3, 68.1))
                        .precedence(SgiUnvalidatedPublishParams.Body.Precedence.R)
                        .rawFileUri("rawFileURI")
                        .rbDuration(24)
                        .rbIndex(1.02947164506)
                        .rbRegionCode(2)
                        .s10(1.23)
                        .s54(1.23)
                        .state(SgiUnvalidatedPublishParams.Body.State.I)
                        .stationName("Boulder")
                        .stce(listOf(1.23, 342.3, 1.32))
                        .stci(listOf(1.23, 342.3, 1.32))
                        .sunspotNum(151.1)
                        .sunspotNumHigh(152.1)
                        .sunspotNumLow(150.1)
                        .addTag("PROVIDER_TAG1")
                        .addTag("PROVIDER_TAG2")
                        .transactionId("TRANSACTION-ID")
                        .type("JBH09")
                        .y10(1.23)
                        .y54(1.23)
                        .build()
                )
                .build()
        )
    }
}
