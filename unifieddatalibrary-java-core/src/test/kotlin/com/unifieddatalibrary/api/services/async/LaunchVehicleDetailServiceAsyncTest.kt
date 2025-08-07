// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailCreateParams
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailGetParams
import com.unifieddatalibrary.api.models.launchvehicledetails.LaunchVehicleDetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LaunchVehicleDetailServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val launchVehicleDetailServiceAsync = client.launchVehicleDetails()

        val future =
            launchVehicleDetailServiceAsync.create(
                LaunchVehicleDetailCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(LaunchVehicleDetailCreateParams.DataMode.TEST)
                    .idLaunchVehicle("LAUNCHVEHICLE-ID")
                    .source("Bluestaq")
                    .id("LAUNCHVEHICLEDETAILS-ID")
                    .attitudeAccuracy(10.23)
                    .category("Example-category")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .deploymentRotationRate(10.23)
                    .diameter(10.23)
                    .estLaunchPrice(10.23)
                    .estLaunchPriceTypical(10.23)
                    .fairingExternalDiameter(10.23)
                    .fairingInternalDiameter(10.23)
                    .fairingLength(10.23)
                    .fairingMass(10.23)
                    .fairingMaterial("Example-fairing-material")
                    .fairingName("Example-fairing-name")
                    .fairingNotes("Example notes")
                    .family("Example-family")
                    .geoPayloadMass(10.23)
                    .gtoInj3SigAccuracyApogeeMargin(10.23)
                    .gtoInj3SigAccuracyApogeeTarget(10.23)
                    .gtoInj3SigAccuracyInclinationMargin(10.23)
                    .gtoInj3SigAccuracyInclinationTarget(10.23)
                    .gtoInj3SigAccuracyPerigeeMargin(10.23)
                    .gtoInj3SigAccuracyPerigeeTarget(10.23)
                    .gtoPayloadMass(10.23)
                    .launchMass(10.23)
                    .launchPrefix("AX011")
                    .length(10.23)
                    .leoPayloadMass(10.23)
                    .manufacturerOrgId("MANUFACTURERORG-ID")
                    .maxAccelLoad(10.23)
                    .maxAcousticLevel(10.23)
                    .maxAcousticLevelRange(10.23)
                    .maxFairingPressureChange(10.23)
                    .maxFlightShockForce(10.23)
                    .maxFlightShockFreq(10.23)
                    .maxPayloadFreqLat(10.23)
                    .maxPayloadFreqLon(10.23)
                    .minorVariant("Example-minor-variant")
                    .notes("Example notes")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .oxidizer("Bromine")
                    .payloadNotes("Example notes")
                    .payloadSeparationRate(10.23)
                    .propellant("Nitrogen")
                    .soundPressureLevel(10.23)
                    .sourceUrl("Example URL")
                    .ssoPayloadMass(10.23)
                    .addTag("PROVIDER_TAG1")
                    .addTag("PROVIDER_TAG2")
                    .variant("Example-variant")
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
        val launchVehicleDetailServiceAsync = client.launchVehicleDetails()

        val future =
            launchVehicleDetailServiceAsync.update(
                LaunchVehicleDetailUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(LaunchVehicleDetailUpdateParams.DataMode.TEST)
                    .idLaunchVehicle("LAUNCHVEHICLE-ID")
                    .source("Bluestaq")
                    .bodyId("LAUNCHVEHICLEDETAILS-ID")
                    .attitudeAccuracy(10.23)
                    .category("Example-category")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .deploymentRotationRate(10.23)
                    .diameter(10.23)
                    .estLaunchPrice(10.23)
                    .estLaunchPriceTypical(10.23)
                    .fairingExternalDiameter(10.23)
                    .fairingInternalDiameter(10.23)
                    .fairingLength(10.23)
                    .fairingMass(10.23)
                    .fairingMaterial("Example-fairing-material")
                    .fairingName("Example-fairing-name")
                    .fairingNotes("Example notes")
                    .family("Example-family")
                    .geoPayloadMass(10.23)
                    .gtoInj3SigAccuracyApogeeMargin(10.23)
                    .gtoInj3SigAccuracyApogeeTarget(10.23)
                    .gtoInj3SigAccuracyInclinationMargin(10.23)
                    .gtoInj3SigAccuracyInclinationTarget(10.23)
                    .gtoInj3SigAccuracyPerigeeMargin(10.23)
                    .gtoInj3SigAccuracyPerigeeTarget(10.23)
                    .gtoPayloadMass(10.23)
                    .launchMass(10.23)
                    .launchPrefix("AX011")
                    .length(10.23)
                    .leoPayloadMass(10.23)
                    .manufacturerOrgId("MANUFACTURERORG-ID")
                    .maxAccelLoad(10.23)
                    .maxAcousticLevel(10.23)
                    .maxAcousticLevelRange(10.23)
                    .maxFairingPressureChange(10.23)
                    .maxFlightShockForce(10.23)
                    .maxFlightShockFreq(10.23)
                    .maxPayloadFreqLat(10.23)
                    .maxPayloadFreqLon(10.23)
                    .minorVariant("Example-minor-variant")
                    .notes("Example notes")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .oxidizer("Bromine")
                    .payloadNotes("Example notes")
                    .payloadSeparationRate(10.23)
                    .propellant("Nitrogen")
                    .soundPressureLevel(10.23)
                    .sourceUrl("Example URL")
                    .ssoPayloadMass(10.23)
                    .addTag("PROVIDER_TAG1")
                    .addTag("PROVIDER_TAG2")
                    .variant("Example-variant")
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
        val launchVehicleDetailServiceAsync = client.launchVehicleDetails()

        val pageFuture = launchVehicleDetailServiceAsync.list()

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
        val launchVehicleDetailServiceAsync = client.launchVehicleDetails()

        val future = launchVehicleDetailServiceAsync.delete("id")

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
        val launchVehicleDetailServiceAsync = client.launchVehicleDetails()

        val launchVehicleDetailFuture =
            launchVehicleDetailServiceAsync.get(
                LaunchVehicleDetailGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val launchVehicleDetail = launchVehicleDetailFuture.get()
        launchVehicleDetail.validate()
    }
}
