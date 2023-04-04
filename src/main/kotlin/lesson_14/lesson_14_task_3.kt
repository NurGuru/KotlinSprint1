package lesson_14

open class Message(
    val authorName: String,
    val postText: String
) {
    fun makePost() {
        println("Пост пользователя $authorName:\n$postText")
    }
}

class Comments(val authorOfComment: String, val commentText: String) : Message(authorOfComment, commentText) {
    fun leaveComment(whosePostCommenting: String, whichPostCommenting: String) {
        println("$authorOfComment: $commentText\nкоментарий к посту:\n$whosePostCommenting: $whichPostCommenting")
    }
}

fun main() {
    val newPost = Message("John", "I love playing football!")
    newPost.makePost()
    println()
    val newComment = Comments("Jimmy", "I love football too!")
    newComment.leaveComment(newPost.authorName, newPost.postText)
}