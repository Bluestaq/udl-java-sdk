// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.diffofarrival.DiffOfArrivalRetrieveParams
import com.unifieddatalibrary.api.models.diffofarrival.DiffOfArrivalTupleParams
import com.unifieddatalibrary.api.models.diffofarrival.DiffOfArrivalUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DiffOfArrivalServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val diffOfArrivalServiceAsync = client.diffOfArrival()

        val diffofarrivalFullFuture =
            diffOfArrivalServiceAsync.retrieve(
                DiffOfArrivalRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val diffofarrivalFull = diffofarrivalFullFuture.get()
        diffofarrivalFull.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val diffOfArrivalServiceAsync = client.diffOfArrival()

        val responseFuture = diffOfArrivalServiceAsync.queryhelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val diffOfArrivalServiceAsync = client.diffOfArrival()

        val diffofarrivalFullsFuture =
            diffOfArrivalServiceAsync.tuple(
                DiffOfArrivalTupleParams.builder()
                    .columns("columns")
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val diffofarrivalFulls = diffofarrivalFullsFuture.get()
        diffofarrivalFulls.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val diffOfArrivalServiceAsync = client.diffOfArrival()

        val future =
            diffOfArrivalServiceAsync.unvalidatedPublish(
                DiffOfArrivalUnvalidatedPublishParams.builder()
                    .addBody(
                        DiffOfArrivalUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(DiffOfArrivalUnvalidatedPublishParams.Body.DataMode.TEST)
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
                            .origNetwork("OPS1")
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

        val response = future.get()
    }
}
