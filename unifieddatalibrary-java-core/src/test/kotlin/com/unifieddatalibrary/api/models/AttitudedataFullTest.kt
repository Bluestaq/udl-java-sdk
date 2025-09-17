// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttitudedataFullTest {

    @Test
    fun create() {
        val attitudedataFull =
            AttitudedataFull.builder()
                .classificationMarking("U")
                .dataMode(AttitudedataFull.DataMode.TEST)
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

        assertThat(attitudedataFull.classificationMarking()).isEqualTo("U")
        assertThat(attitudedataFull.dataMode()).isEqualTo(AttitudedataFull.DataMode.TEST)
        assertThat(attitudedataFull.source()).isEqualTo("Bluestaq")
        assertThat(attitudedataFull.ts())
            .isEqualTo(OffsetDateTime.parse("2022-03-07T14:51:39.653043Z"))
        assertThat(attitudedataFull.id()).contains("ATTITUDEDATA-ID")
        assertThat(attitudedataFull.asId()).contains("773c9887-e931-42eb-8155-f0fbd227b235")
        assertThat(attitudedataFull.coningAngle()).contains(0.1)
        assertThat(attitudedataFull.createdAt())
            .contains(OffsetDateTime.parse("2022-07-05T12:00:00.123Z"))
        assertThat(attitudedataFull.createdBy()).contains("some.user")
        assertThat(attitudedataFull.declination()).contains(0.799)
        assertThat(attitudedataFull.idOnOrbit()).contains("41947")
        assertThat(attitudedataFull.motionType()).contains("PROSOL_MOTION")
        assertThat(attitudedataFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(attitudedataFull.origNetwork()).contains("OPS1")
        assertThat(attitudedataFull.origObjectId()).contains("D6593")
        assertThat(attitudedataFull.precPeriod()).contains(36.1)
        assertThat(attitudedataFull.q1()).contains(0.0312)
        assertThat(attitudedataFull.q1Dot()).contains(0.0043)
        assertThat(attitudedataFull.q2()).contains(0.7854)
        assertThat(attitudedataFull.q2Dot()).contains(0.06)
        assertThat(attitudedataFull.q3()).contains(0.3916)
        assertThat(attitudedataFull.q3Dot()).contains(0.499)
        assertThat(attitudedataFull.qc()).contains(0.4783)
        assertThat(attitudedataFull.qcDot()).contains(0.011)
        assertThat(attitudedataFull.ra()).contains(-173.75)
        assertThat(attitudedataFull.satNo()).contains(41947)
        assertThat(attitudedataFull.spinPeriod()).contains(0.1)
        assertThat(attitudedataFull.xAngle().getOrNull()).containsExactly(139.753)
        assertThat(attitudedataFull.xRate().getOrNull()).containsExactly(0.105)
        assertThat(attitudedataFull.yAngle().getOrNull()).containsExactly(25.066)
        assertThat(attitudedataFull.yRate().getOrNull()).containsExactly(0.032)
        assertThat(attitudedataFull.zAngle().getOrNull()).containsExactly(-53.368)
        assertThat(attitudedataFull.zRate().getOrNull()).containsExactly(0.022)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attitudedataFull =
            AttitudedataFull.builder()
                .classificationMarking("U")
                .dataMode(AttitudedataFull.DataMode.TEST)
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

        val roundtrippedAttitudedataFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attitudedataFull),
                jacksonTypeRef<AttitudedataFull>(),
            )

        assertThat(roundtrippedAttitudedataFull).isEqualTo(attitudedataFull)
    }
}
