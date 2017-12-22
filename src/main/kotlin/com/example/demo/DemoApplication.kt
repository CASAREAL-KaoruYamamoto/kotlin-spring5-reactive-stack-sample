package com.example.demo

import com.example.demo.web.TodoHandler
import com.example.demo.web.router
import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoClients
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.beans
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration

/**
 * Spring Bootのアプリケーション定義
 */
@SpringBootApplication
class DemoApplication: AbstractReactiveMongoConfiguration() {

    /**
     * リアクティブに対応したMongoDB Clientオブジェクトのプロバイダー
     */
    override fun reactiveMongoClient(): MongoClient = MongoClients.create()

    /**
     * このアプリケーション用のデータベース名
     */
    override fun getDatabaseName(): String = "todo"

}

/**
 * Spring Bootアプリケーションの起動ポイント
 */
fun main(args: Array<String>) {

    runApplication<DemoApplication>(*args) {

        /**
         * Bean定義
         */
        addInitializers(beans {
            bean<TodoHandler>()
            bean {
                router(ref<TodoHandler>())
            }
        })

    }

}
