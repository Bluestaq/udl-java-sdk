// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.elsets.ElsetCountParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateBulkFromTleParams
import com.unifieddatalibrary.api.models.elsets.ElsetCreateBulkParams
import com.unifieddatalibrary.api.models.elsets.ElsetIngest
import com.unifieddatalibrary.api.models.elsets.ElsetListParams
import com.unifieddatalibrary.api.models.elsets.ElsetRetrieveParams
import com.unifieddatalibrary.api.models.elsets.ElsetTupleParams
import com.unifieddatalibrary.api.models.elsets.ElsetUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ElsetServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val elsetServiceAsync = client.elsets()

        val future =
            elsetServiceAsync.create(
                ElsetIngest.builder()
                    .classificationMarking("U")
                    .dataMode(ElsetIngest.DataMode.TEST)
                    .epoch(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                    .source("Bluestaq")
                    .agom(0.0126)
                    .algorithm("Example algorithm")
                    .apogee(1.1)
                    .argOfPerigee(1.1)
                    .ballisticCoeff(0.00815)
                    .bStar(1.1)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .descriptor("Example description")
                    .eccentricity(0.333)
                    .ephemType(1L)
                    .idElset("ELSET-ID")
                    .idOnOrbit("ONORBIT-ID")
                    .idOrbitDetermination("026dd511-8ba5-47d3-9909-836149f87686")
                    .inclination(45.1)
                    .line1("Example line1")
                    .line2("Example line2")
                    .meanAnomaly(179.1)
                    .meanMotion(1.1)
                    .meanMotionDDot(1.1)
                    .meanMotionDot(1.1)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .origObjectId("ORIGOBJECT-ID")
                    .perigee(1.1)
                    .period(1.1)
                    .raan(1.1)
                    .rawFileUri("Example URI")
                    .revNo(111)
                    .satNo(12)
                    .semiMajorAxis(1.1)
                    .addSourcedData("OBSERVATION_UUID1")
                    .addSourcedData("OBSERVATION_UUID2")
                    .addSourcedDataType(ElsetIngest.SourcedDataType.RADAR)
                    .addSourcedDataType(ElsetIngest.SourcedDataType.RF)
                    .sourceDl("AXE")
                    .addTag("PROVIDER_TAG1")
                    .addTag("PROVIDER_TAG2")
                    .transactionId("TRANSACTION-ID")
                    .uct(false)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val elsetServiceAsync = client.elsets()

        val elsetFuture =
            elsetServiceAsync.retrieve(
                ElsetRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val elset = elsetFuture.get()
        elset.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val elsetServiceAsync = client.elsets()

        val pageFuture =
            elsetServiceAsync.list(
                ElsetListParams.builder()
                    .epoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val elsetServiceAsync = client.elsets()

        val responseFuture =
            elsetServiceAsync.count(
                ElsetCountParams.builder()
                    .epoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val elsetServiceAsync = client.elsets()

        val future =
            elsetServiceAsync.createBulk(
                ElsetCreateBulkParams.builder()
                    .dupeCheck(true)
                    .addBody(
                        ElsetIngest.builder()
                            .classificationMarking("U")
                            .dataMode(ElsetIngest.DataMode.TEST)
                            .epoch(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .source("Bluestaq")
                            .agom(0.0126)
                            .algorithm("Example algorithm")
                            .apogee(1.1)
                            .argOfPerigee(1.1)
                            .ballisticCoeff(0.00815)
                            .bStar(1.1)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .descriptor("Example description")
                            .eccentricity(0.333)
                            .ephemType(1L)
                            .idElset("ELSET-ID")
                            .idOnOrbit("ONORBIT-ID")
                            .idOrbitDetermination("026dd511-8ba5-47d3-9909-836149f87686")
                            .inclination(45.1)
                            .line1("Example line1")
                            .line2("Example line2")
                            .meanAnomaly(179.1)
                            .meanMotion(1.1)
                            .meanMotionDDot(1.1)
                            .meanMotionDot(1.1)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .origObjectId("ORIGOBJECT-ID")
                            .perigee(1.1)
                            .period(1.1)
                            .raan(1.1)
                            .rawFileUri("Example URI")
                            .revNo(111)
                            .satNo(12)
                            .semiMajorAxis(1.1)
                            .addSourcedData("OBSERVATION_UUID1")
                            .addSourcedData("OBSERVATION_UUID2")
                            .addSourcedDataType(ElsetIngest.SourcedDataType.RADAR)
                            .addSourcedDataType(ElsetIngest.SourcedDataType.RF)
                            .sourceDl("AXE")
                            .addTag("PROVIDER_TAG1")
                            .addTag("PROVIDER_TAG2")
                            .transactionId("TRANSACTION-ID")
                            .uct(false)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun createBulkFromTle() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val elsetServiceAsync = client.elsets()

        val future =
            elsetServiceAsync.createBulkFromTle(
                ElsetCreateBulkFromTleParams.builder()
                    .dataMode("dataMode")
                    .makeCurrent(true)
                    .source("source")
                    .autoCreateSats(true)
                    .control("control")
                    .origin("origin")
                    .tags("tags")
                    .body("body")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun queryCurrentElsetHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val elsetServiceAsync = client.elsets()

        val responseFuture = elsetServiceAsync.queryCurrentElsetHelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val elsetServiceAsync = client.elsets()

        val responseFuture = elsetServiceAsync.queryhelp()

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
        val elsetServiceAsync = client.elsets()

        val elsetsFuture =
            elsetServiceAsync.tuple(
                ElsetTupleParams.builder()
                    .columns("columns")
                    .epoch(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val elsets = elsetsFuture.get()
        elsets.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val elsetServiceAsync = client.elsets()

        val future =
            elsetServiceAsync.unvalidatedPublish(
                ElsetUnvalidatedPublishParams.builder()
                    .addBody(
                        ElsetIngest.builder()
                            .classificationMarking("U")
                            .dataMode(ElsetIngest.DataMode.TEST)
                            .epoch(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                            .source("Bluestaq")
                            .agom(0.0126)
                            .algorithm("Example algorithm")
                            .apogee(1.1)
                            .argOfPerigee(1.1)
                            .ballisticCoeff(0.00815)
                            .bStar(1.1)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .descriptor("Example description")
                            .eccentricity(0.333)
                            .ephemType(1L)
                            .idElset("ELSET-ID")
                            .idOnOrbit("ONORBIT-ID")
                            .idOrbitDetermination("026dd511-8ba5-47d3-9909-836149f87686")
                            .inclination(45.1)
                            .line1("Example line1")
                            .line2("Example line2")
                            .meanAnomaly(179.1)
                            .meanMotion(1.1)
                            .meanMotionDDot(1.1)
                            .meanMotionDot(1.1)
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("OPS1")
                            .origObjectId("ORIGOBJECT-ID")
                            .perigee(1.1)
                            .period(1.1)
                            .raan(1.1)
                            .rawFileUri("Example URI")
                            .revNo(111)
                            .satNo(12)
                            .semiMajorAxis(1.1)
                            .addSourcedData("OBSERVATION_UUID1")
                            .addSourcedData("OBSERVATION_UUID2")
                            .addSourcedDataType(ElsetIngest.SourcedDataType.RADAR)
                            .addSourcedDataType(ElsetIngest.SourcedDataType.RF)
                            .sourceDl("AXE")
                            .addTag("PROVIDER_TAG1")
                            .addTag("PROVIDER_TAG2")
                            .transactionId("TRANSACTION-ID")
                            .uct(false)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
