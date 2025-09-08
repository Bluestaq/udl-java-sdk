// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.attitudesets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttitudesetAbridgedTest {

    @Test
    fun create() {
        val attitudesetAbridged =
            AttitudesetAbridged.builder()
                .classificationMarking("U")
                .dataMode(AttitudesetAbridged.DataMode.TEST)
                .endTime(OffsetDateTime.parse("2022-07-07T18:00:00.654321Z"))
                .frame1("SCBODY")
                .frame2("J2000")
                .numPoints(120)
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2022-07-07T16:00:00.123456Z"))
                .type("AEM")
                .id("ATTITUDESET-ID")
                .createdAt(OffsetDateTime.parse("2022-07-05T12:00:00.123Z"))
                .createdBy("some.user")
                .esId("60f7a241-b7be-48d8-acf3-786670af53f9")
                .eulerRotSeq("123")
                .idOnOrbit("41947")
                .idSensor("a7e99418-b6d6-29ab-e767-440a989cce26")
                .interpolator("LINEAR")
                .interpolatorDegree(2)
                .notes("Notes for this attitude set")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("D6593")
                .origSensorId("ORIGSENSOR-ID")
                .precAngleInit(30.5)
                .satNo(41947)
                .spinAngleInit(25.5)
                .stepSize(60)
                .build()

        assertThat(attitudesetAbridged.classificationMarking()).isEqualTo("U")
        assertThat(attitudesetAbridged.dataMode()).isEqualTo(AttitudesetAbridged.DataMode.TEST)
        assertThat(attitudesetAbridged.endTime())
            .isEqualTo(OffsetDateTime.parse("2022-07-07T18:00:00.654321Z"))
        assertThat(attitudesetAbridged.frame1()).isEqualTo("SCBODY")
        assertThat(attitudesetAbridged.frame2()).isEqualTo("J2000")
        assertThat(attitudesetAbridged.numPoints()).isEqualTo(120)
        assertThat(attitudesetAbridged.source()).isEqualTo("Bluestaq")
        assertThat(attitudesetAbridged.startTime())
            .isEqualTo(OffsetDateTime.parse("2022-07-07T16:00:00.123456Z"))
        assertThat(attitudesetAbridged.type()).isEqualTo("AEM")
        assertThat(attitudesetAbridged.id()).contains("ATTITUDESET-ID")
        assertThat(attitudesetAbridged.createdAt())
            .contains(OffsetDateTime.parse("2022-07-05T12:00:00.123Z"))
        assertThat(attitudesetAbridged.createdBy()).contains("some.user")
        assertThat(attitudesetAbridged.esId()).contains("60f7a241-b7be-48d8-acf3-786670af53f9")
        assertThat(attitudesetAbridged.eulerRotSeq()).contains("123")
        assertThat(attitudesetAbridged.idOnOrbit()).contains("41947")
        assertThat(attitudesetAbridged.idSensor()).contains("a7e99418-b6d6-29ab-e767-440a989cce26")
        assertThat(attitudesetAbridged.interpolator()).contains("LINEAR")
        assertThat(attitudesetAbridged.interpolatorDegree()).contains(2)
        assertThat(attitudesetAbridged.notes()).contains("Notes for this attitude set")
        assertThat(attitudesetAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(attitudesetAbridged.origNetwork()).contains("OPS1")
        assertThat(attitudesetAbridged.origObjectId()).contains("D6593")
        assertThat(attitudesetAbridged.origSensorId()).contains("ORIGSENSOR-ID")
        assertThat(attitudesetAbridged.precAngleInit()).contains(30.5)
        assertThat(attitudesetAbridged.satNo()).contains(41947)
        assertThat(attitudesetAbridged.spinAngleInit()).contains(25.5)
        assertThat(attitudesetAbridged.stepSize()).contains(60)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attitudesetAbridged =
            AttitudesetAbridged.builder()
                .classificationMarking("U")
                .dataMode(AttitudesetAbridged.DataMode.TEST)
                .endTime(OffsetDateTime.parse("2022-07-07T18:00:00.654321Z"))
                .frame1("SCBODY")
                .frame2("J2000")
                .numPoints(120)
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2022-07-07T16:00:00.123456Z"))
                .type("AEM")
                .id("ATTITUDESET-ID")
                .createdAt(OffsetDateTime.parse("2022-07-05T12:00:00.123Z"))
                .createdBy("some.user")
                .esId("60f7a241-b7be-48d8-acf3-786670af53f9")
                .eulerRotSeq("123")
                .idOnOrbit("41947")
                .idSensor("a7e99418-b6d6-29ab-e767-440a989cce26")
                .interpolator("LINEAR")
                .interpolatorDegree(2)
                .notes("Notes for this attitude set")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("D6593")
                .origSensorId("ORIGSENSOR-ID")
                .precAngleInit(30.5)
                .satNo(41947)
                .spinAngleInit(25.5)
                .stepSize(60)
                .build()

        val roundtrippedAttitudesetAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attitudesetAbridged),
                jacksonTypeRef<AttitudesetAbridged>(),
            )

        assertThat(roundtrippedAttitudesetAbridged).isEqualTo(attitudesetAbridged)
    }
}
