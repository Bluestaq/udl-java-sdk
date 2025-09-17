// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SearchLogicalCriterionTest {

    @Test
    fun create() {
        val searchLogicalCriterion =
            SearchLogicalCriterion.builder()
                .criteria(listOf())
                .operator(SearchLogicalCriterion.Operator.AND)
                .build()

        assertThat(searchLogicalCriterion.criteria().getOrNull()).containsExactly()
        assertThat(searchLogicalCriterion.operator()).contains(SearchLogicalCriterion.Operator.AND)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val searchLogicalCriterion =
            SearchLogicalCriterion.builder()
                .criteria(listOf())
                .operator(SearchLogicalCriterion.Operator.AND)
                .build()

        val roundtrippedSearchLogicalCriterion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(searchLogicalCriterion),
                jacksonTypeRef<SearchLogicalCriterion>(),
            )

        assertThat(roundtrippedSearchLogicalCriterion).isEqualTo(searchLogicalCriterion)
    }
}
