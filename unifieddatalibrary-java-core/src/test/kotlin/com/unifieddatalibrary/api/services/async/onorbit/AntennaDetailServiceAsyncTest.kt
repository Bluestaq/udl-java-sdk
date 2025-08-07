// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.onorbit

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailCreateParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailRetrieveParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AntennaDetailServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val antennaDetailServiceAsync = client.onorbit().antennaDetails()

        val future =
            antennaDetailServiceAsync.create(
                AntennaDetailCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(AntennaDetailCreateParams.DataMode.TEST)
                    .idAntenna("ANTENNA-ID")
                    .source("Bluestaq")
                    .id("ANTENNADETAILS-ID")
                    .beamForming(false)
                    .beamwidth(14.1)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .description("Description of antenna A")
                    .diameter(0.01)
                    .endFrequency(3.3)
                    .gain(20.1)
                    .gainTolerance(5.1)
                    .manufacturerOrgId("MANUFACTUREORG-ID")
                    .mode(AntennaDetailCreateParams.Mode.TX)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .polarization(45.1)
                    .position("Top")
                    .addSize(0.03)
                    .addSize(0.05)
                    .startFrequency(2.1)
                    .steerable(false)
                    .addTag("PROVIDER_TAG1")
                    .addTag("PROVIDER_TAG2")
                    .type("Reflector")
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
        val antennaDetailServiceAsync = client.onorbit().antennaDetails()

        val antennaDetailsFullFuture =
            antennaDetailServiceAsync.retrieve(
                AntennaDetailRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val antennaDetailsFull = antennaDetailsFullFuture.get()
        antennaDetailsFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val antennaDetailServiceAsync = client.onorbit().antennaDetails()

        val future =
            antennaDetailServiceAsync.update(
                AntennaDetailUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(AntennaDetailUpdateParams.DataMode.TEST)
                    .idAntenna("ANTENNA-ID")
                    .source("Bluestaq")
                    .bodyId("ANTENNADETAILS-ID")
                    .beamForming(false)
                    .beamwidth(14.1)
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .description("Description of antenna A")
                    .diameter(0.01)
                    .endFrequency(3.3)
                    .gain(20.1)
                    .gainTolerance(5.1)
                    .manufacturerOrgId("MANUFACTUREORG-ID")
                    .mode(AntennaDetailUpdateParams.Mode.TX)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .polarization(45.1)
                    .position("Top")
                    .addSize(0.03)
                    .addSize(0.05)
                    .startFrequency(2.1)
                    .steerable(false)
                    .addTag("PROVIDER_TAG1")
                    .addTag("PROVIDER_TAG2")
                    .type("Reflector")
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
        val antennaDetailServiceAsync = client.onorbit().antennaDetails()

        val pageFuture = antennaDetailServiceAsync.list()

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
        val antennaDetailServiceAsync = client.onorbit().antennaDetails()

        val future = antennaDetailServiceAsync.delete("id")

        val response = future.get()
    }
}
