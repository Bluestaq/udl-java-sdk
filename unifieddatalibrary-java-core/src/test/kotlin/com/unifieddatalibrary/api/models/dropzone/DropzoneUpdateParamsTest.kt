// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.dropzone

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DropzoneUpdateParamsTest {

    @Test
    fun create() {
        DropzoneUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(DropzoneUpdateParams.DataMode.TEST)
            .lat(33.54)
            .lon(-117.162)
            .name("Viper DZ")
            .source("Bluestaq")
            .bodyId("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
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
    }

    @Test
    fun pathParams() {
        val params =
            DropzoneUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(DropzoneUpdateParams.DataMode.TEST)
                .lat(33.54)
                .lon(-117.162)
                .name("Viper DZ")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DropzoneUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(DropzoneUpdateParams.DataMode.TEST)
                .lat(33.54)
                .lon(-117.162)
                .name("Viper DZ")
                .source("Bluestaq")
                .bodyId("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(DropzoneUpdateParams.DataMode.TEST)
        assertThat(body.lat()).isEqualTo(33.54)
        assertThat(body.lon()).isEqualTo(-117.162)
        assertThat(body.name()).isEqualTo("Viper DZ")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("3f28f60b-3a50-2aef-ac88-8e9d0e39912b")
        assertThat(body.altCountryCode()).contains("USA")
        assertThat(body.altCountryName()).contains("United States of America")
        assertThat(body.approvalDate()).contains(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
        assertThat(body.code()).contains("DZ")
        assertThat(body.countryCode()).contains("US")
        assertThat(body.countryName()).contains("United States")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.expirationDate()).contains(OffsetDateTime.parse("2022-12-09T16:00:00.123Z"))
        assertThat(body.extIdentifier()).contains("1001")
        assertThat(body.idSite()).contains("a150b3ee-884b-b9ac-60a0-6408b4b16088")
        assertThat(body.lastUpdate()).contains(OffsetDateTime.parse("2022-11-07T18:44:41.123Z"))
        assertThat(body.length()).contains(549.1)
        assertThat(body.majcom()).contains("United States Northern Command")
        assertThat(body.nearestLoc()).contains("March AFB")
        assertThat(body.operationalApprovalDate())
            .contains(OffsetDateTime.parse("2018-01-05T16:00:00.123Z"))
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.pointName()).contains("CENTER POINT")
        assertThat(body.radius()).contains(495.1)
        assertThat(body.recertDate()).contains(OffsetDateTime.parse("2022-07-05T16:00:00.123Z"))
        assertThat(body.remark()).contains("The text of the remark.")
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.stateAbbr()).contains("CA")
        assertThat(body.stateName()).contains("CALIFORNIA")
        assertThat(body.surveyDate()).contains(OffsetDateTime.parse("2017-12-09T16:00:00.123Z"))
        assertThat(body.width()).contains(549.1)
        assertThat(body.zarId()).contains("1001")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DropzoneUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(DropzoneUpdateParams.DataMode.TEST)
                .lat(33.54)
                .lon(-117.162)
                .name("Viper DZ")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(DropzoneUpdateParams.DataMode.TEST)
        assertThat(body.lat()).isEqualTo(33.54)
        assertThat(body.lon()).isEqualTo(-117.162)
        assertThat(body.name()).isEqualTo("Viper DZ")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
