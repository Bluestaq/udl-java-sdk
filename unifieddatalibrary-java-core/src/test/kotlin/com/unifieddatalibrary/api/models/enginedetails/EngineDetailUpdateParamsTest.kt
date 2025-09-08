// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.enginedetails

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EngineDetailUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            EngineDetailUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(EngineDetailUpdateParams.DataMode.TEST)
                .idEngine("ENGINE-ID")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EngineDetailUpdateParams.DataMode.TEST)
        assertThat(body.idEngine()).isEqualTo("ENGINE-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("ENGINEDETAILS-ID")
        assertThat(body.burnTime()).contains(1.1)
        assertThat(body.chamberPressure()).contains(1.1)
        assertThat(body.characteristicType()).contains("Electric")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.cycleType()).contains("Pressure Fed")
        assertThat(body.family()).contains("ENGINE_TYPE1")
        assertThat(body.manufacturerOrgId()).contains("MANUFACTURERORG-ID")
        assertThat(body.maxFirings()).contains(5)
        assertThat(body.notes()).contains("Example notes")
        assertThat(body.nozzleExpansionRatio()).contains(1.1)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.oxidizer()).contains("Liquid Oxygen")
        assertThat(body.propellant()).contains("Liquid")
        assertThat(body.seaLevelThrust()).contains(1.1)
        assertThat(body.specificImpulse()).contains(1.1)
        assertThat(body.tags().getOrNull()).containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
        assertThat(body.vacuumThrust()).contains(1.1)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EngineDetailUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(EngineDetailUpdateParams.DataMode.TEST)
                .idEngine("ENGINE-ID")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EngineDetailUpdateParams.DataMode.TEST)
        assertThat(body.idEngine()).isEqualTo("ENGINE-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
