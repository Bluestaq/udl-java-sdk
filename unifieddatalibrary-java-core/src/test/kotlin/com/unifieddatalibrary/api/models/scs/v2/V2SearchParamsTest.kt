// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.v2

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.scs.SearchCriterion
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V2SearchParamsTest {

    @Test
    fun create() {
        V2SearchParams.builder()
            .order("order")
            .searchAfter("searchAfter")
            .size(0)
            .sort("sort")
            .query(
                SearchCriterion.ScsSearchFieldCriterion.builder()
                    .field("attachment.content")
                    .operator(SearchCriterion.ScsSearchFieldCriterion.Operator.EXACT_MATCH)
                    .value("This is a very cool file.")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V2SearchParams.builder()
                .order("order")
                .searchAfter("searchAfter")
                .size(0)
                .sort("sort")
                .query(
                    SearchCriterion.ScsSearchFieldCriterion.builder()
                        .field("attachment.content")
                        .operator(SearchCriterion.ScsSearchFieldCriterion.Operator.EXACT_MATCH)
                        .value("This is a very cool file.")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("order", "order")
                    .put("searchAfter", "searchAfter")
                    .put("size", "0")
                    .put("sort", "sort")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V2SearchParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            V2SearchParams.builder()
                .order("order")
                .searchAfter("searchAfter")
                .size(0)
                .sort("sort")
                .query(
                    SearchCriterion.ScsSearchFieldCriterion.builder()
                        .field("attachment.content")
                        .operator(SearchCriterion.ScsSearchFieldCriterion.Operator.EXACT_MATCH)
                        .value("This is a very cool file.")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.query())
            .contains(
                SearchCriterion.ofScsSearchField(
                    SearchCriterion.ScsSearchFieldCriterion.builder()
                        .field("attachment.content")
                        .operator(SearchCriterion.ScsSearchFieldCriterion.Operator.EXACT_MATCH)
                        .value("This is a very cool file.")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V2SearchParams.builder().build()

        val body = params._body()
    }
}
