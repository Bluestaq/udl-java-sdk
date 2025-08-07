// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailCreateParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailGetParams
import com.unifieddatalibrary.api.models.onorbitdetails.OnorbitdetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OnorbitdetailServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val onorbitdetailServiceAsync = client.onorbitdetails()

        val future =
            onorbitdetailServiceAsync.create(
                OnorbitdetailCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(OnorbitdetailCreateParams.DataMode.TEST)
                    .idOnOrbit("REF-ONORBIT-ID")
                    .source("Bluestaq")
                    .id("ONORBITDETAILS-ID")
                    .additionalMass(10.23)
                    .adeptRadius(10.23)
                    .bolDeltaV(1000.1)
                    .bolFuelMass(10.23)
                    .busCrossSection(10.23)
                    .busType("A2100")
                    .colaRadius(10.23)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .crossSection(10.23)
                    .currentMass(500.0)
                    .deltaVUnc(50.1)
                    .addDepEstMass(20.0)
                    .addDepEstMass(21.0)
                    .addDepMassUnc(10.0)
                    .addDepMassUnc(5.0)
                    .addDepName("GOES-18A")
                    .addDepName("GOES-18B")
                    .driftRate(1.23)
                    .dryMass(10.23)
                    .estDeltaVDuration(10.23)
                    .fuelRemaining(10.23)
                    .geoSlot(90.23)
                    .lastObSource("THIRD_PARTY_DATASOURCE")
                    .lastObTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                    .launchMass(10.23)
                    .launchMassMax(15.23)
                    .launchMassMin(5.23)
                    .maneuverable(false)
                    .maxDeltaV(10.23)
                    .maxRadius(10.23)
                    .addMissionType("Weather")
                    .addMissionType("Space Weather")
                    .numDeployable(2)
                    .numMission(2)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .rcs(10.23)
                    .rcsMax(15.23)
                    .rcsMean(10.23)
                    .rcsMin(5.23)
                    .refSource("Wikipedia")
                    .solarArrayArea(10.23)
                    .totalMassUnc(50.1)
                    .vismag(10.23)
                    .vismagMax(15.23)
                    .vismagMean(10.23)
                    .vismagMin(5.23)
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
        val onorbitdetailServiceAsync = client.onorbitdetails()

        val future =
            onorbitdetailServiceAsync.update(
                OnorbitdetailUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(OnorbitdetailUpdateParams.DataMode.TEST)
                    .idOnOrbit("REF-ONORBIT-ID")
                    .source("Bluestaq")
                    .bodyId("ONORBITDETAILS-ID")
                    .additionalMass(10.23)
                    .adeptRadius(10.23)
                    .bolDeltaV(1000.1)
                    .bolFuelMass(10.23)
                    .busCrossSection(10.23)
                    .busType("A2100")
                    .colaRadius(10.23)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .crossSection(10.23)
                    .currentMass(500.0)
                    .deltaVUnc(50.1)
                    .addDepEstMass(20.0)
                    .addDepEstMass(21.0)
                    .addDepMassUnc(10.0)
                    .addDepMassUnc(5.0)
                    .addDepName("GOES-18A")
                    .addDepName("GOES-18B")
                    .driftRate(1.23)
                    .dryMass(10.23)
                    .estDeltaVDuration(10.23)
                    .fuelRemaining(10.23)
                    .geoSlot(90.23)
                    .lastObSource("THIRD_PARTY_DATASOURCE")
                    .lastObTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                    .launchMass(10.23)
                    .launchMassMax(15.23)
                    .launchMassMin(5.23)
                    .maneuverable(false)
                    .maxDeltaV(10.23)
                    .maxRadius(10.23)
                    .addMissionType("Weather")
                    .addMissionType("Space Weather")
                    .numDeployable(2)
                    .numMission(2)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .rcs(10.23)
                    .rcsMax(15.23)
                    .rcsMean(10.23)
                    .rcsMin(5.23)
                    .refSource("Wikipedia")
                    .solarArrayArea(10.23)
                    .totalMassUnc(50.1)
                    .vismag(10.23)
                    .vismagMax(15.23)
                    .vismagMean(10.23)
                    .vismagMin(5.23)
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
        val onorbitdetailServiceAsync = client.onorbitdetails()

        val pageFuture = onorbitdetailServiceAsync.list()

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
        val onorbitdetailServiceAsync = client.onorbitdetails()

        val future = onorbitdetailServiceAsync.delete("id")

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
        val onorbitdetailServiceAsync = client.onorbitdetails()

        val onorbitDetailsFullFuture =
            onorbitdetailServiceAsync.get(
                OnorbitdetailGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val onorbitDetailsFull = onorbitDetailsFullFuture.get()
        onorbitDetailsFull.validate()
    }
}
