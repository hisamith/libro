package com.pasindu15.demo.library.app.transformer;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class ResponseEntityTransformer {
    public Map transform(Object entity, ResponseEntityInterface transformer){
        return transformer.transform(entity);
    }

    public List<Map> transform(List<?> entityList, ResponseEntityInterface transformer){
        return entityList.stream().map(transformer::transform).collect(Collectors.toList());
    }
}
