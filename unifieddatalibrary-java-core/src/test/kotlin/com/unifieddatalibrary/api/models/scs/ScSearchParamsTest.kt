// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScSearchParamsTest {

    @Test
    fun create() {
        ScSearchParams.builder()
            .path("path")
            .count(0)
            .offset(0)
            .contentCriteria("contentCriteria")
            .metaDataCriteria(
                ScSearchParams.MetaDataCriteria.builder()
                    .putAdditionalProperty(
                        "CREATED_AT",
                        JsonValue.from(listOf("< 2022-06-14T07:48:11.302Z")),
                    )
                    .build()
            )
            .nonRangeCriteria(
                ScSearchParams.NonRangeCriteria.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
            .rangeCriteria(
                ScSearchParams.RangeCriteria.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
            .searchAfter("searchAfter")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ScSearchParams.builder()
                .path("path")
                .count(0)
                .offset(0)
                .contentCriteria("contentCriteria")
                .metaDataCriteria(
                    ScSearchParams.MetaDataCriteria.builder()
                        .putAdditionalProperty(
                            "CREATED_AT",
                            JsonValue.from(listOf("< 2022-06-14T07:48:11.302Z")),
                        )
                        .build()
                )
                .nonRangeCriteria(
                    ScSearchParams.NonRangeCriteria.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .rangeCriteria(
                    ScSearchParams.RangeCriteria.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .searchAfter("searchAfter")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("path", "path")
                    .put("count", "0")
                    .put("offset", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ScSearchParams.builder().path("path").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("path", "path").build())
    }

    @Test
    fun body() {
        val params =
            ScSearchParams.builder()
                .path("path")
                .count(0)
                .offset(0)
                .contentCriteria("contentCriteria")
                .metaDataCriteria(
                    ScSearchParams.MetaDataCriteria.builder()
                        .putAdditionalProperty(
                            "CREATED_AT",
                            JsonValue.from(listOf("< 2022-06-14T07:48:11.302Z")),
                        )
                        .build()
                )
                .nonRangeCriteria(
                    ScSearchParams.NonRangeCriteria.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .rangeCriteria(
                    ScSearchParams.RangeCriteria.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .searchAfter("searchAfter")
                .build()

        val body = params._body()

        assertThat(body.contentCriteria()).contains("contentCriteria")
        assertThat(body.metaDataCriteria())
            .contains(
                ScSearchParams.MetaDataCriteria.builder()
                    .putAdditionalProperty(
                        "CREATED_AT",
                        JsonValue.from(listOf("< 2022-06-14T07:48:11.302Z")),
                    )
                    .build()
            )
        assertThat(body.nonRangeCriteria())
            .contains(
                ScSearchParams.NonRangeCriteria.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(body.rangeCriteria())
            .contains(
                ScSearchParams.RangeCriteria.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(body.searchAfter()).contains("searchAfter")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ScSearchParams.builder().path("path").build()

        val body = params._body()
    }
}
