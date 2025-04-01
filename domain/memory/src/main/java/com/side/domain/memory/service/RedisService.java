package com.side.domain.memory.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.side.domain.memory.repository.RedisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class RedisService {

    private final RedisRepository redisRepository;

    public Long increment(String key) {
        return redisRepository.increment(key);
    }

    public void expire(String key, long timeOut, TimeUnit timeUnit) {
        redisRepository.expire(key, timeOut, timeUnit);
    }

    public Long decrement(String key) {
        return redisRepository.decrement(key);
    }

    public boolean insertIfAbsent(String key, Object value) {
        return redisRepository.insertIfAbsent(key, value);
    }

    public void create(String key, Object value) {
        redisRepository.create(key, value);
    }

    public void create(String key, Object value, long timeout, TimeUnit unit) {
        redisRepository.create(key, value, timeout, unit);
    }

    public <T> T get(String key, Class<T> clazz) {
        return redisRepository.get(key, clazz);
    }

    public <T> T get(String key, TypeReference<T> typeReference) {
        return redisRepository.get(key, typeReference);
    }

    public <T> Optional<T> find(String key, Class<T> clazz) {
        return redisRepository.find(key, clazz);
    }

    public <T> Optional<T> find(String key, TypeReference<T> typeReference) {
        return redisRepository.find(key, typeReference);
    }

    public boolean delete(String key) {
        return redisRepository.delete(key);
    }
}
