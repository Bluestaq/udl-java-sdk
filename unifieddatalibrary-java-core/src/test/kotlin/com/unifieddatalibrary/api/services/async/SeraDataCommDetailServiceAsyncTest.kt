// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailCountParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailCreateParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailGetParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailTupleParams
import com.unifieddatalibrary.api.models.seradatacommdetails.SeraDataCommDetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SeraDataCommDetailServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataCommDetailServiceAsync = client.seraDataCommDetails()

        val future =
            seraDataCommDetailServiceAsync.create(
                SeraDataCommDetailCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(SeraDataCommDetailCreateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .id("SERADATACOMMDETAILS-ID")
                    .band("X")
                    .bandwidth(1.23)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .eirp(1.23)
                    .estHtsTotalCapacity(1.23)
                    .estHtsTotalUserDownlinkBandwidthPerBeam(1.23)
                    .estHtsTotalUserUplinkBandwidthPerBeam(1.23)
                    .gatewayDownlinkFrom(1.23)
                    .gatewayDownlinkTo(1.23)
                    .gatewayUplinkFrom(1.23)
                    .gatewayUplinkTo(1.23)
                    .hostedForCompanyOrgId("hostedForCompanyOrgId")
                    .htsNumUserSpotBeams(1)
                    .htsUserDownlinkBandwidthPerBeam(1.23)
                    .htsUserUplinkBandwidthPerBeam(1.23)
                    .idComm("idComm")
                    .manufacturerOrgId("manufacturerOrgId")
                    .num36MhzEquivalentTransponders(1)
                    .numOperationalTransponders(1)
                    .numSpareTransponders(1)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .payloadNotes("Sample Notes")
                    .polarization("polarization")
                    .solidStatePowerAmp(1.23)
                    .spacecraftId("spacecraftId")
                    .tradeLeaseOrgId("tradeLeaseOrgId")
                    .travelingWaveTubeAmplifier(1.23)
                    .userDownlinkFrom(1.23)
                    .userDownlinkTo(1.23)
                    .userUplinkFrom(1.23)
                    .userUplinkTo(1.23)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataCommDetailServiceAsync = client.seraDataCommDetails()

        val future =
            seraDataCommDetailServiceAsync.update(
                SeraDataCommDetailUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(SeraDataCommDetailUpdateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .bodyId("SERADATACOMMDETAILS-ID")
                    .band("X")
                    .bandwidth(1.23)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .eirp(1.23)
                    .estHtsTotalCapacity(1.23)
                    .estHtsTotalUserDownlinkBandwidthPerBeam(1.23)
                    .estHtsTotalUserUplinkBandwidthPerBeam(1.23)
                    .gatewayDownlinkFrom(1.23)
                    .gatewayDownlinkTo(1.23)
                    .gatewayUplinkFrom(1.23)
                    .gatewayUplinkTo(1.23)
                    .hostedForCompanyOrgId("hostedForCompanyOrgId")
                    .htsNumUserSpotBeams(1)
                    .htsUserDownlinkBandwidthPerBeam(1.23)
                    .htsUserUplinkBandwidthPerBeam(1.23)
                    .idComm("idComm")
                    .manufacturerOrgId("manufacturerOrgId")
                    .num36MhzEquivalentTransponders(1)
                    .numOperationalTransponders(1)
                    .numSpareTransponders(1)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .payloadNotes("Sample Notes")
                    .polarization("polarization")
                    .solidStatePowerAmp(1.23)
                    .spacecraftId("spacecraftId")
                    .tradeLeaseOrgId("tradeLeaseOrgId")
                    .travelingWaveTubeAmplifier(1.23)
                    .userDownlinkFrom(1.23)
                    .userDownlinkTo(1.23)
                    .userUplinkFrom(1.23)
                    .userUplinkTo(1.23)
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
        val seraDataCommDetailServiceAsync = client.seraDataCommDetails()

        val pageFuture = seraDataCommDetailServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataCommDetailServiceAsync = client.seraDataCommDetails()

        val future = seraDataCommDetailServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataCommDetailServiceAsync = client.seraDataCommDetails()

        val responseFuture =
            seraDataCommDetailServiceAsync.count(
                SeraDataCommDetailCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataCommDetailServiceAsync = client.seraDataCommDetails()

        val seraDataCommDetailFuture =
            seraDataCommDetailServiceAsync.get(
                SeraDataCommDetailGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val seraDataCommDetail = seraDataCommDetailFuture.get()
        seraDataCommDetail.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val seraDataCommDetailServiceAsync = client.seraDataCommDetails()

        val responseFuture = seraDataCommDetailServiceAsync.queryhelp()

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
        val seraDataCommDetailServiceAsync = client.seraDataCommDetails()

        val responseFuture =
            seraDataCommDetailServiceAsync.tuple(
                SeraDataCommDetailTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
