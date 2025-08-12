// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.featureassessment

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.featureassessment.FeatureAssessmentTupleParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeatureAssessmentTupleParamsTest {

    @Test
    fun create() {
      FeatureAssessmentTupleParams.builder()
          .columns("columns")
          .idAnalyticImagery("idAnalyticImagery")
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = FeatureAssessmentTupleParams.builder()
          .columns("columns")
          .idAnalyticImagery("idAnalyticImagery")
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .put("idAnalyticImagery", "idAnalyticImagery")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = FeatureAssessmentTupleParams.builder()
          .columns("columns")
          .idAnalyticImagery("idAnalyticImagery")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .put("idAnalyticImagery", "idAnalyticImagery")
          .build())
    }
}
