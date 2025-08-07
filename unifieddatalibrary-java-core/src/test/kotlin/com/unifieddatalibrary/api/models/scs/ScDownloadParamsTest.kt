// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScDownloadParamsTest {

    @Test
    fun create() {
        ScDownloadParams.builder()
            .addBody("/processPalantirXml/media/PT_MEDIA6831731772984708680")
            .addBody("/processPalantirXml/media/PT_MEDIA7297147303810886654")
            .build()
    }

    @Test
    fun body() {
        val params =
            ScDownloadParams.builder()
                .addBody("/processPalantirXml/media/PT_MEDIA6831731772984708680")
                .addBody("/processPalantirXml/media/PT_MEDIA7297147303810886654")
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                "/processPalantirXml/media/PT_MEDIA6831731772984708680",
                "/processPalantirXml/media/PT_MEDIA7297147303810886654",
            )
    }
}
