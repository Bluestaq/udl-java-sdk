// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.DailyOperationFull
import com.unifieddatalibrary.api.models.OperatingHoursFull
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DailyOperationFullTest {

    @Test
    fun create() {
      val dailyOperationFull = DailyOperationFull.builder()
          .dayOfWeek(DailyOperationFull.DayOfWeek.MONDAY)
          .addOperatingHour(OperatingHoursFull.builder()
              .opStartTime("12:00")
              .opStopTime("22:00")
              .build())
          .operationName("Arrivals")
          .ophrsLastChangedBy("John Smith")
          .ophrsLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
          .build()

      assertThat(dailyOperationFull.dayOfWeek()).contains(DailyOperationFull.DayOfWeek.MONDAY)
      assertThat(dailyOperationFull.operatingHours().getOrNull()).containsExactly(OperatingHoursFull.builder()
          .opStartTime("12:00")
          .opStopTime("22:00")
          .build())
      assertThat(dailyOperationFull.operationName()).contains("Arrivals")
      assertThat(dailyOperationFull.ophrsLastChangedBy()).contains("John Smith")
      assertThat(dailyOperationFull.ophrsLastChangedDate()).contains(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val dailyOperationFull = DailyOperationFull.builder()
          .dayOfWeek(DailyOperationFull.DayOfWeek.MONDAY)
          .addOperatingHour(OperatingHoursFull.builder()
              .opStartTime("12:00")
              .opStopTime("22:00")
              .build())
          .operationName("Arrivals")
          .ophrsLastChangedBy("John Smith")
          .ophrsLastChangedDate(OffsetDateTime.parse("2024-01-01T16:00:00.123Z"))
          .build()

      val roundtrippedDailyOperationFull = jsonMapper.readValue(jsonMapper.writeValueAsString(dailyOperationFull), jacksonTypeRef<DailyOperationFull>())

      assertThat(roundtrippedDailyOperationFull).isEqualTo(dailyOperationFull)
    }
}
