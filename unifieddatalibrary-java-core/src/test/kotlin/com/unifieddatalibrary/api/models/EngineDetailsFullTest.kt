// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EngineDetailsFullTest {

    @Test
    fun create() {
        val engineDetailsFull =
            EngineDetailsFull.builder()
                .classificationMarking("U")
                .dataMode(EngineDetailsFull.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .vacuumThrust(1.1)
                .build()

        assertThat(engineDetailsFull.classificationMarking()).isEqualTo("U")
        assertThat(engineDetailsFull.dataMode()).isEqualTo(EngineDetailsFull.DataMode.TEST)
        assertThat(engineDetailsFull.idEngine()).isEqualTo("ENGINE-ID")
        assertThat(engineDetailsFull.source()).isEqualTo("Bluestaq")
        assertThat(engineDetailsFull.id()).contains("ENGINEDETAILS-ID")
        assertThat(engineDetailsFull.burnTime()).contains(1.1)
        assertThat(engineDetailsFull.chamberPressure()).contains(1.1)
        assertThat(engineDetailsFull.characteristicType()).contains("Electric")
        assertThat(engineDetailsFull.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(engineDetailsFull.createdBy()).contains("some.user")
        assertThat(engineDetailsFull.cycleType()).contains("Pressure Fed")
        assertThat(engineDetailsFull.family()).contains("ENGINE_TYPE1")
        assertThat(engineDetailsFull.manufacturerOrgId()).contains("MANUFACTURERORG-ID")
        assertThat(engineDetailsFull.maxFirings()).contains(5)
        assertThat(engineDetailsFull.notes()).contains("Example notes")
        assertThat(engineDetailsFull.nozzleExpansionRatio()).contains(1.1)
        assertThat(engineDetailsFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(engineDetailsFull.origNetwork()).contains("OPS1")
        assertThat(engineDetailsFull.oxidizer()).contains("Liquid Oxygen")
        assertThat(engineDetailsFull.propellant()).contains("Liquid")
        assertThat(engineDetailsFull.seaLevelThrust()).contains(1.1)
        assertThat(engineDetailsFull.specificImpulse()).contains(1.1)
        assertThat(engineDetailsFull.tags().getOrNull())
            .containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
        assertThat(engineDetailsFull.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(engineDetailsFull.updatedBy()).contains("some.user")
        assertThat(engineDetailsFull.vacuumThrust()).contains(1.1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val engineDetailsFull =
            EngineDetailsFull.builder()
                .classificationMarking("U")
                .dataMode(EngineDetailsFull.DataMode.TEST)
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
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .vacuumThrust(1.1)
                .build()

        val roundtrippedEngineDetailsFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(engineDetailsFull),
                jacksonTypeRef<EngineDetailsFull>(),
            )

        assertThat(roundtrippedEngineDetailsFull).isEqualTo(engineDetailsFull)
    }
}
