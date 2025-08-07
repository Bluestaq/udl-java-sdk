// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailCountParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailCreateParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailGetParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailTupleParams
import com.unifieddatalibrary.api.models.rfemitterdetails.RfEmitterDetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RfEmitterDetailServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val future =
            rfEmitterDetailServiceAsync.create(
                RfEmitterDetailCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(RfEmitterDetailCreateParams.DataMode.TEST)
                    .idRfEmitter("RFEMITTER-ID")
                    .source("Bluestaq")
                    .id("RFEMITTERDETAILS-ID")
                    .alternateFacilityName("ALTERNATE_FACILITY_NAME")
                    .altName("ALTERNATE_NAME")
                    .antennaDiameter(20.23)
                    .addAntennaSize(1.1)
                    .addAntennaSize(2.2)
                    .barrageNoiseBandwidth(5.23)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .description("DESCRIPTION")
                    .designator("DESIGNATOR")
                    .dopplerNoise(10.23)
                    .drfmInstantaneousBandwidth(20.23)
                    .family("FAMILY")
                    .manufacturerOrgId("MANUFACTURERORG-ID")
                    .notes("NOTES")
                    .numBits(256)
                    .numChannels(10)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .productionFacilityLocationId("PRODUCTIONFACILITYLOCATION-ID")
                    .productionFacilityName("PRODUCTION_FACILITY")
                    .receiverBandwidth(15.23)
                    .receiverSensitivity(10.23)
                    .receiverType("RECEIVER_TYPE")
                    .secondaryNotes("MORE_NOTES")
                    .systemSensitivityEnd(150.23)
                    .systemSensitivityStart(50.23)
                    .transmitPower(100.23)
                    .transmitterBandwidth(0.125)
                    .transmitterFrequency(105.9)
                    .addUrl("TAG1")
                    .addUrl("TAG2")
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
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val future =
            rfEmitterDetailServiceAsync.update(
                RfEmitterDetailUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(RfEmitterDetailUpdateParams.DataMode.TEST)
                    .idRfEmitter("RFEMITTER-ID")
                    .source("Bluestaq")
                    .bodyId("RFEMITTERDETAILS-ID")
                    .alternateFacilityName("ALTERNATE_FACILITY_NAME")
                    .altName("ALTERNATE_NAME")
                    .antennaDiameter(20.23)
                    .addAntennaSize(1.1)
                    .addAntennaSize(2.2)
                    .barrageNoiseBandwidth(5.23)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .description("DESCRIPTION")
                    .designator("DESIGNATOR")
                    .dopplerNoise(10.23)
                    .drfmInstantaneousBandwidth(20.23)
                    .family("FAMILY")
                    .manufacturerOrgId("MANUFACTURERORG-ID")
                    .notes("NOTES")
                    .numBits(256)
                    .numChannels(10)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .productionFacilityLocationId("PRODUCTIONFACILITYLOCATION-ID")
                    .productionFacilityName("PRODUCTION_FACILITY")
                    .receiverBandwidth(15.23)
                    .receiverSensitivity(10.23)
                    .receiverType("RECEIVER_TYPE")
                    .secondaryNotes("MORE_NOTES")
                    .systemSensitivityEnd(150.23)
                    .systemSensitivityStart(50.23)
                    .transmitPower(100.23)
                    .transmitterBandwidth(0.125)
                    .transmitterFrequency(105.9)
                    .addUrl("TAG1")
                    .addUrl("TAG2")
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
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val pageFuture = rfEmitterDetailServiceAsync.list()

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
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val future = rfEmitterDetailServiceAsync.delete("id")

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
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val responseFuture =
            rfEmitterDetailServiceAsync.count(
                RfEmitterDetailCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val rfEmitterDetailFuture =
            rfEmitterDetailServiceAsync.get(
                RfEmitterDetailGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val rfEmitterDetail = rfEmitterDetailFuture.get()
        rfEmitterDetail.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val responseFuture = rfEmitterDetailServiceAsync.queryhelp()

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
        val rfEmitterDetailServiceAsync = client.rfEmitterDetails()

        val responseFuture =
            rfEmitterDetailServiceAsync.tuple(
                RfEmitterDetailTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
