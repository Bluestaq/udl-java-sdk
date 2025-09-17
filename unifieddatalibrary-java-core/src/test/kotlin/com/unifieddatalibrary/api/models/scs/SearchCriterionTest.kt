// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class SearchCriterionTest {

    @Test
    fun ofScsSearchField() {
        val scsSearchField =
            SearchCriterion.ScsSearchFieldCriterion.builder()
                .field("field")
                .operator(SearchCriterion.ScsSearchFieldCriterion.Operator.EXACT_MATCH)
                .value("value")
                .build()

        val searchCriterion = SearchCriterion.ofScsSearchField(scsSearchField)

        assertThat(searchCriterion.scsSearchField()).contains(scsSearchField)
        assertThat(searchCriterion.logical()).isEmpty
    }

    @Test
    fun ofScsSearchFieldRoundtrip() {
        val jsonMapper = jsonMapper()
        val searchCriterion =
            SearchCriterion.ofScsSearchField(
                SearchCriterion.ScsSearchFieldCriterion.builder()
                    .field("field")
                    .operator(SearchCriterion.ScsSearchFieldCriterion.Operator.EXACT_MATCH)
                    .value("value")
                    .build()
            )

        val roundtrippedSearchCriterion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(searchCriterion),
                jacksonTypeRef<SearchCriterion>(),
            )

        assertThat(roundtrippedSearchCriterion).isEqualTo(searchCriterion)
    }

    @Test
    fun ofLogical() {
        val logical =
            SearchLogicalCriterion.builder()
                .criteria(listOf())
                .operator(SearchLogicalCriterion.Operator.AND)
                .build()

        val searchCriterion = SearchCriterion.ofLogical(logical)

        assertThat(searchCriterion.scsSearchField()).isEmpty
        assertThat(searchCriterion.logical()).contains(logical)
    }

    @Test
    fun ofLogicalRoundtrip() {
        val jsonMapper = jsonMapper()
        val searchCriterion =
            SearchCriterion.ofLogical(
                SearchLogicalCriterion.builder()
                    .criteria(listOf())
                    .operator(SearchLogicalCriterion.Operator.AND)
                    .build()
            )

        val roundtrippedSearchCriterion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(searchCriterion),
                jacksonTypeRef<SearchCriterion>(),
            )

        assertThat(roundtrippedSearchCriterion).isEqualTo(searchCriterion)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val searchCriterion =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<SearchCriterion>())

        val e = assertThrows<UnifieddatalibraryInvalidDataException> { searchCriterion.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
