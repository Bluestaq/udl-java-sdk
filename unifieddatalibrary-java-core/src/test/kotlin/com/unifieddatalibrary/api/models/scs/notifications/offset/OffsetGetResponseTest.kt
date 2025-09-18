// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.notifications.offset

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OffsetGetResponseTest {

    @Test
    fun create() {
        val offsetGetResponse = OffsetGetResponse.builder().maxOffset(0L).minOffset(0L).build()

        assertThat(offsetGetResponse.maxOffset()).contains(0L)
        assertThat(offsetGetResponse.minOffset()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val offsetGetResponse = OffsetGetResponse.builder().maxOffset(0L).minOffset(0L).build()

        val roundtrippedOffsetGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(offsetGetResponse),
                jacksonTypeRef<OffsetGetResponse>(),
            )

        assertThat(roundtrippedOffsetGetResponse).isEqualTo(offsetGetResponse)
    }
}
