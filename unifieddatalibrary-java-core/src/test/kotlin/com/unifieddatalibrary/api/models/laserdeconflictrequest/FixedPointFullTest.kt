// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laserdeconflictrequest

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FixedPointFullTest {

    @Test
    fun create() {
        val fixedPointFull =
            FixedPointFull.builder().latitude(-10.18).longitude(-179.98).height(-18.13).build()

        assertThat(fixedPointFull.latitude()).isEqualTo(-10.18)
        assertThat(fixedPointFull.longitude()).isEqualTo(-179.98)
        assertThat(fixedPointFull.height()).contains(-18.13)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fixedPointFull =
            FixedPointFull.builder().latitude(-10.18).longitude(-179.98).height(-18.13).build()

        val roundtrippedFixedPointFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fixedPointFull),
                jacksonTypeRef<FixedPointFull>(),
            )

        assertThat(roundtrippedFixedPointFull).isEqualTo(fixedPointFull)
    }
}
