// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.onorbit

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailCreateParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailRetrieveParams
import com.unifieddatalibrary.api.models.onorbit.antennadetails.AntennaDetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AntennaDetailServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val antennaDetailService = client.onorbit().antennaDetails()

        antennaDetailService.create(
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
                .origNetwork("OPS1")
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
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val antennaDetailService = client.onorbit().antennaDetails()

        val antennaDetailsFull =
            antennaDetailService.retrieve(
                AntennaDetailRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        antennaDetailsFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val antennaDetailService = client.onorbit().antennaDetails()

        antennaDetailService.update(
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
                .origNetwork("OPS1")
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val antennaDetailService = client.onorbit().antennaDetails()

        val page = antennaDetailService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val antennaDetailService = client.onorbit().antennaDetails()

        antennaDetailService.delete("id")
    }
}
