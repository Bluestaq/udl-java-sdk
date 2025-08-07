// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.observations

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrCountParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrCreateBulkParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrCreateParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrListParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrRetrieveParams
import com.unifieddatalibrary.api.models.observations.ecpsdr.EcpsdrTupleParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EcpsdrServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpsdrServiceAsync = client.observations().ecpsdr()

        val future =
            ecpsdrServiceAsync.create(
                EcpsdrCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(EcpsdrCreateParams.DataMode.TEST)
                    .msgTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .source("Bluestaq")
                    .type("STANDARD")
                    .id("ECPSDR-ID")
                    .asl5VCurrMon(12)
                    .cdsPlateVMon(12)
                    .cdsRefVMon(12)
                    .cdsThreshold(12)
                    .cdsThrottle(12)
                    .checksum(12)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .dosBias(12)
                    .dsl5VCurrMon(12)
                    .esdTrigCountH(12)
                    .esdTrigCountL(12)
                    .hiLetL(2)
                    .hiLetM(2)
                    .idOnOrbit("ONORBIT-ID")
                    .idSensor("SENSOR-ID")
                    .lowLetL(2)
                    .lowLetM(2)
                    .medLet1L(2)
                    .medLet1M(2)
                    .medLet2L(2)
                    .medLet2M(2)
                    .medLet3L(2)
                    .medLet3M(2)
                    .medLet4L(2)
                    .medLet4M(2)
                    .mpTemp(12)
                    .obTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .origObjectId("ORIGOBJECT-ID")
                    .origSensorId("ORIGSENSOR-ID")
                    .pd1SigLev(12)
                    .pd2SigLev(12)
                    .psTempMon(12)
                    .retransmit(true)
                    .satNo(101)
                    .senMode("TEST")
                    .surfDosChargeH(12)
                    .surfDosChargeL(12)
                    .surfDosH(12)
                    .surfDosL(12)
                    .surfDosM(12)
                    .surfDosStat(2)
                    .transientData(listOf(1, 2, 3))
                    .vRef(12)
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
        val ecpsdrServiceAsync = client.observations().ecpsdr()

        val ecpsdrFuture =
            ecpsdrServiceAsync.retrieve(
                EcpsdrRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val ecpsdr = ecpsdrFuture.get()
        ecpsdr.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpsdrServiceAsync = client.observations().ecpsdr()

        val pageFuture =
            ecpsdrServiceAsync.list(
                EcpsdrListParams.builder()
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val ecpsdrServiceAsync = client.observations().ecpsdr()

        val responseFuture =
            ecpsdrServiceAsync.count(
                EcpsdrCountParams.builder()
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val ecpsdrServiceAsync = client.observations().ecpsdr()

        val future =
            ecpsdrServiceAsync.createBulk(
                EcpsdrCreateBulkParams.builder()
                    .addBody(
                        EcpsdrCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(EcpsdrCreateBulkParams.Body.DataMode.TEST)
                            .msgTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .source("Bluestaq")
                            .type("STANDARD")
                            .id("ECPSDR-ID")
                            .asl5VCurrMon(12)
                            .cdsPlateVMon(12)
                            .cdsRefVMon(12)
                            .cdsThreshold(12)
                            .cdsThrottle(12)
                            .checksum(12)
                            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .dosBias(12)
                            .dsl5VCurrMon(12)
                            .esdTrigCountH(12)
                            .esdTrigCountL(12)
                            .hiLetL(2)
                            .hiLetM(2)
                            .idOnOrbit("ONORBIT-ID")
                            .idSensor("SENSOR-ID")
                            .lowLetL(2)
                            .lowLetM(2)
                            .medLet1L(2)
                            .medLet1M(2)
                            .medLet2L(2)
                            .medLet2M(2)
                            .medLet3L(2)
                            .medLet3M(2)
                            .medLet4L(2)
                            .medLet4M(2)
                            .mpTemp(12)
                            .obTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                            .origin("THIRD_PARTY_DATASOURCE")
                            .origNetwork("ORIG")
                            .origObjectId("ORIGOBJECT-ID")
                            .origSensorId("ORIGSENSOR-ID")
                            .pd1SigLev(12)
                            .pd2SigLev(12)
                            .psTempMon(12)
                            .retransmit(true)
                            .satNo(101)
                            .senMode("TEST")
                            .surfDosChargeH(12)
                            .surfDosChargeL(12)
                            .surfDosH(12)
                            .surfDosL(12)
                            .surfDosM(12)
                            .surfDosStat(2)
                            .transientData(listOf(1, 2, 3))
                            .vRef(12)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpsdrServiceAsync = client.observations().ecpsdr()

        val responseFuture = ecpsdrServiceAsync.queryHelp()

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
        val ecpsdrServiceAsync = client.observations().ecpsdr()

        val ecpsdrsFuture =
            ecpsdrServiceAsync.tuple(
                EcpsdrTupleParams.builder()
                    .columns("columns")
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val ecpsdrs = ecpsdrsFuture.get()
        ecpsdrs.forEach { it.validate() }
    }
}
