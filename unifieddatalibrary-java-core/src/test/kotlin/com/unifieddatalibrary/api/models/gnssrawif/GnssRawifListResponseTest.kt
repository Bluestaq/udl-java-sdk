// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.gnssrawif

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.gnssrawif.GnssRawIfListResponse
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GnssRawIfListResponseTest {

    @Test
    fun create() {
      val gnssRawIfListResponse = GnssRawIfListResponse.builder()
          .addCenterFreq(1227.6)
          .addCenterFreq(1575.4)
          .classificationMarking("U")
          .dataMode(GnssRawIfListResponse.DataMode.TEST)
          .endTime(OffsetDateTime.parse("2022-04-09T18:12:28.919768Z"))
          .fileName("somefile.hdf5")
          .source("Bluestaq")
          .startTime(OffsetDateTime.parse("2022-04-09T18:11:28.919768Z"))
          .id("GNSSRawIF-ID")
          .bitDepth(8)
          .boresight(listOf(
            0.0,
            1.0,
            0.0,
          ))
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .dataRate(0.205)
          .addDiffCodeBia(0.0271)
          .addDiffCodeBia(0.0016)
          .endAlt(525.626)
          .endLat(38.922)
          .endLon(-104.67)
          .esId("60f7a241-b7be-48d8-acf3-786670af53f9")
          .eventId("2f2205c9-7bc2-4e1a-8416-2f80cc71f64b")
          .fileSize(3168895L)
          .idOnOrbit("32375")
          .addIfFreq(4.09)
          .addIfFreq(5.87)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .origObjectId("L2045")
          .addPostFourier("NONE")
          .addPostFourier("NONE")
          .quat(listOf(
            0.0,
            -0.2734104,
            0.1562345,
            0.9491246,
          ))
          .receiver("GPS1")
          .addSampleRate(8000)
          .addSampleRate(9000)
          .sampleType("COMPLEX")
          .satNo(32375)
          .sequenceId(1)
          .setId("2b0b1b1a-a3c0-4267-894a-0c40cb84a5af")
          .setLength(7)
          .addSrcId("GNSSSET_ID")
          .addSrcTyp("GNSSSET")
          .startAlt(525.664)
          .startIndex(2)
          .startLat(38.834)
          .startLon(-104.821)
          .addTag("TAG1")
          .addTag("TAG2")
          .build()

      assertThat(gnssRawIfListResponse.centerFreq()).containsExactly(1227.6, 1575.4)
      assertThat(gnssRawIfListResponse.classificationMarking()).isEqualTo("U")
      assertThat(gnssRawIfListResponse.dataMode()).isEqualTo(GnssRawIfListResponse.DataMode.TEST)
      assertThat(gnssRawIfListResponse.endTime()).isEqualTo(OffsetDateTime.parse("2022-04-09T18:12:28.919768Z"))
      assertThat(gnssRawIfListResponse.fileName()).isEqualTo("somefile.hdf5")
      assertThat(gnssRawIfListResponse.source()).isEqualTo("Bluestaq")
      assertThat(gnssRawIfListResponse.startTime()).isEqualTo(OffsetDateTime.parse("2022-04-09T18:11:28.919768Z"))
      assertThat(gnssRawIfListResponse.id()).contains("GNSSRawIF-ID")
      assertThat(gnssRawIfListResponse.bitDepth()).contains(8)
      assertThat(gnssRawIfListResponse.boresight().getOrNull()).containsExactly(0.0, 1.0, 0.0)
      assertThat(gnssRawIfListResponse.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
      assertThat(gnssRawIfListResponse.createdBy()).contains("some.user")
      assertThat(gnssRawIfListResponse.dataRate()).contains(0.205)
      assertThat(gnssRawIfListResponse.diffCodeBias().getOrNull()).containsExactly(0.0271, 0.0016)
      assertThat(gnssRawIfListResponse.endAlt()).contains(525.626)
      assertThat(gnssRawIfListResponse.endLat()).contains(38.922)
      assertThat(gnssRawIfListResponse.endLon()).contains(-104.67)
      assertThat(gnssRawIfListResponse.esId()).contains("60f7a241-b7be-48d8-acf3-786670af53f9")
      assertThat(gnssRawIfListResponse.eventId()).contains("2f2205c9-7bc2-4e1a-8416-2f80cc71f64b")
      assertThat(gnssRawIfListResponse.fileSize()).contains(3168895L)
      assertThat(gnssRawIfListResponse.idOnOrbit()).contains("32375")
      assertThat(gnssRawIfListResponse.ifFreq().getOrNull()).containsExactly(4.09, 5.87)
      assertThat(gnssRawIfListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
      assertThat(gnssRawIfListResponse.origNetwork()).contains("ORIG")
      assertThat(gnssRawIfListResponse.origObjectId()).contains("L2045")
      assertThat(gnssRawIfListResponse.postFourier().getOrNull()).containsExactly("NONE", "NONE")
      assertThat(gnssRawIfListResponse.quat().getOrNull()).containsExactly(0.0, -0.2734104, 0.1562345, 0.9491246)
      assertThat(gnssRawIfListResponse.receiver()).contains("GPS1")
      assertThat(gnssRawIfListResponse.sampleRate().getOrNull()).containsExactly(8000, 9000)
      assertThat(gnssRawIfListResponse.sampleType()).contains("COMPLEX")
      assertThat(gnssRawIfListResponse.satNo()).contains(32375)
      assertThat(gnssRawIfListResponse.sequenceId()).contains(1)
      assertThat(gnssRawIfListResponse.setId()).contains("2b0b1b1a-a3c0-4267-894a-0c40cb84a5af")
      assertThat(gnssRawIfListResponse.setLength()).contains(7)
      assertThat(gnssRawIfListResponse.srcIds().getOrNull()).containsExactly("GNSSSET_ID")
      assertThat(gnssRawIfListResponse.srcTyps().getOrNull()).containsExactly("GNSSSET")
      assertThat(gnssRawIfListResponse.startAlt()).contains(525.664)
      assertThat(gnssRawIfListResponse.startIndex()).contains(2)
      assertThat(gnssRawIfListResponse.startLat()).contains(38.834)
      assertThat(gnssRawIfListResponse.startLon()).contains(-104.821)
      assertThat(gnssRawIfListResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
    }

    @Test
    fun roundtrip() {
      val jsonMapper = jsonMapper()
      val gnssRawIfListResponse = GnssRawIfListResponse.builder()
          .addCenterFreq(1227.6)
          .addCenterFreq(1575.4)
          .classificationMarking("U")
          .dataMode(GnssRawIfListResponse.DataMode.TEST)
          .endTime(OffsetDateTime.parse("2022-04-09T18:12:28.919768Z"))
          .fileName("somefile.hdf5")
          .source("Bluestaq")
          .startTime(OffsetDateTime.parse("2022-04-09T18:11:28.919768Z"))
          .id("GNSSRawIF-ID")
          .bitDepth(8)
          .boresight(listOf(
            0.0,
            1.0,
            0.0,
          ))
          .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
          .createdBy("some.user")
          .dataRate(0.205)
          .addDiffCodeBia(0.0271)
          .addDiffCodeBia(0.0016)
          .endAlt(525.626)
          .endLat(38.922)
          .endLon(-104.67)
          .esId("60f7a241-b7be-48d8-acf3-786670af53f9")
          .eventId("2f2205c9-7bc2-4e1a-8416-2f80cc71f64b")
          .fileSize(3168895L)
          .idOnOrbit("32375")
          .addIfFreq(4.09)
          .addIfFreq(5.87)
          .origin("THIRD_PARTY_DATASOURCE")
          .origNetwork("ORIG")
          .origObjectId("L2045")
          .addPostFourier("NONE")
          .addPostFourier("NONE")
          .quat(listOf(
            0.0,
            -0.2734104,
            0.1562345,
            0.9491246,
          ))
          .receiver("GPS1")
          .addSampleRate(8000)
          .addSampleRate(9000)
          .sampleType("COMPLEX")
          .satNo(32375)
          .sequenceId(1)
          .setId("2b0b1b1a-a3c0-4267-894a-0c40cb84a5af")
          .setLength(7)
          .addSrcId("GNSSSET_ID")
          .addSrcTyp("GNSSSET")
          .startAlt(525.664)
          .startIndex(2)
          .startLat(38.834)
          .startLon(-104.821)
          .addTag("TAG1")
          .addTag("TAG2")
          .build()

      val roundtrippedGnssRawIfListResponse = jsonMapper.readValue(jsonMapper.writeValueAsString(gnssRawIfListResponse), jacksonTypeRef<GnssRawIfListResponse>())

      assertThat(roundtrippedGnssRawIfListResponse).isEqualTo(gnssRawIfListResponse)
    }
}
