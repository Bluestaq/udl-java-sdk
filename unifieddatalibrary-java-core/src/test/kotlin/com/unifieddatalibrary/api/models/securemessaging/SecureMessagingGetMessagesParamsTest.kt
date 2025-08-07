// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.securemessaging

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecureMessagingGetMessagesParamsTest {

    @Test
    fun create() {
        SecureMessagingGetMessagesParams.builder()
            .topic("topic")
            .offset(0L)
            .firstResult(0L)
            .maxResults(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = SecureMessagingGetMessagesParams.builder().topic("topic").offset(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("topic")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SecureMessagingGetMessagesParams.builder()
                .topic("topic")
                .offset(0L)
                .firstResult(0L)
                .maxResults(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("firstResult", "0").put("maxResults", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SecureMessagingGetMessagesParams.builder().topic("topic").offset(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
