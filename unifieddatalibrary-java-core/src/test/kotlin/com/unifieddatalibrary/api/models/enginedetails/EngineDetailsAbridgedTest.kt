// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.enginedetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EngineDetailsAbridgedTest {

    @Test
    fun create() {
        val engineDetailsAbridged =
            EngineDetailsAbridged.builder()
                .classificationMarking("U")
                .dataMode(EngineDetailsAbridged.DataMode.TEST)
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
                .vacuumThrust(1.1)
                .build()

        assertThat(engineDetailsAbridged.classificationMarking()).isEqualTo("U")
        assertThat(engineDetailsAbridged.dataMode()).isEqualTo(EngineDetailsAbridged.DataMode.TEST)
        assertThat(engineDetailsAbridged.idEngine()).isEqualTo("ENGINE-ID")
        assertThat(engineDetailsAbridged.source()).isEqualTo("Bluestaq")
        assertThat(engineDetailsAbridged.id()).contains("ENGINEDETAILS-ID")
        assertThat(engineDetailsAbridged.burnTime()).contains(1.1)
        assertThat(engineDetailsAbridged.chamberPressure()).contains(1.1)
        assertThat(engineDetailsAbridged.characteristicType()).contains("Electric")
        assertThat(engineDetailsAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(engineDetailsAbridged.createdBy()).contains("some.user")
        assertThat(engineDetailsAbridged.cycleType()).contains("Pressure Fed")
        assertThat(engineDetailsAbridged.family()).contains("ENGINE_TYPE1")
        assertThat(engineDetailsAbridged.manufacturerOrgId()).contains("MANUFACTURERORG-ID")
        assertThat(engineDetailsAbridged.maxFirings()).contains(5)
        assertThat(engineDetailsAbridged.notes()).contains("Example notes")
        assertThat(engineDetailsAbridged.nozzleExpansionRatio()).contains(1.1)
        assertThat(engineDetailsAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(engineDetailsAbridged.origNetwork()).contains("ORIG")
        assertThat(engineDetailsAbridged.oxidizer()).contains("Liquid Oxygen")
        assertThat(engineDetailsAbridged.propellant()).contains("Liquid")
        assertThat(engineDetailsAbridged.seaLevelThrust()).contains(1.1)
        assertThat(engineDetailsAbridged.specificImpulse()).contains(1.1)
        assertThat(engineDetailsAbridged.vacuumThrust()).contains(1.1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val engineDetailsAbridged =
            EngineDetailsAbridged.builder()
                .classificationMarking("U")
                .dataMode(EngineDetailsAbridged.DataMode.TEST)
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
                .vacuumThrust(1.1)
                .build()

        val roundtrippedEngineDetailsAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(engineDetailsAbridged),
                jacksonTypeRef<EngineDetailsAbridged>(),
            )

        assertThat(roundtrippedEngineDetailsAbridged).isEqualTo(engineDetailsAbridged)
    }
}
