package hello.advanced;

import hello.advanced.trace.logtrace.FieldLogTrace;
import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    // ThreadLocal 사용 x
/*
    @Bean
    public LogTrace logTrace() {
        return new FieldLogTrace();
    }
*/

    // ThreadLocal 사용
    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }
}
