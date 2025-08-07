// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.observations

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationCountParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationCreateBulkParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationCreateParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationGetParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationListParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationTupleParams
import com.unifieddatalibrary.api.models.observations.radarobservation.RadarobservationUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RadarobservationServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val radarobservationServiceAsync = client.observations().radarobservation()

        val future =
            radarobservationServiceAsync.create(
                RadarobservationCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(RadarobservationCreateParams.DataMode.TEST)
                    .obTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                    .source("Bluestaq")
                    .id("RADAROBSERVATION-ID")
                    .azimuth(45.23)
                    .azimuthBias(45.23)
                    .azimuthMeasured(true)
                    .azimuthRate(1.23)
                    .azimuthUnc(45.23)
                    .beam(1.23)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .declination(10.23)
                    .declinationMeasured(true)
                    .descriptor("descriptor")
                    .doppler(10.23)
                    .dopplerUnc(1.23)
                    .elevation(45.23)
                    .elevationBias(1.23)
                    .elevationMeasured(true)
                    .elevationRate(1.23)
                    .elevationUnc(1.23)
                    .idOnOrbit("ONORBIT-ID")
                    .idSensor("SENSOR-ID")
                    .obPosition("FIRST")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .origObjectId("ORIGOBJECT-ID")
                    .origSensorId("ORIGSENSOR-ID")
                    .orthogonalRcs(1.23)
                    .orthogonalRcsUnc(10.23)
                    .ra(1.23)
                    .raMeasured(true)
                    .range(100.23)
                    .rangeAccel(10.23)
                    .rangeAccelUnc(1.23)
                    .rangeBias(1.23)
                    .rangeMeasured(true)
                    .rangeRate(1.23)
                    .rangeRateMeasured(true)
                    .rangeRateUnc(0.5)
                    .rangeUnc(1.23)
                    .rawFileUri("rawFileURI")
                    .rcs(100.23)
                    .rcsUnc(1.23)
                    .satNo(1)
                    .senReferenceFrame(RadarobservationCreateParams.SenReferenceFrame.J2000)
                    .senx(45.23)
                    .seny(40.23)
                    .senz(35.23)
                    .snr(0.5)
                    .sourceDl("AXE")
                    .addTag("TAG1")
                    .addTag("TAG2")
                    .taskId("TASK-ID")
                    .timingBias(1.23)
                    .trackId("TRACK-ID")
                    .trackingState("INIT ACQ")
                    .transactionId("TRANSACTION-ID")
                    .type("RADAR")
                    .uct(true)
                    .x(50.23)
                    .xvel(1.23)
                    .y(50.23)
                    .yvel(5.23)
                    .z(50.23)
                    .zvel(5.23)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val radarobservationServiceAsync = client.observations().radarobservation()

        val pageFuture =
            radarobservationServiceAsync.list(
                RadarobservationListParams.builder()
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val radarobservationServiceAsync = client.observations().radarobservation()

        val responseFuture =
            radarobservationServiceAsync.count(
                RadarobservationCountParams.builder()
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val radarobservationServiceAsync = client.observations().radarobservation()

        val future =
            radarobservationServiceAsync.createBulk(
                RadarobservationCreateBulkParams.builder()
                    .addBody(
                        RadarobservationCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(RadarobservationCreateBulkParams.Body.DataMode.TEST)
                            .obTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .source("Bluestaq")
                            .id("RADAROBSERVATION-ID")
                            .azimuth(45.23)
                            .azimuthBias(45.23)
                            .azimuthMeasured(true)
                            .azimuthRate(1.23)
                            .azimuthUnc(45.23)
                            .beam(1.23)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .declination(10.23)
                            .declinationMeasured(true)
                            .descriptor("descriptor")
                            .doppler(10.23)
                            .dopplerUnc(1.23)
                            .elevation(45.23)
                            .elevationBias(1.23)
                            .elevationMeasured(true)
                            .elevationRate(1.23)
                            .elevationUnc(1.23)
                            .idOnOrbit("ONORBIT-ID")
                            .idSensor("SENSOR-ID")
                            .obPosition("FIRST")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .origObjectId("ORIGOBJECT-ID")
                            .origSensorId("ORIGSENSOR-ID")
                            .orthogonalRcs(1.23)
                            .orthogonalRcsUnc(10.23)
                            .ra(1.23)
                            .raMeasured(true)
                            .range(100.23)
                            .rangeAccel(10.23)
                            .rangeAccelUnc(1.23)
                            .rangeBias(1.23)
                            .rangeMeasured(true)
                            .rangeRate(1.23)
                            .rangeRateMeasured(true)
                            .rangeRateUnc(0.5)
                            .rangeUnc(1.23)
                            .rawFileUri("rawFileURI")
                            .rcs(100.23)
                            .rcsUnc(1.23)
                            .satNo(1)
                            .senReferenceFrame(
                                RadarobservationCreateBulkParams.Body.SenReferenceFrame.J2000
                            )
                            .senx(45.23)
                            .seny(40.23)
                            .senz(35.23)
                            .snr(0.5)
                            .sourceDl("AXE")
                            .addTag("TAG1")
                            .addTag("TAG2")
                            .taskId("TASK-ID")
                            .timingBias(1.23)
                            .trackId("TRACK-ID")
                            .trackingState("INIT ACQ")
                            .transactionId("TRANSACTION-ID")
                            .type("RADAR")
                            .uct(true)
                            .x(50.23)
                            .xvel(1.23)
                            .y(50.23)
                            .yvel(5.23)
                            .z(50.23)
                            .zvel(5.23)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val radarobservationServiceAsync = client.observations().radarobservation()

        val radarobservationFuture =
            radarobservationServiceAsync.get(
                RadarobservationGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val radarobservation = radarobservationFuture.get()
        radarobservation.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val radarobservationServiceAsync = client.observations().radarobservation()

        val responseFuture = radarobservationServiceAsync.queryhelp()

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
        val radarobservationServiceAsync = client.observations().radarobservation()

        val responseFuture =
            radarobservationServiceAsync.tuple(
                RadarobservationTupleParams.builder()
                    .columns("columns")
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val radarobservationServiceAsync = client.observations().radarobservation()

        val future =
            radarobservationServiceAsync.unvalidatedPublish(
                RadarobservationUnvalidatedPublishParams.builder()
                    .addBody(
                        RadarobservationUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(RadarobservationUnvalidatedPublishParams.Body.DataMode.TEST)
                            .obTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .source("Bluestaq")
                            .id("RADAROBSERVATION-ID")
                            .azimuth(45.23)
                            .azimuthBias(45.23)
                            .azimuthMeasured(true)
                            .azimuthRate(1.23)
                            .azimuthUnc(45.23)
                            .beam(1.23)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .declination(10.23)
                            .declinationMeasured(true)
                            .descriptor("descriptor")
                            .doppler(10.23)
                            .dopplerUnc(1.23)
                            .elevation(45.23)
                            .elevationBias(1.23)
                            .elevationMeasured(true)
                            .elevationRate(1.23)
                            .elevationUnc(1.23)
                            .idOnOrbit("ONORBIT-ID")
                            .idSensor("SENSOR-ID")
                            .obPosition("FIRST")
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .origObjectId("ORIGOBJECT-ID")
                            .origSensorId("ORIGSENSOR-ID")
                            .orthogonalRcs(1.23)
                            .orthogonalRcsUnc(10.23)
                            .ra(1.23)
                            .raMeasured(true)
                            .range(100.23)
                            .rangeAccel(10.23)
                            .rangeAccelUnc(1.23)
                            .rangeBias(1.23)
                            .rangeMeasured(true)
                            .rangeRate(1.23)
                            .rangeRateMeasured(true)
                            .rangeRateUnc(0.5)
                            .rangeUnc(1.23)
                            .rawFileUri("rawFileURI")
                            .rcs(100.23)
                            .rcsUnc(1.23)
                            .satNo(1)
                            .senReferenceFrame(
                                RadarobservationUnvalidatedPublishParams.Body.SenReferenceFrame
                                    .J2000
                            )
                            .senx(45.23)
                            .seny(40.23)
                            .senz(35.23)
                            .snr(0.5)
                            .sourceDl("AXE")
                            .addTag("TAG1")
                            .addTag("TAG2")
                            .taskId("TASK-ID")
                            .timingBias(1.23)
                            .trackId("TRACK-ID")
                            .trackingState("INIT ACQ")
                            .transactionId("TRANSACTION-ID")
                            .type("RADAR")
                            .uct(true)
                            .x(50.23)
                            .xvel(1.23)
                            .y(50.23)
                            .yvel(5.23)
                            .z(50.23)
                            .zvel(5.23)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
