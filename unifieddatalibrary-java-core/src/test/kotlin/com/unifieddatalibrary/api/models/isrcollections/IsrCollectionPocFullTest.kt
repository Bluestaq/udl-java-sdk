// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.isrcollections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsrCollectionPocFullTest {

    @Test
    fun create() {
        val isrCollectionPocFull =
            IsrCollectionPocFull.builder()
                .id("ISRCOLLECTIONPOC-ID")
                .callsign("CALLSIGN")
                .chatName("CHAT_NAME")
                .chatSystem("CHAT")
                .email("EMAIL")
                .name("NAME")
                .notes("NOTES")
                .phone("PHONE")
                .radioFrequency(123.23)
                .unit("UNIT")
                .build()

        assertThat(isrCollectionPocFull.id()).contains("ISRCOLLECTIONPOC-ID")
        assertThat(isrCollectionPocFull.callsign()).contains("CALLSIGN")
        assertThat(isrCollectionPocFull.chatName()).contains("CHAT_NAME")
        assertThat(isrCollectionPocFull.chatSystem()).contains("CHAT")
        assertThat(isrCollectionPocFull.email()).contains("EMAIL")
        assertThat(isrCollectionPocFull.name()).contains("NAME")
        assertThat(isrCollectionPocFull.notes()).contains("NOTES")
        assertThat(isrCollectionPocFull.phone()).contains("PHONE")
        assertThat(isrCollectionPocFull.radioFrequency()).contains(123.23)
        assertThat(isrCollectionPocFull.unit()).contains("UNIT")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isrCollectionPocFull =
            IsrCollectionPocFull.builder()
                .id("ISRCOLLECTIONPOC-ID")
                .callsign("CALLSIGN")
                .chatName("CHAT_NAME")
                .chatSystem("CHAT")
                .email("EMAIL")
                .name("NAME")
                .notes("NOTES")
                .phone("PHONE")
                .radioFrequency(123.23)
                .unit("UNIT")
                .build()

        val roundtrippedIsrCollectionPocFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(isrCollectionPocFull),
                jacksonTypeRef<IsrCollectionPocFull>(),
            )

        assertThat(roundtrippedIsrCollectionPocFull).isEqualTo(isrCollectionPocFull)
    }
}
