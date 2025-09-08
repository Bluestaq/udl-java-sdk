// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailCreateParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailRetrieveParams
import com.unifieddatalibrary.api.models.enginedetails.EngineDetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EngineDetailServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val engineDetailService = client.engineDetails()

        engineDetailService.create(
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
                .origNetwork("OPS1")
                .oxidizer("Liquid Oxygen")
                .propellant("Liquid")
                .seaLevelThrust(1.1)
                .specificImpulse(1.1)
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .vacuumThrust(1.1)
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
        val engineDetailService = client.engineDetails()

        val engineDetailsFull =
            engineDetailService.retrieve(
                EngineDetailRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        engineDetailsFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val engineDetailService = client.engineDetails()

        engineDetailService.update(
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
                .origNetwork("OPS1")
                .oxidizer("Liquid Oxygen")
                .propellant("Liquid")
                .seaLevelThrust(1.1)
                .specificImpulse(1.1)
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .vacuumThrust(1.1)
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
        val engineDetailService = client.engineDetails()

        val page = engineDetailService.list()

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
        val engineDetailService = client.engineDetails()

        engineDetailService.delete("id")
    }
}
