// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.securemessaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TopicDetailsTest {

    @Test
    fun create() {
        val topicDetails =
            TopicDetails.builder()
                .description("description")
                .maxPos(0L)
                .minPos(0L)
                .topic("topic")
                .udlOpenAPISchema("udlOpenAPISchema")
                .build()

        assertThat(topicDetails.description()).contains("description")
        assertThat(topicDetails.maxPos()).contains(0L)
        assertThat(topicDetails.minPos()).contains(0L)
        assertThat(topicDetails.topic()).contains("topic")
        assertThat(topicDetails.udlOpenAPISchema()).contains("udlOpenAPISchema")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val topicDetails =
            TopicDetails.builder()
                .description("description")
                .maxPos(0L)
                .minPos(0L)
                .topic("topic")
                .udlOpenAPISchema("udlOpenAPISchema")
                .build()

        val roundtrippedTopicDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(topicDetails),
                jacksonTypeRef<TopicDetails>(),
            )

        assertThat(roundtrippedTopicDetails).isEqualTo(topicDetails)
    }
}
