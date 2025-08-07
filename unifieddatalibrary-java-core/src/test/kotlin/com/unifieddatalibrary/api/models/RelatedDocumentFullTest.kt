// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RelatedDocumentFullTest {

    @Test
    fun create() {
        val relatedDocumentFull =
            RelatedDocumentFull.builder()
                .addDataSourceRef(
                    SofDataSourceRefFull.builder()
                        .dataSourceId("dataSourceId")
                        .endPosition("endPosition")
                        .paragraphNumber("paragraphNumber")
                        .sentenceNumber("sentenceNumber")
                        .startPosition("startPosition")
                        .build()
                )
                .documentId("documentId")
                .build()

        assertThat(relatedDocumentFull.dataSourceRefs().getOrNull())
            .containsExactly(
                SofDataSourceRefFull.builder()
                    .dataSourceId("dataSourceId")
                    .endPosition("endPosition")
                    .paragraphNumber("paragraphNumber")
                    .sentenceNumber("sentenceNumber")
                    .startPosition("startPosition")
                    .build()
            )
        assertThat(relatedDocumentFull.documentId()).contains("documentId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val relatedDocumentFull =
            RelatedDocumentFull.builder()
                .addDataSourceRef(
                    SofDataSourceRefFull.builder()
                        .dataSourceId("dataSourceId")
                        .endPosition("endPosition")
                        .paragraphNumber("paragraphNumber")
                        .sentenceNumber("sentenceNumber")
                        .startPosition("startPosition")
                        .build()
                )
                .documentId("documentId")
                .build()

        val roundtrippedRelatedDocumentFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(relatedDocumentFull),
                jacksonTypeRef<RelatedDocumentFull>(),
            )

        assertThat(roundtrippedRelatedDocumentFull).isEqualTo(relatedDocumentFull)
    }
}
