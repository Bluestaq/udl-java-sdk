// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationCountParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationCreateBulkParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationListParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationTupleParams
import com.unifieddatalibrary.api.models.spaceenvobservation.SpaceEnvObservationUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpaceEnvObservationServiceAsyncTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val spaceEnvObservationServiceAsync = client.spaceEnvObservation()

        val pageFuture =
            spaceEnvObservationServiceAsync.list(
                SpaceEnvObservationListParams.builder()
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
        val spaceEnvObservationServiceAsync = client.spaceEnvObservation()

        val responseFuture =
            spaceEnvObservationServiceAsync.count(
                SpaceEnvObservationCountParams.builder()
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
        val spaceEnvObservationServiceAsync = client.spaceEnvObservation()

        val future =
            spaceEnvObservationServiceAsync.createBulk(
                SpaceEnvObservationCreateBulkParams.builder()
                    .addBody(
                        SpaceEnvObservationCreateBulkParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(SpaceEnvObservationCreateBulkParams.Body.DataMode.TEST)
                            .obTime(OffsetDateTime.parse("2023-06-07T14:17:39.653Z"))
                            .source("Bluestaq")
                            .id("f13f82b8-5d2a-407a-b3f3-1fe30ca79eae")
                            .alt(35785.3732)
                            .createdAt(OffsetDateTime.parse("2023-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .dataType("ECP")
                            .derived(false)
                            .description("Observation Data Description Text")
                            .descriptor("energetic charged particle")
                            .externalId("fe4ad5dc-0128-4ce8-b09c-0b404322025e")
                            .forecast(true)
                            .genSystem("System Name")
                            .genTime(OffsetDateTime.parse("2023-02-10T19:48:09.934Z"))
                            .idOnOrbit("41866")
                            .idSensor("ECP-1")
                            .instrumentType("MAGNETOMETER")
                            .lat(38.8339)
                            .lon(-104.8214)
                            .measType("ENERGETIC PARTICLES")
                            .msgType("SODM")
                            .observatoryName("GOES-16")
                            .observatoryNotes("Notes")
                            .observatoryType("ONORBIT")
                            .obSetId("ECPOBSET-478125")
                            .origin("OPS1")
                            .origNetwork("OPS1")
                            .origObjectId("41866")
                            .origSensorId("ECP-1")
                            .particleType("PROTON")
                            .quality("GOOD")
                            .satNo(41866)
                            .senEnergyLevel("0500-700 keV")
                            .senPos(listOf(4174.78541785946, -9969.69867853067, 40733.9284531208))
                            .senReferenceFrame(
                                SpaceEnvObservationCreateBulkParams.Body.SenReferenceFrame.J2000
                            )
                            .senVel(
                                listOf(0.727059797295872, 0.298037087322647, 0.00157064850994095)
                            )
                            .addSeoList(
                                SpaceEnvObservationCreateBulkParams.Body.SeoList.builder()
                                    .obType("INTEGRAL FLUX")
                                    .obUoM("particles/cm^2/s/sr")
                                    .obArray(listOf(1.7, 35.6, 21.2, 19.01))
                                    .obBool(true)
                                    .obDescription("Observation Description Text")
                                    .obQuality("GOOD")
                                    .obString("C1.3")
                                    .obValue(0.487687826)
                                    .build()
                            )
                            .addSrcId("615236d7-d464-4b8c-9b0b-45994e017d80")
                            .addSrcId("8a38e3d6-35fd-4bda-b883-e3724e6bc6b9")
                            .addSrcTyp("SPACEENVOB")
                            .addSrcTyp("SGI")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val spaceEnvObservationServiceAsync = client.spaceEnvObservation()

        val responseFuture = spaceEnvObservationServiceAsync.queryhelp()

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
        val spaceEnvObservationServiceAsync = client.spaceEnvObservation()

        val spaceEnvObservationFullsFuture =
            spaceEnvObservationServiceAsync.tuple(
                SpaceEnvObservationTupleParams.builder()
                    .columns("columns")
                    .obTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val spaceEnvObservationFulls = spaceEnvObservationFullsFuture.get()
        spaceEnvObservationFulls.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val spaceEnvObservationServiceAsync = client.spaceEnvObservation()

        val future =
            spaceEnvObservationServiceAsync.unvalidatedPublish(
                SpaceEnvObservationUnvalidatedPublishParams.builder()
                    .addBody(
                        SpaceEnvObservationUnvalidatedPublishParams.Body.builder()
                            .classificationMarking("U")
                            .dataMode(
                                SpaceEnvObservationUnvalidatedPublishParams.Body.DataMode.TEST
                            )
                            .obTime(OffsetDateTime.parse("2023-06-07T14:17:39.653Z"))
                            .source("Bluestaq")
                            .id("f13f82b8-5d2a-407a-b3f3-1fe30ca79eae")
                            .alt(35785.3732)
                            .createdAt(OffsetDateTime.parse("2023-01-01T16:00:00.123Z"))
                            .createdBy("some.user")
                            .dataType("ECP")
                            .derived(false)
                            .description("Observation Data Description Text")
                            .descriptor("energetic charged particle")
                            .externalId("fe4ad5dc-0128-4ce8-b09c-0b404322025e")
                            .forecast(true)
                            .genSystem("System Name")
                            .genTime(OffsetDateTime.parse("2023-02-10T19:48:09.934Z"))
                            .idOnOrbit("41866")
                            .idSensor("ECP-1")
                            .instrumentType("MAGNETOMETER")
                            .lat(38.8339)
                            .lon(-104.8214)
                            .measType("ENERGETIC PARTICLES")
                            .msgType("SODM")
                            .observatoryName("GOES-16")
                            .observatoryNotes("Notes")
                            .observatoryType("ONORBIT")
                            .obSetId("ECPOBSET-478125")
                            .origin("OPS1")
                            .origNetwork("OPS1")
                            .origObjectId("41866")
                            .origSensorId("ECP-1")
                            .particleType("PROTON")
                            .quality("GOOD")
                            .satNo(41866)
                            .senEnergyLevel("0500-700 keV")
                            .senPos(listOf(4174.78541785946, -9969.69867853067, 40733.9284531208))
                            .senReferenceFrame(
                                SpaceEnvObservationUnvalidatedPublishParams.Body.SenReferenceFrame
                                    .J2000
                            )
                            .senVel(
                                listOf(0.727059797295872, 0.298037087322647, 0.00157064850994095)
                            )
                            .addSeoList(
                                SpaceEnvObservationUnvalidatedPublishParams.Body.SeoList.builder()
                                    .obType("INTEGRAL FLUX")
                                    .obUoM("particles/cm^2/s/sr")
                                    .obArray(listOf(1.7, 35.6, 21.2, 19.01))
                                    .obBool(true)
                                    .obDescription("Observation Description Text")
                                    .obQuality("GOOD")
                                    .obString("C1.3")
                                    .obValue(0.487687826)
                                    .build()
                            )
                            .addSrcId("615236d7-d464-4b8c-9b0b-45994e017d80")
                            .addSrcId("8a38e3d6-35fd-4bda-b883-e3724e6bc6b9")
                            .addSrcTyp("SPACEENVOB")
                            .addSrcTyp("SGI")
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }
}
