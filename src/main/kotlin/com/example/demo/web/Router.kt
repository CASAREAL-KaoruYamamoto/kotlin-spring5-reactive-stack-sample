package com.example.demo.web

import org.springframework.web.reactive.function.server.router

/**
 * ルーター
 */
fun router(todoHandler: TodoHandler) = router {

    /* TODO項目に対するパスの割り当て */
    "/todos".nest {

        /* TODO項目一覧の取得 */
        GET("/", todoHandler::findAll)

    }

}