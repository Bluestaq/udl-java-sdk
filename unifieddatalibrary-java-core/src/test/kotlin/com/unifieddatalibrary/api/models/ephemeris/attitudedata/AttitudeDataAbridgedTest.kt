// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.ephemeris.attitudedata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttitudeDataAbridgedTest {

    @Test
    fun create() {
        val attitudeDataAbridged =
            AttitudeDataAbridged.builder()
                .classificationMarking("U")
                .dataMode(AttitudeDataAbridged.DataMode.TEST)
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2022-03-07T14:51:39.653043Z"))
                .id("ATTITUDEDATA-ID")
                .asId("773c9887-e931-42eb-8155-f0fbd227b235")
                .coningAngle(0.1)
                .createdAt(OffsetDateTime.parse("2022-07-05T12:00:00.123Z"))
                .createdBy("some.user")
                .declination(0.799)
                .idOnOrbit("41947")
                .motionType("PROSOL_MOTION")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("D6593")
                .precPeriod(36.1)
                .q1(0.0312)
                .q1Dot(0.0043)
                .q2(0.7854)
                .q2Dot(0.06)
                .q3(0.3916)
                .q3Dot(0.499)
                .qc(0.4783)
                .qcDot(0.011)
                .ra(-173.75)
                .satNo(41947)
                .spinPeriod(0.1)
                .addXAngle(139.753)
                .addXRate(0.105)
                .addYAngle(25.066)
                .addYRate(0.032)
                .addZAngle(-53.368)
                .addZRate(0.022)
                .build()

        assertThat(attitudeDataAbridged.classificationMarking()).isEqualTo("U")
        assertThat(attitudeDataAbridged.dataMode()).isEqualTo(AttitudeDataAbridged.DataMode.TEST)
        assertThat(attitudeDataAbridged.source()).isEqualTo("Bluestaq")
        assertThat(attitudeDataAbridged.ts())
            .isEqualTo(OffsetDateTime.parse("2022-03-07T14:51:39.653043Z"))
        assertThat(attitudeDataAbridged.id()).contains("ATTITUDEDATA-ID")
        assertThat(attitudeDataAbridged.asId()).contains("773c9887-e931-42eb-8155-f0fbd227b235")
        assertThat(attitudeDataAbridged.coningAngle()).contains(0.1)
        assertThat(attitudeDataAbridged.createdAt())
            .contains(OffsetDateTime.parse("2022-07-05T12:00:00.123Z"))
        assertThat(attitudeDataAbridged.createdBy()).contains("some.user")
        assertThat(attitudeDataAbridged.declination()).contains(0.799)
        assertThat(attitudeDataAbridged.idOnOrbit()).contains("41947")
        assertThat(attitudeDataAbridged.motionType()).contains("PROSOL_MOTION")
        assertThat(attitudeDataAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(attitudeDataAbridged.origNetwork()).contains("OPS1")
        assertThat(attitudeDataAbridged.origObjectId()).contains("D6593")
        assertThat(attitudeDataAbridged.precPeriod()).contains(36.1)
        assertThat(attitudeDataAbridged.q1()).contains(0.0312)
        assertThat(attitudeDataAbridged.q1Dot()).contains(0.0043)
        assertThat(attitudeDataAbridged.q2()).contains(0.7854)
        assertThat(attitudeDataAbridged.q2Dot()).contains(0.06)
        assertThat(attitudeDataAbridged.q3()).contains(0.3916)
        assertThat(attitudeDataAbridged.q3Dot()).contains(0.499)
        assertThat(attitudeDataAbridged.qc()).contains(0.4783)
        assertThat(attitudeDataAbridged.qcDot()).contains(0.011)
        assertThat(attitudeDataAbridged.ra()).contains(-173.75)
        assertThat(attitudeDataAbridged.satNo()).contains(41947)
        assertThat(attitudeDataAbridged.spinPeriod()).contains(0.1)
        assertThat(attitudeDataAbridged.xAngle().getOrNull()).containsExactly(139.753)
        assertThat(attitudeDataAbridged.xRate().getOrNull()).containsExactly(0.105)
        assertThat(attitudeDataAbridged.yAngle().getOrNull()).containsExactly(25.066)
        assertThat(attitudeDataAbridged.yRate().getOrNull()).containsExactly(0.032)
        assertThat(attitudeDataAbridged.zAngle().getOrNull()).containsExactly(-53.368)
        assertThat(attitudeDataAbridged.zRate().getOrNull()).containsExactly(0.022)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attitudeDataAbridged =
            AttitudeDataAbridged.builder()
                .classificationMarking("U")
                .dataMode(AttitudeDataAbridged.DataMode.TEST)
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2022-03-07T14:51:39.653043Z"))
                .id("ATTITUDEDATA-ID")
                .asId("773c9887-e931-42eb-8155-f0fbd227b235")
                .coningAngle(0.1)
                .createdAt(OffsetDateTime.parse("2022-07-05T12:00:00.123Z"))
                .createdBy("some.user")
                .declination(0.799)
                .idOnOrbit("41947")
                .motionType("PROSOL_MOTION")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("D6593")
                .precPeriod(36.1)
                .q1(0.0312)
                .q1Dot(0.0043)
                .q2(0.7854)
                .q2Dot(0.06)
                .q3(0.3916)
                .q3Dot(0.499)
                .qc(0.4783)
                .qcDot(0.011)
                .ra(-173.75)
                .satNo(41947)
                .spinPeriod(0.1)
                .addXAngle(139.753)
                .addXRate(0.105)
                .addYAngle(25.066)
                .addYRate(0.032)
                .addZAngle(-53.368)
                .addZRate(0.022)
                .build()

        val roundtrippedAttitudeDataAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attitudeDataAbridged),
                jacksonTypeRef<AttitudeDataAbridged>(),
            )

        assertThat(roundtrippedAttitudeDataAbridged).isEqualTo(attitudeDataAbridged)
    }
}
