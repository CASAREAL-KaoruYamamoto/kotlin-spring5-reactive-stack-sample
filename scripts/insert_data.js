const conn = new Mongo()
const db = conn.getDB("todo")
db.todoItem.insert([
    {"done" : false, "subject" : "粗大ごみを出す", "_class" : "com.example.demo.model.TodoItem" },
    {"done" : false, "subject" : "リビングを掃除する", "deadline" : ISODate("2017-12-31T00:00:00Z"), "_class" : "com.example.demo.model.TodoItem" },
    {"done" : true, "subject" : "牛乳を買って帰る", "deadline" : ISODate("2017-12-21T00:00:00Z"), "_class" : "com.example.demo.model.TodoItem" }
])