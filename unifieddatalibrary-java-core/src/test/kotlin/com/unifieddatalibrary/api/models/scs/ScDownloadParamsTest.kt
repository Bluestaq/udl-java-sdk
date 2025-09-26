// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScDownloadParamsTest {

    @Test
    fun create() {
        ScDownloadParams.builder().addBody("/MyFolderToDownload/").build()
    }

    @Test
    fun body() {
        val params = ScDownloadParams.builder().addBody("/MyFolderToDownload/").build()

        val body = params._body()

        assertThat(body).containsExactly("/MyFolderToDownload/")
    }
}
