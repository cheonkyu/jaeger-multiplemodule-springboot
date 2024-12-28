package io.cheonkyu.app

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter
import org.springframework.stereotype.Component

@Configuration
class TracerConfig {
    @Bean
    fun otlpHttpSpanExporter(@Value("\${tracing.url}") url: String): OtlpGrpcSpanExporter {
//        println(url);
        return OtlpGrpcSpanExporter.builder().setEndpoint(url).build()
    }
}