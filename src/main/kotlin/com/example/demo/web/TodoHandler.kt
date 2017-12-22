package com.example.demo.web

import com.example.demo.repositories.TodoItemRepository
import org.springframework.http.MediaType.APPLICATION_JSON_UTF8
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono

/**
 * TODO項目のハンドラー
 */
class TodoHandler(private val todoItemRepository: TodoItemRepository) {

    /**
     * TODO項目一覧の取得
     */
    fun findAll(request: ServerRequest): Mono<ServerResponse> =
            ok().contentType(APPLICATION_JSON_UTF8)
                    .body(todoItemRepository.findAll())

}