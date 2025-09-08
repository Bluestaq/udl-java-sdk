// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.ecpsdr.EcpSdrUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EcpSdrServiceAsyncTest {

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val ecpSdrServiceAsync = client.ecpSdr()

        val future =
            ecpSdrServiceAsync.unvalidatedPublish(
                EcpSdrUnvalidatedPublishParams.builder()
                    .addBody(
                        EcpSdrUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(EcpSdrUnvalidatedPublishParams.Body.DataMode.TEST)
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

        val response = future.get()
    }
}
