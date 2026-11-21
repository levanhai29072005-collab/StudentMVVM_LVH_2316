package vn.edu.ute.studentmvvm.network

import vn.edu.ute.studentmvvm.model.Student

data class StudentDto(
    val id: Int = 0,
    val name: String = "",
    val email: String = ""
)

fun StudentDto.toEntity(): Student {
    return Student(
        id = 0,
        fullName = name,
        studentCode = "201100${10 + id}",
        email = email,
        gpa = 3.50,
        major = "Công Nghệ Thông Tin"
    )
}