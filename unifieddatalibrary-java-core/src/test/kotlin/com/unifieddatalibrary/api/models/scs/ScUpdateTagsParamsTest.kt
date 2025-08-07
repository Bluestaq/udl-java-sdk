// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScUpdateTagsParamsTest {

    @Test
    fun create() {
        ScUpdateTagsParams.builder().folder("folder").tags("tags").build()
    }

    @Test
    fun queryParams() {
        val params = ScUpdateTagsParams.builder().folder("folder").tags("tags").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("folder", "folder").put("tags", "tags").build())
    }
}
