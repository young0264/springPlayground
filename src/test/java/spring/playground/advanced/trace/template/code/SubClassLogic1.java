package spring.playground.advanced.trace.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubClassLogic1 extends AbstractTemplate{

    @Override
    protected void call() {
        log.info("[SubClassLogic1] 비즈니스 로직 1 실행함");
    }
}
