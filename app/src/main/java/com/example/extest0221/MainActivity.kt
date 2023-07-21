package com.example.extest0221

import java.util.Scanner

data class User(val id: String, val pw: String, val email: String, val phone: String)

class UserLogin {
    fun login(user: User, Id: String, Pw: String): Boolean {
        return Id == user.id && Pw == user.pw
    }
}

class RegisterLogin {
    fun register(): User {
        val scanner = Scanner(System.`in`);

        println("아이디 :")
        val id = scanner.nextLine();

        println("비밀번호 :")
        val pw = scanner.nextLine();

        println("이메일 :")
        val email = scanner.nextLine();

        println("전화번호 :")
        val phone = scanner.nextLine();

        return User(id, pw, email, phone);
    }
}

fun main() {
    val dummyUser = User("admin", "1234", "admin@admin.com", "123456789")
    val UserLogin = UserLogin();
    val RegisterLogin = RegisterLogin();

    println("회원가입")
    val saveUser = RegisterLogin.register();

    println("로그인")
    println("아이디 :")
    val Id = readLine() ?: ""
    println("비밀번호 :")
    val Pw = readLine() ?: ""

    if (UserLogin.login(dummyUser, Id, Pw)) {
        println("로그인 성공")
    } else {
        println("로그인 실패")
    }

}