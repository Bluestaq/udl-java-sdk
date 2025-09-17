// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.observations

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
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
internal class EcpsdrServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpsdrService = client.observations().ecpsdr()

        ecpsdrService.create(
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
                .origNetwork("OPS1")
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
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpsdrService = client.observations().ecpsdr()

        val ecpsdr =
            ecpsdrService.retrieve(
                EcpsdrRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        ecpsdr.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpsdrService = client.observations().ecpsdr()

        val page =
            ecpsdrService.list(
                EcpsdrListParams.builder()
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val ecpsdrService = client.observations().ecpsdr()

        ecpsdrService.count(
            EcpsdrCountParams.builder()
                .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val ecpsdrService = client.observations().ecpsdr()

        ecpsdrService.createBulk(
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
                        .origNetwork("OPS1")
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
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpsdrService = client.observations().ecpsdr()

        val response = ecpsdrService.queryHelp()

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
        val ecpsdrService = client.observations().ecpsdr()

        val ecpsdrs =
            ecpsdrService.tuple(
                EcpsdrTupleParams.builder()
                    .columns("columns")
                    .msgTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        ecpsdrs.forEach { it.validate() }
    }
}
