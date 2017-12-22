package com.example.demo.repositories

import com.example.demo.entity.TodoItem
import org.springframework.data.repository.reactive.ReactiveCrudRepository

/**
 * TODO項目に対するCRUD操作をサポートするリポジトリー・インターフェイス
 */
interface TodoItemRepository: ReactiveCrudRepository<TodoItem, String>