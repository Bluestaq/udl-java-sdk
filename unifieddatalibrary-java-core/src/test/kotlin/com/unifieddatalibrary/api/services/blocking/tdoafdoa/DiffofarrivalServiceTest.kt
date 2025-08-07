// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.tdoafdoa

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.DiffofarrivalCountParams
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.DiffofarrivalCreateBulkParams
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.DiffofarrivalCreateParams
import com.unifieddatalibrary.api.models.tdoafdoa.diffofarrival.DiffofarrivalListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DiffofarrivalServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val diffofarrivalService = client.tdoaFdoa().diffofarrival()

        diffofarrivalService.create(
            DiffofarrivalCreateParams.builder()
                .classificationMarking("U")
                .dataMode(DiffofarrivalCreateParams.DataMode.TEST)
                .obTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .source("Bluestaq")
                .id("DIFFOFARRIVAL-ID")
                .bandwidth(1.1)
                .collectionMode("SURVEY")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .deltaRange(1.1)
                .deltaRangeRate(1.1)
                .deltaRangeRateUnc(1.1)
                .deltaRangeUnc(1.1)
                .descriptor("Example descriptor")
                .fdoa(1.1)
                .fdoaUnc(1.1)
                .frequency(1.1)
                .idOnOrbit("ONORBIT-ID")
                .idSensor1("SENSOR1-ID")
                .idSensor2("SENSOR2-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .origObjectId("ORIGOBJECT-ID")
                .origSensorId1("ORIGSENSOR1-ID")
                .origSensorId2("ORIGSENSOR2-ID")
                .rawFileUri("rawFileURI")
                .satNo(25544)
                .sen2alt(1.1)
                .sen2lat(1.1)
                .sen2lon(1.1)
                .senalt(1.1)
                .senlat(45.1)
                .senlon(120.1)
                .sensor1Delay(1.1)
                .sensor2Delay(1.1)
                .snr(1.1)
                .sourceDl("AXE")
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .taskId("TASK-ID")
                .tdoa(1.1)
                .tdoaUnc(1.1)
                .transactionId("TRANSACTION-ID")
                .uct(false)
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
        val diffofarrivalService = client.tdoaFdoa().diffofarrival()

        val page =
            diffofarrivalService.list(
                DiffofarrivalListParams.builder()
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val diffofarrivalService = client.tdoaFdoa().diffofarrival()

        diffofarrivalService.count(
            DiffofarrivalCountParams.builder()
                .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val diffofarrivalService = client.tdoaFdoa().diffofarrival()

        diffofarrivalService.createBulk(
            DiffofarrivalCreateBulkParams.builder()
                .addBody(
                    DiffofarrivalCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(DiffofarrivalCreateBulkParams.Body.DataMode.TEST)
                        .obTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                        .source("Bluestaq")
                        .id("DIFFOFARRIVAL-ID")
                        .bandwidth(1.1)
                        .collectionMode("SURVEY")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .deltaRange(1.1)
                        .deltaRangeRate(1.1)
                        .deltaRangeRateUnc(1.1)
                        .deltaRangeUnc(1.1)
                        .descriptor("Example descriptor")
                        .fdoa(1.1)
                        .fdoaUnc(1.1)
                        .frequency(1.1)
                        .idOnOrbit("ONORBIT-ID")
                        .idSensor1("SENSOR1-ID")
                        .idSensor2("SENSOR2-ID")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .origObjectId("ORIGOBJECT-ID")
                        .origSensorId1("ORIGSENSOR1-ID")
                        .origSensorId2("ORIGSENSOR2-ID")
                        .rawFileUri("rawFileURI")
                        .satNo(25544)
                        .sen2alt(1.1)
                        .sen2lat(1.1)
                        .sen2lon(1.1)
                        .senalt(1.1)
                        .senlat(45.1)
                        .senlon(120.1)
                        .sensor1Delay(1.1)
                        .sensor2Delay(1.1)
                        .snr(1.1)
                        .sourceDl("AXE")
                        .addTag("PROVIDER_TAG1")
                        .addTag("PROVIDER_TAG2")
                        .taskId("TASK-ID")
                        .tdoa(1.1)
                        .tdoaUnc(1.1)
                        .transactionId("TRANSACTION-ID")
                        .uct(false)
                        .build()
                )
                .build()
        )
    }
}
