// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.dropzone

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DropzoneListResponseTest {

    @Test
    fun create() {
        val dropzoneListResponse =
            DropzoneListResponse.builder()
                .classificationMarking("U")
                .dataMode(DropzoneListResponse.DataMode.TEST)
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

        assertThat(dropzoneListResponse.classificationMarking()).isEqualTo("U")
        assertThat(dropzoneListResponse.dataMode()).isEqualTo(DropzoneListResponse.DataMode.TEST)
        assertThat(dropzoneListResponse.lat()).isEqualTo(33.54)
        assertThat(dropzoneListResponse.lon()).isEqualTo(-117.162)
        assertThat(dropzoneListResponse.name()).isEqualTo("Viper DZ")
        assertThat(dropzoneListResponse.source()).isEqualTo("Bluestaq")
        assertThat(dropzoneListResponse.id()).contains("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
        assertThat(dropzoneListResponse.altCountryCode()).contains("USA")
        assertThat(dropzoneListResponse.altCountryName()).contains("United States of America")
        assertThat(dropzoneListResponse.approvalDate())
            .contains(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
        assertThat(dropzoneListResponse.code()).contains("DZ")
        assertThat(dropzoneListResponse.countryCode()).contains("US")
        assertThat(dropzoneListResponse.countryName()).contains("United States")
        assertThat(dropzoneListResponse.createdAt())
            .contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(dropzoneListResponse.createdBy()).contains("some.user")
        assertThat(dropzoneListResponse.expirationDate())
            .contains(OffsetDateTime.parse("2022-12-09T16:00:00.123Z"))
        assertThat(dropzoneListResponse.extIdentifier()).contains("1001")
        assertThat(dropzoneListResponse.idSite()).contains("a150b3ee-884b-b9ac-60a0-6408b4b16088")
        assertThat(dropzoneListResponse.lastUpdate())
            .contains(OffsetDateTime.parse("2022-11-07T18:44:41.123Z"))
        assertThat(dropzoneListResponse.length()).contains(549.1)
        assertThat(dropzoneListResponse.majcom()).contains("United States Northern Command")
        assertThat(dropzoneListResponse.nearestLoc()).contains("March AFB")
        assertThat(dropzoneListResponse.operationalApprovalDate())
            .contains(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
        assertThat(dropzoneListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(dropzoneListResponse.origNetwork()).contains("OPS1")
        assertThat(dropzoneListResponse.pointName()).contains("CENTER POINT")
        assertThat(dropzoneListResponse.radius()).contains(495.1)
        assertThat(dropzoneListResponse.recertDate())
            .contains(OffsetDateTime.parse("2022-07-05T16:00:00.123Z"))
        assertThat(dropzoneListResponse.remark()).contains("The text of the remark.")
        assertThat(dropzoneListResponse.sourceDl()).contains("AXE")
        assertThat(dropzoneListResponse.stateAbbr()).contains("CA")
        assertThat(dropzoneListResponse.stateName()).contains("CALIFORNIA")
        assertThat(dropzoneListResponse.surveyDate())
            .contains(OffsetDateTime.parse("2017-12-09T16:00:00.123Z"))
        assertThat(dropzoneListResponse.width()).contains(549.1)
        assertThat(dropzoneListResponse.zarId()).contains("1001")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dropzoneListResponse =
            DropzoneListResponse.builder()
                .classificationMarking("U")
                .dataMode(DropzoneListResponse.DataMode.TEST)
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

        val roundtrippedDropzoneListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dropzoneListResponse),
                jacksonTypeRef<DropzoneListResponse>(),
            )

        assertThat(roundtrippedDropzoneListResponse).isEqualTo(dropzoneListResponse)
    }
}
