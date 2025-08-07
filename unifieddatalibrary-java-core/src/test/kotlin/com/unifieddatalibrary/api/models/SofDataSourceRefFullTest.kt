// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SofDataSourceRefFullTest {

    @Test
    fun create() {
        val sofDataSourceRefFull =
            SofDataSourceRefFull.builder()
                .dataSourceId("dataSourceId")
                .endPosition("endPosition")
                .paragraphNumber("paragraphNumber")
                .sentenceNumber("sentenceNumber")
                .startPosition("startPosition")
                .build()

        assertThat(sofDataSourceRefFull.dataSourceId()).contains("dataSourceId")
        assertThat(sofDataSourceRefFull.endPosition()).contains("endPosition")
        assertThat(sofDataSourceRefFull.paragraphNumber()).contains("paragraphNumber")
        assertThat(sofDataSourceRefFull.sentenceNumber()).contains("sentenceNumber")
        assertThat(sofDataSourceRefFull.startPosition()).contains("startPosition")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sofDataSourceRefFull =
            SofDataSourceRefFull.builder()
                .dataSourceId("dataSourceId")
                .endPosition("endPosition")
                .paragraphNumber("paragraphNumber")
                .sentenceNumber("sentenceNumber")
                .startPosition("startPosition")
                .build()

        val roundtrippedSofDataSourceRefFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sofDataSourceRefFull),
                jacksonTypeRef<SofDataSourceRefFull>(),
            )

        assertThat(roundtrippedSofDataSourceRefFull).isEqualTo(sofDataSourceRefFull)
    }
}
