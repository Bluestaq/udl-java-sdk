// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.dropzone

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DropzoneQueryResponseTest {

    @Test
    fun create() {
        val dropzoneQueryResponse =
            DropzoneQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(DropzoneQueryResponse.DataMode.TEST)
                .lat(33.54)
                .lon(-117.162)
                .name("Viper DZ")
                .source("Bluestaq")
                .id("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
                .altCountryCode("USA")
                .altCountryName("United States of America")
                .approvalDate(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
                .code("DZ")
                .countryCode("US")
                .countryName("United States")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .expirationDate(OffsetDateTime.parse("2022-12-09T16:00:00.123Z"))
                .extIdentifier("1001")
                .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                .lastUpdate(OffsetDateTime.parse("2022-11-07T18:44:41.123Z"))
                .length(549.1)
                .majcom("United States Northern Command")
                .nearestLoc("March AFB")
                .operationalApprovalDate(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .pointName("CENTER POINT")
                .radius(495.1)
                .recertDate(OffsetDateTime.parse("2022-07-05T16:00:00.123Z"))
                .remark("The text of the remark.")
                .sourceDl("AXE")
                .stateAbbr("CA")
                .stateName("CALIFORNIA")
                .surveyDate(OffsetDateTime.parse("2017-12-09T16:00:00.123Z"))
                .width(549.1)
                .zarId("1001")
                .build()

        assertThat(dropzoneQueryResponse.classificationMarking()).isEqualTo("U")
        assertThat(dropzoneQueryResponse.dataMode()).isEqualTo(DropzoneQueryResponse.DataMode.TEST)
        assertThat(dropzoneQueryResponse.lat()).isEqualTo(33.54)
        assertThat(dropzoneQueryResponse.lon()).isEqualTo(-117.162)
        assertThat(dropzoneQueryResponse.name()).isEqualTo("Viper DZ")
        assertThat(dropzoneQueryResponse.source()).isEqualTo("Bluestaq")
        assertThat(dropzoneQueryResponse.id()).contains("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
        assertThat(dropzoneQueryResponse.altCountryCode()).contains("USA")
        assertThat(dropzoneQueryResponse.altCountryName()).contains("United States of America")
        assertThat(dropzoneQueryResponse.approvalDate())
            .contains(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
        assertThat(dropzoneQueryResponse.code()).contains("DZ")
        assertThat(dropzoneQueryResponse.countryCode()).contains("US")
        assertThat(dropzoneQueryResponse.countryName()).contains("United States")
        assertThat(dropzoneQueryResponse.createdAt())
            .contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(dropzoneQueryResponse.createdBy()).contains("some.user")
        assertThat(dropzoneQueryResponse.expirationDate())
            .contains(OffsetDateTime.parse("2022-12-09T16:00:00.123Z"))
        assertThat(dropzoneQueryResponse.extIdentifier()).contains("1001")
        assertThat(dropzoneQueryResponse.idSite()).contains("a150b3ee-884b-b9ac-60a0-6408b4b16088")
        assertThat(dropzoneQueryResponse.lastUpdate())
            .contains(OffsetDateTime.parse("2022-11-07T18:44:41.123Z"))
        assertThat(dropzoneQueryResponse.length()).contains(549.1)
        assertThat(dropzoneQueryResponse.majcom()).contains("United States Northern Command")
        assertThat(dropzoneQueryResponse.nearestLoc()).contains("March AFB")
        assertThat(dropzoneQueryResponse.operationalApprovalDate())
            .contains(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
        assertThat(dropzoneQueryResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(dropzoneQueryResponse.origNetwork()).contains("OPS1")
        assertThat(dropzoneQueryResponse.pointName()).contains("CENTER POINT")
        assertThat(dropzoneQueryResponse.radius()).contains(495.1)
        assertThat(dropzoneQueryResponse.recertDate())
            .contains(OffsetDateTime.parse("2022-07-05T16:00:00.123Z"))
        assertThat(dropzoneQueryResponse.remark()).contains("The text of the remark.")
        assertThat(dropzoneQueryResponse.sourceDl()).contains("AXE")
        assertThat(dropzoneQueryResponse.stateAbbr()).contains("CA")
        assertThat(dropzoneQueryResponse.stateName()).contains("CALIFORNIA")
        assertThat(dropzoneQueryResponse.surveyDate())
            .contains(OffsetDateTime.parse("2017-12-09T16:00:00.123Z"))
        assertThat(dropzoneQueryResponse.width()).contains(549.1)
        assertThat(dropzoneQueryResponse.zarId()).contains("1001")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dropzoneQueryResponse =
            DropzoneQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(DropzoneQueryResponse.DataMode.TEST)
                .lat(33.54)
                .lon(-117.162)
                .name("Viper DZ")
                .source("Bluestaq")
                .id("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
                .altCountryCode("USA")
                .altCountryName("United States of America")
                .approvalDate(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
                .code("DZ")
                .countryCode("US")
                .countryName("United States")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .expirationDate(OffsetDateTime.parse("2022-12-09T16:00:00.123Z"))
                .extIdentifier("1001")
                .idSite("a150b3ee-884b-b9ac-60a0-6408b4b16088")
                .lastUpdate(OffsetDateTime.parse("2022-11-07T18:44:41.123Z"))
                .length(549.1)
                .majcom("United States Northern Command")
                .nearestLoc("March AFB")
                .operationalApprovalDate(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .pointName("CENTER POINT")
                .radius(495.1)
                .recertDate(OffsetDateTime.parse("2022-07-05T16:00:00.123Z"))
                .remark("The text of the remark.")
                .sourceDl("AXE")
                .stateAbbr("CA")
                .stateName("CALIFORNIA")
                .surveyDate(OffsetDateTime.parse("2017-12-09T16:00:00.123Z"))
                .width(549.1)
                .zarId("1001")
                .build()

        val roundtrippedDropzoneQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dropzoneQueryResponse),
                jacksonTypeRef<DropzoneQueryResponse>(),
            )

        assertThat(roundtrippedDropzoneQueryResponse).isEqualTo(dropzoneQueryResponse)
    }
}
