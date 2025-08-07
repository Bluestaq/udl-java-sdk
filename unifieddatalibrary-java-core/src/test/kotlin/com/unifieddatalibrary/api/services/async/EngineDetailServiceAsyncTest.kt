// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailCreateParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailRetrieveParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EngineDetailServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val engineDetailServiceAsync = client.engineDetails()

        val future =
            engineDetailServiceAsync.create(
                EngineDetailCreateParams.builder()
                    .classificationMarking("U")
                    .dataMode(EngineDetailCreateParams.DataMode.TEST)
                    .idEngine("ENGINE-ID")
                    .source("Bluestaq")
                    .id("ENGINEDETAILS-ID")
                    .burnTime(1.1)
                    .chamberPressure(1.1)
                    .characteristicType("Electric")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .cycleType("Pressure Fed")
                    .family("ENGINE_TYPE1")
                    .manufacturerOrgId("MANUFACTURERORG-ID")
                    .maxFirings(5)
                    .notes("Example notes")
                    .nozzleExpansionRatio(1.1)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .oxidizer("Liquid Oxygen")
                    .propellant("Liquid")
                    .seaLevelThrust(1.1)
                    .specificImpulse(1.1)
                    .addTag("PROVIDER_TAG1")
                    .addTag("PROVIDER_TAG2")
                    .vacuumThrust(1.1)
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
        val engineDetailServiceAsync = client.engineDetails()

        val engineDetailsFullFuture =
            engineDetailServiceAsync.retrieve(
                EngineDetailRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val engineDetailsFull = engineDetailsFullFuture.get()
        engineDetailsFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val engineDetailServiceAsync = client.engineDetails()

        val future =
            engineDetailServiceAsync.update(
                EngineDetailUpdateParams.builder()
                    .pathId("id")
                    .classificationMarking("U")
                    .dataMode(EngineDetailUpdateParams.DataMode.TEST)
                    .idEngine("ENGINE-ID")
                    .source("Bluestaq")
                    .bodyId("ENGINEDETAILS-ID")
                    .burnTime(1.1)
                    .chamberPressure(1.1)
                    .characteristicType("Electric")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .cycleType("Pressure Fed")
                    .family("ENGINE_TYPE1")
                    .manufacturerOrgId("MANUFACTURERORG-ID")
                    .maxFirings(5)
                    .notes("Example notes")
                    .nozzleExpansionRatio(1.1)
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("ORIG")
                    .oxidizer("Liquid Oxygen")
                    .propellant("Liquid")
                    .seaLevelThrust(1.1)
                    .specificImpulse(1.1)
                    .addTag("PROVIDER_TAG1")
                    .addTag("PROVIDER_TAG2")
                    .vacuumThrust(1.1)
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
        val engineDetailServiceAsync = client.engineDetails()

        val pageFuture = engineDetailServiceAsync.list()

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
        val engineDetailServiceAsync = client.engineDetails()

        val future = engineDetailServiceAsync.delete("id")

        val response = future.get()
    }
}
